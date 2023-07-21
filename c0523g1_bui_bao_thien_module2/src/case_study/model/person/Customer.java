package case_study.model.person;

public class Customer extends Person {
    private int id;
    private String name;
    private String dayOfBirth;
    private String gender;
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    private String idNumber;
    private int phone;
    private String email;
    private String customerType;

    public Customer() {
    }

    public Customer(int id, String name, String dayOfBirth, String gender, String idNumber, int phone, String email, String customerType) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phone = phone;
        this.email = email;
        this.customerType = customerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer " +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", day of birth =" + dayOfBirth +
                ", gender ='" + gender + '\'' +
                ", id number ='" + idNumber + '\'' +
                ", phone =" + phone +
                ", email ='" + email + '\'' +
                ", customer type ='" + customerType + '\'';
    }
}
