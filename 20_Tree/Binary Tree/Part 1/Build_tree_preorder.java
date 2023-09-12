import java.util.*;

public class Build_tree_preorder {
    //node class
    static class Node{
        int data;
        Node left;
        Node right;

        //create a constructor.
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //create a Binary tree class..
    static class BinaryTree{

        //create a methord..
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            
            //create a newnode..
            Node newnode = new Node(nodes[index]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);
            return newnode;
        }

        //preOrder  Traversal..
        public static void preOrderTraverasal(Node root){
            
            if(root  == null){
                return ; 
            }
            System.out.print(" " + root.data);
            preOrderTraverasal(root.left);
            preOrderTraverasal(root.right);
        }

        //InOrder Traversal.
        public static void InOrderTraversal(Node root){
            if(root == null){
                return;
            }
            InOrderTraversal(root.left);
            System.out.print(" " +  root.data);
            InOrderTraversal(root.right);
        }
        //PostOrder Traversal.
        public static void PostOrderTraversal(Node root){
            if(root == null){
                return;
            }
            PostOrderTraversal(root.left);
            PostOrderTraversal(root.right);
            System.out.print(" " +  root.data);
        }

        //LevelOrder Traversal (Imp***)
        public static void levelOrder(Node root){
            //base case ..
            if(root == null){
                return;
            }
            //create a queue..
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                //take currNode..
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(" " + currNode.data);
                    if(currNode.left!= null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!= null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println("Root is " + root.data);
        tree.preOrderTraverasal(root);
        System.out.println();
        tree.InOrderTraversal(root);
        System.out.println();
        tree.PostOrderTraversal(root);
        System.out.println();
        tree.levelOrder(root);
    }
}
