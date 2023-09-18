public class sizeofLargestBST {
    //static class
    static class Node{
        int data;
        Node left;
        Node right;

        //constructor..
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    //Info class..
    static class Info{
        boolean isValidBST;
        int size;
        int min;
        int max;

        //constructor..
        public Info(boolean isValidBST , int size, int min, int max){
            this.isValidBST = isValidBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;
    public static Info largestBST(Node root){
        //base case..
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo =largestBST(root.left);
        Info rightInfo =largestBST(root.right);
        int size = leftInfo.size + rightInfo.size +1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));

        //ValidBST code.
        if(root.data <= leftInfo.max || root.data>=rightInfo.min){
            return new Info(false, size, min, max);
        }

        if(leftInfo.isValidBST && rightInfo.isValidBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.right = new Node(70);
        root.right.left= new Node(45);
        root.right.right.right= new Node(80);
        root.right.right.left= new Node(65);
        
        Info info = largestBST(root);
        System.out.println("Largest BST size is : "+ maxBST);
    }
}
