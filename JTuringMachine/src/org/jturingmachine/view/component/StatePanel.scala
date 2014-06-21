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
import javax.swing.BorderFactory
import scala.swing.Button
import scala.swing.RadioButton
import scala.swing.ButtonGroup
import scala.swing.ComboBox

/**
 *
 *
 * @author juanitodread
 * @version $
 *
 * Jun 10, 2014
 */
class StatePanel extends FlowPanel {

  border = BorderFactory.createTitledBorder("State")
  
  
  
  val ordinaryStateRd = new RadioButton("Transition") {
    
  }

  val finalStateRd = new RadioButton("Final") {
    
  }
  
  val currentStatesCmb = new ComboBox(List("Current states...", "q1", "q2"))
  currentStatesCmb .tooltip = "Simple tooltip"
  
  val deleteStateBtn = Button("Delete") {
    println("Button Clicked")
  }
 
  val statesGroup = new ButtonGroup(ordinaryStateRd, finalStateRd)
  
  contents ++= List(ordinaryStateRd, finalStateRd )
  contents += currentStatesCmb 
  contents += deleteStateBtn
  
}