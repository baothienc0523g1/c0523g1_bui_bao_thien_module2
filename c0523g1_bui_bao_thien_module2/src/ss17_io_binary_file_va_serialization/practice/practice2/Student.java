package ss17_io_binary_file_va_serialization.practice.practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*
 * Serializable là một Interface (giao diện) đánh dấu
 * không có các dữ liệu và phương thức. Thông thường,
 * Serializable được sử dụng để đánh dấu các class trong Java để các
 * Object trong class có thể nhận được những khả năng kế thừa nhất định.*/

public class Student implements Serializable {
    public static void main(String[] args) {
        String path = "D:\\GIT - Bai tap\\c0523g1_bui_bao_thien_module2\\src\\ss17_io_binary_file_va_serialization\\practice\\practice2\\practice2_output.txt";
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Long", "Laos"));
        studentList.add(new Student(2, "Hưng", "Malay"));
        studentList.add(new Student(3, "Liên", "Thai"));
        studentList.add(new Student(4, "Hậu", "Jamaica"));
        studentList.add(new Student(5, "Nhật", "Mặt Trăng"));
        writeDataToFile(path, studentList);

        for (Student student : readDataFromFile(path)) {
            System.out.println(student);
        }
    }

    private Integer id;
    private String name;
    private String address;

    public Student() {
    }

    public Student(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
