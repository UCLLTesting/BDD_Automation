package domain.model;

import java.time.LocalDate;

public class Examination {

    private int length;
    private int weight;
    private LocalDate examinationDate;

    public Examination(int length, int weight, LocalDate examinationDate) {
        setLength(length);
        setWeight(weight);
        setExaminationDate(examinationDate);
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

    public LocalDate getExaminationDate() {
        return examinationDate;
    }

    public void setExaminationDate(LocalDate examinationDate) {
        this.examinationDate = examinationDate;
    }
}
