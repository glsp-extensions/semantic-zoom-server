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

import java.util.Arrays;
import java.util.List;

import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.actions.BasicActionHandler;
import org.eclipse.glsp.server.features.levelofdetail.rules.DiscreteLevelOfDetailEnum;
import org.eclipse.glsp.server.gson.GraphGsonConfigurationFactory;
import org.eclipse.glsp.server.model.GModelState;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.inject.Inject;

public class RequestDiscreteLevelOfDetailActionHandler extends BasicActionHandler<RequestDiscreteLevelOfDetailAction> {

   protected final Gson gson;

   @Inject
   public RequestDiscreteLevelOfDetailActionHandler(final GraphGsonConfigurationFactory gsonConfigurator) {
      GsonBuilder builder = gsonConfigurator.configureGson();
      gson = builder.create();
   }

   @Override
   protected List<Action> executeAction(final RequestDiscreteLevelOfDetailAction actualAction,
      final GModelState modelState) {

      JsonArray jsonArray = new JsonArray();

      Arrays.stream(DiscreteLevelOfDetailEnum.values())
         .map((final DiscreteLevelOfDetailEnum level) -> {
            JsonObject obj = new JsonObject();
            obj.addProperty("name", level.name());
            obj.addProperty("from", level.getFrom());
            obj.addProperty("to", level.getTo());
            return obj;
         })
         .forEach(jsonArray::add);

      return listOf(new SetDiscreteLevelOfDetailAction(jsonArray));
   }
}
