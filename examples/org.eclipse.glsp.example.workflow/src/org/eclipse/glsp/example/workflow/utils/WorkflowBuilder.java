/********************************************************************************
 * Copyright (c) 2019 EclipseSource and others.
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
package org.eclipse.glsp.example.workflow.utils;

import org.eclipse.glsp.example.workflow.wfgraph.ActivityNode;
import org.eclipse.glsp.example.workflow.wfgraph.Icon;
import org.eclipse.glsp.example.workflow.wfgraph.TaskNode;
import org.eclipse.glsp.example.workflow.wfgraph.WeightedEdge;
import org.eclipse.glsp.example.workflow.wfgraph.WfgraphFactory;
import org.eclipse.glsp.graph.GCompartment;
import org.eclipse.glsp.graph.GDiscreteLevelOfDetail;
import org.eclipse.glsp.graph.GLabel;
import org.eclipse.glsp.graph.builder.AbstractGCompartmentBuilder;
import org.eclipse.glsp.graph.builder.AbstractGEdgeBuilder;
import org.eclipse.glsp.graph.builder.AbstractGNodeBuilder;
import org.eclipse.glsp.graph.builder.impl.GCompartmentBuilder;
import org.eclipse.glsp.graph.builder.impl.GCssStyleRuleBuilder;
import org.eclipse.glsp.graph.builder.impl.GLabelBuilder;
import org.eclipse.glsp.graph.builder.impl.GLayoutOptions;
import org.eclipse.glsp.graph.builder.impl.GLayoutRuleBuilder;
import org.eclipse.glsp.graph.builder.impl.GLevelOfDetailRuleTriggerContinuousBuilder;
import org.eclipse.glsp.graph.builder.impl.GLevelOfDetailRuleTriggerDiscreteBuilder;
import org.eclipse.glsp.graph.builder.impl.GVisibilityRuleBuilder;
import org.eclipse.glsp.graph.util.GConstants;
import org.eclipse.glsp.graph.util.GConstants.HAlign;

public final class WorkflowBuilder {

   public static class WeightedEdgeBuilder extends AbstractGEdgeBuilder<WeightedEdge, WeightedEdgeBuilder> {

      private String probability;

      public WeightedEdgeBuilder() {
         super(ModelTypes.WEIGHTED_EDGE);
      }

      public WeightedEdgeBuilder probability(final String probability) {
         this.probability = probability;
         return self();
      }

      @Override
      protected void setProperties(final WeightedEdge edge) {
         super.setProperties(edge);
         edge.setProbability(probability);
      }

      @Override
      protected WeightedEdge instantiate() {
         return WfgraphFactory.eINSTANCE.createWeightedEdge();
      }

      @Override
      protected WeightedEdgeBuilder self() {
         return this;
      }

   }

   public static class ActivityNodeBuilder extends AbstractGNodeBuilder<ActivityNode, ActivityNodeBuilder> {
      protected String nodeType;

      public ActivityNodeBuilder(final String type, final String nodeType) {
         super(type);
         this.nodeType = nodeType;
      }

      @Override
      protected void setProperties(final ActivityNode node) {
         super.setProperties(node);
         node.setNodeType(nodeType);
      }

      @Override
      protected ActivityNode instantiate() {
         return WfgraphFactory.eINSTANCE.createActivityNode();
      }

      @Override
      protected ActivityNodeBuilder self() {
         return this;
      }
   }

   public static class TaskNodeBuilder extends AbstractGNodeBuilder<TaskNode, TaskNodeBuilder> {
      private final String name;
      private final String taskType;
      private final int duration;

      public TaskNodeBuilder(final String type, final String name, final String taskType, final int duration) {
         super(type);
         this.name = name;
         this.taskType = taskType;
         this.duration = duration;

      }

      @Override
      protected TaskNode instantiate() {
         return WfgraphFactory.eINSTANCE.createTaskNode();
      }

      @Override
      protected TaskNodeBuilder self() {
         return this;
      }

      @Override
      public void setProperties(final TaskNode taskNode) {
         // this.addLevelOfDetailRule(
         // new GScaleRuleBuilder()
         // .setLevelOfDetailRuleTrigger(
         // new GLevelOfDetailRuleTriggerDiscreteBuilder()
         // .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.OVERVIEW)
         // .build())
         // .scale(1)
         // .multiplyWithCLevel(true)
         // .build());
         // this.addLevelOfDetailRule(
         // new GLayoutRuleBuilder()
         // .setLevelOfDetailRuleTrigger(
         // new GLevelOfDetailRuleTriggerDiscreteBuilder()
         // .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.OVERVIEW)
         // .build())
         // .layoutOptions(new GLayoutOptions()
         // .paddingBottom(5D)
         // .paddingTop(5D)
         // .paddingLeft(10D)
         // .paddingRight(15D))
         // .build());
         this.addLevelOfDetailRule(
            new GLayoutRuleBuilder()
               .setLevelOfDetailRuleTrigger(
                  new GLevelOfDetailRuleTriggerDiscreteBuilder()
                     .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.OVERVIEW)
                     .build())
               .layoutOptions(new GLayoutOptions()
                  .paddingBottom(3D)
                  .paddingTop(3D))
               .build());
         super.setProperties(taskNode);
         taskNode.setName(name);
         taskNode.setTaskType(taskType);
         taskNode.setDuration(duration);
         taskNode.setLayout(GConstants.Layout.VBOX);
         taskNode.getChildren().add(createCompartment(taskNode));
      }

      private GCompartment createCompartment(final TaskNode taskNode) {
         return new GCompartmentBuilder(ModelTypes.COMP_HEADER) //
            .id(taskNode.getId() + "_header") //
            .layout(GConstants.Layout.HBOX) //
            .add(createCompartmentIcon(taskNode)) //
            .add(new GCompartmentBuilder(ModelTypes.COMP_HEADER)
               .id(taskNode.getId() + "_header_compartment")
               .layout(GConstants.Layout.VBOX)
               .add(createCompartmentHeader(taskNode))
               .add(createCompartmentDuration(taskNode))
               .add(createCompartmentType(taskNode))
               .build())
            // .addLevelOfDetailRule(
            // new GScaleRuleBuilder()
            // .setLevelOfDetailRuleTrigger(
            // new GLevelOfDetailRuleTriggerContinuousBuilder()
            // .setFrom(1.0001)
            // .setTo(1.4)
            // .build())
            // .scale(1)
            // .multiplyWithCLevel(true)
            // .build())
            // .addLevelOfDetailRule(
            // new GScaleRuleBuilder()
            // .setLevelOfDetailRuleTrigger(
            // new GLevelOfDetailRuleTriggerContinuousBuilder()
            // .setFrom(1.4001)
            // .setTo(999999)
            // .build())
            // .scale(1.4)
            // .build())
            .build();
      }

      private GLabel createCompartmentHeader(final TaskNode taskNode) {
         return new GLabelBuilder(ModelTypes.LABEL_HEADING) //
            .id(taskNode.getId() + "_classname") //
            .text(taskNode.getName()) //
            .addLevelOfDetailRule(
               new GCssStyleRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerDiscreteBuilder()
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.DETAIL)
                        .build())
                  .addStyle("font-size", "50%")
                  .build())
            .addLevelOfDetailRule(
               new GCssStyleRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerDiscreteBuilder()
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.DETAIL2)
                        .build())
                  .addStyle("font-size", "33%")
                  .build())
            .addLevelOfDetailRule(
               new GCssStyleRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerDiscreteBuilder()
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.OVERVIEW)
                        .build())
                  .addStyle("font-size", "150%")
                  .build())

            .build();
      }

      private GLabel createCompartmentDuration(final TaskNode taskNode) {
         return new GLabelBuilder(ModelTypes.LABEL_TEXT) //
            .id(taskNode.getId() + "_duration") //
            .text("Duration: " + taskNode.getDuration()) //
            .addLevelOfDetailRule(
               new GVisibilityRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerDiscreteBuilder()
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.INTERMEDIATE)
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.OVERVIEW)
                        .build())
                  .setSetVisibility(false)
                  .build())
            .addLevelOfDetailRule(
               new GCssStyleRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerContinuousBuilder()
                        .setFrom(0.25)
                        .setTo(0.5)
                        .build())
                  // .setLevelOfDetailRuleTrigger(
                  // new GLevelOfDetailRuleTriggerDiscreteBuilder()
                  // .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.DETAIL)
                  // .build())
                  .addStyle("font-size", "50%")
                  .build())
            .addLevelOfDetailRule(
               new GCssStyleRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerDiscreteBuilder()
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.DETAIL2)
                        .build())
                  .addStyle("font-size", "33%")
                  .build())
            .build();
      }

      private GLabel createCompartmentType(final TaskNode taskNode) {
         return new GLabelBuilder(ModelTypes.LABEL_TEXT) //
            .id(taskNode.getId() + "_type") //
            .text("Type: " + taskNode.getTaskType()) //
            .addLevelOfDetailRule(
               new GVisibilityRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerDiscreteBuilder()
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.INTERMEDIATE)
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.OVERVIEW)
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.DETAIL)
                        .build())
                  .setSetVisibility(false)
                  .build())
            .addLevelOfDetailRule(
               new GCssStyleRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerDiscreteBuilder()
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.DETAIL2)
                        .build())
                  .addStyle("font-size", "33%")
                  .build())
            .build();
      }

      private Icon createCompartmentIcon(final TaskNode taskNode) {
         return new IconBuilder() //
            .id(taskNode.getId() + "_icon") //
            .layout(GConstants.Layout.STACK) //
            .layoutOptions(new GLayoutOptions() //
               .hAlign(HAlign.CENTER) //
               .resizeContainer(false)) //
            .addLevelOfDetailRule(
               new GVisibilityRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerDiscreteBuilder()
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.OVERVIEW)
                        .build())
                  .setSetVisibility(false)
                  .build())
            .addLevelOfDetailRule(
               new GLayoutRuleBuilder()
                  .setLevelOfDetailRuleTrigger(
                     new GLevelOfDetailRuleTriggerDiscreteBuilder()
                        .addDiscreteLevelOfDetail(GDiscreteLevelOfDetail.OVERVIEW)
                        .build())
                  .layoutOptions(
                     new GLayoutOptions()
                        .resizeContainer(true))
                  .setHandleAlways(true)
                  .build())
            .add(createCompartmentIconLabel(taskNode)).build();
      }

      private GLabel createCompartmentIconLabel(final TaskNode taskNode) {
         return new GLabelBuilder(ModelTypes.LABEL_ICON) //
            .id(taskNode.getId() + "_ticon") //
            .text("" + taskNode.getTaskType().toUpperCase().charAt(0)) //
            .build();
      }

   }

   public static class IconBuilder extends AbstractGCompartmentBuilder<Icon, IconBuilder> {

      public IconBuilder() {
         super(ModelTypes.ICON);
      }

      @Override
      protected Icon instantiate() {
         return WfgraphFactory.eINSTANCE.createIcon();
      }

      @Override
      protected IconBuilder self() {
         return this;
      }

   }

   private WorkflowBuilder() {}
}
