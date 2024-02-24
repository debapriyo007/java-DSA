import java.util.*;
public class SegmentTreeSum {
    static int tree[];

    //intilize the Tree..
    public static void init(int n){
        tree = new int[4*n]; 
    }

    //Build segement tree..
    public static int buildST(int arr[], int sti, int si, int ei){

        //base case.
        if(si == ei){
            tree[sti] = arr[si];
            return arr[si];
        }

        int mid = (si+ei)/2; //find mid.
        //Build left subtree.
        buildST(arr, 2*sti+1, si, mid);
        //Build Right subtree.
        buildST(arr, 2*sti+2, mid+1, ei);
        //calculate the current node sum..
        tree[sti] = tree[2*sti+1] + tree[2*sti+2];
        return tree[sti];
    }
    public static int getSumUtil(int i , int si, int sj, int qi, int qj){
         
        //Non Overlaping.
        if(qj<= si || qi>=sj){
            return 0;
        }else if(si>=qi && sj<=qj){//Complete Overlaping.
            return tree[i];
        }else{  //partial Overlaping.
            int mid = (si+sj)/2;
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left+right;
        } 

    }

    public static int getSum(int arr[], int qi, int qj){
        int n =arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);
        // for(int i = 0 ;i<tree.length ;i++){
        //     System.out.print(tree[i]+ " ");
        // }
        System.out.println(getSum(arr, 2, 5));
        
    }
}
