/**
 * WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator extends com.ibm.ws.webservices.multiprotocol.AgnosticService implements com.ibm.ws.webservices.multiprotocol.GeneratedService, AES_MB_IntakeWOList_Lib_1_0.WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpService {

    public WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator() {
        super(com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
           "http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0/Binding",
           "WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpService"));

        context.setLocatorName("AES_MB_IntakeWOList_Lib_1_0.WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator");
    }

    public WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator(com.ibm.ws.webservices.multiprotocol.ServiceContext ctx) {
        super(ctx);
        context.setLocatorName("AES_MB_IntakeWOList_Lib_1_0.WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator");
    }

    // Use to get a proxy class for WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort
    private final java.lang.String WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort_address = "http://localhost:9082/AES_MB_IntakeWOList_Svcs_1_0Web/sca/AES_MB_IntakeWOList_Intf_1_0";

    public java.lang.String getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortAddress() {
        if (context.getOverriddingEndpointURIs() == null) {
            return WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort_address;
        }
        String overriddingEndpoint = (String) context.getOverriddingEndpointURIs().get("WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort");
        if (overriddingEndpoint != null) {
            return overriddingEndpoint;
        }
        else {
            return WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort_address;
        }
    }

    private java.lang.String WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortPortName = "WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort";

    // The WSDD port name defaults to the port name.
    private java.lang.String WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortWSDDPortName = "WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort";

    public java.lang.String getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortWSDDPortName() {
        return WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortWSDDPortName;
    }

    public void setWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortWSDDPortName(java.lang.String name) {
        WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortWSDDPortName = name;
    }

    public AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0 getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortAddress());
        }
        catch (java.net.MalformedURLException e) {
            return null; // unlikely as URL was validated in WSDL2Java
        }
        return getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort(endpoint);
    }

    public AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0 getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0 _stub =
            (AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0) getStub(
                WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortPortName,
                (String) getPort2NamespaceMap().get(WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortPortName),
                AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0.class,
                "AES_MB_IntakeWOList_Lib_1_0.WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpBindingStub",
                portAddress.toString());
        if (_stub instanceof com.ibm.ws.webservices.engine.client.Stub) {
            ((com.ibm.ws.webservices.engine.client.Stub) _stub).setPortName(WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortWSDDPortName);
        }
        return _stub;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0.class.isAssignableFrom(serviceEndpointInterface)) {
                return getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort();
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("WSWS3273E: Error: There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        String inputPortName = portName.getLocalPart();
        if ("WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort".equals(inputPortName)) {
            return getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort();
        }
        else  {
            throw new javax.xml.rpc.ServiceException();
        }
    }

    public void setPortNamePrefix(java.lang.String prefix) {
        WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortWSDDPortName = prefix + "/" + WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPortPortName;
    }

    public javax.xml.namespace.QName getServiceName() {
        return com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0/Binding", "WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpService");
    }

    private java.util.Map port2NamespaceMap = null;

    protected synchronized java.util.Map getPort2NamespaceMap() {
        if (port2NamespaceMap == null) {
            port2NamespaceMap = new java.util.HashMap();
            port2NamespaceMap.put(
               "WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort",
               "http://schemas.xmlsoap.org/wsdl/soap/");
        }
        return port2NamespaceMap;
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            String serviceNamespace = getServiceName().getNamespaceURI();
            for (java.util.Iterator i = getPort2NamespaceMap().keySet().iterator(); i.hasNext(); ) {
                ports.add(
                    com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
                        serviceNamespace,
                        (String) i.next()));
            }
        }
        return ports.iterator();
    }

    public javax.xml.rpc.Call[] getCalls(javax.xml.namespace.QName portName) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
        if  (portName.getLocalPart().equals("WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort")) {
            return new javax.xml.rpc.Call[] {
                createCall(portName, "getIntakeWOList", "getIntakeWOListRequest"),
            };
        }
        else {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
    }
}
