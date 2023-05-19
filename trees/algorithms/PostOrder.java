class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);

        printPostorder(node.right);

        System.out.print(node.data + " ");
    }

    void printPostorder() {
        printPostorder(root);
    }
}

public class PostOrder{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // tree.root = new Node(1);
        // tree.root.left = new Node(2);
        // tree.root.right = new Node(3);
        // tree.root.left.left = new Node(4);
        // tree.root.left.right = new Node(5);
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.left.left = new Node(9);
        tree.root.right.left.right = new Node(8);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.left.right = new Node(5);           

        System.out.println("Postorder traversal of binary tree is ");
        tree.printPostorder();
    }
}