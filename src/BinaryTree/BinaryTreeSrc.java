package BinaryTree;

public class BinaryTreeSrc<t> {
    int val = 0;
    BinaryTreeSrc<t> left = null;
    BinaryTreeSrc<t> right = null;
    BinaryTreeSrc<t> head = null;

    BinaryTreeSrc(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void add(int val) {
        if (head == null) {

            BinaryTreeSrc<t> current = new BinaryTreeSrc<>(val);

        }
    }
}
