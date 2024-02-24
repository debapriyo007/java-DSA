import java.util.*;
public class Delete_in_BST {

    //create a Node class..
    static class Node{
        int data;
        Node left;
        Node right;

        //constructor..
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Insert Function..
    public static Node insertBST(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(root.data>val){
            root.left = insertBST(root.left, val);
        }else{
            root.right = insertBST(root.right, val);
        }
        return root;
    }

    //InOrder Traversal..
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    //Delete a particular Node..
    public static Node deleteBST(Node root, int val){
        //First search the node which i have to delete..
        if(root.data > val){
            root.left = deleteBST(root.left, val);
        }else if(root.data<val){
            root.right = deleteBST(root.right, val);
        }else{
            //Voila Case..

            //Case 1 : Delete Leaf Node..
            if(root.left == null && root.right == null){
                return null;
            }

            //Case 2 : Delete a Single child.
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //Case 3 : Both childer are exist.
            Node IS = findinorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteBST(root.right, IS.data);

        }
        return root;
    }

    //InOrderSuccessor Methords.
    public static Node findinorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }

    //print in range of k1 and k2.. 
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data>k1){
            printInRange(root.left, k1, k2);
        }
        if(root.data>=k1 && root.data<=k2){
            System.out.print(root.data + " ");
        }
        if(root.data<k2){
            printInRange(root.right, k1, k2);
        }
    }
    

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0;i<values.length ;i++){
           root =  insertBST(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        //deleteBST(root, 8);
        //inOrder(root);
        printInRange(root, 5, 12);

    }
}
