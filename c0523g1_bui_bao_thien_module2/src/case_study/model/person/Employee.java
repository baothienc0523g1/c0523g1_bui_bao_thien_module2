package case_study.model.person;

public class Employee extends Person {
    private int id;
    private String name;
    private String dayOfBirth;
    private String gender;
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    private String idNumber;
    private int phone;
    private String email;
    private int levelOfBusiness;
    private String jobPosition;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String dayOfBirth,
                    String gender, String idNumber, int phone, String email,
                    int levelOfBusiness, String jobPosition, int salary) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idNumber = idNumber;
        this.phone = phone;
        this.email = email;
        this.levelOfBusiness = levelOfBusiness;
        this.jobPosition = jobPosition;
        this.salary = salary;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public int getLevelOfBusiness() {
        return levelOfBusiness;
    }

    public void setLevelOfBusiness(int levelOfBusiness) {
        this.levelOfBusiness = levelOfBusiness;
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
        return "Employee: " +
                "id =" + id +
                ", name ='" + name + '\'' +
                ", day of birth ='" + dayOfBirth + '\'' +
                ", gender ='" + gender + '\'' +
                ", id number ='" + idNumber + '\'' +
                ", phone =" + phone +
                ", email ='" + email + '\'' +
                ", level of business =" + levelOfBusiness +
                ", job position ='" + jobPosition + '\'' +
                ", salary =" + salary;
    }
}
