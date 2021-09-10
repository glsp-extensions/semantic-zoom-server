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
package org.eclipse.glsp.graph.builder;

import org.eclipse.glsp.graph.GLevelOfDetailRuleTrigger;

public abstract class AbstractLevelOfDetailRuleTriggerBuilder<T extends GLevelOfDetailRuleTrigger, E extends AbstractLevelOfDetailRuleTriggerBuilder<T, E>>
   extends GBuilder<T> {

   protected String type;

   public AbstractLevelOfDetailRuleTriggerBuilder(final String type) {
      this.type = type;
   }

   protected abstract E self();

   @Override
   protected void setProperties(final T element) {
      element.setType(type);
   }
}
