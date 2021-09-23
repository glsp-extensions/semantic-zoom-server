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
package org.eclipse.glsp.graph.builder.impl;

import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GScaleRule;
import org.eclipse.glsp.graph.GraphFactory;
import org.eclipse.glsp.graph.builder.AbstractGLevelOfDetailRuleBuilder;

public class GScaleRuleBuilder extends AbstractGLevelOfDetailRuleBuilder<GScaleRule, GScaleRuleBuilder> {

   protected double scale = 1;

   protected boolean multiplyWithCLevel = false;
   protected boolean sumWithCLevel = false;

   public GScaleRuleBuilder() {
      super(DefaultTypes.LEVEL_OF_DETAIL_RULE_SCALE);
   }

   public GScaleRuleBuilder scale(final double d) {
      this.scale = d;
      return this;
   }

   public GScaleRuleBuilder multiplyWithCLevel(final boolean multiplyWithCLevel) {
      this.multiplyWithCLevel = multiplyWithCLevel;
      return this;
   }

   public GScaleRuleBuilder sumWithCLevel(final boolean sumWithCLevel) {
      this.sumWithCLevel = sumWithCLevel;
      return this;
   }

   @Override
   protected GScaleRuleBuilder self() {
      return this;
   }

   @Override
   protected void setProperties(final GScaleRule element) {
      element.setScale(this.scale);
      element.setSumWithCLevel(this.sumWithCLevel);
      element.setMultiplyWithCLevel(this.multiplyWithCLevel);
      super.setProperties(element);
   }

   @Override
   protected GScaleRule instantiate() {
      return GraphFactory.eINSTANCE.createGScaleRule();
   }
}
