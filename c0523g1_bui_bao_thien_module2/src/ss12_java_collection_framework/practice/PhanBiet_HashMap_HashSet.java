package ss12_java_collection_framework.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhanBiet_HashMap_HashSet {
    /*lớp này là lớp khởi tạo đối tượng Studen nhưng
    để tên bài thực hành, tránh nhầm lẫn*/
     private String name;
     private int age;
     private String address;

     public PhanBiet_HashMap_HashSet(){}
    public PhanBiet_HashMap_HashSet(String name, int age, String address) {
         this.name = name;
         this.age = age;
         this.address = address;
    }

    public String getName() {
        return name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Studen@name = " + name + ", age = "
               + age + ", address = " + address;
    }

    public static void main(String[] args) {
         /* bài này mục đích phân biệt được luồng thực thi và
         * các thao tác giữa map so với set
         * map chi tiết và đa dụng hơn set trong một số trường
         * hợp. VD đối tượng trùng nhau về thông tin thì dùng map sẽ
         * có các key để quản lý*/

        PhanBiet_HashMap_HashSet studen1 = new PhanBiet_HashMap_HashSet("Ozil", 20, "Berlin");
        PhanBiet_HashMap_HashSet studen2 = new PhanBiet_HashMap_HashSet("Benzema", 20, "Madrid");
        PhanBiet_HashMap_HashSet studen3 = new PhanBiet_HashMap_HashSet("Klose", 20, "Berlin");

        //KDL: key - integer, studen - kiểu PhanBiet_Hash...
        Map<Integer, PhanBiet_HashMap_HashSet> studentMap = new HashMap<Integer, PhanBiet_HashMap_HashSet>();
        //tại studenMap, key = 1, có value là object studen 1.
         studentMap.put(1, studen1);
         studentMap.put(2, studen2);
         studentMap.put(3, studen3);

         //thuộc tính entry của Map là nơi lưu trữ cả key và value.
        //phương thức entry.set trả về một cặp key và
         for (Map.Entry<Integer, PhanBiet_HashMap_HashSet> student : studentMap.entrySet()) {
             System.out.println(student.toString());
         }
        System.out.println("----------Set----------");
        Set<PhanBiet_HashMap_HashSet> students = new HashSet<PhanBiet_HashMap_HashSet>();
        students.add(studen1);
        students.add(studen2);
        students.add(studen3);

        for(PhanBiet_HashMap_HashSet student : students) {
            System.out.println(student.toString());
        }

    }
}
