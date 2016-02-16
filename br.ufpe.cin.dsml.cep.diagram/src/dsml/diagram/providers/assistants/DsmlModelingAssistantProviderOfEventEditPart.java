/*
 * 
 */
package dsml.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dsml.diagram.edit.parts.EventEditPart;
import dsml.diagram.edit.parts.Target2EditPart;
import dsml.diagram.edit.parts.Target3EditPart;
import dsml.diagram.edit.parts.Target4EditPart;
import dsml.diagram.edit.parts.Target5EditPart;
import dsml.diagram.edit.parts.Target6EditPart;
import dsml.diagram.edit.parts.Target7EditPart;
import dsml.diagram.edit.parts.TargetEditPart;
import dsml.diagram.providers.DsmlElementTypes;
import dsml.diagram.providers.DsmlModelingAssistantProvider;

/**
 * @generated
 */
public class DsmlModelingAssistantProviderOfEventEditPart extends
		DsmlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DsmlElementTypes.Attribute_3056);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((EventEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(EventEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DsmlElementTypes.LinkTarget_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((EventEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			EventEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TargetEditPart) {
			types.add(DsmlElementTypes.LinkTarget_4004);
		}
		if (targetEditPart instanceof Target2EditPart) {
			types.add(DsmlElementTypes.LinkTarget_4004);
		}
		if (targetEditPart instanceof Target3EditPart) {
			types.add(DsmlElementTypes.LinkTarget_4004);
		}
		if (targetEditPart instanceof Target4EditPart) {
			types.add(DsmlElementTypes.LinkTarget_4004);
		}
		if (targetEditPart instanceof Target5EditPart) {
			types.add(DsmlElementTypes.LinkTarget_4004);
		}
		if (targetEditPart instanceof Target6EditPart) {
			types.add(DsmlElementTypes.LinkTarget_4004);
		}
		if (targetEditPart instanceof Target7EditPart) {
			types.add(DsmlElementTypes.LinkTarget_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((EventEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(EventEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DsmlElementTypes.LinkTarget_4004) {
			types.add(DsmlElementTypes.Target_3001);
			types.add(DsmlElementTypes.Target_3002);
			types.add(DsmlElementTypes.Target_3009);
			types.add(DsmlElementTypes.Target_3011);
			types.add(DsmlElementTypes.Target_3013);
			types.add(DsmlElementTypes.Target_3057);
			types.add(DsmlElementTypes.Target_3062);
		}
		return types;
	}

}
