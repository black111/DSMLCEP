/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2015  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://featureide.cs.ovgu.de/ for further information.
 */
package de.ovgu.featureide.ui.statistics.core.composite.lazyimplementations;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.FeatureModelAnalyzer;
import de.ovgu.featureide.ui.statistics.core.composite.LazyParent;
import de.ovgu.featureide.ui.statistics.core.composite.Parent;

/**
 * Counts and categorizes features in the given feature model.
 * 
 * @author Dominik Hamann
 * @author Patrick Haese
 */
public final class StatisticsFeatureComplexity extends LazyParent {
	private FeatureModelAnalyzer ana;
	private FeatureModel model;

	
	public StatisticsFeatureComplexity(String description, FeatureModel model) {
		super(description, null);
		this.model = model;
		this.ana = model.getAnalyser();
	}

	@Override
	protected void initChildren() {
		if (model != null) {
			/*
			 * Calculates the actual statistics.
			 */
			final int constraints = model.getConstraintCount();

			Boolean isValid = null;
			try {
				isValid = ana.isValid();
			} catch (TimeoutException e) {
			}

			/*
			 * Creates a dataset.
			 */
			Collection<Feature> listOfFeatures = model.getFeatures();

			addChild(new Parent(MODEL_VOID, isValid == null ? MODEL_TIMEOUT
					: isValid));

			addChild(new FeatureListNode(NUMBER_FEATURES, listOfFeatures));

			addChild(new FeatureListNode(NUMBER_CONCRETE,
					model.getConcreteFeatures()));

			List<Feature> listOfAbstractFeatures = new LinkedList<Feature>();
			for (Feature f : listOfFeatures) {
				if (f.isAbstract()) {
					listOfAbstractFeatures.add(f);
				}
			}
			addChild(new FeatureListNode(NUMBER_ABSTRACT,
					listOfAbstractFeatures));

			List<Feature> listOfCompoundFeatures = new LinkedList<Feature>();
			for (Feature f : listOfFeatures) {
				if (!f.getChildren().isEmpty()) {
					listOfCompoundFeatures.add(f);
				}
			}
			addChild(new FeatureListNode(NUMBER_COMPOUND,
					listOfCompoundFeatures));

			List<Feature> listOfPrimitiveFeatures = new LinkedList<Feature>();
			for (Feature f : listOfFeatures) {
				if (f.getChildren().isEmpty()) {
					listOfPrimitiveFeatures.add(f);
				}
			}
			addChild(new FeatureListNode(NUMBER_TERMINAL,
					listOfPrimitiveFeatures));

			addChild(new FeatureListNode(NUMBER_HIDDEN, ana.getHiddenFeatures()));
			
			addChild(new Parent(NUMBER_CONSTRAINTS, constraints));

		}
	}
}
