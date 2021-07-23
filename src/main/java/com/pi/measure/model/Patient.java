package com.pi.measure.model;

import java.time.LocalDateTime;
import java.util.List;

public class Patient {

    private String name;

    private LocalDateTime dob;

    private String gender;

    private List<MedicationActive> medicationActive;

    private List<MedicationDispensed> medicationDispensed;

    private List<MedicationOrdered> medicationOrdered;

    private Expression expression;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<MedicationActive> getMedicationActive() {
        return medicationActive;
    }

    public void setMedicationActive(List<MedicationActive> medicationActive) {
        this.medicationActive = medicationActive;
    }

    public List<MedicationDispensed> getMedicationDispensed() {
        return medicationDispensed;
    }

    public void setMedicationDispensed(List<MedicationDispensed> medicationDispensed) {
        this.medicationDispensed = medicationDispensed;
    }

    public List<MedicationOrdered> getMedicationOrdered() {
        return medicationOrdered;
    }

    public void setMedicationOrdered(List<MedicationOrdered> medicationOrdered) {
        this.medicationOrdered = medicationOrdered;
    }

    public Patient(){}

}
