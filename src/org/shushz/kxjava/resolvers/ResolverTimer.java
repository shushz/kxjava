/*
 * Modifications copyright:
 * Copyright (c) 2018-present, Alexander Dvinsky.
 * Original work copyright:
 * Copyright (c) 2018-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package org.shushz.kxjava.resolvers;

import org.shushz.kxjava.Kickable;

public interface ResolverTimer {

  <T> Kickable<T> timeKickable(Kickable<T> kickable);
}
