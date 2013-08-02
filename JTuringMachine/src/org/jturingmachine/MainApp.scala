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
package org.jturingmachine

import javax.swing.SwingUtilities
import org.jturingmachine.view.ApplicationView
import org.jturingmachine.view.graphics.state.InitialState

/**
 * Main class. This class starts all the application.
 *
 * @author juanitodread
 * @version 1.0
 *
 * Jul 30, 2013
 */
object MainApp {

  def main( args: Array[String] ): Unit = {
    SwingUtilities.invokeLater( new Runnable() {
      def run() {
        val app = new ApplicationView
        app.startup( args )
        val initState = InitialState()
        println(initState)
      }
    } )
  }

}