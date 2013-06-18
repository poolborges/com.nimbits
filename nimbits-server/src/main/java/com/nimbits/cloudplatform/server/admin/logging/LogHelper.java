/*
 * Copyright (c) 2010 Nimbits Inc.
 *
 * http://www.nimbits.com
 *
 *
 * Licensed under the GNU GENERAL PUBLIC LICENSE, Version 3.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the license is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, eitherexpress or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.cloudplatform.server.admin.logging;


import java.util.logging.Logger;

/**
 * Created by bsautner
 * User: benjamin
 * Date: 4/5/12
 * Time: 8:26 AM
 */
public class LogHelper {

    private LogHelper() {
    }

    public static void logException(final Class<?> c, final Throwable ex) {
        final Logger log = Logger.getLogger(c.getName());
        log.severe(ex.getMessage());


    }

    public static void log(final Class<?> c, final String ex) {
        final Logger log = Logger.getLogger(c.getName());
        log.fine(ex);


    }
}