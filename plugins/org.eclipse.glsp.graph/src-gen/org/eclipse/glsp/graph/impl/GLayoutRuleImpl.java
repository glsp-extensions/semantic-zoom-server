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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.glsp.graph.GBoundsAware;
import org.eclipse.glsp.graph.GLayoutRule;
import org.eclipse.glsp.graph.GLevelOfDetailClientRule;
import org.eclipse.glsp.graph.GLevelOfDetailRule;
import org.eclipse.glsp.graph.GLevelOfDetailRuleTrigger;
import org.eclipse.glsp.graph.GLevelOfDetailServerRule;
import org.eclipse.glsp.graph.GModelElement;
import org.eclipse.glsp.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GLayout Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#getLayout <em>Layout</em>}</li>
 * <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#getLayoutOptions <em>Layout Options</em>}</li>
 * <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#getTrigger <em>Trigger</em>}</li>
 * <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.glsp.graph.impl.GLayoutRuleImpl#isHandleAlways <em>Handle Always</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GLayoutRuleImpl extends MinimalEObjectImpl.Container implements GLayoutRule {
   /**
    * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getLayout()
    * @generated
    * @ordered
    */
   protected static final String LAYOUT_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getLayout()
    * @generated
    * @ordered
    */
   protected String layout = LAYOUT_EDEFAULT;

   /**
    * The cached value of the '{@link #getLayoutOptions() <em>Layout Options</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getLayoutOptions()
    * @generated
    * @ordered
    */
   protected EMap<String, Object> layoutOptions;

   /**
    * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getTrigger()
    * @generated
    * @ordered
    */
   protected GLevelOfDetailRuleTrigger trigger;

   /**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getType()
    * @generated
    * @ordered
    */
   protected static final String TYPE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #getType()
    * @generated
    * @ordered
    */
   protected String type = TYPE_EDEFAULT;

   /**
    * The default value of the '{@link #isHandleAlways() <em>Handle Always</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #isHandleAlways()
    * @generated
    * @ordered
    */
   protected static final boolean HANDLE_ALWAYS_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isHandleAlways() <em>Handle Always</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @see #isHandleAlways()
    * @generated
    * @ordered
    */
   protected boolean handleAlways = HANDLE_ALWAYS_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   public GLayoutRuleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return GraphPackage.Literals.GLAYOUT_RULE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public GLevelOfDetailRuleTrigger getTrigger() {
      if (trigger != null && trigger.eIsProxy()) {
         InternalEObject oldTrigger = (InternalEObject) trigger;
         trigger = (GLevelOfDetailRuleTrigger) eResolveProxy(oldTrigger);
         if (trigger != oldTrigger) {
            if (eNotificationRequired()) {
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.GLAYOUT_RULE__TRIGGER, oldTrigger,
                  trigger));
            }
         }
      }
      return trigger;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   public GLevelOfDetailRuleTrigger basicGetTrigger() {
      return trigger;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void setTrigger(final GLevelOfDetailRuleTrigger newTrigger) {
      GLevelOfDetailRuleTrigger oldTrigger = trigger;
      trigger = newTrigger;
      if (eNotificationRequired()) {
         eNotify(
            new ENotificationImpl(this, Notification.SET, GraphPackage.GLAYOUT_RULE__TRIGGER, oldTrigger, trigger));
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public String getType() { return type; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void setType(final String newType) {
      String oldType = type;
      type = newType;
      if (eNotificationRequired()) {
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GLAYOUT_RULE__TYPE, oldType, type));
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public boolean isHandleAlways() { return handleAlways; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void setHandleAlways(final boolean newHandleAlways) {
      boolean oldHandleAlways = handleAlways;
      handleAlways = newHandleAlways;
      if (eNotificationRequired()) {
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GLAYOUT_RULE__HANDLE_ALWAYS,
            oldHandleAlways, handleAlways));
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public String getLayout() { return layout; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void setLayout(final String newLayout) {
      String oldLayout = layout;
      layout = newLayout;
      if (eNotificationRequired()) {
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GLAYOUT_RULE__LAYOUT, oldLayout, layout));
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public EMap<String, Object> getLayoutOptions() {
      if (layoutOptions == null) {
         layoutOptions = new EcoreEMap<>(GraphPackage.Literals.STRING_TO_OBJECT_MAP_ENTRY,
            StringToObjectMapEntryImpl.class, this, GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS);
      }
      return layoutOptions;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated NOT
    */
   @Override
   public GModelElement handle(final GModelElement element) {
      if (element instanceof GBoundsAware) {
         GBoundsAware bae = (GBoundsAware) element;
         if (this.layoutOptions.get("resizeContainer") != null && (boolean) this.layoutOptions.get("resizeContainer")) {
            bae.setSize(null);
         }
      }

      return element;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
      final NotificationChain msgs) {
      switch (featureID) {
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            return ((InternalEList<?>) getLayoutOptions()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
      switch (featureID) {
         case GraphPackage.GLAYOUT_RULE__LAYOUT:
            return getLayout();
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            if (coreType) {
               return getLayoutOptions();
            } else {
               return getLayoutOptions().map();
            }
         case GraphPackage.GLAYOUT_RULE__TRIGGER:
            if (resolve) {
               return getTrigger();
            }
            return basicGetTrigger();
         case GraphPackage.GLAYOUT_RULE__TYPE:
            return getType();
         case GraphPackage.GLAYOUT_RULE__HANDLE_ALWAYS:
            return isHandleAlways();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void eSet(final int featureID, final Object newValue) {
      switch (featureID) {
         case GraphPackage.GLAYOUT_RULE__LAYOUT:
            setLayout((String) newValue);
            return;
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            ((EStructuralFeature.Setting) getLayoutOptions()).set(newValue);
            return;
         case GraphPackage.GLAYOUT_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) newValue);
            return;
         case GraphPackage.GLAYOUT_RULE__TYPE:
            setType((String) newValue);
            return;
         case GraphPackage.GLAYOUT_RULE__HANDLE_ALWAYS:
            setHandleAlways((Boolean) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public void eUnset(final int featureID) {
      switch (featureID) {
         case GraphPackage.GLAYOUT_RULE__LAYOUT:
            setLayout(LAYOUT_EDEFAULT);
            return;
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            getLayoutOptions().clear();
            return;
         case GraphPackage.GLAYOUT_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) null);
            return;
         case GraphPackage.GLAYOUT_RULE__TYPE:
            setType(TYPE_EDEFAULT);
            return;
         case GraphPackage.GLAYOUT_RULE__HANDLE_ALWAYS:
            setHandleAlways(HANDLE_ALWAYS_EDEFAULT);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public boolean eIsSet(final int featureID) {
      switch (featureID) {
         case GraphPackage.GLAYOUT_RULE__LAYOUT:
            return LAYOUT_EDEFAULT == null ? layout != null : !LAYOUT_EDEFAULT.equals(layout);
         case GraphPackage.GLAYOUT_RULE__LAYOUT_OPTIONS:
            return layoutOptions != null && !layoutOptions.isEmpty();
         case GraphPackage.GLAYOUT_RULE__TRIGGER:
            return trigger != null;
         case GraphPackage.GLAYOUT_RULE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case GraphPackage.GLAYOUT_RULE__HANDLE_ALWAYS:
            return handleAlways != HANDLE_ALWAYS_EDEFAULT;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
      if (baseClass == GLevelOfDetailRule.class) {
         switch (derivedFeatureID) {
            case GraphPackage.GLAYOUT_RULE__TRIGGER:
               return GraphPackage.GLEVEL_OF_DETAIL_RULE__TRIGGER;
            case GraphPackage.GLAYOUT_RULE__TYPE:
               return GraphPackage.GLEVEL_OF_DETAIL_RULE__TYPE;
            default:
               return -1;
         }
      }
      if (baseClass == GLevelOfDetailServerRule.class) {
         switch (derivedFeatureID) {
            case GraphPackage.GLAYOUT_RULE__HANDLE_ALWAYS:
               return GraphPackage.GLEVEL_OF_DETAIL_SERVER_RULE__HANDLE_ALWAYS;
            default:
               return -1;
         }
      }
      if (baseClass == GLevelOfDetailClientRule.class) {
         switch (derivedFeatureID) {
            default:
               return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
      if (baseClass == GLevelOfDetailRule.class) {
         switch (baseFeatureID) {
            case GraphPackage.GLEVEL_OF_DETAIL_RULE__TRIGGER:
               return GraphPackage.GLAYOUT_RULE__TRIGGER;
            case GraphPackage.GLEVEL_OF_DETAIL_RULE__TYPE:
               return GraphPackage.GLAYOUT_RULE__TYPE;
            default:
               return -1;
         }
      }
      if (baseClass == GLevelOfDetailServerRule.class) {
         switch (baseFeatureID) {
            case GraphPackage.GLEVEL_OF_DETAIL_SERVER_RULE__HANDLE_ALWAYS:
               return GraphPackage.GLAYOUT_RULE__HANDLE_ALWAYS;
            default:
               return -1;
         }
      }
      if (baseClass == GLevelOfDetailClientRule.class) {
         switch (baseFeatureID) {
            default:
               return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public int eDerivedOperationID(final int baseOperationID, final Class<?> baseClass) {
      if (baseClass == GLevelOfDetailRule.class) {
         switch (baseOperationID) {
            default:
               return -1;
         }
      }
      if (baseClass == GLevelOfDetailServerRule.class) {
         switch (baseOperationID) {
            case GraphPackage.GLEVEL_OF_DETAIL_SERVER_RULE___HANDLE__GMODELELEMENT:
               return GraphPackage.GLAYOUT_RULE___HANDLE__GMODELELEMENT;
            default:
               return -1;
         }
      }
      if (baseClass == GLevelOfDetailClientRule.class) {
         switch (baseOperationID) {
            default:
               return -1;
         }
      }
      return super.eDerivedOperationID(baseOperationID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
      switch (operationID) {
         case GraphPackage.GLAYOUT_RULE___HANDLE__GMODELELEMENT:
            return handle((GModelElement) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    *
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) {
         return super.toString();
      }

      StringBuilder result = new StringBuilder(super.toString());
      result.append(" (layout: ");
      result.append(layout);
      result.append(", type: ");
      result.append(type);
      result.append(", handleAlways: ");
      result.append(handleAlways);
      result.append(')');
      return result.toString();
   }

} // GLayoutRuleImpl
