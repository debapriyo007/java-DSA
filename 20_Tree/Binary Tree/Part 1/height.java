import java.util.*;

public class height {
    // node class
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

    //calculate the numbers of nodes..
    public static int countofNode(Node root) {
        if (root == null) {
            return 0;
        }
        int lc = countofNode(root.left);
        int rc = countofNode(root.right);
        return lc + rc + 1;
    }

    // calculate the heigth of the tree..
    public static int heightofNode(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightofNode(root.left);
        int rh = heightofNode(root.right);
        return Math.max(lh, rh) + 1;
    }
    //calc the sum of the nodes..
    public static int sum (Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum+rightSum+root.data;
    }
    /*cal the diameter..
    public static int diameter(Node root){ //This code will take 0(n^2) time complexity.
        if(root == null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int leftHt = heightofNode(root.left);
        int rightDia = diameter(root.right);
        int rightHt = heightofNode(root.right);
        
        int selfDia = leftHt + rightHt +1;
        return Math.max(selfDia, Math.max(rightDia, leftDia));
    }*/

    //Approach - II cal diameter.
    
    static  class Info{
         int dia;
         int ht;

         //constructor..
         public Info(int dia , int ht){
            this.dia = dia;
            this.ht = ht;
         }
    }

    //now create my diameter methord.
    public static Info diameter(Node root){ //This methords takes 0(n) Time complexity
        //base case..
        if(root == null){
            return new Info(0, 0); 
        }
        Info leftinfo = diameter(root.left);
        Info rightinfo = diameter(root.right);
        int dia = Math.max(Math.max(leftinfo.dia,rightinfo.dia) , leftinfo.ht + rightinfo.ht+1);
        int ht = Math.max(leftinfo.ht, rightinfo.ht)+1;
        return new Info(dia, ht);
    }



    public static void main(String[] args) {

        /*
             1
           /   \
           2    3
          / \  /  \
         4  5  6   7
         
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of root is : " + heightofNode(root));
        System.out.println("No of Nodes is  : " + countofNode(root));
        System.out.println("Sum of the Tree is : "+ sum(root));
        //System.out.println("Diameter of my tree is "+ diameter(root));
        System.out.println("The diameter is " + diameter(root).dia);

    }
}
