import java.util.*;
public class convertBSTtoBalanceBST {

    //creating class
    static class Node{
        int data;
        Node left;
        Node right;

        //constructor..
        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //preOder Methord..
    public static void preOder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preOder(root.left);
        preOder(root.right);
    }
    //GetInorder Methord..
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    //create BST methord...
    public static Node createBST(ArrayList<Integer>inorder  , int si , int ei){
        if(si>ei){
            return null;
        }      
        int mid = (si+ei)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, si, mid-1);
        root.right = createBST(inorder, mid+1, ei);
        return root;
    }

    //Balance BST.
    public static Node balanceBST(Node root){
        //Step 1 : Find Inorder sequence..
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        //Step 2: Sorted Inorder to Balance BST.
        root = createBST(inorder, 0, inorder.size()-1);
        return root;

    } 
    public static void main(String[] args) {
        
        //creating my BST.

        /*
                     8
                    / \
                   6   10
                  /      \
                 5       11
                /          \
               3            12
         */

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
       
        root = balanceBST(root);
        preOder(root);
        
       
    }
}
