public class SortedArraytoBlanceBST{
    //Creating Node class
    static class Node {
        int data;
        Node left;
        Node right;

        //constructor.
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //creating a preOrder methord..
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node blanceBST(int arr[], int si, int ei){

        //base case.
        if(si>ei)return null;
        int mid = (si+ei)/2;
        Node root = new Node(arr[mid]);
        //now i recursive call for left as well as right.
        root.left = blanceBST(arr, si, mid-1);
        root.right = blanceBST(arr, mid+1, ei);
        return root;
    }
    public static void main(String[] args) {
        
        int arr[] = {3,5,6,8,10,11,12};
        Node root = blanceBST(arr, 0, arr.length-1);
        preOrder(root);

    }
}