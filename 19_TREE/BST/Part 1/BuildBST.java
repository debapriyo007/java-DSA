import java.util.*;

public class BuildBST {

    // creating Node class
    static class Node {
        int data;
        Node left;
        Node right;

        // creating constructor..
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert Methord..
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        // if value is less than root val then go rigth side..
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Search in BST..
    public static boolean searchBST(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key > root.data) {

            return searchBST(root.right, key);
        } else {
            return searchBST(root.left, key);
        }

    }

    // InOrder traversal..
    public static void inOrder(Node root) {
        // bas case..
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null; // first root will bw intilized with null value..
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // System.out.println("After Inserting the nodes my tree became : ");

        // inOrder(root);
        if(searchBST(root, 111)){
            System.out.println("The Key is found.");
        }else{
            System.out.println("The key is't Found!!!");
        }
    }
}
