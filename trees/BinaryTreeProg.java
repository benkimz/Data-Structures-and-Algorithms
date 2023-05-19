// define a class node with a left and right property
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

// define a class "binary tree" to attach nodes
class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }

        if (val < node.val) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.val + " ");
            traverseInOrder(node.right);
        }
    }
}


public class BinaryTreeProg{
    public static void main(String args[]) {
        final BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(9);
        tree.traverseInOrder(); // prints: 1 3 5 7 9
    }
}
 