import java.util.*;
public class Recursion_AdvanceQuestion{
	public static void main(String[] args) {
	    
	   // Scanner sc = new Scanner(System.in);
	   // System.out.println("Enter the array size :");
	   // int N = sc.nextInt();
	    
	   // int[]arr = new int[N];
	   // System.out.print("Enter the elements :");
	   // for(int i = 0;i<N;i++){
	   //     arr[i] = sc.nextInt();
	   // }
	    
	   // int[]arr = {1, 2, 3};
	    int []arr = {2,3,5};
	    int target = 8;   // -------------------> This is only for taget sum.
	    
	    
	    
	    
	    
	    System.out.println("Here is your all subset:");
	    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	    
	    ArrayList<Integer>ds = new ArrayList<>();
	    
	    System.out.println("Here your all the Combinition sum where target is give :");
	    
	    combitionalSum2(0, arr, target, ds, list);
	    System.out.print(list);
	    
	    
	    HashSet<ArrayList<Integer>> set  = new HashSet<>();
	    //call the fun.
	   // generateAllSubsets(0, arr,ds,list);
	   // System.out.println(list);
	   
	   System.out.println("Your all Unqiue subsets :");
	   //generateAll_Unique_Subsets(0, arr, ds, set); 
	   //System.out.print(set);
	   
	   
	    //call sumset sum..
	   // subsetSum(0, 0, arr, ds);
	    
	   // System.out.print("Combinition subsets sum : " + ds);
	   
	   
	   
	   //call for purmutations.
	   System.out.println("Print all Parmutations");
	   boolean[] freq = new boolean[arr.length];
	   //printParmutations(arr, ds, freq, list);
	   approach2(arr, 0, ds, list);
	   //System.out.print(list);
	}
	
	
	
	
	// Here is My all "RECURSION " Questions.
	
	
	
	
	// combitionalSum
	
	static void combitionalSum(int index, int arr[], int target,ArrayList<Integer>ds, ArrayList<ArrayList<Integer>>list){
	    
	    if(index == arr.length){
	        if(target == 0){
	            list.add(new ArrayList<>(ds));
	         
	        }
	        return;
	    }
	    
	    if(arr[index] <= target){
	        ds.add(arr[index]);
	        //pick that elem.
	        combitionalSum(index, arr,target - arr[index], ds, list);
	         ds.remove(ds.size()-1);
	        }
	    combitionalSum(index+1, arr, target , ds, list); //this the no pick
	}
	
	// combitionalSum - II
	static void combitionalSum2(int index, int arr[], int target,ArrayList<Integer>ds, 
	ArrayList<ArrayList<Integer>>list){
	    
	    if(target == 0){
	        list.add(new ArrayList<>(ds));
	        return;
	    }
	    
	    for(int i = index;i<arr.length;i++){
	        
	        if(i>index && arr[i] == arr[i-1])continue;
	        if(arr[i] > target)break;
	        ds.add(arr[i]);
	        combitionalSum2(index + 1, arr, target - arr[i], ds, list); //here pick index one by one.
	        ds.remove(ds.size()-1);
	    }
	}
	
	
	
	
	//my generate subsets.
	static ArrayList<ArrayList<Integer>> generateAllSubsets(int index, int[]arr, 
	ArrayList<Integer>ds, ArrayList<ArrayList<Integer>> list){
	    
	   
	    if(index == arr.length){
	        list.add(new ArrayList<>(ds));
	        return list;
	    }
	    
	    ds.add(arr[index]);
	    generateAllSubsets(index+1, arr, ds, list); //this is the pick cond.
	    ds.remove(ds.size()-1);
	    generateAllSubsets(index+1, arr, ds, list); //non pick.
	    
	    return list;
	}
	
	
	// cal the sub set sums.
    static void subsetSum(int index, int sum , int[]arr,ArrayList<Integer>ds){
        
        if(index == arr.length){
            ds.add(sum);
            return;
        }
        
        //now i will be checking for pick and non-pick only.
        subsetSum(index+1, sum+arr[index], arr, ds);
        subsetSum(index+1, sum, arr, ds);
    }
	
	
	//you have to create a methord that only contain the unqiue combitional sets.
	
	//example : [1, 2,2] ->[1, 2, 2] [1, 2] [1, 2] [1] [2, 2] [2] [2] []
	// here remove the duplicates.
	
	// slights changes in generate subset methord
	// generate all sub set and put it into HashSet.
	
	static HashSet<ArrayList<Integer>> generateAll_Unique_Subsets(int index, int[]arr, 
	ArrayList<Integer>ds, HashSet<ArrayList<Integer>> set){
	    
	   
	    if(index == arr.length){
	        set.add(new ArrayList<>(ds));
	        return set;
	    }
	    
	    ds.add(arr[index]);
	    generateAll_Unique_Subsets(index+1, arr, ds, set); //this is the pick cond.
	    ds.remove(ds.size()-1);
	    generateAll_Unique_Subsets(index+1, arr, ds, set); //non pick.
	    
	    return set;
	}

	
	//print all permutations.
	
	static void printParmutations(int[]arr,ArrayList<Integer>ds, boolean[]freq, ArrayList<ArrayList<Integer>>list){
	    if(ds.size() == arr.length){
	        list.add(new ArrayList<>(ds));
	        return;
	    }
	    
	    for(int i = 0;i<arr.length;i++){
	        //if frq array is't mark
	        if(!freq[i]){
	            ds.add(arr[i]);
	            freq[i] = true;
	            // call for the others.
	            printParmutations(arr, ds, freq, list);
	            //when i hit base case and get back make sure remove the last insert element 
	            // and make freq array as false.
	            ds.remove(ds.size()-1);
	            freq[i] = false;
	        }
	        
	    }
	}
	
	// slighly change this code if my ph lockscreen password is 4 digits
	// you can generate all parmutation combinitions.and unlock the screen lock (HA HA HA HA ^_^ )
	
	//Second approach to Print the parmutation.
	
	static void approach2(int[]arr, int index, ArrayList<Integer>ds, ArrayList<ArrayList<Integer>>list){
	    if(index == arr.length){
	       list.add(new ArrayList<>(ds));
	       return;
	    }
	    
	    for(int i = index ;i<arr.length;i++){
	        ds.add(arr[i]);
	        swap(arr,i, index);
	        approach2(arr, index+1, ds, list);
	        ds.remove(ds.size()-1);
	        swap(arr,i, index);
	   }
	}
	
    static void swap(int[]arr, int i , int j){
        int tem = arr[i];
        arr[i]  = arr[j];
        arr[j] = tem;
    }	
}