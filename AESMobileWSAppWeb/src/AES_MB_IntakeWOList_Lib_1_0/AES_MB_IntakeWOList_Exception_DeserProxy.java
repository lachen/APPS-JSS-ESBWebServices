/**
 * AES_MB_IntakeWOList_Exception_DeserProxy.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class AES_MB_IntakeWOList_Exception_DeserProxy  extends java.lang.Exception  {
    private AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request requestBO;
    private java.lang.String exceptionMessage;

    public AES_MB_IntakeWOList_Exception_DeserProxy() {
    }

    public AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request getRequestBO() {
        return requestBO;
    }

    public void setRequestBO(AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request requestBO) {
        this.requestBO = requestBO;
    }

    public java.lang.String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(java.lang.String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public java.lang.Object convert() {
      AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception _e;
      _e = new AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception(
        getRequestBO(),
        getExceptionMessage());
      return _e;
    }
}
