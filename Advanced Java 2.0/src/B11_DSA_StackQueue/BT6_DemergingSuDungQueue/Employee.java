package B11_DSA_StackQueue.BT6_DemergingSuDungQueue;

import java.util.Date;

public class Employee {
    /* 1: man, 0: woman */
    private int gender;
    private Date dateOfBirth;

    public Employee(int gender, Date dateOfBirth) {
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
