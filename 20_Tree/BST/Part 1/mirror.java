public class mirror {
    //creting a class.
    static class Node{
        int data;
        Node left;
        Node right;

        //creating a constructor..
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //printing my BST..
    public static void InorderBST(Node root){
        if(root == null)return;
        InorderBST(root.left);
        System.out.print(root.data + " ");
        InorderBST(root.right);
    }


    //Mirror BST Methord..
    public static Node mirrorBST(Node root){
        if(root == null){
            return null;
        }

        Node leftMirror = mirrorBST(root.left);
        Node rightMirror = mirrorBST(root.right);

        //now i am swap the left and right mirror subtree..
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static void main(String[] args) {
/*       creating a BST..
              8
             / \
            5  10
           / \   \ 
          3   6  11
*/
        
        Node root = new Node(8);
        root.left= new Node(5);
        root.left.left= new Node(3);
        root.left.right= new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);


/*
              8
             / \
            10  5
           /   / \ 
          11  6   3

          Mirror BST

*/

        System.out.println("Original BST is : ");
        InorderBST(root);
        root = mirrorBST(root);
        System.out.println();
        System.out.println("After performing the mirror the BST is : ");
        InorderBST(root);

    }
}
