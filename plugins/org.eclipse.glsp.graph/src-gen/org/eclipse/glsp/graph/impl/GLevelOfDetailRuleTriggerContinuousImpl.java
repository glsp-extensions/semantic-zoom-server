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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.glsp.graph.GLevelOfDetailRuleTriggerContinuous;
import org.eclipse.glsp.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GLevel Of Detail Rule Trigger Continuous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLevelOfDetailRuleTriggerContinuousImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLevelOfDetailRuleTriggerContinuousImpl#getTriggerContinuousLevelFrom <em>Trigger Continuous Level From</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLevelOfDetailRuleTriggerContinuousImpl#getTriggerContinuousLevelTo <em>Trigger Continuous Level To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GLevelOfDetailRuleTriggerContinuousImpl extends MinimalEObjectImpl.Container
   implements GLevelOfDetailRuleTriggerContinuous {
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
    * The default value of the '{@link #getTriggerContinuousLevelFrom() <em>Trigger Continuous Level From</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTriggerContinuousLevelFrom()
    * @generated
    * @ordered
    */
   protected static final double TRIGGER_CONTINUOUS_LEVEL_FROM_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getTriggerContinuousLevelFrom() <em>Trigger Continuous Level From</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTriggerContinuousLevelFrom()
    * @generated
    * @ordered
    */
   protected double triggerContinuousLevelFrom = TRIGGER_CONTINUOUS_LEVEL_FROM_EDEFAULT;

   /**
    * The default value of the '{@link #getTriggerContinuousLevelTo() <em>Trigger Continuous Level To</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTriggerContinuousLevelTo()
    * @generated
    * @ordered
    */
   protected static final double TRIGGER_CONTINUOUS_LEVEL_TO_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getTriggerContinuousLevelTo() <em>Trigger Continuous Level To</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTriggerContinuousLevelTo()
    * @generated
    * @ordered
    */
   protected double triggerContinuousLevelTo = TRIGGER_CONTINUOUS_LEVEL_TO_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GLevelOfDetailRuleTriggerContinuousImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return GraphPackage.Literals.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS;
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
            GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public double getTriggerContinuousLevelFrom() { return triggerContinuousLevelFrom; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setTriggerContinuousLevelFrom(double newTriggerContinuousLevelFrom) {
      double oldTriggerContinuousLevelFrom = triggerContinuousLevelFrom;
      triggerContinuousLevelFrom = newTriggerContinuousLevelFrom;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_FROM,
            oldTriggerContinuousLevelFrom, triggerContinuousLevelFrom));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public double getTriggerContinuousLevelTo() { return triggerContinuousLevelTo; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setTriggerContinuousLevelTo(double newTriggerContinuousLevelTo) {
      double oldTriggerContinuousLevelTo = triggerContinuousLevelTo;
      triggerContinuousLevelTo = newTriggerContinuousLevelTo;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_TO,
            oldTriggerContinuousLevelTo, triggerContinuousLevelTo));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TYPE:
            return getType();
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_FROM:
            return getTriggerContinuousLevelFrom();
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_TO:
            return getTriggerContinuousLevelTo();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TYPE:
            setType((String) newValue);
            return;
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_FROM:
            setTriggerContinuousLevelFrom((Double) newValue);
            return;
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_TO:
            setTriggerContinuousLevelTo((Double) newValue);
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
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TYPE:
            setType(TYPE_EDEFAULT);
            return;
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_FROM:
            setTriggerContinuousLevelFrom(TRIGGER_CONTINUOUS_LEVEL_FROM_EDEFAULT);
            return;
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_TO:
            setTriggerContinuousLevelTo(TRIGGER_CONTINUOUS_LEVEL_TO_EDEFAULT);
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
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_FROM:
            return triggerContinuousLevelFrom != TRIGGER_CONTINUOUS_LEVEL_FROM_EDEFAULT;
         case GraphPackage.GLEVEL_OF_DETAIL_RULE_TRIGGER_CONTINUOUS__TRIGGER_CONTINUOUS_LEVEL_TO:
            return triggerContinuousLevelTo != TRIGGER_CONTINUOUS_LEVEL_TO_EDEFAULT;
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
      result.append(", triggerContinuousLevelFrom: ");
      result.append(triggerContinuousLevelFrom);
      result.append(", triggerContinuousLevelTo: ");
      result.append(triggerContinuousLevelTo);
      result.append(')');
      return result.toString();
   }

} //GLevelOfDetailRuleTriggerContinuousImpl
