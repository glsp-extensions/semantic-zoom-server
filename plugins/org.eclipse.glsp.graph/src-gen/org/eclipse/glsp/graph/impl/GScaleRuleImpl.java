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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.glsp.graph.GLevelOfDetailRuleTrigger;
import org.eclipse.glsp.graph.GScaleRule;
import org.eclipse.glsp.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GScale Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.impl.GScaleRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GScaleRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GScaleRuleImpl#isHandledByServer <em>Handled By Server</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GScaleRuleImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GScaleRuleImpl#isMultiplyWithCLevel <em>Multiply With CLevel</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GScaleRuleImpl#isSumWithCLevel <em>Sum With CLevel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GScaleRuleImpl extends MinimalEObjectImpl.Container implements GScaleRule {
   /**
    * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTrigger()
    * @generated
    * @ordered
    */
   protected GLevelOfDetailRuleTrigger trigger;

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
    * The default value of the '{@link #isHandledByServer() <em>Handled By Server</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isHandledByServer()
    * @generated
    * @ordered
    */
   protected static final boolean HANDLED_BY_SERVER_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isHandledByServer() <em>Handled By Server</em>}' attribute.
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @see #isHandledByServer()
    * @generated
    * @ordered
    */
   protected boolean handledByServer = HANDLED_BY_SERVER_EDEFAULT;

   /**
    * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getScale()
    * @generated
    * @ordered
    */
   protected static final double SCALE_EDEFAULT = 0.0;

   /**
    * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getScale()
    * @generated
    * @ordered
    */
   protected double scale = SCALE_EDEFAULT;

   /**
    * The default value of the '{@link #isMultiplyWithCLevel() <em>Multiply With CLevel</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isMultiplyWithCLevel()
    * @generated
    * @ordered
    */
   protected static final boolean MULTIPLY_WITH_CLEVEL_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isMultiplyWithCLevel() <em>Multiply With CLevel</em>}' attribute.
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @see #isMultiplyWithCLevel()
    * @generated
    * @ordered
    */
   protected boolean multiplyWithCLevel = MULTIPLY_WITH_CLEVEL_EDEFAULT;

   /**
    * The default value of the '{@link #isSumWithCLevel() <em>Sum With CLevel</em>}' attribute.
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @see #isSumWithCLevel()
    * @generated
    * @ordered
    */
   protected static final boolean SUM_WITH_CLEVEL_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isSumWithCLevel() <em>Sum With CLevel</em>}' attribute.
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @see #isSumWithCLevel()
    * @generated
    * @ordered
    */
   protected boolean sumWithCLevel = SUM_WITH_CLEVEL_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GScaleRuleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return GraphPackage.Literals.GSCALE_RULE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public GLevelOfDetailRuleTrigger getTrigger() {
      if (trigger != null && trigger.eIsProxy()) {
         InternalEObject oldTrigger = (InternalEObject) trigger;
         trigger = (GLevelOfDetailRuleTrigger) eResolveProxy(oldTrigger);
         if (trigger != oldTrigger) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.GSCALE_RULE__TRIGGER, oldTrigger,
                  trigger));
         }
      }
      return trigger;
   }

   /**
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @generated
    */
   public GLevelOfDetailRuleTrigger basicGetTrigger() {
      return trigger;
   }

   /**
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setTrigger(GLevelOfDetailRuleTrigger newTrigger) {
      GLevelOfDetailRuleTrigger oldTrigger = trigger;
      trigger = newTrigger;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GSCALE_RULE__TRIGGER, oldTrigger, trigger));
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
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GSCALE_RULE__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean isHandledByServer() { return handledByServer; }

   /**
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setHandledByServer(boolean newHandledByServer) {
      boolean oldHandledByServer = handledByServer;
      handledByServer = newHandledByServer;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GSCALE_RULE__HANDLED_BY_SERVER,
            oldHandledByServer, handledByServer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public double getScale() { return scale; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setScale(double newScale) {
      double oldScale = scale;
      scale = newScale;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GSCALE_RULE__SCALE, oldScale, scale));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean isMultiplyWithCLevel() { return multiplyWithCLevel; }

   /**
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setMultiplyWithCLevel(boolean newMultiplyWithCLevel) {
      boolean oldMultiplyWithCLevel = multiplyWithCLevel;
      multiplyWithCLevel = newMultiplyWithCLevel;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GSCALE_RULE__MULTIPLY_WITH_CLEVEL,
            oldMultiplyWithCLevel, multiplyWithCLevel));
   }

   /**
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean isSumWithCLevel() { return sumWithCLevel; }

   /**
    * <!-- begin-user-doc -->
   	 * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setSumWithCLevel(boolean newSumWithCLevel) {
      boolean oldSumWithCLevel = sumWithCLevel;
      sumWithCLevel = newSumWithCLevel;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GSCALE_RULE__SUM_WITH_CLEVEL,
            oldSumWithCLevel, sumWithCLevel));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case GraphPackage.GSCALE_RULE__TRIGGER:
            if (resolve)
               return getTrigger();
            return basicGetTrigger();
         case GraphPackage.GSCALE_RULE__TYPE:
            return getType();
         case GraphPackage.GSCALE_RULE__HANDLED_BY_SERVER:
            return isHandledByServer();
         case GraphPackage.GSCALE_RULE__SCALE:
            return getScale();
         case GraphPackage.GSCALE_RULE__MULTIPLY_WITH_CLEVEL:
            return isMultiplyWithCLevel();
         case GraphPackage.GSCALE_RULE__SUM_WITH_CLEVEL:
            return isSumWithCLevel();
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
         case GraphPackage.GSCALE_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) newValue);
            return;
         case GraphPackage.GSCALE_RULE__TYPE:
            setType((String) newValue);
            return;
         case GraphPackage.GSCALE_RULE__HANDLED_BY_SERVER:
            setHandledByServer((Boolean) newValue);
            return;
         case GraphPackage.GSCALE_RULE__SCALE:
            setScale((Double) newValue);
            return;
         case GraphPackage.GSCALE_RULE__MULTIPLY_WITH_CLEVEL:
            setMultiplyWithCLevel((Boolean) newValue);
            return;
         case GraphPackage.GSCALE_RULE__SUM_WITH_CLEVEL:
            setSumWithCLevel((Boolean) newValue);
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
         case GraphPackage.GSCALE_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) null);
            return;
         case GraphPackage.GSCALE_RULE__TYPE:
            setType(TYPE_EDEFAULT);
            return;
         case GraphPackage.GSCALE_RULE__HANDLED_BY_SERVER:
            setHandledByServer(HANDLED_BY_SERVER_EDEFAULT);
            return;
         case GraphPackage.GSCALE_RULE__SCALE:
            setScale(SCALE_EDEFAULT);
            return;
         case GraphPackage.GSCALE_RULE__MULTIPLY_WITH_CLEVEL:
            setMultiplyWithCLevel(MULTIPLY_WITH_CLEVEL_EDEFAULT);
            return;
         case GraphPackage.GSCALE_RULE__SUM_WITH_CLEVEL:
            setSumWithCLevel(SUM_WITH_CLEVEL_EDEFAULT);
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
         case GraphPackage.GSCALE_RULE__TRIGGER:
            return trigger != null;
         case GraphPackage.GSCALE_RULE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case GraphPackage.GSCALE_RULE__HANDLED_BY_SERVER:
            return handledByServer != HANDLED_BY_SERVER_EDEFAULT;
         case GraphPackage.GSCALE_RULE__SCALE:
            return scale != SCALE_EDEFAULT;
         case GraphPackage.GSCALE_RULE__MULTIPLY_WITH_CLEVEL:
            return multiplyWithCLevel != MULTIPLY_WITH_CLEVEL_EDEFAULT;
         case GraphPackage.GSCALE_RULE__SUM_WITH_CLEVEL:
            return sumWithCLevel != SUM_WITH_CLEVEL_EDEFAULT;
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
      result.append(", handledByServer: ");
      result.append(handledByServer);
      result.append(", scale: ");
      result.append(scale);
      result.append(", multiplyWithCLevel: ");
      result.append(multiplyWithCLevel);
      result.append(", sumWithCLevel: ");
      result.append(sumWithCLevel);
      result.append(')');
      return result.toString();
   }

} //GScaleRuleImpl
