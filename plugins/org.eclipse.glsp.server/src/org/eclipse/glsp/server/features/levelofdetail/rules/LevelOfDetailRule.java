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
package org.eclipse.glsp.server.features.levelofdetail.rules;

import java.util.ArrayList;

public abstract class LevelOfDetailRule implements LevelOfDetailRuleInterface {
   private final String type;
   private ArrayList<LevelOfDetailRuleTrigger> trigger = new ArrayList<>();

   public LevelOfDetailRule(final String type) {
      super();
      this.type = type;
   }

   public String getType() { return type; }

   @Override
   public ArrayList<LevelOfDetailRuleTrigger> getLevelOfDetailRuleTrigger() { return trigger; }

   @Override
   public LevelOfDetailRule setLevelOfDetailRuleTrigger(
      final ArrayList<LevelOfDetailRuleTrigger> levelOfDetailRuleTrigger) {
      this.trigger = levelOfDetailRuleTrigger;
      return this;
   }

   @Override
   public LevelOfDetailRule addLevelOfDetailRuleTrigger(final LevelOfDetailRuleTrigger levelOfDetailRuleTrigger) {
      this.trigger.add(levelOfDetailRuleTrigger);
      return this;
   }
}
