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
 * A representation of the model object '<em><b>GLevel Of Detail Server Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.glsp.graph.GLevelOfDetailServerRule#isHandleAlways <em>Handle Always</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.graph.GraphPackage#getGLevelOfDetailServerRule()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GLevelOfDetailServerRule extends GLevelOfDetailRule {
   /**
    * Returns the value of the '<em><b>Handle Always</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @return the value of the '<em>Handle Always</em>' attribute.
    * @see #setHandleAlways(boolean)
    * @see org.eclipse.glsp.graph.GraphPackage#getGLevelOfDetailServerRule_HandleAlways()
    * @model required="true"
    * @generated
    */
   boolean isHandleAlways();

   /**
    * Sets the value of the '{@link org.eclipse.glsp.graph.GLevelOfDetailServerRule#isHandleAlways <em>Handle
    * Always</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @param value the new value of the '<em>Handle Always</em>' attribute.
    * @see #isHandleAlways()
    * @generated
    */
   void setHandleAlways(boolean value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @model required="true" elementRequired="true"
    * @generated
    */
   GModelElement handle(GModelElement element);
} // GLevelOfDetailServerRule
