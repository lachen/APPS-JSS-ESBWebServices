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
 * WSFaultType is the main exception class used in EligibilitySvcs. All handled
 * exceptions will be wrapped up and thrown upwards as a WSFaultType.
 * 
 * @author Ruben Esparza
 */
public class WSFaultType extends Exception
{

    private static final long serialVersionUID = 1L;
    private java.lang.String  message;
    private java.lang.String  type;
    private java.lang.String  code;
    private java.lang.String  severity;
    private java.lang.String  state;
    private java.lang.String  exceptionState;

    /**
     * Constructor for WSFaultType
     * 
     * @param message
     * @param type
     * @param code
     * @param severity
     * @param state
     * @param exceptionState
     */
    public WSFaultType(java.lang.String message, java.lang.String type,
            java.lang.String code, java.lang.String severity,
            java.lang.String state, java.lang.String exceptionState) {
        this.message = message;
        this.type = type;
        this.code = code;
        this.severity = severity;
        this.state = state;
        this.exceptionState = exceptionState;
    }

    /**
     * @return String
     */
    public java.lang.String getMessage() {
        return message;
    }

    /**
     * @return String
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * @return String
     */
    public java.lang.String getCode() {
        return code;
    }

    /**
     * @return String
     */
    public java.lang.String getSeverity() {
        return severity;
    }

    /**
     * @return String
     */
    public java.lang.String getState() {
        return state;
    }

    /**
     * @return String
     */
    public java.lang.String getExceptionState() {
        return exceptionState;
    }

}
