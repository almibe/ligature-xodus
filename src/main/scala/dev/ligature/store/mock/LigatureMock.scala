/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package dev.ligature.store.mock

import cats.effect.{IO, Resource}
import dev.ligature.{Ligature, LigatureInstance}

class LigatureMock extends Ligature {
  override def instance: Resource[IO, LigatureInstance] = ???
}