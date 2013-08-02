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

import java.awt.Color
import java.awt.Graphics

/**
 *
 *
 * @author juanitodread
 * @version $
 *
 * Jul 31, 2013
 */
class InitialState private ( label: String, id: Int) extends AbstractState( label: String ) {
  
  var id = 1
  var exitedColor = InitialState.UNEXCITED_COLOR
  
  override def draw(g: Graphics): Unit = {
    
  }

  override def excite( enable: Boolean ): Unit = {
    exitedColor = if ( enable ) InitialState.EXCITED_COLOR 
                  else InitialState.UNEXCITED_COLOR
    exited = enable
  }

}

object InitialState {
  val EXCITED_COLOR = new Color( 228, 109, 10 )

  val UNEXCITED_COLOR = Color.BLACK

  private lazy val INSTANCE = new InitialState( "q1", 1 )

  def apply() = INSTANCE
}