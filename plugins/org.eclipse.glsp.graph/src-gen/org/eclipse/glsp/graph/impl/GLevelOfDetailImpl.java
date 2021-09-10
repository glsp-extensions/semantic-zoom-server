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
package org.eclipse.glsp.graph.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.glsp.graph.GLevelOfDetail;
import org.eclipse.glsp.graph.GLevelOfDetailRule;
import org.eclipse.glsp.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GLevel Of Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLevelOfDetailImpl#getLevelOfDetailRules <em>Level Of Detail Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GLevelOfDetailImpl extends MinimalEObjectImpl.Container implements GLevelOfDetail {
   /**
    * The cached value of the '{@link #getLevelOfDetailRules() <em>Level Of Detail Rules</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLevelOfDetailRules()
    * @generated
    * @ordered
    */
   protected EList<GLevelOfDetailRule> levelOfDetailRules;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GLevelOfDetailImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return GraphPackage.Literals.GLEVEL_OF_DETAIL;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<GLevelOfDetailRule> getLevelOfDetailRules() {
      if (levelOfDetailRules == null) {
         levelOfDetailRules = new EObjectResolvingEList<GLevelOfDetailRule>(GLevelOfDetailRule.class, this,
            GraphPackage.GLEVEL_OF_DETAIL__LEVEL_OF_DETAIL_RULES);
      }
      return levelOfDetailRules;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case GraphPackage.GLEVEL_OF_DETAIL__LEVEL_OF_DETAIL_RULES:
            return getLevelOfDetailRules();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case GraphPackage.GLEVEL_OF_DETAIL__LEVEL_OF_DETAIL_RULES:
            getLevelOfDetailRules().clear();
            getLevelOfDetailRules().addAll((Collection<? extends GLevelOfDetailRule>) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case GraphPackage.GLEVEL_OF_DETAIL__LEVEL_OF_DETAIL_RULES:
            getLevelOfDetailRules().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case GraphPackage.GLEVEL_OF_DETAIL__LEVEL_OF_DETAIL_RULES:
            return levelOfDetailRules != null && !levelOfDetailRules.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //GLevelOfDetailImpl
