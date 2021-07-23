package com.pi.measure.model;

public class Medication {

    private RelevantPeriod relevantPeriod;

    private Character rxStatus;

    private Character allowEDI;

    private Character NDC;

    private Character otcDrugFlag;

    private Character sendMode;

    private Character formularyPerformed;

    private Boolean validPrescription;

    public RelevantPeriod getRelevantPeriod() {
        return relevantPeriod;
    }

    public void setRelevantPeriod(RelevantPeriod relevantPeriod) {
        this.relevantPeriod = relevantPeriod;
    }

    public Character getRxStatus() {
        return rxStatus;
    }

    public void setRxStatus(Character rxStatus) {
        this.rxStatus = rxStatus;
    }

    public Character getAllowEDI() {
        return allowEDI;
    }

    public void setAllowEDI(Character allowEDI) {
        this.allowEDI = allowEDI;
    }

    public Character getNDC() {
        return NDC;
    }

    public void setNDC(Character NDC) {
        this.NDC = NDC;
    }

    public Character getOtcDrugFlag() {
        return otcDrugFlag;
    }

    public void setOtcDrugFlag(Character otcDrugFlag) {
        this.otcDrugFlag = otcDrugFlag;
    }

    public Character getSendMode() {
        return sendMode;
    }

    public void setSendMode(Character sendMode) {
        this.sendMode = sendMode;
    }

    public Boolean getValidPrescription() {
        return validPrescription;
    }

    public void setValidPrescription(Boolean validPrescription) {
        this.validPrescription = validPrescription;
    }

    public Character getFormularyPerformed() {
        return formularyPerformed;
    }

    public void setFormularyPerformed(Character formularyPerformed) {
        this.formularyPerformed = formularyPerformed;
    }
}
