package ss17_io_binary_file_va_serialization.exercise.bai_tap_2;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {

    private int id;
    private String name;
    private int age;
    private String customerType;
    private static final long serialVersionUID = 17;

    public Customer() {
    }

    public Customer(int id, String name, int age, String customerType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.customerType = customerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", customerType='" + customerType + '\'' +
                '}';
    }
}
