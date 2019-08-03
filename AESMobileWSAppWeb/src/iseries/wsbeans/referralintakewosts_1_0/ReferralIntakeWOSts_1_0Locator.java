/**
 * ReferralIntakeWOSts_1_0Locator.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0;

public class ReferralIntakeWOSts_1_0Locator extends com.ibm.ws.webservices.multiprotocol.AgnosticService implements com.ibm.ws.webservices.multiprotocol.GeneratedService, iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0 {

    public ReferralIntakeWOSts_1_0Locator() {
        super(com.ibm.ws.webservices.engine.utils.QNameTable.createQName(
           "http://referralintakewosts_1_0.wsbeans.iseries",
           "ReferralIntakeWOSts_1_0"));

        context.setLocatorName("iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0Locator");
    }

    public ReferralIntakeWOSts_1_0Locator(com.ibm.ws.webservices.multiprotocol.ServiceContext ctx) {
        super(ctx);
        context.setLocatorName("iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0Locator");
    }

    // Use to get a proxy class for referralIntakeWOSts_1_0SOAP11Port_http
    private final java.lang.String referralIntakeWOSts_1_0SOAP11Port_http_address = "http://br0210.corp.apria.com:10000/web/services/ReferralIntakeWOSts_1_0";

    public java.lang.String getReferralIntakeWOSts_1_0SOAP11Port_httpAddress() {
        if (context.getOverriddingEndpointURIs() == null) {
            return referralIntakeWOSts_1_0SOAP11Port_http_address;
        }
        String overriddingEndpoint = (String) context.getOverriddingEndpointURIs().get("ReferralIntakeWOSts_1_0SOAP11port_http");
        if (overriddingEndpoint != null) {
            return overriddingEndpoint;
        }
        else {
            return referralIntakeWOSts_1_0SOAP11Port_http_address;
        }
    }

    private java.lang.String referralIntakeWOSts_1_0SOAP11Port_httpPortName = "ReferralIntakeWOSts_1_0SOAP11port_http";

    // The WSDD port name defaults to the port name.
    private java.lang.String referralIntakeWOSts_1_0SOAP11Port_httpWSDDPortName = "ReferralIntakeWOSts_1_0SOAP11port_http";

    public java.lang.String getReferralIntakeWOSts_1_0SOAP11Port_httpWSDDPortName() {
        return referralIntakeWOSts_1_0SOAP11Port_httpWSDDPortName;
    }

    public void setReferralIntakeWOSts_1_0SOAP11Port_httpWSDDPortName(java.lang.String name) {
        referralIntakeWOSts_1_0SOAP11Port_httpWSDDPortName = name;
    }

    public iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0PortType getReferralIntakeWOSts_1_0SOAP11Port_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getReferralIntakeWOSts_1_0SOAP11Port_httpAddress());
        }
        catch (java.net.MalformedURLException e) {
            return null; // unlikely as URL was validated in WSDL2Java
        }
        return getReferralIntakeWOSts_1_0SOAP11Port_http(endpoint);
    }

    public iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0PortType getReferralIntakeWOSts_1_0SOAP11Port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0PortType _stub =
            (iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0PortType) getStub(
                referralIntakeWOSts_1_0SOAP11Port_httpPortName,
                (String) getPort2NamespaceMap().get(referralIntakeWOSts_1_0SOAP11Port_httpPortName),
                iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0PortType.class,
                "iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0SOAP11BindingStub",
                portAddress.toString());
        if (_stub instanceof com.ibm.ws.webservices.engine.client.Stub) {
            ((com.ibm.ws.webservices.engine.client.Stub) _stub).setPortName(referralIntakeWOSts_1_0SOAP11Port_httpWSDDPortName);
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
            if (iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                return getReferralIntakeWOSts_1_0SOAP11Port_http();
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
        if ("ReferralIntakeWOSts_1_0SOAP11port_http".equals(inputPortName)) {
            return getReferralIntakeWOSts_1_0SOAP11Port_http();
        }
        else  {
            throw new javax.xml.rpc.ServiceException();
        }
    }

    public void setPortNamePrefix(java.lang.String prefix) {
        referralIntakeWOSts_1_0SOAP11Port_httpWSDDPortName = prefix + "/" + referralIntakeWOSts_1_0SOAP11Port_httpPortName;
    }

    public javax.xml.namespace.QName getServiceName() {
        return com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "ReferralIntakeWOSts_1_0");
    }

    private java.util.Map port2NamespaceMap = null;

    protected synchronized java.util.Map getPort2NamespaceMap() {
        if (port2NamespaceMap == null) {
            port2NamespaceMap = new java.util.HashMap();
            port2NamespaceMap.put(
               "ReferralIntakeWOSts_1_0SOAP11port_http",
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
        if  (portName.getLocalPart().equals("ReferralIntakeWOSts_1_0SOAP11port_http")) {
            return new javax.xml.rpc.Call[] {
                createCall(portName, "referralintakewosts_1_0_XML", "null"),
                createCall(portName, "referralintakewosts_1_0", "null"),
            };
        }
        else {
            throw new javax.xml.rpc.ServiceException("WSWS3062E: Error: portName should not be null.");
        }
    }
}
