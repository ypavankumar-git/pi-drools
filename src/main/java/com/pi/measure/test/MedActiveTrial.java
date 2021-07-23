package com.pi.measure.test;

import com.pi.measure.BaseTest;
import com.pi.measure.model.*;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MedActiveTrial extends BaseTest {

    @Test
    public void condition1(){


        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String dobTime = "1998-03-17T10:15:30";
        LocalDateTime localTimeObj3 = LocalDateTime.parse(dobTime, formatter);


        Patient patient = new Patient();
        patient.setName("Magan");
        patient.setGender("Male");
        patient.setDob(localTimeObj3);
        List<MedicationActive> medicationActiveList = new ArrayList<MedicationActive>();
        MedicationActive medicationActive = new MedicationActive();
        medicationActive.setSendMode('E');
        medicationActive.setNDC('P');
        medicationActive.setAllowEDI('Y');
        medicationActive.setRxStatus('C');
        medicationActive.setOtcDrugFlag('R');
        medicationActive.setFormularyPerformed('Y');

        String time1 = "2021-03-27T10:15:30";
        LocalDateTime localTimeObj1 = LocalDateTime.parse(time1, formatter);

        String time2 = "2021-06-24T10:15:30";
        LocalDateTime localTimeObj2 = LocalDateTime.parse(time2, formatter);

        RelevantPeriod relevantPeriod = new RelevantPeriod();
        relevantPeriod.setRelevantStart(localTimeObj1);
        relevantPeriod.setRelevantEnd(localTimeObj2);

        medicationActive.setRelevantPeriod(relevantPeriod);

        medicationActiveList.add(medicationActive);


        //sec
        MedicationActive medicationActive1 = new MedicationActive();
        medicationActive1.setSendMode('E');
        medicationActive1.setNDC('P');
        medicationActive1.setAllowEDI('Y');
        medicationActive1.setRxStatus('C');
        medicationActive1.setOtcDrugFlag('R');
        medicationActive1.setFormularyPerformed('Y');

        time1 = "2021-03-27T10:15:30";
        localTimeObj1 = LocalDateTime.parse(time1, formatter);

        time2 = "2021-06-24T10:15:30";
        localTimeObj2 = LocalDateTime.parse(time2, formatter);

        relevantPeriod = new RelevantPeriod();
        relevantPeriod.setRelevantStart(localTimeObj1);
        relevantPeriod.setRelevantEnd(localTimeObj2);

        medicationActive1.setRelevantPeriod(relevantPeriod);
        medicationActiveList.add(medicationActive1);
        patient.setMedicationActive(medicationActiveList);



        Expression exp = new Expression();
        patient.setExpression(exp);

        KieSession kieSession = getKieSession("condition1");

        MeasurementPeriod mp = new MeasurementPeriod();
        kieSession.insert(mp);
        for(MedicationActive med : medicationActiveList) {
            kieSession.insert(med);

        }
        int count = kieSession.fireAllRules();
        System.out.println("Fired " + count + " rules");

        kieSession.dispose();

        kieSession = getKieSession("condition2");
        for(MedicationActive med : medicationActiveList) {
            kieSession.insert(med);

        }
            kieSession.insert(patient);
            count = kieSession.fireAllRules();


            System.out.println("Fired " + count + " rules");

            kieSession.dispose();


//
//        KieSession kieSession = getKieSession("condition1");
//
//        kieSession.insert(medicationActive1);
//        kieSession.insert(medicationActive);
//        patient.setMedicationActive(medicationActiveList);
//        kieSession.insert(patient);

//        MeasurementPeriod mp = new MeasurementPeriod();
//        kieSession.insert(mp);
//        int count = kieSession.fireAllRules();
//
//        System.out.println("Fired " + count + " rules");
//
//        kieSession.dispose();
//
//        kieSession = getKieSession("condition2");
//        kieSession.insert(medicationActive1);
//        kieSession.insert(medicationActive);
//        kieSession.insert(patient);
//        count = kieSession.fireAllRules();
//
//        kieSession.dispose();

//        System.out.println("vp"+ patient.getMedicationActive().get(0).getValidPrescription());

        System.out.println("num" +patient.getExpression().getNumerator());
        System.out.println("denom" +patient.getExpression().getDenominator());

//        System.out.println("Fired " + count + " rules");


    }
}
