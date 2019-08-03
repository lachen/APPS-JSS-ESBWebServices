/**
 * WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceInformation.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceInformation implements com.ibm.ws.webservices.multiprotocol.ServiceInformation {

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
        inner0.put("getIntakeWOList", list0);

        com.ibm.ws.webservices.engine.description.OperationDesc getIntakeWOList0Op = _getIntakeWOList0Op();
        list0.add(getIntakeWOList0Op);

        operationDescriptions.put("WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort",inner0);
        operationDescriptions = java.util.Collections.unmodifiableMap(operationDescriptions);
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _getIntakeWOList0Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc getIntakeWOList0Op = null;
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
        getIntakeWOList0Op = new com.ibm.ws.webservices.engine.description.OperationDesc("getIntakeWOList", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "getIntakeWOList"), _params0, _returnDesc0, _faults0, null);
        getIntakeWOList0Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "AES_MB_IntakeWOList_Intf_1_0"));
        getIntakeWOList0Op.setOption("inputName","getIntakeWOListRequest");
        getIntakeWOList0Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "getIntakeWOListResponseMsg"));
        getIntakeWOList0Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0/Binding", "WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpService"));
        getIntakeWOList0Op.setOption("buildNum","cf070942.33");
        getIntakeWOList0Op.setOption("ResponseNamespace","http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0");
        getIntakeWOList0Op.setOption("targetNamespace","http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0/Binding");
        getIntakeWOList0Op.setOption("outputName","getIntakeWOListResponse");
        getIntakeWOList0Op.setOption("ResponseLocalPart","getIntakeWOListResponse");
        getIntakeWOList0Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans/AES_MB_IntakeWOList_Intf_1_0", "getIntakeWOListRequestMsg"));
        getIntakeWOList0Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return getIntakeWOList0Op;

    }


    private static void initTypeMappings() {
        typeMappings = new java.util.HashMap();
        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Request"),
                         AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Result"),
                         AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "AES_MB_IntakeWOList_Exception"),
                         AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "WorkOrder"),
                         AES_MB_IntakeWOList_Lib_1_0.WorkOrder.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://AES_MB_IntakeWOList_Lib_1_0/com/apria/services/aes/workorderdetails/beans", "Intake"),
                         AES_MB_IntakeWOList_Lib_1_0.Intake.class);

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
