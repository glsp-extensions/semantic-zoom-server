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
import org.eclipse.glsp.graph.GLevelOfDetailRuleTriggerDouble;
import org.eclipse.glsp.graph.GraphFactory;
import org.eclipse.glsp.graph.builder.AbstractLevelOfDetailRuleTriggerBuilder;

public class GLevelOfDetailRuleTriggerContinuousBuilder
   extends
   AbstractLevelOfDetailRuleTriggerBuilder<GLevelOfDetailRuleTriggerDouble, GLevelOfDetailRuleTriggerContinuousBuilder> {

   public GLevelOfDetailRuleTriggerContinuousBuilder() {
      super(DefaultTypes.LEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS);
   }

   protected double from;
   protected double to;

   public GLevelOfDetailRuleTriggerContinuousBuilder setFrom(final double from) {
      this.from = from;
      return this;
   }

   public GLevelOfDetailRuleTriggerContinuousBuilder setTo(final double to) {
      this.to = to;
      return this;
   }

   @Override
   protected GLevelOfDetailRuleTriggerContinuousBuilder self() {
      return this;
   }

   @Override
   protected GLevelOfDetailRuleTriggerDouble instantiate() {
      return GraphFactory.eINSTANCE.createGLevelOfDetailRuleTriggerDouble();
   }

   @Override
   protected void setProperties(final GLevelOfDetailRuleTriggerDouble element) {
      element.setTriggerContinuousLevelFrom(from);
      element.setTriggerContinuousLevelTo(to);
      super.setProperties(element);
   }

}
