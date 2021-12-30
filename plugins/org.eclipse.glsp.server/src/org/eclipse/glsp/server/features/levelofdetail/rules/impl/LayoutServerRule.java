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
package org.eclipse.glsp.server.features.levelofdetail.rules.impl;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.glsp.graph.GBoundsAware;
import org.eclipse.glsp.graph.GLayouting;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.server.features.levelofdetail.rules.LevelOfDetailServerRule;

public class LayoutServerRule extends LayoutRule implements LevelOfDetailServerRule {

   public LayoutServerRule(final GLayoutOptions layoutOptions) {
      super(layoutOptions);
   }

   public LayoutServerRule(final LayoutRule layoutRule) {
      super(layoutRule.layoutOptions);
      this.setLevelOfDetailRuleTrigger(layoutRule.getLevelOfDetailRuleTrigger());
   }

   @Override
   public GModelElement handle(final GModelElement element) {

      if (element instanceof GBoundsAware) {
         GBoundsAware bae = (GBoundsAware) element;
         GLayouting gl = (GLayouting) element;
         EMap<String, Object> options = gl.getLayoutOptions();

         // replace options
         for (Entry<String, Object> elementEntry : options) {
            if (this.layoutOptions.get(elementEntry.getKey()) != null) {
               elementEntry.setValue(this.layoutOptions.get(elementEntry.getKey()));
            }
         }

         // remove old size so that it will be recalculated
         bae.setSize(null);
      }

      return element;
   }
}
