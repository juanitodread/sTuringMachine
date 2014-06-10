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

import java.awt.Dimension

import scala.swing.Action
import scala.swing.BorderPanel
import scala.swing.Component
import scala.swing.Dialog
import scala.swing.FlowPanel
import scala.swing.MainFrame
import scala.swing.Menu
import scala.swing.MenuBar
import scala.swing.MenuItem
import scala.swing.SimpleSwingApplication

import org.jturingmachine.ApplicationConstants
import org.jturingmachine.util.MessageUtil
import org.jturingmachine.view.component.Canvas
import org.jturingmachine.view.component.WorkPanel

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

    val workPanel = new WorkPanel(FlowPanel.Alignment.Left    )
    val canvas = new Canvas()
    
    
    
    contents = new BorderPanel() {
      layout(workPanel) = BorderPanel.Position.North
//      layout(canvas) = BorderPanel.Position.Center
    }
    menuBar = menuBarDefinition(contents)
    size_=(new Dimension(1000, 800))
    
    pack
  }
  
  def menuBarDefinition(frameContents: Seq[Component]): MenuBar = {
    new MenuBar {
      val menu1 = new Menu("File") {
    
      val item = new MenuItem("Open") {
        println("Something")
        new Dialog()
      }
      
      item.action = Action("new Open") {
        println("Something")
        Dialog.showMessage(frameContents.head , "Hello World", "My Title", Dialog.Message.Info)
      }
      
      contents += item
      }
      
      contents += menu1
    }
    
    
  }
}