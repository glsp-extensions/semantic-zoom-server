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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.glsp.graph.GLayoutRule;
import org.eclipse.glsp.graph.GLayouting;
import org.eclipse.glsp.graph.GLevelOfDetailRuleTrigger;
import org.eclipse.glsp.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GLayout Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#isHandledByServer <em>Handled By Server</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#getLayoutOptions <em>Layout Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GLayoutRuleImpl extends MinimalEObjectImpl.Container implements GLayoutRule {
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
    * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLayout()
    * @generated
    * @ordered
    */
   protected static final String LAYOUT_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLayout()
    * @generated
    * @ordered
    */
   protected String layout = LAYOUT_EDEFAULT;

   /**
    * The cached value of the '{@link #getLayoutOptions() <em>Layout Options</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLayoutOptions()
    * @generated
    * @ordered
    */
   protected EMap<String, Object> layoutOptions;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GLayoutRuleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return GraphPackage.Literals.GLAYOUT_RULE;
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
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.GLAYOUT_RULE__TRIGGER, oldTrigger,
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
         eNotify(
            new ENotificationImpl(this, Notification.SET, GraphPackage.GLAYOUT_RULE__TRIGGER, oldTrigger, trigger));
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
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GLAYOUT_RULE__TYPE, oldType, type));
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
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GLAYOUT_RULE__HANDLED_BY_SERVER,
            oldHandledByServer, handledByServer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String getLayout() { return layout; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void setLayout(String newLayout) {
      String oldLayout = layout;
      layout = newLayout;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GLAYOUT_RULE__LAYOUT, oldLayout, layout));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EMap<String, Object> getLayoutOptions() {
      if (layoutOptions == null) {
         layoutOptions = new EcoreEMap<String, Object>(GraphPackage.Literals.STRING_TO_OBJECT_MAP_ENTRY,
            StringToObjectMapEntryImpl.class, this, GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS);
      }
      return layoutOptions;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            return ((InternalEList<?>) getLayoutOptions()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case GraphPackage.GLAYOUT_RULE__TRIGGER:
            if (resolve)
               return getTrigger();
            return basicGetTrigger();
         case GraphPackage.GLAYOUT_RULE__TYPE:
            return getType();
         case GraphPackage.GLAYOUT_RULE__HANDLED_BY_SERVER:
            return isHandledByServer();
         case GraphPackage.GLAYOUT_RULE__LAYOUT:
            return getLayout();
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            if (coreType)
               return getLayoutOptions();
            else
               return getLayoutOptions().map();
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
         case GraphPackage.GLAYOUT_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) newValue);
            return;
         case GraphPackage.GLAYOUT_RULE__TYPE:
            setType((String) newValue);
            return;
         case GraphPackage.GLAYOUT_RULE__HANDLED_BY_SERVER:
            setHandledByServer((Boolean) newValue);
            return;
         case GraphPackage.GLAYOUT_RULE__LAYOUT:
            setLayout((String) newValue);
            return;
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            ((EStructuralFeature.Setting) getLayoutOptions()).set(newValue);
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
         case GraphPackage.GLAYOUT_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) null);
            return;
         case GraphPackage.GLAYOUT_RULE__TYPE:
            setType(TYPE_EDEFAULT);
            return;
         case GraphPackage.GLAYOUT_RULE__HANDLED_BY_SERVER:
            setHandledByServer(HANDLED_BY_SERVER_EDEFAULT);
            return;
         case GraphPackage.GLAYOUT_RULE__LAYOUT:
            setLayout(LAYOUT_EDEFAULT);
            return;
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            getLayoutOptions().clear();
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
         case GraphPackage.GLAYOUT_RULE__TRIGGER:
            return trigger != null;
         case GraphPackage.GLAYOUT_RULE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case GraphPackage.GLAYOUT_RULE__HANDLED_BY_SERVER:
            return handledByServer != HANDLED_BY_SERVER_EDEFAULT;
         case GraphPackage.GLAYOUT_RULE__LAYOUT:
            return LAYOUT_EDEFAULT == null ? layout != null : !LAYOUT_EDEFAULT.equals(layout);
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            return layoutOptions != null && !layoutOptions.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == GLayouting.class) {
         switch (derivedFeatureID) {
            case GraphPackage.GLAYOUT_RULE__LAYOUT:
               return GraphPackage.GLAYOUTING__LAYOUT;
            case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
               return GraphPackage.GLAYOUTING__LAYOUT_OPTIONS;
            default:
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == GLayouting.class) {
         switch (baseFeatureID) {
            case GraphPackage.GLAYOUTING__LAYOUT:
               return GraphPackage.GLAYOUT_RULE__LAYOUT;
            case GraphPackage.GLAYOUTING__LAYOUT_OPTIONS:
               return GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS;
            default:
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
      result.append(", layout: ");
      result.append(layout);
      result.append(')');
      return result.toString();
   }

} //GLayoutRuleImpl
