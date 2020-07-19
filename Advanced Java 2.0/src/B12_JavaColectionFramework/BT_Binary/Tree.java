package B12_JavaColectionFramework.BT_Binary;

public interface Tree<E> {
        boolean insert(E e);

        void inorder();

        int getSize();

        boolean search(E e);

        void postorder();

        void preorder();
    }

