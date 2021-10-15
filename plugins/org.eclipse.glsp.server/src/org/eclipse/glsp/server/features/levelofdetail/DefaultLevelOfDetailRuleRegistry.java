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
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.server.features.levelofdetail.rules.LevelOfDetailRule;
import org.eclipse.glsp.server.features.levelofdetail.rules.LevelOfDetailServerRule;
import org.eclipse.glsp.server.internal.registry.MapMultiRegistry;

public class DefaultLevelOfDetailRuleRegistry extends MapMultiRegistry<String, LevelOfDetailRule>
   implements LevelOfDetailRuleRegistry {

   public DefaultLevelOfDetailRuleRegistry() {}

   public boolean registerRule(final String key, final LevelOfDetailRule rule) {
      return this.register(key, rule);
   }

   public boolean registerRules(final String[] key, final LevelOfDetailRule rule) {
      return Arrays.stream(key).map((ruleKey) -> {
         return this.registerRule(ruleKey, rule);
      }).allMatch(b -> b == true);
   }

   @Override
   public LevelOfDetailServerRule[] getServerRulesForElement(final GModelElement element) {

      LevelOfDetailServerRule[] serverRules = this.keys().stream()
         .map(key -> this.get(key).stream()
            .filter(rule -> rule instanceof LevelOfDetailServerRule)
            .filter(rule -> this.isAssignedRule(key, element))
            .map(rule -> (LevelOfDetailServerRule) rule)
            .collect(Collectors.toList()))
         .flatMap(Collection::stream)
         .toArray(LevelOfDetailServerRule[]::new);

      return serverRules;
   }

   private boolean isAssignedRule(final String selector, final GModelElement element) {
      if (selector.contains(",")) {
         return Arrays.stream(selector.split(","))
            .map(s -> s.trim())
            .anyMatch(s -> this.isAssignedRule(s, element));
      }

      int substringIndex = this.getNextSubstringIndex(selector);
      String nextSelector = substringIndex > -1 ? selector.substring(substringIndex) : selector;
      int selectorSplitIndex = Math.max(nextSelector.lastIndexOf('>'), nextSelector.lastIndexOf(' '));

      if (nextSelector.contains(">")) {
         if (element.getParent() == null
            || !element.getType().equals(nextSelector.substring(selectorSplitIndex) + 1)
            || !element.getParent().getType().equals(nextSelector.substring(0, selectorSplitIndex))) {
            return false;
         }
         if (substringIndex != -1
            && !this.isAssignedRule(selector.substring(0, substringIndex + selectorSplitIndex),
               element.getParent())) {
            return false;
         }
      } else if (nextSelector.contains(" ")) {
         if (!element.getType().equals(nextSelector.substring(selectorSplitIndex + 1))) {
            return false;
         }
         GModelElement currentParent = element.getParent();
         boolean parentFound = false;
         while (currentParent != null) {
            if (currentParent.getType().equals(nextSelector.substring(0, selectorSplitIndex))) {
               if (substringIndex == -1
                  || this.isAssignedRule(selector.substring(0, substringIndex + selectorSplitIndex),
                     currentParent)) {
                  parentFound = true;
                  break;
               }
            }
            currentParent = currentParent.getParent();
         }
         if (!parentFound) {
            return false;
         }
      } else if (!nextSelector.equals(element.getType())) {
         return false;
      }

      return true;
   }

   private int getNextSubstringIndex(final String ruleSelector) {
      int n = Math.max(ruleSelector.lastIndexOf('>'), ruleSelector.lastIndexOf(' '));
      if (n == -1) {
         return -1;
      }
      String sub = ruleSelector.substring(0, n).trim();
      int n2 = Math.max(sub.lastIndexOf('>'), sub.lastIndexOf(' '));
      if (n2 == -1) {
         return -1;
      }
      return n2 + 1;
   }

   @Override
   public List<LevelOfDetailServerRule> getServerRules() {
      return this.getAll().stream()
         .filter(rule -> rule instanceof LevelOfDetailServerRule)
         .map(rule -> (LevelOfDetailServerRule) rule)
         .collect(Collectors.toList());

   }
}
