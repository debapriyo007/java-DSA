import java.util.*;
public class prb_04_max_len_chain_pair {
    public static void main(String[] args) {
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        //Sort 2D array..
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int chainLen= 1;
        int chainEnd = pair[0][1];

        for(int i = 0 ;i<pair.length ;i++){
            if(pair[i][0]> chainEnd){
                chainLen++;
                chainEnd = pair[i][1];
            }
        }
        System.out.println("Maximum length of chain : " + chainLen);

    }
}
