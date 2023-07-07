package ss5_access_modifier.practice;

public class StacticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    //constructor khởi tạo các thuộc tính
    StacticMethod(int r, String n) {
        rollno = r;
        name = n;
    }
    //stactic method để thay đổi giá trị của biến static;
    //void là một phương thức không trả về giá trị (ko có return);
    static void change() {
        college = "CODEGYM";
    }
    //method để hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
