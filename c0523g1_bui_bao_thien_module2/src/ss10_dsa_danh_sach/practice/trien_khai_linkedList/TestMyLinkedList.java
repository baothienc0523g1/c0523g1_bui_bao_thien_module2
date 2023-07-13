package ss10_dsa_danh_sach.practice.trien_khai_linkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TEST /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.addFirst(14);

        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.printList();
    }
}
