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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.glsp.graph.DefaultTypes;
import org.eclipse.glsp.graph.GCssClassRule;
import org.eclipse.glsp.graph.GraphFactory;
import org.eclipse.glsp.graph.builder.AbstractGLevelOfDetailRuleBuilder;

public class GCssClassRuleBuilder extends AbstractGLevelOfDetailRuleBuilder<GCssClassRule, GCssClassRuleBuilder> {

   protected List<String> classes = new ArrayList<>();

   public GCssClassRuleBuilder() {
      super(DefaultTypes.LEVEL_OF_DETAIL_RULE_CSSCLASS);
   }

   public GCssClassRuleBuilder addClass(final String cssClass) {
      this.classes.add(cssClass);
      return this;
   }

   @Override
   protected GCssClassRuleBuilder self() {
      return this;
   }

   @Override
   protected void setProperties(final GCssClassRule element) {
      element.getClasses().addAll(this.classes);
      super.setProperties(element);
   }

   @Override
   protected GCssClassRule instantiate() {
      return GraphFactory.eINSTANCE.createGCssClassRule();
   }
}
