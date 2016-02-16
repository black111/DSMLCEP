/*
 * 
 */
package dsml.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import dsml.diagram.part.DsmlVisualIDRegistry;

/**
 * @generated
 */
public class DsmlNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7031;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7030;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DsmlNavigatorItem) {
			DsmlNavigatorItem item = (DsmlNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return DsmlVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
