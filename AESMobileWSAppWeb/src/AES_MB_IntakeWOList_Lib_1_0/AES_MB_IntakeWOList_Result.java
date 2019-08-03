/**
 * AES_MB_IntakeWOList_Result.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package AES_MB_IntakeWOList_Lib_1_0;

public class AES_MB_IntakeWOList_Result  {
    private AES_MB_IntakeWOList_Lib_1_0.Intake[] intake;
    private java.lang.String intakeCount;
    private java.lang.String intakeOverFlow;
    private java.lang.String recCount;
    private java.lang.String recStatus;
    private java.lang.String WOCount;
    private AES_MB_IntakeWOList_Lib_1_0.WorkOrder[] workOrder;

    public AES_MB_IntakeWOList_Result() {
    }

    public AES_MB_IntakeWOList_Lib_1_0.Intake[] getIntake() {
        return intake;
    }

    public void setIntake(AES_MB_IntakeWOList_Lib_1_0.Intake[] intake) {
        this.intake = intake;
    }

    public AES_MB_IntakeWOList_Lib_1_0.Intake getIntake(int i) {
        return this.intake[i];
    }

    public void setIntake(int i, AES_MB_IntakeWOList_Lib_1_0.Intake value) {
        this.intake[i] = value;
    }

    public java.lang.String getIntakeCount() {
        return intakeCount;
    }

    public void setIntakeCount(java.lang.String intakeCount) {
        this.intakeCount = intakeCount;
    }

    public java.lang.String getIntakeOverFlow() {
        return intakeOverFlow;
    }

    public void setIntakeOverFlow(java.lang.String intakeOverFlow) {
        this.intakeOverFlow = intakeOverFlow;
    }

    public java.lang.String getRecCount() {
        return recCount;
    }

    public void setRecCount(java.lang.String recCount) {
        this.recCount = recCount;
    }

    public java.lang.String getRecStatus() {
        return recStatus;
    }

    public void setRecStatus(java.lang.String recStatus) {
        this.recStatus = recStatus;
    }

    public java.lang.String getWOCount() {
        return WOCount;
    }

    public void setWOCount(java.lang.String WOCount) {
        this.WOCount = WOCount;
    }

    public AES_MB_IntakeWOList_Lib_1_0.WorkOrder[] getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(AES_MB_IntakeWOList_Lib_1_0.WorkOrder[] workOrder) {
        this.workOrder = workOrder;
    }

    public AES_MB_IntakeWOList_Lib_1_0.WorkOrder getWorkOrder(int i) {
        return this.workOrder[i];
    }

    public void setWorkOrder(int i, AES_MB_IntakeWOList_Lib_1_0.WorkOrder value) {
        this.workOrder[i] = value;
    }

}
