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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.glsp.graph.GDiscreteLevelOfDetail;
import org.eclipse.glsp.graph.GLevelOfDetailRuleTriggerDiscrete;
import org.eclipse.glsp.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GLevel Of Detail Rule Trigger Discrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLevelOfDetailRuleTriggerDiscreteImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLevelOfDetailRuleTriggerDiscreteImpl#getTriggerDiscreteLevel <em>Trigger Discrete Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GLevelOfDetailRuleTriggerDiscreteImpl extends MinimalEObjectImpl.Container
   implements GLevelOfDetailRuleTriggerDiscrete {
   /**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected static final String TYPE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getType()
    * @generated
    * @ordered
    */
   protected String type = TYPE_EDEFAULT;

   /**
    * The cached value of the '{@link #getTriggerDiscreteLevel() <em>Trigger Discrete Level</em>}' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTriggerDiscreteLevel()
    * @generated
    * @ordered
    */
   protected EList<GDiscreteLevelOfDetail> triggerDiscreteLevel;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GLevelOfDetailRuleTriggerDiscreteImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return GraphPackage.Literals.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String getType() { return type; }

   /**
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setType(String newType) {
      String oldType = type;
      type = newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<GDiscreteLevelOfDetail> getTriggerDiscreteLevel() {
      if (triggerDiscreteLevel == null) {
         triggerDiscreteLevel = new EDataTypeUniqueEList<GDiscreteLevelOfDetail>(GDiscreteLevelOfDetail.class, this,
            GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TRIGGER_DISCRETE_LEVEL);
      }
      return triggerDiscreteLevel;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TYPE:
            return getType();
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TRIGGER_DISCRETE_LEVEL:
            return getTriggerDiscreteLevel();
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
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TYPE:
            setType((String) newValue);
            return;
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TRIGGER_DISCRETE_LEVEL:
            getTriggerDiscreteLevel().clear();
            getTriggerDiscreteLevel().addAll((Collection<? extends GDiscreteLevelOfDetail>) newValue);
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
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TYPE:
            setType(TYPE_EDEFAULT);
            return;
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TRIGGER_DISCRETE_LEVEL:
            getTriggerDiscreteLevel().clear();
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
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_DISCRETE__TRIGGER_DISCRETE_LEVEL:
            return triggerDiscreteLevel != null && !triggerDiscreteLevel.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy())
         return super.toString();

      StringBuilder result = new StringBuilder(super.toString());
      result.append(" (type: ");
      result.append(type);
      result.append(", triggerDiscreteLevel: ");
      result.append(triggerDiscreteLevel);
      result.append(')');
      return result.toString();
   }

} //GLevelOfDetailRuleTriggerDiscreteImpl
