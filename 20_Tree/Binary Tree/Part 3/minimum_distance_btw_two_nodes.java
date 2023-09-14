import java.util.*;

public class minimum_distance_btw_two_nodes {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    

    //Findout LCA..

    public static Node lca2(Node root , int n1 , int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node RightLca = lca2(root.right, n1, n2);

        if(RightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return RightLca;
        }
       return root;
    }

    //lcaDist Methord..
    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist =lcaDist(root.left, n);
        int rigthDist = lcaDist(root.right, n);

        if(leftDist == -1 && rigthDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rigthDist+1;
        }else{
            return leftDist+1;
        }
    }

    //Minimum distance between Nodes..
    public static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca , n2);

        return dist1+dist2;
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

        int n1 = 4  , n2 = 7;
       System.out.println("Minimum distance is :" +minDist(root, n1, n2));
    }
}
