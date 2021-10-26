/********************************************************************************
 * Copyright (c) 2020-2021 EclipseSource and others.
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
 ********************************************************************************/
package org.eclipse.glsp.server.features.modelsourcewatcher;

/**
 * A model source watcher observes the model source and notifies the client if the model
 * source has changed.
 */
public interface ModelSourceWatcher {

   /**
    * Starts watching the model source.
    */
   default void startWatching() {}

   /**
    * Stops watching the model source.
    * <p>
    * If the watching hasn't been started before, this won't do anything.
    * </p>
    */
   default void stopWatching() {}

   /**
    * Pauses the client notifications of this watcher.
    * <p>
    * If the watching hasn't been started before, this won't do anything.
    * </p>
    */
   default void pauseWatching() {}

   /**
    * Continues the client notifications of this watcher.
    * <p>
    * If the watching hasn't been started or paused before, this won't do anything.
    * </p>
    */
   default void continueWatching() {}
}
