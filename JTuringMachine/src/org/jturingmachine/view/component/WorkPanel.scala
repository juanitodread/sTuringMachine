/**
 * sTuringMachine
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
package org.jturingmachine.view.component

import scala.swing.FlowPanel
import scala.swing.Button
import scala.swing.Component

/**
 * This is the general work panel in the top of the main frame.
 *
 * @author juanitodread
 * @version 1.0
 *
 * Jun 9, 2014
 */
class WorkPanel(alignment: FlowPanel.Alignment.Value) extends FlowPanel(alignment)() {
  
    val button = Button("Click Me") {
      println("Button  Clicked")
    }
    
    val button2 = Button("Click Me") {
      println("Button Clicked")
    }
        
    val button3 = Button("Click Me") {
      println("Button Clicked")
    }
    
    contents += button
    contents += button2
}