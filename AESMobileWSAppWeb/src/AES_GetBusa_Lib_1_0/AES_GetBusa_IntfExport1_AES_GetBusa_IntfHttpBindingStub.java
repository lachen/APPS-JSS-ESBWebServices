/**
 * AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_GetBusa_Lib_1_0;

public class AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpBindingStub extends com.ibm.ws.webservices.engine.client.Stub implements AES_GetBusa_Lib_1_0.AES_GetBusa_Intf {
    public AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws com.ibm.ws.webservices.engine.WebServicesFault {
        if (service == null) {
            super.service = new com.ibm.ws.webservices.engine.client.Service();
        }
        else {
            super.service = service;
        }
        super.engine = ((com.ibm.ws.webservices.engine.client.Service) super.service).getEngine();
        super.messageContexts = new com.ibm.ws.webservices.engine.MessageContext[2];
        java.lang.String theOption = (java.lang.String)super._getProperty("lastStubMapping");
        if (theOption == null || !theOption.equals("AES_GetBusa_Lib_1_0.AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpBinding")) {
                initTypeMapping();
                super._setProperty("lastStubMapping","AES_GetBusa_Lib_1_0.AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpBinding");
        }
        super.cachedEndpoint = endpointURL;
        super.connection = ((com.ibm.ws.webservices.engine.client.Service) super.service).getConnection(endpointURL);
    }

    private void initTypeMapping() {
        javax.xml.rpc.encoding.TypeMapping tm = super.getTypeMapping(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
        java.lang.Class javaType = null;
        javax.xml.namespace.QName xmlType = null;
        javax.xml.namespace.QName compQName = null;
        javax.xml.namespace.QName compTypeQName = null;
        com.ibm.ws.webservices.engine.encoding.SerializerFactory sf = null;
        com.ibm.ws.webservices.engine.encoding.DeserializerFactory df = null;
        javaType = AES_GetBusa_Lib_1_0.AES_GetBusa_Request.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Request");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = AES_GetBusa_Lib_1_0.AES_GetBusa_Response.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Response");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = AES_GetBusa_Lib_1_0.AES_GetBusa_Exception.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Exception");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _getBusaByZipCodeOperation0 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getgetBusaByZipCodeOperation0() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "input"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Request"), AES_GetBusa_Lib_1_0.AES_GetBusa_Request.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans}AES_GetBusa_Request");
        _params0[0].setOption("partName","AES_GetBusa_Request");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "output"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Response"), AES_GetBusa_Lib_1_0.AES_GetBusa_Response.class, true, false, false, false, true, false); 
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partQNameString","{http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans}AES_GetBusa_Response");
        _returnDesc0.setOption("partName","AES_GetBusa_Response");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
         new com.ibm.ws.webservices.engine.description.FaultDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Exception"), com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByZipCode_faultMsg"), "AES_GetBusa_Lib_1_0.AES_GetBusa_Exception", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByZipCodeFault1_fault"), com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Exception")), 
          };
        _getBusaByZipCodeOperation0 = new com.ibm.ws.webservices.engine.description.OperationDesc("getBusaByZipCode", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByZipCode"), _params0, _returnDesc0, _faults0, "");
        _getBusaByZipCodeOperation0.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "AES_GetBusa_Intf"));
        _getBusaByZipCodeOperation0.setOption("inputName","getBusaByZipCodeRequest");
        _getBusaByZipCodeOperation0.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByZipCodeResponseMsg"));
        _getBusaByZipCodeOperation0.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding", "AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpService"));
        _getBusaByZipCodeOperation0.setOption("buildNum","cf070942.33");
        _getBusaByZipCodeOperation0.setOption("ResponseNamespace","http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf");
        _getBusaByZipCodeOperation0.setOption("targetNamespace","http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding");
        _getBusaByZipCodeOperation0.setOption("outputName","getBusaByZipCodeResponse");
        _getBusaByZipCodeOperation0.setOption("ResponseLocalPart","getBusaByZipCodeResponse");
        _getBusaByZipCodeOperation0.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByZipCodeRequestMsg"));
        _getBusaByZipCodeOperation0.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _getBusaByZipCodeOperation0.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _getBusaByZipCodeOperation0;

    }

    private int _getBusaByZipCodeIndex0 = 0;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getgetBusaByZipCodeInvoke0(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_getBusaByZipCodeIndex0];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpBindingStub._getBusaByZipCodeOperation0);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_getBusaByZipCodeIndex0] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public AES_GetBusa_Lib_1_0.AES_GetBusa_Response getBusaByZipCode(AES_GetBusa_Lib_1_0.AES_GetBusa_Request input) throws java.rmi.RemoteException, AES_GetBusa_Lib_1_0.AES_GetBusa_Exception {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getgetBusaByZipCodeInvoke0(new java.lang.Object[] {input}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            if (e != null) {
                if (e instanceof AES_GetBusa_Lib_1_0.AES_GetBusa_Exception) {
                    throw (AES_GetBusa_Lib_1_0.AES_GetBusa_Exception) e;
                }
            }
            throw wsf;
        } 
        try {
            return (AES_GetBusa_Lib_1_0.AES_GetBusa_Response) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (AES_GetBusa_Lib_1_0.AES_GetBusa_Response) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), AES_GetBusa_Lib_1_0.AES_GetBusa_Response.class);
        }
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _getCPUByBUOperation1 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getgetCPUByBUOperation1() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params1 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "input"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Request"), AES_GetBusa_Lib_1_0.AES_GetBusa_Request.class, false, false, false, false, true, false), 
          };
        _params1[0].setOption("inputPosition","0");
        _params1[0].setOption("partQNameString","{http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans}AES_GetBusa_Request");
        _params1[0].setOption("partName","AES_GetBusa_Request");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc1 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "output"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Response"), AES_GetBusa_Lib_1_0.AES_GetBusa_Response.class, true, false, false, false, true, false); 
        _returnDesc1.setOption("outputPosition","0");
        _returnDesc1.setOption("partQNameString","{http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans}AES_GetBusa_Response");
        _returnDesc1.setOption("partName","AES_GetBusa_Response");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults1 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
         new com.ibm.ws.webservices.engine.description.FaultDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Exception"), com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getCPUByBU_faultMsg"), "AES_GetBusa_Lib_1_0.AES_GetBusa_Exception", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByBusinessUnitFault1_fault"), com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Exception")), 
          };
        _getCPUByBUOperation1 = new com.ibm.ws.webservices.engine.description.OperationDesc("getCPUByBU", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getCPUByBU"), _params1, _returnDesc1, _faults1, "");
        _getCPUByBUOperation1.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "AES_GetBusa_Intf"));
        _getCPUByBUOperation1.setOption("inputName","getCPUByBURequest");
        _getCPUByBUOperation1.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getCPUByBUResponseMsg"));
        _getCPUByBUOperation1.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding", "AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpService"));
        _getCPUByBUOperation1.setOption("buildNum","cf070942.33");
        _getCPUByBUOperation1.setOption("ResponseNamespace","http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf");
        _getCPUByBUOperation1.setOption("targetNamespace","http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding");
        _getCPUByBUOperation1.setOption("outputName","getCPUByBUResponse");
        _getCPUByBUOperation1.setOption("ResponseLocalPart","getCPUByBUResponse");
        _getCPUByBUOperation1.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getCPUByBURequestMsg"));
        _getCPUByBUOperation1.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _getCPUByBUOperation1.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _getCPUByBUOperation1;

    }

    private int _getCPUByBUIndex1 = 1;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getgetCPUByBUInvoke1(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_getCPUByBUIndex1];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpBindingStub._getCPUByBUOperation1);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_getCPUByBUIndex1] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public AES_GetBusa_Lib_1_0.AES_GetBusa_Response getCPUByBU(AES_GetBusa_Lib_1_0.AES_GetBusa_Request input) throws java.rmi.RemoteException, AES_GetBusa_Lib_1_0.AES_GetBusa_Exception {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getgetCPUByBUInvoke1(new java.lang.Object[] {input}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            if (e != null) {
                if (e instanceof AES_GetBusa_Lib_1_0.AES_GetBusa_Exception) {
                    throw (AES_GetBusa_Lib_1_0.AES_GetBusa_Exception) e;
                }
            }
            throw wsf;
        } 
        try {
            return (AES_GetBusa_Lib_1_0.AES_GetBusa_Response) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (AES_GetBusa_Lib_1_0.AES_GetBusa_Response) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), AES_GetBusa_Lib_1_0.AES_GetBusa_Response.class);
        }
    }

    private static void _staticInit() {
        _getCPUByBUOperation1 = _getgetCPUByBUOperation1();
        _getBusaByZipCodeOperation0 = _getgetBusaByZipCodeOperation0();
    }

    static {
       _staticInit();
    }
}
