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

public enum DiscreteLevelOfDetailEnum {

   OVERVIEW(1.25, null),

   INTERMEDIATE(0.5, 1.25),

   INTERMEDIATE_DETAIL(0.25, 0.5),

   DETAIL(null, 0.25);

   private final Double from;

   private final Double to;

   DiscreteLevelOfDetailEnum(final Double from, final Double to) {
      this.from = from;
      this.to = to;
   }

   public Double getFrom() { return from; }

   public Double getTo() { return to; }

   public static DiscreteLevelOfDetailEnum getDiscreteLevelForContinuousLevel(final double cLevel) {
      for (DiscreteLevelOfDetailEnum dLevel : DiscreteLevelOfDetailEnum.values()) {
         if (dLevel.getFrom() == null && dLevel.getTo() == null) {
            return dLevel;
         } else if (dLevel.getFrom() == null && cLevel < dLevel.getTo()) {
            return dLevel;
         } else if (dLevel.getTo() == null && cLevel >= dLevel.getFrom()) {
            return dLevel;
         } else if (dLevel.getTo() != null && dLevel.getFrom() != null && cLevel < dLevel.getTo()
            && cLevel >= dLevel.getFrom()) {
            return dLevel;
         }
      }
      return null;
   }
}
