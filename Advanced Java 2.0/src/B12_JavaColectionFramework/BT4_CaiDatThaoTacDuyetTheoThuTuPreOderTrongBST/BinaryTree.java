package B12_JavaColectionFramework.BT4_CaiDatThaoTacDuyetTheoThuTuPreOderTrongBST;

public class BinaryTree {
    Node buildUtil(int in[], int post[], int inStrt,
                   int inEnd, Index pIndex) {
        // Base case
        if (inStrt > inEnd)
            return null;

        /* Pick current node from Postrder traversal using
           postIndex and decrement postIndex */
        Node node = new Node(post[pIndex.index]);
        (pIndex.index)--;

        /* If this node has no children then return */
        if (inStrt == inEnd)
            return node;

        /* Else find the index of this node in Inorder
           traversal */
        int iIndex = search(in, inStrt, inEnd, node.data);

        /* Using index in Inorder traversal, construct left and
           right subtress */
        node.right = buildUtil(in, post, iIndex + 1, inEnd, pIndex);
        node.left = buildUtil(in, post, inStrt, iIndex - 1, pIndex);

        return node;
    }

    // This function mainly initializes index of root
    // and calls buildUtil()
    Node buildTree(int in[], int post[], int n) {
        Index pIndex = new Index();
        pIndex.index = n - 1;
        return buildUtil(in, post, 0, n - 1, pIndex);
    }

    /* Function to find index of value in arr[start...end]
       The function assumes that value is postsent in in[] */
    int search(int arr[], int strt, int end, int value) {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                break;
        }
        return i;
    }

    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
