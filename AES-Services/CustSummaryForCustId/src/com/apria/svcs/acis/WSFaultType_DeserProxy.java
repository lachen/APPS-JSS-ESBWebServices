/**
 * WSFaultType_DeserProxy.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf230909.32 v3909221945
 */

package com.apria.svcs.acis;

public class WSFaultType_DeserProxy  extends java.lang.Exception  {
    private java.lang.String message;
    private java.lang.String type;
    private java.lang.String code;
    private java.lang.String severity;
    private java.lang.String state;
    private java.lang.String exceptionState;

    public WSFaultType_DeserProxy() {
    }

    public java.lang.String getMessage() {
        return message;
    }

    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public java.lang.String getCode() {
        return code;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public java.lang.String getSeverity() {
        return severity;
    }

    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }

    public java.lang.String getState() {
        return state;
    }

    public void setState(java.lang.String state) {
        this.state = state;
    }

    public java.lang.String getExceptionState() {
        return exceptionState;
    }

    public void setExceptionState(java.lang.String exceptionState) {
        this.exceptionState = exceptionState;
    }

    public java.lang.Object convert() {
      com.apria.svcs.acis.WSFaultType _e;
      _e = new com.apria.svcs.acis.WSFaultType(
        getMessage(),
        getType(),
        getCode(),
        getSeverity(),
        getState(),
        getExceptionState());
      return _e;
    }
}
