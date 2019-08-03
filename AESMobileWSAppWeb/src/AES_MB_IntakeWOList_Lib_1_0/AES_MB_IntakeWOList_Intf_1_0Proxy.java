package AES_MB_IntakeWOList_Lib_1_0;

public class AES_MB_IntakeWOList_Intf_1_0Proxy implements AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0 {
  private boolean _useJNDI = true;
  private String _endpoint = null;
  private AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0 __aES_MB_IntakeWOList_Intf_1_0 = null;
  
  public AES_MB_IntakeWOList_Intf_1_0Proxy() {
    _initAES_MB_IntakeWOList_Intf_1_0Proxy();
  }
  
  private void _initAES_MB_IntakeWOList_Intf_1_0Proxy() {
  
    if (_useJNDI) {
      try {
        javax.naming.InitialContext ctx = new javax.naming.InitialContext();
        __aES_MB_IntakeWOList_Intf_1_0 = ((AES_MB_IntakeWOList_Lib_1_0.WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpService)ctx.lookup("java:comp/env/service/WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpService")).getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort();
      }
      catch (javax.naming.NamingException namingException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("javax.naming.NamingException: " + namingException.getMessage());
          namingException.printStackTrace(System.out);
        }
      }
      catch (javax.xml.rpc.ServiceException serviceException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("javax.xml.rpc.ServiceException: " + serviceException.getMessage());
          serviceException.printStackTrace(System.out);
        }
      }
    }
    if (__aES_MB_IntakeWOList_Intf_1_0 == null) {
      try {
        __aES_MB_IntakeWOList_Intf_1_0 = (new AES_MB_IntakeWOList_Lib_1_0.WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator()).getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort();
        
      }
      catch (javax.xml.rpc.ServiceException serviceException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("javax.xml.rpc.ServiceException: " + serviceException.getMessage());
          serviceException.printStackTrace(System.out);
        }
      }
    }
    if (__aES_MB_IntakeWOList_Intf_1_0 != null) {
      if (_endpoint != null)
        ((javax.xml.rpc.Stub)__aES_MB_IntakeWOList_Intf_1_0)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
      else
        _endpoint = (String)((javax.xml.rpc.Stub)__aES_MB_IntakeWOList_Intf_1_0)._getProperty("javax.xml.rpc.service.endpoint.address");
    }
    
  }
  
  
  public void useJNDI(boolean useJNDI) {
    _useJNDI = useJNDI;
    __aES_MB_IntakeWOList_Intf_1_0 = null;
    
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (__aES_MB_IntakeWOList_Intf_1_0 != null)
      ((javax.xml.rpc.Stub)__aES_MB_IntakeWOList_Intf_1_0)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result getIntakeWOList(AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request input) throws java.rmi.RemoteException, AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception{
    if (__aES_MB_IntakeWOList_Intf_1_0 == null)
      _initAES_MB_IntakeWOList_Intf_1_0Proxy();
    return __aES_MB_IntakeWOList_Intf_1_0.getIntakeWOList(input);
  }
  
  
  public AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0 getAES_MB_IntakeWOList_Intf_1_0() {
    if (__aES_MB_IntakeWOList_Intf_1_0 == null)
      _initAES_MB_IntakeWOList_Intf_1_0Proxy();
    return __aES_MB_IntakeWOList_Intf_1_0;
  }
  
}