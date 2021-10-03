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

import java.util.Map;

import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GLayoutRule;
import org.eclipse.glsp.graph.GraphFactory;
import org.eclipse.glsp.graph.builder.AbstractGLevelOfDetailServerRuleBuilder;

public class GLayoutRuleBuilder extends AbstractGLevelOfDetailServerRuleBuilder<GLayoutRule, GLayoutRuleBuilder> {

   protected String layout;
   protected Map<String, Object> layoutOptions;

   public GLayoutRuleBuilder() {
      super(DefaultTypes.LEVEL_OF_DETAIL_RULE_LAYOUT);
   }

   public GLayoutRuleBuilder layoutOptions(final Map<String, Object> layoutOptions) {
      this.layoutOptions = layoutOptions;
      return self();
   }

   public GLayoutRuleBuilder layout(final String layout) {
      this.layout = layout;
      return self();
   }

   @Override
   protected GLayoutRuleBuilder self() {
      return this;
   }

   @Override
   protected void setProperties(final GLayoutRule element) {
      super.setProperties(element);
      if (layoutOptions != null) {
         element.getLayoutOptions().putAll(layoutOptions);
      }
      element.setLayout(layout);
   }

   @Override
   protected GLayoutRule instantiate() {
      return GraphFactory.eINSTANCE.createGLayoutRule();
   }
}
