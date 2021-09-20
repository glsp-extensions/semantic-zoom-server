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
 * A representation of the model object '<em><b>GScale Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.GScaleRule#getScale <em>Scale</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.GScaleRule#isMultiplyWithCLevel <em>Multiply With CLevel</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.GScaleRule#isSumWithCLevel <em>Sum With CLevel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.glsp.graph.GraphPackage#getGScaleRule()
 * @model
 * @generated
 */
public interface GScaleRule extends GLevelOfDetailRule {
   /**
    * Returns the value of the '<em><b>Scale</b></em>' attribute.
    * The default value is <code>"1"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the value of the '<em>Scale</em>' attribute.
    * @see #setScale(double)
    * @see org.eclipse.glsp.graph.GraphPackage#getGScaleRule_Scale()
    * @model default="1" required="true"
    * @generated
    */
   double getScale();

   /**
    * Sets the value of the '{@link org.eclipse.glsp.graph.GScaleRule#getScale <em>Scale</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Scale</em>' attribute.
    * @see #getScale()
    * @generated
    */
   void setScale(double value);

   /**
    * Returns the value of the '<em><b>Multiply With CLevel</b></em>' attribute.
    * The default value is <code>"false"</code>.
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @return the value of the '<em>Multiply With CLevel</em>' attribute.
    * @see #setMultiplyWithCLevel(boolean)
    * @see org.eclipse.glsp.graph.GraphPackage#getGScaleRule_MultiplyWithCLevel()
    * @model default="false" required="true"
    * @generated
    */
   boolean isMultiplyWithCLevel();

   /**
    * Sets the value of the '{@link org.eclipse.glsp.graph.GScaleRule#isMultiplyWithCLevel <em>Multiply With CLevel</em>}' attribute.
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Multiply With CLevel</em>' attribute.
    * @see #isMultiplyWithCLevel()
    * @generated
    */
   void setMultiplyWithCLevel(boolean value);

   /**
    * Returns the value of the '<em><b>Sum With CLevel</b></em>' attribute.
    * The default value is <code>"false"</code>.
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @return the value of the '<em>Sum With CLevel</em>' attribute.
    * @see #setSumWithCLevel(boolean)
    * @see org.eclipse.glsp.graph.GraphPackage#getGScaleRule_SumWithCLevel()
    * @model default="false" required="true"
    * @generated
    */
   boolean isSumWithCLevel();

   /**
    * Sets the value of the '{@link org.eclipse.glsp.graph.GScaleRule#isSumWithCLevel <em>Sum With CLevel</em>}' attribute.
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @param value the new value of the '<em>Sum With CLevel</em>' attribute.
    * @see #isSumWithCLevel()
    * @generated
    */
   void setSumWithCLevel(boolean value);

} // GScaleRule
