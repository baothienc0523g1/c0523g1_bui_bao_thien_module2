package model.person;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Serializable, Comparable<Employee> {
    private static final long serialVersionUID = -1122;
    private String id;
    private String level;
    private String position;
    private Double salary;


    public Employee(String name, LocalDate birthDay, String gender, String personalId,
                    String phoneNumber, String email, String id, String level,
                    String position, Double salary) {
        super(name, birthDay, gender, personalId, phoneNumber, email);
        this.id = id;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }
    public String getInfoToCSV() {
        return this.name + "," + this.birthDay + "," + this.gender
                + "," + this.personalId + "," + this.phoneNumber + "," + this.email
                + "," + this.id + "," + this.level + "," + this.position
                + "," + this.salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", id: " + id + ", level: " + level
                + ", position: " + position + ", birthday: " + birthDay
                + ", gender: " + gender + ", email: " + email
                + ", personal ID: " + personalId + ", phone number: "
                + phoneNumber + ", salary: $" + salary;
    }
    @Override
    public int compareTo(Employee o) {
        return this.getId().compareTo(o.getId());
    }
}
