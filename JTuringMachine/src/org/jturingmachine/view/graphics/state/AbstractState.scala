/**
 * jTuring Machine
 *
 * Copyright 2013 juanitodread
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.jturingmachine.view.graphics.state

import org.jturingmachine.view.graphics.AbstractGraphicObject

/**
 *
 *
 * @author juanitodread
 * @version 1.0
 *
 * Jul 30, 2013
 */
abstract class AbstractState(label: String) extends AbstractGraphicObject {
  
  var exited: Boolean = false
  
//  val moving: Boolean = false
//  
//  val locked: Boolean = false
  
  def excite(enable: Boolean): Unit
  
  override def toString(): String = {
    s"{id: ${id}, label: ${label}}"
  }
}

object ObjectState {
  val RADIUS: Int = 25
}