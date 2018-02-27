package Zad4Company;

public class Employee {
    private String name;
    private String lastName;
    private int birthday ;
    private int seniority;

    public Employee(String name, String nazwisko, int birthday, int seniority) {
        this.name = name;
        this.lastName = nazwisko;
        this.birthday = birthday;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", seniority=" + seniority +
                '}';
    }
}
