package ss12_java_collection_framework.practice.sxepvoi_comparable_comparator;

public class SapXepVoi_Comparable_Comparator implements Comparable<SapXepVoi_Comparable_Comparator> {
    /* Nêu được sự khác nhau giữa Comparable và Comparator */
    /* Class này định nghĩa comparable cho chính nó, và khi gọi
    * nó chỉ đc thực thi phương thức này, điều này nhằm đảm bảo sự đặc
    * trưng của nó đối với các class khác. VD String, Integer, Character có
    * các Comparable riêng cho chính nó. */
    private String name;
    private int age;
    private String address;

    public SapXepVoi_Comparable_Comparator(String name, int age, String address) {
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
        return "SapXepVoi_Comparable_Comparator{" +
                "name='" + name + '\'' + "age " + age
                +'}';
    }

    @Override
    public int compareTo(SapXepVoi_Comparable_Comparator student) {
            return this.getName().compareTo(student.getName());
        }
}
