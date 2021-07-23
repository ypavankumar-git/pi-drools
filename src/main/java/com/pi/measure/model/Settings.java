package com.pi.measure.model;


public class Settings {

    private String reportingYear;

    private MeasurementPeriod measurementPeriod;

    public String getReportingYear() {
        return reportingYear;
    }

    public void setReportingYear(String reportingYear) {
        this.reportingYear = reportingYear;
    }

    public MeasurementPeriod getMeasurementPeriod() {
        return measurementPeriod;
    }

    public void setMeasurementPeriod(MeasurementPeriod measurementPeriod) {
        this.measurementPeriod = measurementPeriod;
    }

    public Settings() {
        this.measurementPeriod = new MeasurementPeriod();
    }
}
