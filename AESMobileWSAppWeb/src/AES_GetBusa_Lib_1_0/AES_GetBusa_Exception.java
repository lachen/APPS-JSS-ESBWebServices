/**
 * AES_GetBusa_Exception.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_GetBusa_Lib_1_0;

public class AES_GetBusa_Exception  extends java.lang.Exception  {
    private AES_GetBusa_Lib_1_0.AES_GetBusa_Request requestBO;
    private java.lang.String exceptionMessage;

    public AES_GetBusa_Exception(
           AES_GetBusa_Lib_1_0.AES_GetBusa_Request requestBO,
           java.lang.String exceptionMessage) {
        this.requestBO = requestBO;
        this.exceptionMessage = exceptionMessage;
    }

    public AES_GetBusa_Lib_1_0.AES_GetBusa_Request getRequestBO() {
        return requestBO;
    }

    public java.lang.String getExceptionMessage() {
        return exceptionMessage;
    }

}
