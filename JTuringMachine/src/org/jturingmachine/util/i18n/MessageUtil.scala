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
package org.jturingmachine.util

import java.util.Locale
import java.util.ResourceBundle
import org.jturingmachine.ApplicationConstants

/**
 * A message utility class to get messages from bundles resources.
 *
 * @author juanitodread
 * @version 1.0
 *
 * Jul 30, 2013
 */
object MessageUtil extends ApplicationConstants {

  val locale = Locale.getDefault
  val messages = ResourceBundle.getBundle( MESSAGE_BUNDLE, locale )
  
  /**
   * Get a message from a resource bundle.
   * 
   * @param key The key of the message.
   * @return The message or Text not found if the key is null.
   */
  def getMessage( key: String ) = Option( key ) match {
    case Some( x ) => messages.getString( x )
    case None      => MESSAGE_NOT_FOUND
  }

}