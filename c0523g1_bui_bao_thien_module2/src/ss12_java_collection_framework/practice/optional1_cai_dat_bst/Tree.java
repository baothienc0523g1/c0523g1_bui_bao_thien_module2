package ss12_java_collection_framework.practice.optional1_cai_dat_bst;

public interface Tree<E> {
    /*chèn phần tử vào BST, trả về true nếu
    chèn thành công*/
    boolean insert(E e);

    /* duyệt cây nhị phân bắt đầu từ nút gốc*/
    void inorder();
    int getSize();
}
