/**
 * WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpBindingStub extends com.ibm.ws.webservices.engine.client.Stub implements AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0 {
    public WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws com.ibm.ws.webservices.engine.WebServicesFault {
        if (service == null) {
            super.service = new com.ibm.ws.webservices.engine.client.Service();
        }
        else {
            super.service = service;
        }
        super.engine = ((com.ibm.ws.webservices.engine.client.Service) super.service).getEngine();
        super.messageContexts = new com.ibm.ws.webservices.engine.MessageContext[1];
        java.lang.String theOption = (java.lang.String)super._getProperty("lastStubMapping");
        if (theOption == null || !theOption.equals("AES_MB_IntakeWOList_Lib_1_0.WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpBinding")) {
                initTypeMapping();
                super._setProperty("lastStubMapping","AES_MB_IntakeWOList_Lib_1_0.WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpBinding");
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
        javaType = AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Request");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Result");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Exception");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = AES_MB_IntakeWOList_Lib_1_0.WorkOrder.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "WorkOrder");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

        javaType = AES_MB_IntakeWOList_Lib_1_0.Intake.class;
        xmlType = com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "Intake");
        sf = com.ibm.ws.webservices.engine.encoding.ser.BaseSerializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanSerializerFactory.class, javaType, xmlType);
        df = com.ibm.ws.webservices.engine.encoding.ser.BaseDeserializerFactory.createFactory(com.ibm.ws.webservices.engine.encoding.ser.BeanDeserializerFactory.class, javaType, xmlType);
        if (sf != null || df != null) {
            tm.register(javaType, xmlType, sf, df);
        }

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _getIntakeWOListOperation0 = null;
    private static com.ibm.ws.webservices.engine.description.OperationDesc _getgetIntakeWOListOperation0() {
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "input"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Request"), AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request.class, false, false, false, false, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans}AES_MB_IntakeWOList_Request");
        _params0[0].setOption("partName","AES_MB_IntakeWOList_Request");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("", "output"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Result"), AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result.class, true, false, false, false, true, false); 
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partQNameString","{http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans}AES_MB_IntakeWOList_Result");
        _returnDesc0.setOption("partName","AES_MB_IntakeWOList_Result");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
         new com.ibm.ws.webservices.engine.description.FaultDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Exception"), com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "getIntakeWOList_operation1FaultMsg"), "AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "operation1Fault1_operation1Fault"), com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Exception")), 
          };
        _getIntakeWOListOperation0 = new com.ibm.ws.webservices.engine.description.OperationDesc("getIntakeWOList", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "getIntakeWOList"), _params0, _returnDesc0, _faults0, "");
        _getIntakeWOListOperation0.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "AES_MB_IntakeWOList_Intf_1_0"));
        _getIntakeWOListOperation0.setOption("inputName","getIntakeWOListRequest");
        _getIntakeWOListOperation0.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "getIntakeWOListResponseMsg"));
        _getIntakeWOListOperation0.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0/Binding", "WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpService"));
        _getIntakeWOListOperation0.setOption("buildNum","cf070942.33");
        _getIntakeWOListOperation0.setOption("ResponseNamespace","http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0");
        _getIntakeWOListOperation0.setOption("targetNamespace","http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0/Binding");
        _getIntakeWOListOperation0.setOption("outputName","getIntakeWOListResponse");
        _getIntakeWOListOperation0.setOption("ResponseLocalPart","getIntakeWOListResponse");
        _getIntakeWOListOperation0.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "getIntakeWOListRequestMsg"));
        _getIntakeWOListOperation0.setUse(com.ibm.ws.webservices.engine.enumtype.Use.LITERAL);
        _getIntakeWOListOperation0.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return _getIntakeWOListOperation0;

    }

    private int _getIntakeWOListIndex0 = 0;
    private synchronized com.ibm.ws.webservices.engine.client.Stub.Invoke _getgetIntakeWOListInvoke0(Object[] parameters) throws com.ibm.ws.webservices.engine.WebServicesFault  {
        com.ibm.ws.webservices.engine.MessageContext mc = super.messageContexts[_getIntakeWOListIndex0];
        if (mc == null) {
            mc = new com.ibm.ws.webservices.engine.MessageContext(super.engine);
            mc.setOperation(WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpBindingStub._getIntakeWOListOperation0);
            mc.setUseSOAPAction(true);
            mc.setSOAPActionURI("");
            mc.setEncodingStyle(com.ibm.ws.webservices.engine.Constants.URI_LITERAL_ENC);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.SEND_TYPE_ATTR_PROPERTY, Boolean.FALSE);
            mc.setProperty(com.ibm.wsspi.webservices.Constants.ENGINE_DO_MULTI_REFS_PROPERTY, Boolean.FALSE);
            super.primeMessageContext(mc);
            super.messageContexts[_getIntakeWOListIndex0] = mc;
        }
        try {
            mc = (com.ibm.ws.webservices.engine.MessageContext) mc.clone();
        }
        catch (CloneNotSupportedException cnse) {
            throw com.ibm.ws.webservices.engine.WebServicesFault.makeFault(cnse);
        }
        return new com.ibm.ws.webservices.engine.client.Stub.Invoke(connection, mc, parameters);
    }

    public AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result getIntakeWOList(AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request input) throws java.rmi.RemoteException, AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception {
        if (super.cachedEndpoint == null) {
            throw new com.ibm.ws.webservices.engine.NoEndPointException();
        }
        java.util.Vector _resp = null;
        try {
            _resp = _getgetIntakeWOListInvoke0(new java.lang.Object[] {input}).invoke();

        } catch (com.ibm.ws.webservices.engine.WebServicesFault wsf) {
            Exception e = wsf.getUserException();
            if (e != null) {
                if (e instanceof AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception) {
                    throw (AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception) e;
                }
            }
            throw wsf;
        } 
        try {
            return (AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result) ((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue();
        } catch (java.lang.Exception _exception) {
            return (AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result) super.convert(((com.ibm.ws.webservices.engine.xmlsoap.ext.ParamValue) _resp.get(0)).getValue(), AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result.class);
        }
    }

    private static void _staticInit() {
        _getIntakeWOListOperation0 = _getgetIntakeWOListOperation0();
    }

    static {
       _staticInit();
    }
}
