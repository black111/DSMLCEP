package dsml.diagram.m2t;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JOptionPane;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

import dsml.DsmlPackage;
import dsml.diagram.m2t.TransformationView;
import dsml.diagram.part.DsmlDiagramEditor;


public class MT2Action implements IWorkbenchWindowActionDelegate {

	public MT2Action() {
	}

	public void run(IAction action) {

		// Get the active editor
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		// This is only meaningful if the editor is a Friends diagram editor
		if (editor instanceof DsmlDiagramEditor) {

			DsmlDiagramEditor friendsDiagramEditor = (DsmlDiagramEditor) editor;

			// Get the EMF model under the editor
			Resource resource = getFirstSemanticModelResource( friendsDiagramEditor.getEditingDomain().getResourceSet());

			if (resource == null) return;

			// Wrap it as an InMemoryEmfModel
			InMemoryEmfModel m = new InMemoryEmfModel("M", resource, DsmlPackage.eINSTANCE);

			// Construct the EGL module
			EglTemplateFactoryModuleAdapter module = 
					new EglTemplateFactoryModuleAdapter(new EglFileGeneratingTemplateFactory());

			//Bundle bundle = Platform.getBundle("br.ufpe.cin.dsml2");
			//URL fileURL = bundle.getEntry("m2t/dsml2.egl");

			InputStream inputStream = null;
			BufferedReader br = null;			
			StringBuilder sb = null;
			
			try {
				// read this file into InputStream

				inputStream = getClass().getResourceAsStream("/src/dsml/diagram/m2t/dsml.egl");

				br = new BufferedReader(new InputStreamReader(inputStream));

				sb = new StringBuilder();

				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (inputStream != null) {
					try {
						inputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}


			try {
				//module.parse(FileLocator.resolve(fileURL).toURI());
				module.parse(sb.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}

			module.getContext().getModelRepository().addModel(m);
		//	IViewReference[] refs = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();
		//	for (IViewReference ref: refs) System.out.println(ref.getId());
			TransformationView view = null;
			try {
				view = (TransformationView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(TransformationView.ID);
				
			} catch (PartInitException e1) {
				e1.printStackTrace();
			}

			try {

		  	view.setInput((String) module.execute());
	       // 	System.out.println((String) module.execute());
			} catch (EolRuntimeException e) {
				e.printStackTrace();
			}
			

		}

	}

	public Resource getFirstSemanticModelResource(ResourceSet resourceSet) {
		for (Resource resource : resourceSet.getResources()) {
			return resource;
		}
		return null;
	}

	public void selectionChanged(IAction action, ISelection selection) {}

	public void dispose() {}

	public void init(IWorkbenchWindow window) { }
}