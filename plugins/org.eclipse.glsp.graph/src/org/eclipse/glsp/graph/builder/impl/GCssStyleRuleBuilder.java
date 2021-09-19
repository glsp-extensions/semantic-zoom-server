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

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GCssStyleRule;
import org.eclipse.glsp.graph.GraphFactory;
import org.eclipse.glsp.graph.builder.AbstractGLevelOfDetailRuleBuilder;

public class GCssStyleRuleBuilder extends AbstractGLevelOfDetailRuleBuilder<GCssStyleRule, GCssStyleRuleBuilder> {

   protected Map<String, Object> styles = new LinkedHashMap<>();

   public GCssStyleRuleBuilder() {
      super(DefaultTypes.LEVEL_OF_DETAIL_RULE_CSSSTYLE);
   }

   public GCssStyleRuleBuilder addStyle(final String style, final String value) {
      this.styles.put(style, value);
      return this;
   }

   @Override
   protected GCssStyleRuleBuilder self() {
      return this;
   }

   @Override
   protected void setProperties(final GCssStyleRule element) {
      element.getStyles().putAll(this.styles);
      super.setProperties(element);
   }

   @Override
   protected GCssStyleRule instantiate() {
      return GraphFactory.eINSTANCE.createGCssStyleRule();
   }
}
