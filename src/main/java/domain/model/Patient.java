package domain.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {
    private String SSN;
    private LocalDate birthDate;
    private String gender;
    private int length;
    private int weight;
    private ArrayList<Examination> examinations = new ArrayList<>();

    public Patient (String ssn, LocalDate birthDate, String gender, int length, int weight) {
        setSSN(ssn);
        setBirthDate(birthDate);
        setGender(gender);
        setLength(length);
        setWeight(weight);
    }

    public Examination getLastExamination () {
        return examinations.get(examinations.size()-1);
    }

    public void addExamination (Examination examination) {
        examinations.add(examination);
    }

    public double getBMI () {
        double bmi = 10*getLastExamination().getWeight()/Math.pow(getLastExamination().getLength(),2);
        return ((double)Math.round(bmi * 100) / 100);
    }


    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<Examination> getExaminations() {
        return examinations;
    }

    public void setExaminations(ArrayList<Examination> examinations) {
        this.examinations = examinations;
    }


}
