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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.actions.BasicActionHandler;
import org.eclipse.glsp.server.features.levelofdetail.SetLevelOfDetailRulesAction.LevelOfDetailRuleAssignment;
import org.eclipse.glsp.server.gson.GraphGsonConfigurationFactory;
import org.eclipse.glsp.server.model.GModelState;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.inject.Inject;

public class RequestLevelOfDetailRulesActionHandler extends BasicActionHandler<RequestLevelOfDetailRulesAction> {
   private static Logger LOG = Logger.getLogger(RequestLevelOfDetailRulesActionHandler.class);

   @Inject
   LevelOfDetailRuleRegistry levelOfDetailRuleRegistry;

   protected final Gson gson;

   @Inject
   public RequestLevelOfDetailRulesActionHandler(final GraphGsonConfigurationFactory gsonConfigurator) {
      GsonBuilder builder = gsonConfigurator.configureGson();
      gson = builder.create();
   }

   @Override
   protected List<Action> executeAction(final RequestLevelOfDetailRulesAction actualAction,
      final GModelState modelState) {

      LOG.debug("RequestLevelOfDetailRulesActionHandler");

      List<LevelOfDetailRuleAssignment> list = new ArrayList<>();

      this.levelOfDetailRuleRegistry.keys().stream()
         .forEach(key -> {
            list.add(new LevelOfDetailRuleAssignment(key, this.levelOfDetailRuleRegistry.get(key).stream()
               .filter(rule -> !(rule instanceof LevelOfDetailServerRule))
               .collect(Collectors.toList())));
         });

      return listOf(new SetLevelOfDetailRulesAction(list));
   }

}
