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

import java.util.ArrayList;
import java.util.List;

public class LevelOfDetailRuleTriggerDiscrete extends LevelOfDetailRuleTrigger {
   private final static String TYPE = "lod:rule-trigger-discrete";

   private final List<DiscreteLevelOfDetailEnum> triggerDiscreteLevel = new ArrayList<>();

   public LevelOfDetailRuleTriggerDiscrete() {
      super(TYPE);
   }

   public LevelOfDetailRuleTriggerDiscrete addDiscreteLevelOfDetail(final DiscreteLevelOfDetailEnum discreteLevel) {
      this.triggerDiscreteLevel.add(discreteLevel);
      return this;
   }

   @Override
   public boolean isTriggered(final double cLevel) {
      DiscreteLevelOfDetailEnum dLevel = DiscreteLevelOfDetailEnum.getDiscreteLevelForContinuousLevel(cLevel);
      return this.triggerDiscreteLevel.stream().anyMatch(level -> level == dLevel);
   }
}
