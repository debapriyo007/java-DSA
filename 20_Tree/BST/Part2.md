# **❗️Part 2 is very Important❗️**
###### This Queston ❗️
```python
import java.util.*;

public class mergetwoBSTs {

    //Node class..
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Print BST..
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    //getInorder methord.
    public static void getInorder(Node root , ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    //Create BST..
    public static Node createBST(ArrayList<Integer>arr , int si , int ei){
        if(si>ei)return null;
        int mid = (si+ei)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, si, mid-1);
        root.right = createBST(arr, mid+1, ei);
        return root;

    }

    public static Node mergeBSTs(Node root1, Node root2){
         
        // step 1 : Findout inorder sequence for root1
        ArrayList<Integer>arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        // step 2 : Findout inorder sequence for root2
        ArrayList<Integer>arr2 = new ArrayList<>();
        getInorder(root2, arr2);
        
        //Step 3 : Merge two inorder sequence.
        int i = 0;
        int j = 0;
        ArrayList<Integer> finaList = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finaList.add(arr1.get(i));
                i++;
            }else{
                finaList.add(arr2.get(j));
                j++; 
            }
        }

        while(i<arr1.size()){
            finaList.add(arr1.get(i));
                i++;
        }
        while(j<arr2.size()){
            finaList.add(arr2.get(j));
                j++; 
        }

        //Step 4 : Sorted ArrayList to Balance BST.
        return createBST(finaList, 0, finaList.size()-1);
        
    }
    public static void main(String[] args) {
        
        /*
                  BST 1

                   2
                  / \
                 1   4
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        
        /*
                  BST 2

                   9
                  / \
                 3   12
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preOrder(root);

    }
}
