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

import org.eclipse.glsp.graph.GVisibilityRule;
import org.eclipse.glsp.graph.GraphFactory;
import org.eclipse.glsp.graph.builder.AbstractGLevelOfDetailRuleBuilder;

public class GVisibilityRuleBuilder extends AbstractGLevelOfDetailRuleBuilder<GVisibilityRule, GVisibilityRuleBuilder> {

   protected boolean setVisibility;

   public GVisibilityRuleBuilder setSetVisibility(final boolean setVisibility) {
      this.setVisibility = setVisibility;
      return this;
   }

   @Override
   protected GVisibilityRuleBuilder self() {
      return this;
   }

   @Override
   protected void setProperties(final GVisibilityRule element) {
      element.setSetVisibility(setVisibility);
      super.setProperties(element);
   }

   @Override
   protected GVisibilityRule instantiate() {
      return GraphFactory.eINSTANCE.createGVisibilityRule();
   }
}
