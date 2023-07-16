package ss12_java_collection_framework.practice.sxepvoi_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<SapXepVoi_Comparable_Comparator> {
    /* Ở class này ta định nghĩa 1 phương
    * thức comparator riêng biệt không có trong class
    * chính. Nó được sd khi muốn so sánh, sắp
    * xếp dữ liệu theo cách riêng mà LTV muốn
    * định nghĩa*/
    @Override
    public int compare(SapXepVoi_Comparable_Comparator o1, SapXepVoi_Comparable_Comparator o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<SapXepVoi_Comparable_Comparator> list = new ArrayList<SapXepVoi_Comparable_Comparator>();
        SapXepVoi_Comparable_Comparator student1 = new SapXepVoi_Comparable_Comparator("Iniesta",38, "Spain");
        SapXepVoi_Comparable_Comparator student2 = new SapXepVoi_Comparable_Comparator("Xavi",30, "Spain");
        SapXepVoi_Comparable_Comparator student3 = new SapXepVoi_Comparable_Comparator("Que Ngoc Hai",22, "SLNA");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        System.out.println("Mảng ban đầu chưa được sắp xếp");
        for (SapXepVoi_Comparable_Comparator st : list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("Sau khi gọi phương thức AgeComparator tự định nghĩa");
        for (SapXepVoi_Comparable_Comparator st : list) {
            System.out.println(st.toString());
        }
    }
}
