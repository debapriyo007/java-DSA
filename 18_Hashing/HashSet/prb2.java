import java.util.HashSet;

public class prb2 {
    public static void main(String[] args) {
        int arr[] ={7,3,9};
        int arr2[] ={6,3,9,2,9,4};

        //Calculate the union ..
        //to calculate the union  create a HashSet..
        HashSet<Integer> set = new HashSet<>();
        //first array element are add in set.
        for(int i = 0 ;i<arr.length ;i++){
            set.add(arr[i]);
        }
        //sameway the second array element are add in the set..
        for(int i = 0 ;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        
        //calculate the size of the union  array..
        System.out.println("Union array size " + set.size());

        //now to calculate the Intersection..
        //To calculate the intersection first we need to clear the set..
        set.clear();

        //so , at first need to add one array in the set after that 
        //comparing another array , and take a varriable to count the size.
        
        //add add element in set,,
        for(int i = 0 ;i<arr.length ;i++){
            set.add(arr[i]);
        }
        
        //check exist or not..
        int count = 0; //intilize the count varrible with 0
        for(int i = 0 ;i <arr2.length ;i++){
            if(set.contains(arr2[i])){
                count++; //count will be updated..
                set.remove(arr2[i]);
            }
        }

        System.out.println("Intersection " + count);
    }
}
