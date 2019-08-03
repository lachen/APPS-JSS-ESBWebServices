/**
 * ReferralIntakeWOSts_1_0Result.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf070942.33 v102309233842
 */

package iseries.wsbeans.referralintakewosts_1_0.xsd;

public class ReferralIntakeWOSts_1_0Result  {
    private iseries.wsbeans.referralintakewosts_1_0.xsd.Intake[] _Intake;
    private java.math.BigDecimal _IntakeCount;
    private java.math.BigDecimal _IntakeOverflow;
    private java.math.BigDecimal _RecCount;
    private java.lang.String _RecStatus;
    private java.math.BigDecimal _WOCount;
    private iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder[] _WorkOrder;

    public ReferralIntakeWOSts_1_0Result() {
    }

    public iseries.wsbeans.referralintakewosts_1_0.xsd.Intake[] get_Intake() {
        return _Intake;
    }

    public void set_Intake(iseries.wsbeans.referralintakewosts_1_0.xsd.Intake[] _Intake) {
        this._Intake = _Intake;
    }

    public iseries.wsbeans.referralintakewosts_1_0.xsd.Intake get_Intake(int i) {
        return this._Intake[i];
    }

    public void set_Intake(int i, iseries.wsbeans.referralintakewosts_1_0.xsd.Intake value) {
        this._Intake[i] = value;
    }

    public java.math.BigDecimal get_IntakeCount() {
        return _IntakeCount;
    }

    public void set_IntakeCount(java.math.BigDecimal _IntakeCount) {
        this._IntakeCount = _IntakeCount;
    }

    public java.math.BigDecimal get_IntakeOverflow() {
        return _IntakeOverflow;
    }

    public void set_IntakeOverflow(java.math.BigDecimal _IntakeOverflow) {
        this._IntakeOverflow = _IntakeOverflow;
    }

    public java.math.BigDecimal get_RecCount() {
        return _RecCount;
    }

    public void set_RecCount(java.math.BigDecimal _RecCount) {
        this._RecCount = _RecCount;
    }

    public java.lang.String get_RecStatus() {
        return _RecStatus;
    }

    public void set_RecStatus(java.lang.String _RecStatus) {
        this._RecStatus = _RecStatus;
    }

    public java.math.BigDecimal get_WOCount() {
        return _WOCount;
    }

    public void set_WOCount(java.math.BigDecimal _WOCount) {
        this._WOCount = _WOCount;
    }

    public iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder[] get_WorkOrder() {
        return _WorkOrder;
    }

    public void set_WorkOrder(iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder[] _WorkOrder) {
        this._WorkOrder = _WorkOrder;
    }

    public iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder get_WorkOrder(int i) {
        return this._WorkOrder[i];
    }

    public void set_WorkOrder(int i, iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder value) {
        this._WorkOrder[i] = value;
    }

}
