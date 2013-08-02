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
package org.jturingmachine.view

import scala.swing.SimpleSwingApplication
import scala.swing.MainFrame
import scala.swing.BoxPanel
import scala.swing.Orientation
import scala.swing.Swing
import scala.swing.Button
import org.jturingmachine.util.MessageUtil
import org.jturingmachine.ApplicationConstants

/**
 * Main frame of the application.
 *
 * @author juanitodread
 * @version 1.0
 *
 * Jul 30, 2013
 */
class ApplicationView extends SimpleSwingApplication with ApplicationConstants {

  def top = new MainFrame {
    val appTitle = MessageUtil.getMessage( APP_TITLE )
    val appVersion = MessageUtil.getMessage( APP_VERSION )

    title = s"${appTitle} - v ${appVersion}"

    val button = new Button {
      text = "Click Me"
    }

    contents = new BoxPanel( Orientation.Vertical ) {
      contents += button
      border = Swing.EmptyBorder( 30, 30, 10, 30 )
    }
  }

}