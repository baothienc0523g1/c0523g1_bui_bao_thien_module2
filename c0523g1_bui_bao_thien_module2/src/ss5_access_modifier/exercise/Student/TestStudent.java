package ss5_access_modifier.exercise.Student;

import ss5_access_modifier.exercise.Student.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Hoang","C10");
        System.out.println(student1.getName());
        student2.setClasses("abc");
        System.out.println(student2.getClass());
    }
}
