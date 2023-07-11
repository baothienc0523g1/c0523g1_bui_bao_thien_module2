package ss5_access_modifier.exercise.Student;

public class Student {
    private String name = "John";
    private String className = "C02";
    public Student() {
    }
    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.className = className;
    }
    public String getName() {
        return this.name;
    }
    public String getClassName() {
        return this.className;
    }
}
