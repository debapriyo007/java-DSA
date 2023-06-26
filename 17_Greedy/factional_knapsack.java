import java.util.*;


public class factional_knapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]= {10,20,30};
        int W = 50;
         
        //Creating 2D array ..
        double ratio[][] = new double[val.length][2]; //int oth column store 'Index' and 1st coloum store 'ratio'
        for(int i = 0 ;i<val.length ;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); //ascending  order sorting..
        int capacity= W;
        int finalVal = 0;
        for(int i = ratio.length-1 ;i>=0 ;i--){
            int idx = (int)ratio[i][0]; //pick the item..
            if(capacity>= weight[idx]){ //full add the item or not..
                finalVal+= val[idx];
                capacity-=weight[idx];
            }else{
                finalVal +=(ratio[i][1] * capacity); //include factional only.. 
                capacity =0;
                break;
            }
        }
        System.out.println("Final value : " + finalVal);


    }
}
