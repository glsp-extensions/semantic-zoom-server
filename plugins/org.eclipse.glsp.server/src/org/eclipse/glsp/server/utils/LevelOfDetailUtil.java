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
package org.eclipse.glsp.server.utils;

import org.apache.log4j.Logger;
import org.eclipse.glsp.graph.GLevelOfDetailRule;
import org.eclipse.glsp.graph.GLevelOfDetailServerRule;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GModelRoot;

public final class LevelOfDetailUtil {
   private static Logger LOG = Logger.getLogger(LaunchUtil.class);

   private LevelOfDetailUtil() {}

   /*
    * Apply all server-side level-of-detail rules to the model
    */
   public static void applyLevelOfDetailRules(final GModelRoot root, final double continuousLevelOfDetail) {
      LOG.debug("applying level of detail rules");
      LevelOfDetailUtil.applyToChildren(root, continuousLevelOfDetail);
   }

   private static void applyToChildren(final GModelElement element, final double continuousLevelOfDetail) {
      for (GModelElement child : element.getChildren()) {
         for (GLevelOfDetailRule rule : element.getLevelOfDetailRules()) {
            if (rule instanceof GLevelOfDetailServerRule) {
               final GLevelOfDetailServerRule serverRule = (GLevelOfDetailServerRule) rule;
               if (serverRule.isHandleAlways() || rule.getTrigger().isTriggered(continuousLevelOfDetail)) {
                  try {
                     serverRule.handle(element);
                  } catch (UnsupportedOperationException e) {
                     LOG.warn("Level-of-detail server rule with type \"" + rule.getType()
                        + "\" was not handled because no implementation was found (UnsupportedOperationException was thrown).");
                  }
               }
            }
         }

         LevelOfDetailUtil.applyToChildren(child, continuousLevelOfDetail);
      }
   }
}
