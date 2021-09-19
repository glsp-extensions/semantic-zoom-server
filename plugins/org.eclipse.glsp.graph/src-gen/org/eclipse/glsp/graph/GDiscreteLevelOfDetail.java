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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GDiscrete Level Of Detail</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.glsp.graph.GraphPackage#getGDiscreteLevelOfDetail()
 * @model
 * @generated
 */
public enum GDiscreteLevelOfDetail implements Enumerator {
   /**
    * The '<em><b>Detail2</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #DETAIL2_VALUE
    * @generated
    * @ordered
    */
   DETAIL2(0, "Detail2", "Detail2"),
   /**
    * The '<em><b>Detail</b></em>' literal object.
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @see #DETAIL_VALUE
    * @generated
    * @ordered
    */
   DETAIL(1, "Detail", "Detail"),
   /**
    * The '<em><b>Intermediate</b></em>' literal object.
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @see #INTERMEDIATE_VALUE
    * @generated
    * @ordered
    */
   INTERMEDIATE(2, "Intermediate", "Intermediate"),
   /**
    * The '<em><b>Overview</b></em>' literal object.
    * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
    * @see #OVERVIEW_VALUE
    * @generated
    * @ordered
    */
   OVERVIEW(3, "Overview", "Overview");

   /**
    * The '<em><b>Detail2</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #DETAIL2
    * @model name="Detail2"
    * @generated
    * @ordered
    */
   public static final int DETAIL2_VALUE = 0;

   /**
    * The '<em><b>Detail</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #DETAIL
    * @model name="Detail"
    * @generated
    * @ordered
    */
   public static final int DETAIL_VALUE = 1;

   /**
    * The '<em><b>Intermediate</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #INTERMEDIATE
    * @model name="Intermediate"
    * @generated
    * @ordered
    */
   public static final int INTERMEDIATE_VALUE = 2;

   /**
    * The '<em><b>Overview</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #OVERVIEW
    * @model name="Overview"
    * @generated
    * @ordered
    */
   public static final int OVERVIEW_VALUE = 3;

   /**
    * An array of all the '<em><b>GDiscrete Level Of Detail</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final GDiscreteLevelOfDetail[] VALUES_ARRAY = new GDiscreteLevelOfDetail[] {
      DETAIL2,
      DETAIL,
      INTERMEDIATE,
      OVERVIEW,
   };

   /**
    * A public read-only list of all the '<em><b>GDiscrete Level Of Detail</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final List<GDiscreteLevelOfDetail> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>GDiscrete Level Of Detail</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param literal the literal.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static GDiscreteLevelOfDetail get(String literal) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         GDiscreteLevelOfDetail result = VALUES_ARRAY[i];
         if (result.toString().equals(literal)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>GDiscrete Level Of Detail</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param name the name.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static GDiscreteLevelOfDetail getByName(String name) {
      for (int i = 0; i < VALUES_ARRAY.length; ++i) {
         GDiscreteLevelOfDetail result = VALUES_ARRAY[i];
         if (result.getName().equals(name)) {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>GDiscrete Level Of Detail</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the integer value.
    * @return the matching enumerator or <code>null</code>.
    * @generated
    */
   public static GDiscreteLevelOfDetail get(int value) {
      switch (value) {
         case DETAIL2_VALUE:
            return DETAIL2;
         case DETAIL_VALUE:
            return DETAIL;
         case INTERMEDIATE_VALUE:
            return INTERMEDIATE;
         case OVERVIEW_VALUE:
            return OVERVIEW;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private GDiscreteLevelOfDetail(int value, String name, String literal) {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int getValue() { return value; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String getName() { return name; }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String getLiteral() { return literal; }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      return literal;
   }

} //GDiscreteLevelOfDetail
