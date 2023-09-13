public class sub_tree {

    //Creating Node class
    static class Node {
        int data;
        Node left;
        Node right;

        //creating contructor .
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //isIdentical Function..
    public static boolean isIdentical(Node node , Node subroot){
        //base case ..
        if(node == null && subroot == null){
            return true;
        }else if(node == null || subroot == null || node.data != subroot.data){
            return false; 
        }
        //now check in left subtree that no identical is present or not.
         if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        
        return true;
     }

    public static boolean isSubtree(Node root , Node subroot){
        //base case ..
        if(root == null){
            return false; 
        }
        if(root.data == subroot.data){
            if(isIdentical(root , subroot)){
                return true;
            }
        }
        boolean leftAns = isSubtree(root.left, subroot);
        boolean rightAns = isSubtree(root.right, subroot);
        return leftAns || rightAns;
    }
    public static void main(String[] args) {
       Node root  = new Node(1); 
       root.left = new Node(2);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right  = new Node(3);
       root.right.right  = new Node(6);

    /*
          1
         / \
        2   3
       / \   \
      4   5   6
        
    */

    //create a subtree..
    Node subroot = new Node(2);
    subroot.left = new Node(4);
    subroot.right = new Node(5);


   /*
        2  
       / \   
      4   5

    */

     System.out.println(isSubtree(root, subroot));

    }
}
