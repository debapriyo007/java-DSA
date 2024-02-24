import java.util.*;

public class Question {

    // create a Node class..
    static class Node {
        int data;
        Node left;
        Node right;

        // constructor..
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert Function..
    public static Node insertBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = insertBST(root.left, val);
        } else {
            root.right = insertBST(root.right, val);
        }
        return root;
    }

    // InOrder Traversal..
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // print in range of k1 and k2..
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data > k1) {
            printInRange(root.left, k1, k2);
        }
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }
        if (root.data < k2) {
            printInRange(root.right, k1, k2);
        }
    }

    // Print root to leaf node path..
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0 ;i<path.size();i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }


    //Valid BST Question.
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min!= null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left, min, root) 
           && isValidBST(root.right, root, max);
        
    }


    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insertBST(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        // printInRange(root, 5, 12);
        //printRoot2Leaf(root, new ArrayList<>());
        if(isValidBST(root, null, null)){
            System.out.print("Valid BST");
        }else{
            System.out.println("BST is't valid!!");
        }

    }
}
