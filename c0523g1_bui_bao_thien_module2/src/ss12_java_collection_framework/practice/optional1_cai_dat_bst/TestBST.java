package ss12_java_collection_framework.practice.optional1_cai_dat_bst;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("B");
        tree.insert("D");
        tree.insert("C");
        tree.insert("A");

        System.out.println("Duyệt cây (theo thứ tự)");
        tree.inorder();
        System.out.println("Số lượng node trong BST " + tree.getSize());
    }
}
