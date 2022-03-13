/********************************************************************************
 * Copyright (c) 2020 EclipseSource and others.
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
package org.eclipse.glsp.example.workflow;

import org.apache.log4j.Logger;
import org.eclipse.glsp.example.workflow.utils.ModelTypes;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.server.features.levelofdetail.DefaultLevelOfDetailRuleRegistry;
import org.eclipse.glsp.server.features.levelofdetail.rules.DiscreteLevelOfDetailEnum;
import org.eclipse.glsp.server.features.levelofdetail.rules.LevelOfDetailRuleTriggerDiscrete;
import org.eclipse.glsp.server.features.levelofdetail.rules.impl.CssStyleRule;
import org.eclipse.glsp.server.features.levelofdetail.rules.impl.LayoutRule;
import org.eclipse.glsp.server.features.levelofdetail.rules.impl.LayoutServerRule;
import org.eclipse.glsp.server.features.levelofdetail.rules.impl.VisibilityRule;

public class WorkflowLevelOfDetailRuleRegistry extends DefaultLevelOfDetailRuleRegistry {
   private static Logger LOG = Logger.getLogger(WorkflowLevelOfDetailRuleRegistry.class);

   public WorkflowLevelOfDetailRuleRegistry() {
      String task_child_text = ModelTypes.LABEL_TEXT + "," + ModelTypes.LABEL_TYPE_TEXT;

      registerRule(
         ModelTypes.AUTOMATED_TASK + "," + ModelTypes.MANUAL_TASK,
         new LayoutRule(new GLayoutOptions()
            .paddingBottom(3D)
            .paddingTop(3D))
               .addLevelOfDetailRuleTrigger(
                  new LevelOfDetailRuleTriggerDiscrete()
                     .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.OVERVIEW)));

      registerRule(
         ModelTypes.LABEL_HEADING,
         new CssStyleRule()
            .addStyle("font-size", "40%")
            .addLevelOfDetailRuleTrigger(
               new LevelOfDetailRuleTriggerDiscrete()
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.INTERMEDIATE_DETAIL)));
      registerRule(
         ModelTypes.LABEL_HEADING,
         new CssStyleRule()
            .addStyle("font-size", "33%")
            .addLevelOfDetailRuleTrigger(
               new LevelOfDetailRuleTriggerDiscrete()
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.DETAIL)));
      registerRule(
         ModelTypes.LABEL_HEADING,
         new CssStyleRule()
            .addStyle("font-size", "120%")
            .addLevelOfDetailRuleTrigger(
               new LevelOfDetailRuleTriggerDiscrete()
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.OVERVIEW)));

      registerRule(
         task_child_text,
         new VisibilityRule()
            .setSetVisibility(false)
            .addLevelOfDetailRuleTrigger(
               new LevelOfDetailRuleTriggerDiscrete()
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.OVERVIEW)
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.INTERMEDIATE)));

      registerRule(
         task_child_text,
         new CssStyleRule()
            .addStyle("font-size", "30%")
            .addLevelOfDetailRuleTrigger(
               new LevelOfDetailRuleTriggerDiscrete()
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.INTERMEDIATE_DETAIL)));

      registerRule(
         task_child_text,
         new CssStyleRule()
            .addStyle("font-size", "20%")
            .addLevelOfDetailRuleTrigger(
               new LevelOfDetailRuleTriggerDiscrete()
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.DETAIL)));

      registerRule(
         ModelTypes.LABEL_TYPE_TEXT,
         new VisibilityRule()
            .setSetVisibility(false)
            .addLevelOfDetailRuleTrigger(
               new LevelOfDetailRuleTriggerDiscrete()
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.OVERVIEW)
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.INTERMEDIATE_DETAIL)
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.INTERMEDIATE)));

      registerRule(
         ModelTypes.ICON,
         new VisibilityRule()
            .setSetVisibility(false)
            .addLevelOfDetailRuleTrigger(
               new LevelOfDetailRuleTriggerDiscrete()
                  .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.OVERVIEW)));

      // server rule to set resizeContainer to true and recalculate bounds when icon is removed
      LayoutRule iconLayoutRule = new LayoutRule(new GLayoutOptions().resizeContainer(true));
      iconLayoutRule.addLevelOfDetailRuleTrigger(
         new LevelOfDetailRuleTriggerDiscrete()
            .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.OVERVIEW));

      registerRule(ModelTypes.ICON, new LayoutServerRule(iconLayoutRule));

      // server rule to set resizeContainer back to false when icon is added again
      LayoutRule iconLayoutRule2 = new LayoutRule(new GLayoutOptions().resizeContainer(false));
      iconLayoutRule2.addLevelOfDetailRuleTrigger(
         new LevelOfDetailRuleTriggerDiscrete()
            .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.INTERMEDIATE)
            .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.INTERMEDIATE_DETAIL)
            .addDiscreteLevelOfDetail(DiscreteLevelOfDetailEnum.DETAIL));

      registerRule(ModelTypes.ICON, new LayoutServerRule(iconLayoutRule2));
   }
}
