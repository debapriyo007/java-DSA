import java.util.*;

public class print_Kth_level {
    static class Node{
        int data;
        Node left;
        Node right;

        //constructor ..
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //printing kth level element..
    public static void kthLevelprint(Node root , int level , int k){
        //base case ..
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+ " ");
            return;
        }
        kthLevelprint(root.left, level+1, k);
        kthLevelprint(root.right, level+1, k);


    }
    public static void main(String[] args) {
        
        //Now creating the tree..


        /*
          
               1      ------> Level 1
              /  \
             2    3   ------> Level 2
            / \  / \
           4  5 6   7 ------> Level 3
          
        */


        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print("My Kth Level elements are : ");
        kthLevelprint(root, 1, 3 ); //here my level is start from 1 .

    }
}
