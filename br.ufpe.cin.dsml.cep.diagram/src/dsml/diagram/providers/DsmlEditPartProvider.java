/*
 * 
 */
package dsml.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import dsml.diagram.edit.parts.DrawingAreaEditPart;
import dsml.diagram.edit.parts.DsmlEditPartFactory;
import dsml.diagram.part.DsmlVisualIDRegistry;

/**
 * @generated
 */
public class DsmlEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DsmlEditPartProvider() {
		super(new DsmlEditPartFactory(), DsmlVisualIDRegistry.TYPED_INSTANCE,
				DrawingAreaEditPart.MODEL_ID);
	}

}
