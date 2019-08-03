/**
 * ReferralIntakeWOSts_1_0SOAP11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0;

public class ReferralIntakeWOSts_1_0SOAP11BindingStub extends com.ibm.ws.webservices.engine.client.Stub implements iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0PortType {
    public ReferralIntakeWOSts_1_0SOAP11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws com.ibm.ws.webservices.engine.WebServicesFault {
        if (service == null) {
            super.service = new com.ibm.ws.webservices.engine.client.Service();
        }
        else {
            super.service = service;
        }
        super.engine = ((com.ibm.ws.webservices.engine.client.Service) super.service).getEngine();
        super.messageContexts = new com.ibm.ws.webservices.engine.MessageContext[2];
        java.lang.String theOption = (java.lang.String)super._getProperty("lastStubMapping");
        if (theOption == null || !theOption.equals("iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0SOAP11Binding")) {
                initTypeMapping();
                super._setProperty("lastStubMapping","iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0SOAP11Binding");
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
        javaType = iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Input.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "ReferralIntakeWOSts_1_0Input");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "ReferralIntakeWOSts_1_0Result");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = iseries.wsbeans.referralintakewosts_1_0.xsd.Intake.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "Intake");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "WorkOrder");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _referralintakewosts_1_0_XMLOperation0 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getreferralintakewosts_1_0_XMLOperation0() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "param0"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "ReferralIntakeWOSts_1_0Input"), iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Input.class, false, false, false, true, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://referralintakewosts_1_0.wsbeans.iseries/xsd}ReferralIntakeWOSts_1_0Input");
        _params0[0].setOption("partName","ReferralIntakeWOSts_1_0Input");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "return"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, false, false, true, true, false); 
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partQNameString","{http://www.w3.org/2001/XMLSchema}string");
        _returnDesc0.setOption("partName","string");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _referralintakewosts_1_0_XMLOperation0 = new com.ibm.ws.webservices.engine.description.OperationDesc("referralintakewosts_1_0_XML", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "referralintakewosts_1_0_XML"), _params0, _returnDesc0, _faults0, "urn:referralintakewosts_1_0_XML");
        _referralintakewosts_1_0_XMLOperation0.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "ReferralIntakeWOSts_1_0PortType"));
        _referralintakewosts_1_0_XMLOperation0.setOption("inputWSAAction","urn:referralintakewosts_1_0_XML");
        _referralintakewosts_1_0_XMLOperation0.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "referralintakewosts_1_0_XMLResponse"));
        _referralintakewosts_1_0_XMLOperation0.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "ReferralIntakeWOSts_1_0"));
        _referralintakewosts_1_0_XMLOperation0.setOption("buildNum","cf070942.33");
        _referralintakewosts_1_0_XMLOperation0.setOption("ResponseNamespace","http://referralintakewosts_1_0.wsbeans.iseries/xsd");
        _referralintakewosts_1_0_XMLOperation0.setOption("targetNamespace","http://referralintakewosts_1_0.wsbeans.iseries");
        _referralintakewosts_1_0_XMLOperation0.setOption("outputWSAAction","urn:referralintakewosts_1_0_XMLResponse");
        _referralintakewosts_1_0_XMLOperation0.setOption("ResponseLocalPart","referralintakewosts_1_0_XMLResponse");
        _referralintakewosts_1_0_XMLOperation0.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "referralintakewosts_1_0_XMLRequest"));
        _referralintakewosts_1_0_XMLOperation0.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _referralintakewosts_1_0_XMLOperation0.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _referralintakewosts_1_0_XMLOperation0;

    }

    private int _referralintakewosts_1_0_XMLIndex0 = 0;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getreferralintakewosts_1_0_XMLInvoke0(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_referralintakewosts_1_0_XMLIndex0];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(ReferralIntakeWOSts_1_0SOAP11BindingStub._referralintakewosts_1_0_XMLOperation0);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("urn:referralintakewosts_1_0_XML");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_referralintakewosts_1_0_XMLIndex0] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public java.lang.String referralintakewosts_1_0_XML(iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Input param0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getreferralintakewosts_1_0_XMLInvoke0(new java.lang.Object[] {param0}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return (java.lang.String) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (java.lang.String) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), java.lang.String.class);
        }
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _referralintakewosts_1_0Operation1 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getreferralintakewosts_1_0Operation1() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params1 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "param0"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "ReferralIntakeWOSts_1_0Input"), iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Input.class, false, false, false, true, true, false), 
          };
        _params1[0].setOption("inputPosition","0");
        _params1[0].setOption("partQNameString","{http://referralintakewosts_1_0.wsbeans.iseries/xsd}ReferralIntakeWOSts_1_0Input");
        _params1[0].setOption("partName","ReferralIntakeWOSts_1_0Input");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc1 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "return"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "ReferralIntakeWOSts_1_0Result"), iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result.class, true, false, false, true, true, false); 
        _returnDesc1.setOption("outputPosition","0");
        _returnDesc1.setOption("partQNameString","{http://referralintakewosts_1_0.wsbeans.iseries/xsd}ReferralIntakeWOSts_1_0Result");
        _returnDesc1.setOption("partName","ReferralIntakeWOSts_1_0Result");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults1 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        _referralintakewosts_1_0Operation1 = new com.ibm.ws.webservices.engine.description.OperationDesc("referralintakewosts_1_0", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "referralintakewosts_1_0"), _params1, _returnDesc1, _faults1, "urn:referralintakewosts_1_0");
        _referralintakewosts_1_0Operation1.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "ReferralIntakeWOSts_1_0PortType"));
        _referralintakewosts_1_0Operation1.setOption("inputWSAAction","urn:referralintakewosts_1_0");
        _referralintakewosts_1_0Operation1.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "referralintakewosts_1_0Response"));
        _referralintakewosts_1_0Operation1.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "ReferralIntakeWOSts_1_0"));
        _referralintakewosts_1_0Operation1.setOption("buildNum","cf070942.33");
        _referralintakewosts_1_0Operation1.setOption("ResponseNamespace","http://referralintakewosts_1_0.wsbeans.iseries/xsd");
        _referralintakewosts_1_0Operation1.setOption("targetNamespace","http://referralintakewosts_1_0.wsbeans.iseries");
        _referralintakewosts_1_0Operation1.setOption("outputWSAAction","urn:referralintakewosts_1_0Response");
        _referralintakewosts_1_0Operation1.setOption("ResponseLocalPart","referralintakewosts_1_0Response");
        _referralintakewosts_1_0Operation1.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "referralintakewosts_1_0Request"));
        _referralintakewosts_1_0Operation1.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _referralintakewosts_1_0Operation1.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _referralintakewosts_1_0Operation1;

    }

    private int _referralintakewosts_1_0Index1 = 1;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getreferralintakewosts_1_0Invoke1(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_referralintakewosts_1_0Index1];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(ReferralIntakeWOSts_1_0SOAP11BindingStub._referralintakewosts_1_0Operation1);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("urn:referralintakewosts_1_0");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_referralintakewosts_1_0Index1] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result referralintakewosts_1_0(iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Input param0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getreferralintakewosts_1_0Invoke1(new java.lang.Object[] {param0}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            throw wsf;
        } 
        try {
            return (iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result.class);
        }
    }

    private static void _staticInit() {
        _referralintakewosts_1_0_XMLOperation0 = _getreferralintakewosts_1_0_XMLOperation0();
        _referralintakewosts_1_0Operation1 = _getreferralintakewosts_1_0Operation1();
    }

    static {
       _staticInit();
    }
}
