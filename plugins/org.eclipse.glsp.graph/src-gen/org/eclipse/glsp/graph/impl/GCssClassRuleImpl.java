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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.glsp.graph.GCssClassRule;
import org.eclipse.glsp.graph.GLevelOfDetailRuleTrigger;
import org.eclipse.glsp.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCss Class Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.glsp.graph.impl.GCssClassRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GCssClassRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.glsp.graph.impl.GCssClassRuleImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCssClassRuleImpl extends MinimalEObjectImpl.Container implements GCssClassRule {
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
    * The cached value of the '{@link #getClasses() <em>Classes</em>}' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getClasses()
    * @generated
    * @ordered
    */
   protected EList<String> classes;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public GCssClassRuleImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return GraphPackage.Literals.GCSS_CLASS_RULE;
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
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphPackage.GCSS_CLASS_RULE__TRIGGER,
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
            new ENotificationImpl(this, Notification.SET, GraphPackage.GCSS_CLASS_RULE__TRIGGER, oldTrigger, trigger));
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
         eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GCSS_CLASS_RULE__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EList<String> getClasses() {
      if (classes == null) {
         classes = new EDataTypeUniqueEList<String>(String.class, this, GraphPackage.GCSS_CLASS_RULE__CLASSES);
      }
      return classes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case GraphPackage.GCSS_CLASS_RULE__TRIGGER:
            if (resolve)
               return getTrigger();
            return basicGetTrigger();
         case GraphPackage.GCSS_CLASS_RULE__TYPE:
            return getType();
         case GraphPackage.GCSS_CLASS_RULE__CLASSES:
            return getClasses();
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
         case GraphPackage.GCSS_CLASS_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) newValue);
            return;
         case GraphPackage.GCSS_CLASS_RULE__TYPE:
            setType((String) newValue);
            return;
         case GraphPackage.GCSS_CLASS_RULE__CLASSES:
            getClasses().clear();
            getClasses().addAll((Collection<? extends String>) newValue);
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
         case GraphPackage.GCSS_CLASS_RULE__TRIGGER:
            setTrigger((GLevelOfDetailRuleTrigger) null);
            return;
         case GraphPackage.GCSS_CLASS_RULE__TYPE:
            setType(TYPE_EDEFAULT);
            return;
         case GraphPackage.GCSS_CLASS_RULE__CLASSES:
            getClasses().clear();
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
         case GraphPackage.GCSS_CLASS_RULE__TRIGGER:
            return trigger != null;
         case GraphPackage.GCSS_CLASS_RULE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
         case GraphPackage.GCSS_CLASS_RULE__CLASSES:
            return classes != null && !classes.isEmpty();
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
      result.append(", classes: ");
      result.append(classes);
      result.append(')');
      return result.toString();
   }

} //GCssClassRuleImpl
