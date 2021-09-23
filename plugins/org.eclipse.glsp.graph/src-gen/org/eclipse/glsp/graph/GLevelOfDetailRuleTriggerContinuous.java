/**
 * Copyright (c) 2019-2021 EclipseSource and others.
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
 * ********************************************************************************
 */
package org.eclipse.glsp.graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GLevel Of Detail Rule Trigger Continuous</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.GLevelOfDetailRuleTriggerContinuous#getTriggerContinuousLevelFrom <em>Trigger Continuous Level From</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.GLevelOfDetailRuleTriggerContinuous#getTriggerContinuousLevelTo <em>Trigger Continuous Level To</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.graph.GraphPackage#getGLevelOfDetailRuleTriggerContinuous()
 * @model
 * @generated
 */
public interface GLevelOfDetailRuleTriggerContinuous extends GLevelOfDetailRuleTrigger {
   /**
    * Returns the value of the '<em><b>Trigger Continuous Level From</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Trigger Continuous Level From</em>' attribute.
    * @see #setTriggerContinuousLevelFrom(double)
    * @see org.eclipse.glsp.graph.GraphPackage#getGLevelOfDetailRuleTriggerContinuous_TriggerContinuousLevelFrom()
    * @model required="true"
    * @generated
    */
   double getTriggerContinuousLevelFrom();

   /**
    * Sets the value of the '{@link org.eclipse.glsp.graph.GLevelOfDetailRuleTriggerContinuous#getTriggerContinuousLevelFrom <em>Trigger Continuous Level From</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Trigger Continuous Level From</em>' attribute.
    * @see #getTriggerContinuousLevelFrom()
    * @generated
    */
   void setTriggerContinuousLevelFrom(double value);

   /**
    * Returns the value of the '<em><b>Trigger Continuous Level To</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Trigger Continuous Level To</em>' attribute.
    * @see #setTriggerContinuousLevelTo(double)
    * @see org.eclipse.glsp.graph.GraphPackage#getGLevelOfDetailRuleTriggerContinuous_TriggerContinuousLevelTo()
    * @model required="true"
    * @generated
    */
   double getTriggerContinuousLevelTo();

   /**
    * Sets the value of the '{@link org.eclipse.glsp.graph.GLevelOfDetailRuleTriggerContinuous#getTriggerContinuousLevelTo <em>Trigger Continuous Level To</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Trigger Continuous Level To</em>' attribute.
    * @see #getTriggerContinuousLevelTo()
    * @generated
    */
   void setTriggerContinuousLevelTo(double value);

} // GLevelOfDetailRuleTriggerContinuous
