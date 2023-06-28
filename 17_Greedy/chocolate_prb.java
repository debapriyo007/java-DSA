import java.util.*;
public class chocolate_prb {
    public static void main(String[] args) {
        int m =6, n=4;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h = 0 , v=0; //hor , ver cuts..
        int hp =1, vp =1; //count of hori or vertical pices.. 
        int cost = 0;

        while(h<costHor.length && v<costVer.length){
            if(costVer[v]<= costHor[h]){ //alway hor cut first..
                cost +=(costHor[h]*vp);
                hp++;
                h++;
            }else{ //vertical cut..
                cost += (costVer[v]* hp);
                vp++;
                v++;
            }
        }
        //if any cost a left ..
        while(h<costHor.length){
            cost +=(costHor[h]*vp);
                hp++;
                h++;
        }
        
        while(v<costVer.length){
            cost += (costVer[v]* hp);
            vp++;
            v++; 
        }

        System.out.println("Minimun cost of cuts : " + cost);
    }
}
