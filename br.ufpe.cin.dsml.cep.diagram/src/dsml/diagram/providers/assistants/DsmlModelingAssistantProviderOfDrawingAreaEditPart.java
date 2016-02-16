/*
 * 
 */
package dsml.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dsml.diagram.providers.DsmlElementTypes;
import dsml.diagram.providers.DsmlModelingAssistantProvider;

/**
 * @generated
 */
public class DsmlModelingAssistantProviderOfDrawingAreaEditPart extends
		DsmlModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(DsmlElementTypes.Rule_2001);
		types.add(DsmlElementTypes.Event_2002);
		types.add(DsmlElementTypes.EventPattern_2003);
		types.add(DsmlElementTypes.EventOutput_2004);
		types.add(DsmlElementTypes.Window_2005);
		types.add(DsmlElementTypes.TargetGroupby_2006);
		return types;
	}

}