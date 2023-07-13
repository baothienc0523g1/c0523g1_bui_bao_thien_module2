package ss10_dsa_danh_sach.practice.trien_khai_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);

        System.out.println("Phần tử vị trí thứ 5: " + listInteger.get(5));
        System.out.println("Phần tử vị trí thứ 1: " + listInteger.get(1));
        System.out.println("Phần tử vị trí thứ 3: " + listInteger.get(3));

//        System.out.println("Phần tử vị trí thứ 7: " + listInteger.get(7));
//        System.out.println("Phần tử vị trí thứ -1: " + listInteger.get(-1));
    }
}
