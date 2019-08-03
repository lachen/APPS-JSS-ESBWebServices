/**
 * AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_GetBusa_Lib_1_0;

public class AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator extends com.ibm.ws.webservices.multiprotocol.AgnosticService implements com.ibm.ws.webservices.multiprotocol.GeneratedService, AES_GetBusa_Lib_1_0.AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpService {

    public AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator() {
        super(com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
           "http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding",
           "AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpService"));

        context.setLocatorName("AES_GetBusa_Lib_1_0.AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator");
    }

    public AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator(com.ibm.ws.webservices.multiprotocol.ServiceContext ctx) {
        super(ctx);
        context.setLocatorName("AES_GetBusa_Lib_1_0.AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator");
    }

    // Use to get a proxy class for AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort
    private final java.lang.String AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort_address = "http://aesbdev.apria.com:80/AES_GetBusa_Svcs_1_0Web/sca/AES_GetBusa_Intf_1_0";

    public java.lang.String getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortAddress() {
        if (context.getOverriddingEndpointURIs() == null) {
            return AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort_address;
        }
        String overriddingEndpoint = (String) context.getOverriddingEndpointURIs().get("AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort");
        if (overriddingEndpoint != null) {
            return overriddingEndpoint;
        }
        else {
            return AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort_address;
        }
    }

    private java.lang.String AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortPortName = "AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort";

    // The WSDD port name defaults to the port name.
    private java.lang.String AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortWSDDPortName = "AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort";

    public java.lang.String getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortWSDDPortName() {
        return AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortWSDDPortName;
    }

    public void setAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortWSDDPortName(java.lang.String name) {
        AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortWSDDPortName = name;
    }

    public AES_GetBusa_Lib_1_0.AES_GetBusa_Intf getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortAddress());
        }
        catch (java.net.MalformedURLException e) {
            return null; // unlikely as URL was validated in WSDL2Java
        }
        return getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort(endpoint);
    }

    public AES_GetBusa_Lib_1_0.AES_GetBusa_Intf getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        AES_GetBusa_Lib_1_0.AES_GetBusa_Intf _stub =
            (AES_GetBusa_Lib_1_0.AES_GetBusa_Intf) getStub(
                AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortPortName,
                (String) getPort2NamespaceMap().get(AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortPortName),
                AES_GetBusa_Lib_1_0.AES_GetBusa_Intf.class,
                "AES_GetBusa_Lib_1_0.AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpBindingStub",
                portAddress.toString());
        if (_stub instanceof com.ibm.ws.webservices.engine.client.Stub) {
            ((com.ibm.ws.webservices.engine.client.Stub) _stub).setPortName(AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortWSDDPortName);
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
            if (AES_GetBusa_Lib_1_0.AES_GetBusa_Intf.class.isAssignableFrom(serviceEndpointInterface)) {
                return getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort();
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
        if ("AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort".equals(inputPortName)) {
            return getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort();
        }
        else  {
            throw new javax.xml.rpc.ServiceException();
        }
    }

    public void setPortNamePrefix(java.lang.String prefix) {
        AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortWSDDPortName = prefix + "/" + AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPortPortName;
    }

    public javax.xml.namespace.QName getServiceName() {
        return com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding", "AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpService");
    }

    private java.util.Map port2NamespaceMap = null;

    protected synchronized java.util.Map getPort2NamespaceMap() {
        if (port2NamespaceMap == null) {
            port2NamespaceMap = new java.util.HashMap();
            port2NamespaceMap.put(
               "AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort",
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
        if  (portName.getLocalPart().equals("AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort")) {
            return new javax.xml.rpc.Call[] {
                createCall(portName, "getBusaByZipCode", "getBusaByZipCodeRequest"),
                createCall(portName, "getCPUByBU", "getCPUByBURequest"),
            };
        }
        else {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
    }
}
