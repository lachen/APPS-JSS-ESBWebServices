package AES_GetBusa_Lib_1_0;

public class AES_GetBusa_IntfProxy implements AES_GetBusa_Lib_1_0.AES_GetBusa_Intf {
  private boolean _useJNDI = true;
  private String _endpoint = null;
  private AES_GetBusa_Lib_1_0.AES_GetBusa_Intf __aES_GetBusa_Intf = null;
  
  public AES_GetBusa_IntfProxy() {
    _initAES_GetBusa_IntfProxy();
  }
  
  private void _initAES_GetBusa_IntfProxy() {
  
    if (_useJNDI) {
      try {
        javax.naming.InitialContext ctx = new javax.naming.InitialContext();
        __aES_GetBusa_Intf = ((AES_GetBusa_Lib_1_0.AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpService)ctx.lookup("java:comp/env/service/AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpService")).getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort();
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
    if (__aES_GetBusa_Intf == null) {
      try {
        __aES_GetBusa_Intf = (new AES_GetBusa_Lib_1_0.AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator()).getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort();
        
      }
      catch (javax.xml.rpc.ServiceException serviceException) {
        if ("true".equalsIgnoreCase(System.getProperty("DEBUG_PROXY"))) {
          System.out.println("javax.xml.rpc.ServiceException: " + serviceException.getMessage());
          serviceException.printStackTrace(System.out);
        }
      }
    }
    if (__aES_GetBusa_Intf != null) {
      if (_endpoint != null)
        ((javax.xml.rpc.Stub)__aES_GetBusa_Intf)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
      else
        _endpoint = (String)((javax.xml.rpc.Stub)__aES_GetBusa_Intf)._getProperty("javax.xml.rpc.service.endpoint.address");
    }
    
  }
  
  
  public void useJNDI(boolean useJNDI) {
    _useJNDI = useJNDI;
    __aES_GetBusa_Intf = null;
    
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (__aES_GetBusa_Intf != null)
      ((javax.xml.rpc.Stub)__aES_GetBusa_Intf)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public AES_GetBusa_Lib_1_0.AES_GetBusa_Response getBusaByZipCode(AES_GetBusa_Lib_1_0.AES_GetBusa_Request input) throws java.rmi.RemoteException, AES_GetBusa_Lib_1_0.AES_GetBusa_Exception{
    if (__aES_GetBusa_Intf == null)
      _initAES_GetBusa_IntfProxy();
    return __aES_GetBusa_Intf.getBusaByZipCode(input);
  }
  
  public AES_GetBusa_Lib_1_0.AES_GetBusa_Response getCPUByBU(AES_GetBusa_Lib_1_0.AES_GetBusa_Request input) throws java.rmi.RemoteException, AES_GetBusa_Lib_1_0.AES_GetBusa_Exception{
    if (__aES_GetBusa_Intf == null)
      _initAES_GetBusa_IntfProxy();
    return __aES_GetBusa_Intf.getCPUByBU(input);
  }
  
  
  public AES_GetBusa_Lib_1_0.AES_GetBusa_Intf getAES_GetBusa_Intf() {
    if (__aES_GetBusa_Intf == null)
      _initAES_GetBusa_IntfProxy();
    return __aES_GetBusa_Intf;
  }
  
}