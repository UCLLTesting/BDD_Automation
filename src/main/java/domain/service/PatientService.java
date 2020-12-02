package domain.service;

import domain.model.Examination;
import domain.model.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatientService {

    private static PatientService INSTANCE;
    private List<Patient> patients = new ArrayList<Patient>();

    public PatientService () {
    }

    public static PatientService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new PatientService();
        }
        return INSTANCE;
    }

    public List<Patient> getAllPatients () {
        return patients;
    }

    public void add (Patient patient) {
        patients.add(patient);
    }

    public void delete (String ssn) {

    }

    public void deleteAll () {
        patients = new ArrayList<Patient>();
    }

    public Patient getPatientWitSSN(String ssn) {
        for (Patient patient: patients) {
            if (patient.getSSN().equals(ssn)) {
                return patient;
            }
        }
        return null;
    }
}
