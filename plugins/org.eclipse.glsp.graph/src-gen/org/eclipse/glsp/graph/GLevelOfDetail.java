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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GLevel Of Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.GLevelOfDetail#getLevelOfDetailRules <em>Level Of Detail Rules</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.graph.GraphPackage#getGLevelOfDetail()
 * @model
 * @generated
 */
public interface GLevelOfDetail extends EObject {
   /**
    * Returns the value of the '<em><b>Level Of Detail Rules</b></em>' reference list.
    * The list contents are of type {@link org.eclipse.glsp.graph.GLevelOfDetailRule}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Level Of Detail Rules</em>' reference list.
    * @see org.eclipse.glsp.graph.GraphPackage#getGLevelOfDetail_LevelOfDetailRules()
    * @model
    * @generated
    */
   EList<GLevelOfDetailRule> getLevelOfDetailRules();

} // GLevelOfDetail
