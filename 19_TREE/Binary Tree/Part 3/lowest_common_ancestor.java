import java.util.*;

public class lowest_common_ancestor {
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

    //My getPath methord..
    public static boolean getPath(Node root , int n, ArrayList<Node> path){
        //base case.
        if(root == null){
            return false; 
        }
        path.add(root);
        if(root.data == n ){
            return true;
        }
        boolean foundLeft  = getPath(root.left, n, path);
        boolean foundRight  = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    //Lowest Common Ancestor.
    public static Node lca(Node root, int n1 , int n2){

        //step 1: Find out the path..
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //step 2 : Calculate LCA..
        int i = 0;
        for(;i<path1.size()  && i< path2.size();i++){
            if(path1.get(i)!= path2.get(i)){
                break;
            }
        }
        //Last equal Node --> i-1th

        Node lca = path1.get(i-1);
        return lca;
    }

    //Approach -II

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

        int n1 = 6  , n2 = 7;
        //System.out.println(lca(root, n1, n2).data);
        System.out.println(lca2(root, n1, n2).data);

    }
}
