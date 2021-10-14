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

import java.util.List;

import org.eclipse.glsp.server.actions.ResponseAction;

public class SetLevelOfDetailRulesAction extends ResponseAction {
   public static final String ID = "setLevelOfDetailRules";
   // private JsonArray rules;
   private List<LevelOfDetailRuleAssignment> ruleAssignments;

   public SetLevelOfDetailRulesAction() {
      super(ID);
   }

   public SetLevelOfDetailRulesAction(final List<LevelOfDetailRuleAssignment> ruleAssignments) {
      this();
      this.ruleAssignments = ruleAssignments;
   }

   public static class LevelOfDetailRuleAssignment {
      private final String element;
      private final List<LevelOfDetailRule> rules;

      public LevelOfDetailRuleAssignment(final String element, final List<LevelOfDetailRule> rules) {
         super();
         this.element = element;
         this.rules = rules;
      }
   }
}
