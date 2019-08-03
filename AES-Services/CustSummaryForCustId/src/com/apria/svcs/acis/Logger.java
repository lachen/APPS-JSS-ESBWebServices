/*******************************************************************************
 * Copyright (c) 2008 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/

package com.apria.svcs.acis;

/**
 * 
 * Logger - Utility Class for Logging
 *
 */
public class Logger
{
    public static final short LOGLEVEL_DEBUG = 1;
    public static final short LOGLEVEL_INFO  = 2;
    public static final short LOGLEVEL_WARN  = 3;
    public static final short LOGLEVEL_ERROR = 4;
    public static final short LOGLEVEL_FATAL = 5;
    
    private static short log_level = LOGLEVEL_DEBUG;
    
    static {
        try {
            //log_level = Short.parseShort(PropertyManager.getProperty(Constants.PROP_APPN_LOG_LEVEL));
            System.out.println(Constants.PROP_APPN_LOG_LEVEL + "=" + log_level);
        } catch (Exception ex) {
            System.out.println("Error getting property " + Constants.PROP_APPN_LOG_LEVEL + ". Use default value:" + log_level);
        }
    }
    
    public static void debug(String str) {
        if (LOGLEVEL_DEBUG >= log_level) {
            System.out.println(str);
        }
    }
    
    public static void info(String str) {
        if (LOGLEVEL_INFO >= log_level) {
            System.out.println(str);
        }
    }

    public static void warn(String str) {
        if (LOGLEVEL_WARN >= log_level) {
            System.out.println(str);
        }
    }

    public static void error(String str) {
        if (LOGLEVEL_ERROR >= log_level) {
            System.out.println(str);
        }
    }

    public static void fatal(String str) {
        System.out.println(str);
    }
}
