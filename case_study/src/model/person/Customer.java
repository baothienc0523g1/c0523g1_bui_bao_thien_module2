package model.person;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Customer extends Person implements Serializable {
    private static final long serialVersionUID = -1133;
    private String id;
    private String type;
    private String address;

    public Customer(String id) {
        this.id = id;
    }

    public Customer(String name, LocalDate birthDay, String gender,
                    String personalId, String phoneNumber, String email,
                    String id, String type, String address) {
        super(name, birthDay, gender, personalId, phoneNumber, email);
        this.id = id;
        this.type = type;
        this.address = address;
    }

    public String getInfoToCSV() {
        return this.name + "," + this.birthDay + "," + this.gender
                + "," + this.personalId + "," + this.phoneNumber + "," + this.email
                + "," + this.id + "," + this.type + "," + this.address;
    }

    public Customer(String id, String type, String address) {
        this.id = id;
        this.type = type;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", id: " + id + ", type: " + type
                + ", address: " + address + ", birthday: " + birthDay
                + ", gender: " + gender + ", email: " + email
                + ", personal ID: " + personalId + ", phone number: "
                + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }
}
