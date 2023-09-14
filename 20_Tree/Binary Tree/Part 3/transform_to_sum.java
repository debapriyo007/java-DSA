import java.util.*;
public class transform_to_sum {

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
    
    //PreOreder Traversal..
    public static void preeOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preeOrder(root.left);
        preeOrder(root.right);
    }
   
    //Transfrom to sum tree methord..
    public static int Transfrom(Node root){
        if(root == null){
            return 0;
        }
        int leftChild = Transfrom(root.left);
        int rightChild = Transfrom(root.right);
        int data = root.data;
        

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        //change my root data..
        root.data = newLeft + leftChild + newRight + rightChild;
        return data;  
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
        System.out.print("After performing preeOrder Traversal : ");
        Transfrom(root);
        preeOrder(root);
      


    }
}
