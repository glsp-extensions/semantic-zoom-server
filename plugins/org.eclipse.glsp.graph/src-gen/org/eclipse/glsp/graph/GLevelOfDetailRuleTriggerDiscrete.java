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
 * A representation of the model object '<em><b>GLevel Of Detail Rule Trigger Discrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.GLevelOfDetailRuleTriggerDiscrete#getTriggerDiscreteLevel <em>Trigger Discrete Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.graph.GraphPackage#getGLevelOfDetailRuleTriggerDiscrete()
 * @model
 * @generated
 */
public interface GLevelOfDetailRuleTriggerDiscrete extends GLevelOfDetailRuleTrigger {
   /**
    * Returns the value of the '<em><b>Trigger Discrete Level</b></em>' attribute.
    * The literals are from the enumeration {@link org.eclipse.glsp.graph.GDiscreteLevelOfDetail}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Trigger Discrete Level</em>' attribute.
    * @see org.eclipse.glsp.graph.GDiscreteLevelOfDetail
    * @see #setTriggerDiscreteLevel(GDiscreteLevelOfDetail)
    * @see org.eclipse.glsp.graph.GraphPackage#getGLevelOfDetailRuleTriggerDiscrete_TriggerDiscreteLevel()
    * @model required="true"
    * @generated
    */
   GDiscreteLevelOfDetail getTriggerDiscreteLevel();

   /**
    * Sets the value of the '{@link org.eclipse.glsp.graph.GLevelOfDetailRuleTriggerDiscrete#getTriggerDiscreteLevel <em>Trigger Discrete Level</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Trigger Discrete Level</em>' attribute.
    * @see org.eclipse.glsp.graph.GDiscreteLevelOfDetail
    * @see #getTriggerDiscreteLevel()
    * @generated
    */
   void setTriggerDiscreteLevel(GDiscreteLevelOfDetail value);

} // GLevelOfDetailRuleTriggerDiscrete
