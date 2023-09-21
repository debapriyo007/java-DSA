public class AVLTree {
    static class Node{
        int data;
        int height;
        Node left;
        Node right;

        //constructor..
        Node(int data){
            this.data = data;
             height = 1;
        }
    }
    public static Node root;

    //calculate the height..
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }
    //Maxi methord..
    static int max(int a , int b){
        return (a>b)? a : b;
    }

    //right rotated sub tree rooted with y.
    public static Node rigthRotated(Node y){
        Node x = y.left;
        Node T2 = x.right;

        //perfrom rotation..
        x.right = y;
        y.left = T2;

    }

    //Insert function.
    public static Node insert(Node root, int key){
        if(root == null)return new Node(key);
        if(key<root.data)root.left = insert(root.left, key);
        else if(key>root.data)root.right = insert(root.right, key);
        else return root; //duplicate are not allow. 

        //update the root height..
        root.height = 1+Math.max(height(root.left), height(root.right));

        //get root balance factor.
        int bf = getBalance(root);

        //LL Case..
        if(bf>1 && key < root.left.data){
            return rigthRotated(root);
        }
        //LR case..
        if(bf> 1 && key> root.left.data){
            root.left = 
        }
    }
     
    public static void main(String[] args) {
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        root = insert(root,25);

        /*
               AVL Tree.
               
                   30
                  /  \
                 20   40
                /  \    \
               10  25   50
         */

         preorder(root); 
    }
}
