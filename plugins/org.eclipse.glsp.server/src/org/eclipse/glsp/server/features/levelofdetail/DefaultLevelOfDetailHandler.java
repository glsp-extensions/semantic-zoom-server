/********************************************************************************
 * Copyright (c) 2021 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
package org.eclipse.glsp.server.features.levelofdetail;

import org.apache.log4j.Logger;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GModelRoot;
import org.eclipse.glsp.server.features.levelofdetail.rules.LevelOfDetailServerRule;

import com.google.inject.Inject;

public class DefaultLevelOfDetailHandler implements LevelOfDetailHandler {
   private static Logger LOG = Logger.getLogger(DefaultLevelOfDetailHandler.class);

   private double currentLevelOfDetail = 1;

   @Inject
   LevelOfDetailRuleRegistry levelOfDetailRuleRegistry;

   @Override
   public void applyLevelOfDetailRules(final GModelRoot root, final double continuousLevelOfDetail) {
      this.applyToChildren(root, continuousLevelOfDetail);
   }

   @Override
   public void applyLevelOfDetailRules(final GModelRoot root) {
      this.applyToChildren(root, this.getCurrentLevelOfDetail());
   }

   private void applyToChildren(final GModelElement element, final double continuousLevelOfDetail) {
      for (GModelElement child : element.getChildren()) {
         for (LevelOfDetailServerRule serverRule : this.levelOfDetailRuleRegistry.getServerRulesForElement(child)) {
            if (serverRule.getLevelOfDetailRuleTrigger().stream()
               .anyMatch(trigger -> trigger.isTriggered(continuousLevelOfDetail))) {
               serverRule.handle(child);
            }
         }
         this.applyToChildren(child, continuousLevelOfDetail);
      }
   }

   @Override
   public void setCurrentLevelOfDetail(final double level) { this.currentLevelOfDetail = level; }

   @Override
   public double getCurrentLevelOfDetail() { return this.currentLevelOfDetail; }
}
