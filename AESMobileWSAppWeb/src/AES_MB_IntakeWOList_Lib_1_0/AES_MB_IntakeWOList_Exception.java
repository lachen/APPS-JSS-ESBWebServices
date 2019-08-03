/**
 * AES_MB_IntakeWOList_Exception.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class AES_MB_IntakeWOList_Exception  extends java.lang.Exception  {
    private AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request requestBO;
    private java.lang.String exceptionMessage;

    public AES_MB_IntakeWOList_Exception(
           AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request requestBO,
           java.lang.String exceptionMessage) {
        this.requestBO = requestBO;
        this.exceptionMessage = exceptionMessage;
    }

    public AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request getRequestBO() {
        return requestBO;
    }

    public java.lang.String getExceptionMessage() {
        return exceptionMessage;
    }

}
