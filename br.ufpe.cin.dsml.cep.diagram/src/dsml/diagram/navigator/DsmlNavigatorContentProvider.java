/*
 * 
 */
package dsml.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import dsml.diagram.edit.parts.*;
import dsml.diagram.part.DsmlVisualIDRegistry;
import dsml.diagram.part.Messages;

/**
 * @generated
 */
public class DsmlNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DsmlNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<DsmlNavigatorItem> result = new ArrayList<DsmlNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, DrawingAreaEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof DsmlNavigatorGroup) {
			DsmlNavigatorGroup group = (DsmlNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DsmlNavigatorItem) {
			DsmlNavigatorItem navigatorItem = (DsmlNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DsmlVisualIDRegistry.getVisualID(view)) {

		case DrawingAreaEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DsmlNavigatorGroup links = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_DrawingArea_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(RuleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(EventOutputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(WindowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetGroupbyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case RuleEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Rule_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RuleRuleQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Event_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventEventAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventPatternEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_EventPattern_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventPatternEventPatternNodeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case EventOutputEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_EventOutput_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventOutputEventOutputQueriesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WindowEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Window_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TargetGroupbyEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_TargetGroupby_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TargetEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Target2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case NotEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UnaryPatternEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PatternTimerEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatPatternEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AggregationEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionGroupEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Target3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupbyConditionEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Target4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BringGroupEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Target5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OperatorEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ValueOperatorEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Not2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UnaryPattern2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PatternTimer2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatPattern2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Aggregation2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionGroup2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Not3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UnaryPattern3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PatternTimer3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatPattern3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Aggregation3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionGroup3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupbyCondition2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Not4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UnaryPattern4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PatternTimer4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatPattern4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Aggregation4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3033_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3033_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionGroup4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3034_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3034_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BringGroup2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupbyCondition3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3036_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3036_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupbyCondition4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3037_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3037_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BringGroup3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3038_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3038_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BringGroup4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3039_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3039_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Operator2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ValueOperator2EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3041_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3041_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Operator3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3042_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3042_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ValueOperator3EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3043_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Operator4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3044_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ValueOperator4EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3045_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3045_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Not5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3046_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3046_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UnaryPattern5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3047_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3047_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PatternTimer5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3048_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3048_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatPattern5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3049_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3049_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Aggregation5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3050_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3050_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionGroup5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3051_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3051_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupbyCondition5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3052_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3052_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BringGroup5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3053_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3053_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Operator5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3054_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3054_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ValueOperator5EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3055_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3055_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Target6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3057_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3057_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Not6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3058_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3058_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UnaryPattern6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3059_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3059_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PatternTimer6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3060_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3060_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatPattern6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3061_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3061_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Target7EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3062_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Target_3062_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetTargetOperationTypesCompartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(LinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LinkPatternTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Not7EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3063_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Not_3063_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UnaryPattern7EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3064_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_UnaryPattern_3064_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PatternTimer7EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3065_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_PatternTimer_3065_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RepeatPattern7EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3066_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_RepeatPattern_3066_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Aggregation6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3067_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Aggregation_3067_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ConditionGroup6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3068_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionGroup_3068_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupConditionGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupbyCondition6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3069_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_GroupbyCondition_3069_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionGroupbyConditionOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BringGroup6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3070_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_BringGroup_3070_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(BringGroupBringGroupOperationTypesCompartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Operator6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3071_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Operator_3071_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ValueOperator6EditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsmlNavigatorGroup incominglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3072_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup outgoinglinks = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_ValueOperator_3072_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ComparisonEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(ArithmeticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(LogicalConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ComparisonEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsmlNavigatorGroup target = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Comparison_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup source = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Comparison_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ArithmeticEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsmlNavigatorGroup target = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Arithmetic_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup source = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_Arithmetic_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LogicalConnectorEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsmlNavigatorGroup target = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_LogicalConnector_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup source = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_LogicalConnector_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(NotEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyConditionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(OperatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Not7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(UnaryPattern7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(PatternTimer7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(RepeatPattern7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(Aggregation6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ConditionGroup6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(GroupbyCondition6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(BringGroup6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Operator6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(ValueOperator6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LinkTargetEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsmlNavigatorGroup target = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_LinkTarget_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup source = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_LinkTarget_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(RuleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(EventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(EventPatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(EventOutputEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(WindowEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry
							.getType(TargetGroupbyEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LinkPatternTargetEditPart.VISUAL_ID: {
			LinkedList<DsmlAbstractNavigatorItem> result = new LinkedList<DsmlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsmlNavigatorGroup target = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_LinkPatternTarget_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsmlNavigatorGroup source = new DsmlNavigatorGroup(
					Messages.NavigatorGroupName_LinkPatternTarget_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(TargetEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsmlVisualIDRegistry.getType(Target7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DrawingAreaEditPart.MODEL_ID.equals(DsmlVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DsmlNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<DsmlNavigatorItem> result = new ArrayList<DsmlNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new DsmlNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<DsmlNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof DsmlAbstractNavigatorItem) {
			DsmlAbstractNavigatorItem abstractNavigatorItem = (DsmlAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
