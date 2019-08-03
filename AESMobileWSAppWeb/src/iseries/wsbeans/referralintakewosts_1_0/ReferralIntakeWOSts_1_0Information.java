/**
 * ReferralIntakeWOSts_1_0Information.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0;

public class ReferralIntakeWOSts_1_0Information implements com.ibm.ws.webservices.multiprotocol.ServiceInformation {

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
        inner0.put("referralintakewosts_1_0", list0);

        com.ibm.ws.webservices.engine.description.OperationDesc referralintakewosts_1_00Op = _referralintakewosts_1_00Op();
        list0.add(referralintakewosts_1_00Op);

        java.util.List list1 = new java.util.ArrayList();
        inner0.put("referralintakewosts_1_0_XML", list1);

        com.ibm.ws.webservices.engine.description.OperationDesc referralintakewosts_1_0_XML1Op = _referralintakewosts_1_0_XML1Op();
        list1.add(referralintakewosts_1_0_XML1Op);

        operationDescriptions.put("ReferralIntakeWOSts_1_0SOAP11port_http",inner0);
        operationDescriptions = java.util.Collections.unmodifiableMap(operationDescriptions);
    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _referralintakewosts_1_00Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc referralintakewosts_1_00Op = null;
        com.ibm.ws.webservices.engine.description.ParameterDesc[]  _params0 = new com.ibm.ws.webservices.engine.description.ParameterDesc[] {
         new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "param0"), com.ibm.ws.webservices.engine.description.ParameterDesc.IN, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "ReferralIntakeWOSts_1_0Input"), iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Input.class, false, false, false, true, true, false), 
          };
        _params0[0].setOption("inputPosition","0");
        _params0[0].setOption("partQNameString","{http://referralintakewosts_1_0.wsbeans.iseries/xsd}ReferralIntakeWOSts_1_0Input");
        _params0[0].setOption("partName","ReferralIntakeWOSts_1_0Input");
        com.ibm.ws.webservices.engine.description.ParameterDesc  _returnDesc0 = new com.ibm.ws.webservices.engine.description.ParameterDesc(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "return"), com.ibm.ws.webservices.engine.description.ParameterDesc.OUT, com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "ReferralIntakeWOSts_1_0Result"), iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result.class, true, false, false, true, true, false); 
        _returnDesc0.setOption("outputPosition","0");
        _returnDesc0.setOption("partQNameString","{http://referralintakewosts_1_0.wsbeans.iseries/xsd}ReferralIntakeWOSts_1_0Result");
        _returnDesc0.setOption("partName","ReferralIntakeWOSts_1_0Result");
        com.ibm.ws.webservices.engine.description.FaultDesc[]  _faults0 = new com.ibm.ws.webservices.engine.description.FaultDesc[] {
          };
        referralintakewosts_1_00Op = new com.ibm.ws.webservices.engine.description.OperationDesc("referralintakewosts_1_0", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "referralintakewosts_1_0"), _params0, _returnDesc0, _faults0, null);
        referralintakewosts_1_00Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "ReferralIntakeWOSts_1_0PortType"));
        referralintakewosts_1_00Op.setOption("inputWSAAction","urn:referralintakewosts_1_0");
        referralintakewosts_1_00Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "referralintakewosts_1_0Response"));
        referralintakewosts_1_00Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "ReferralIntakeWOSts_1_0"));
        referralintakewosts_1_00Op.setOption("buildNum","cf070942.33");
        referralintakewosts_1_00Op.setOption("ResponseNamespace","http://referralintakewosts_1_0.wsbeans.iseries/xsd");
        referralintakewosts_1_00Op.setOption("targetNamespace","http://referralintakewosts_1_0.wsbeans.iseries");
        referralintakewosts_1_00Op.setOption("outputWSAAction","urn:referralintakewosts_1_0Response");
        referralintakewosts_1_00Op.setOption("ResponseLocalPart","referralintakewosts_1_0Response");
        referralintakewosts_1_00Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "referralintakewosts_1_0Request"));
        referralintakewosts_1_00Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return referralintakewosts_1_00Op;

    }

    private static com.ibm.ws.webservices.engine.description.OperationDesc _referralintakewosts_1_0_XML1Op() {
        com.ibm.ws.webservices.engine.description.OperationDesc referralintakewosts_1_0_XML1Op = null;
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
        referralintakewosts_1_0_XML1Op = new com.ibm.ws.webservices.engine.description.OperationDesc("referralintakewosts_1_0_XML", com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "referralintakewosts_1_0_XML"), _params0, _returnDesc0, _faults0, null);
        referralintakewosts_1_0_XML1Op.setOption("portTypeQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "ReferralIntakeWOSts_1_0PortType"));
        referralintakewosts_1_0_XML1Op.setOption("inputWSAAction","urn:referralintakewosts_1_0_XML");
        referralintakewosts_1_0_XML1Op.setOption("outputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "referralintakewosts_1_0_XMLResponse"));
        referralintakewosts_1_0_XML1Op.setOption("ServiceQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "ReferralIntakeWOSts_1_0"));
        referralintakewosts_1_0_XML1Op.setOption("buildNum","cf070942.33");
        referralintakewosts_1_0_XML1Op.setOption("ResponseNamespace","http://referralintakewosts_1_0.wsbeans.iseries/xsd");
        referralintakewosts_1_0_XML1Op.setOption("targetNamespace","http://referralintakewosts_1_0.wsbeans.iseries");
        referralintakewosts_1_0_XML1Op.setOption("outputWSAAction","urn:referralintakewosts_1_0_XMLResponse");
        referralintakewosts_1_0_XML1Op.setOption("ResponseLocalPart","referralintakewosts_1_0_XMLResponse");
        referralintakewosts_1_0_XML1Op.setOption("inputMessageQName",com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries", "referralintakewosts_1_0_XMLRequest"));
        referralintakewosts_1_0_XML1Op.setStyle(com.ibm.ws.webservices.engine.enumtype.Style.WRAPPED);
        return referralintakewosts_1_0_XML1Op;

    }


    private static void initTypeMappings() {
        typeMappings = new java.util.HashMap();
        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "ReferralIntakeWOSts_1_0Input"),
                         iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Input.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "ReferralIntakeWOSts_1_0Result"),
                         iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "Intake"),
                         iseries.wsbeans.referralintakewosts_1_0.xsd.Intake.class);

        typeMappings.put(com.ibm.ws.webservices.engine.utils.QNameTable.createQName("http://referralintakewosts_1_0.wsbeans.iseries/xsd", "WorkOrder"),
                         iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder.class);

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
