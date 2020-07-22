package B12_JavaColectionFramework.BT4_CaiDatThaoTacDuyetTheoThuTuPreOderTrongBST;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int in[] = new int[]{4, 8, 2, 5, 1, 6, 3, 7};
        int post[] = new int[]{8, 4, 5, 2, 6, 7, 3, 1};
        int n = in.length;
        Node root = tree.buildTree(in, post, n);
        System.out.println("Preorder of the constructed tree : ");
        tree.preOrder(root);
    }
}
