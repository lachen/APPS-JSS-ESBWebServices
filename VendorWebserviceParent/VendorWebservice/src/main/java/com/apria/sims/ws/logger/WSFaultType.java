/**
 * WSFaultType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf10631.06 v81706232132
 */

package com.apria.sims.ws.logger;

public class WSFaultType  extends java.lang.Exception  {

	private static final long serialVersionUID = -5791392093861013322L;
	private java.lang.String message;
    private java.lang.String type;
    private java.lang.String code;
    private java.lang.String severity;
    private java.lang.String state;
    private java.lang.String exceptionState;

    public WSFaultType(
           java.lang.String message,
           java.lang.String type,
           java.lang.String code,
           java.lang.String severity,
           java.lang.String state,
           java.lang.String exceptionState) {
        this.message = message;
        this.type = type;
        this.code = code;
        this.severity = severity;
        this.state = state;
        this.exceptionState = exceptionState;
    }

    public java.lang.String getMessage() {
        return message;
    }

    public java.lang.String getType() {
        return type;
    }

    public java.lang.String getCode() {
        return code;
    }

    public java.lang.String getSeverity() {
        return severity;
    }

    public java.lang.String getState() {
        return state;
    }

    public java.lang.String getExceptionState() {
        return exceptionState;
    }

}
