import java.util.*;
public class kthAncestor {

    //crating a Node class..
    static class Node{
        int data;
        Node left;
        Node right;

        //creating a constructor..
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int kthAn(Node root , int n , int k){
        //base case..
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = kthAn(root.left, n, k);
        int rightDist = kthAn(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist , rightDist);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args) {


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
        int n = 5, k =2;
        kthAn(root, n, k);


    }
}
