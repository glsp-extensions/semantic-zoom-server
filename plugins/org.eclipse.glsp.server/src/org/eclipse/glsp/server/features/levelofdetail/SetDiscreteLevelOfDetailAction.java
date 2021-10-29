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
package org.eclipse.glsp.server.features.levelofdetail;

import org.eclipse.glsp.server.actions.ResponseAction;

import com.google.gson.JsonArray;

public class SetDiscreteLevelOfDetailAction extends ResponseAction {

   public static final String ID = "setDiscreteLevelOfDetail";
   private JsonArray discreteLevels;

   public SetDiscreteLevelOfDetailAction() {
      super(ID);
   }

   public SetDiscreteLevelOfDetailAction(final JsonArray jsonArray) {
      this();
      this.discreteLevels = jsonArray;
   }
}