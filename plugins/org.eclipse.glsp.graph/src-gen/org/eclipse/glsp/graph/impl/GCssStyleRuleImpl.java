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
import org.eclipse.glsp.graph.GCssStyleRule;
import org.eclipse.glsp.graph.GLevelOfDetailRuleTrigger;
import org.eclipse.glsp.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCss Style Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.impl.GCssStyleRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GCssStyleRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GCssStyleRuleImpl#isHandledByServer <em>Handled By Server</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GCssStyleRuleImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCssStyleRuleImpl extends MinimalEObjectImpl.Container implements GCssStyleRule {
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
    * The cached value of the '{@link #getStyles() <em>Styles</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getStyles()
    * @generated
    * @ordered
    */
   protected EMap<String, Object> styles;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GCssStyleRuleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return GraphPackage.Literals.GCSS_STYLE_RULE;
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
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.GCSS_STYLE_RULE__TRIGGER,
                  oldTrigger, trigger));
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
            new ENotificationImpl(this, Notification.SET, GraphPackage.GCSS_STYLE_RULE__TRIGGER, oldTrigger, trigger));
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
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GCSS_STYLE_RULE__TYPE, oldType, type));
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
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GCSS_STYLE_RULE__HANDLED_BY_SERVER,
            oldHandledByServer, handledByServer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EMap<String, Object> getStyles() {
      if (styles == null) {
         styles = new EcoreEMap<String, Object>(GraphPackage.Literals.STRING_TO_OBJECT_MAP_ENTRY,
            StringToObjectMapEntryImpl.class, this, GraphPackage.GCSS_STYLE_RULE__STYLES);
      }
      return styles;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case GraphPackage.GCSS_STYLE_RULE__STYLES:
            return ((InternalEList<?>) getStyles()).basicRemove(otherEnd, msgs);
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
         case GraphPackage.GCSS_STYLE_RULE__TRIGGER:
            if (resolve)
               return getTrigger();
            return basicGetTrigger();
         case GraphPackage.GCSS_STYLE_RULE__TYPE:
            return getType();
         case GraphPackage.GCSS_STYLE_RULE__HANDLED_BY_SERVER:
            return isHandledByServer();
         case GraphPackage.GCSS_STYLE_RULE__STYLES:
            if (coreType)
               return getStyles();
            else
               return getStyles().map();
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
         case GraphPackage.GCSS_STYLE_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) newValue);
            return;
         case GraphPackage.GCSS_STYLE_RULE__TYPE:
            setType((String) newValue);
            return;
         case GraphPackage.GCSS_STYLE_RULE__HANDLED_BY_SERVER:
            setHandledByServer((Boolean) newValue);
            return;
         case GraphPackage.GCSS_STYLE_RULE__STYLES:
            ((EStructuralFeature.Setting) getStyles()).set(newValue);
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
         case GraphPackage.GCSS_STYLE_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) null);
            return;
         case GraphPackage.GCSS_STYLE_RULE__TYPE:
            setType(TYPE_EDEFAULT);
            return;
         case GraphPackage.GCSS_STYLE_RULE__HANDLED_BY_SERVER:
            setHandledByServer(HANDLED_BY_SERVER_EDEFAULT);
            return;
         case GraphPackage.GCSS_STYLE_RULE__STYLES:
            getStyles().clear();
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
         case GraphPackage.GCSS_STYLE_RULE__TRIGGER:
            return trigger != null;
         case GraphPackage.GCSS_STYLE_RULE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case GraphPackage.GCSS_STYLE_RULE__HANDLED_BY_SERVER:
            return handledByServer != HANDLED_BY_SERVER_EDEFAULT;
         case GraphPackage.GCSS_STYLE_RULE__STYLES:
            return styles != null && !styles.isEmpty();
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
      result.append(')');
      return result.toString();
   }

} // GCssStyleRuleImpl
