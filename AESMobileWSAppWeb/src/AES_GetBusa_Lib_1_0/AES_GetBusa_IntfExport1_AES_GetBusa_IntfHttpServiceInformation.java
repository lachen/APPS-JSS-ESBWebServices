/**
 * AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceInformation.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_GetBusa_Lib_1_0;

public class AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceInformation implements com.ibm.ws.webservices.multiprotocol.ServiceInformation {

    private static java.util.Map operationDescriptions;
    private static java.util.Map typeMappings;

    static {
         initOperationDescriptions();
         initTypeMappings();
    }

    private static void initOperationDescriptions() { 
        operationDescriptions = new java.util.HashMap();

        java.util.Map inner0 = new java.util.HashMap();

        java.util.List list0 = new java.util.ArrayList();
        inner0.put("getBusaByZipCode", list0);

        com.ibm.ws.webservices.engine.description.OperationDesc getBusaByZipCode0Op = _getBusaByZipCode0Op();
        list0.add(getBusaByZipCode0Op);

        java.util.List list1 = new java.util.ArrayList();
        inner0.put("getCPUByBU", list1);

        com.ibm.ws.webservices.engine.description.OperationDesc getCPUByBU1Op = _getCPUByBU1Op();
        list1.add(getCPUByBU1Op);

        operationDescriptions.put("AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort",inner0);
        operationDescriptions = java.util.Collections.unmodifiableMap(operationDescriptions);
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _getBusaByZipCode0Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc getBusaByZipCode0Op = null;
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
        getBusaByZipCode0Op = new com.ibm.ws.webservices.engine.description.OperationDesc("getBusaByZipCode", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByZipCode"), _params0, _returnDesc0, _faults0, null);
        getBusaByZipCode0Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "AES_GetBusa_Intf"));
        getBusaByZipCode0Op.setOption("inputName","getBusaByZipCodeRequest");
        getBusaByZipCode0Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByZipCodeResponseMsg"));
        getBusaByZipCode0Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding", "AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpService"));
        getBusaByZipCode0Op.setOption("buildNum","cf070942.33");
        getBusaByZipCode0Op.setOption("ResponseNamespace","http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf");
        getBusaByZipCode0Op.setOption("targetNamespace","http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding");
        getBusaByZipCode0Op.setOption("outputName","getBusaByZipCodeResponse");
        getBusaByZipCode0Op.setOption("ResponseLocalPart","getBusaByZipCodeResponse");
        getBusaByZipCode0Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByZipCodeRequestMsg"));
        getBusaByZipCode0Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return getBusaByZipCode0Op;

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _getCPUByBU1Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc getCPUByBU1Op = null;
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
         new com.ibm.ws.webservices.engine.description.FaultDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Exception"), com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getCPUByBU_faultMsg"), "AES_GetBusa_Lib_1_0.AES_GetBusa_Exception", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getBusaByBusinessUnitFault1_fault"), com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Exception")), 
          };
        getCPUByBU1Op = new com.ibm.ws.webservices.engine.description.OperationDesc("getCPUByBU", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getCPUByBU"), _params0, _returnDesc0, _faults0, null);
        getCPUByBU1Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "AES_GetBusa_Intf"));
        getCPUByBU1Op.setOption("inputName","getCPUByBURequest");
        getCPUByBU1Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getCPUByBUResponseMsg"));
        getCPUByBU1Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding", "AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpService"));
        getCPUByBU1Op.setOption("buildNum","cf070942.33");
        getCPUByBU1Op.setOption("ResponseNamespace","http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf");
        getCPUByBU1Op.setOption("targetNamespace","http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding");
        getCPUByBU1Op.setOption("outputName","getCPUByBUResponse");
        getCPUByBU1Op.setOption("ResponseLocalPart","getCPUByBUResponse");
        getCPUByBU1Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf", "getCPUByBURequestMsg"));
        getCPUByBU1Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return getCPUByBU1Op;

    }


    private static void initTypeMappings() {
        typeMappings = new java.util.HashMap();
        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Request"),
                         AES_GetBusa_Lib_1_0.AES_GetBusa_Request.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Response"),
                         AES_GetBusa_Lib_1_0.AES_GetBusa_Response.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/beans", "AES_GetBusa_Exception"),
                         AES_GetBusa_Lib_1_0.AES_GetBusa_Exception.class);

        typeMappings = java.util.Collections.unmodifiableMap(typeMappings);
    }

    public java.util.Map getTypeMappings() {
        return typeMappings;
    }

    public Class getJavaType(javax.xml.namespace.QName xmlName) {
        return (Class) typeMappings.get(xmlName);
    }

    public java.util.Map getOperationDescriptions(String portName) {
        return (java.util.Map) operationDescriptions.get(portName);
    }

    public java.util.List getOperationDescriptions(String portName, String operationName) {
        java.util.Map map = (java.util.Map) operationDescriptions.get(portName);
        if (map != null) {
            return (java.util.List) map.get(operationName);
        }
        return null;
    }

}
