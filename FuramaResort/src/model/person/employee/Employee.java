package model.person.employee;

import model.person.Person;

public class Employee extends Person {
    private String employeeID;
    private String educationLevel;
    private String jobPosition;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String dob, String gender, String identificationNumber, String phoneNumber, String email, String employeeID, String educationLevel, String jobPosition, int salary) {
        super(name, dob, gender, identificationNumber, phoneNumber, email);
        this.employeeID = employeeID;
        this.educationLevel = educationLevel;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}
