/**
 * G-3. Graph Representation in Java | Two Ways to Represent
 */
import java.util.*;
public class G3 {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        //now connect each edge and vertex.

        // for 1---2 egde
        adj.get(1).add(2);
        adj.get(2).add(1);


        // 2---3 edge

        adj.get(2).add(3);
        adj.get(3).add(2);

        // for 3---1 edge

        adj.get(1).add(3);
        adj.get(3).add(1);


        //to print all the edges connected..
        for(int i = 1;i<= n;i++){
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }

        /*@ If there is directed grap.
         * like u-->v
         * do this way: adj.get(u).add(v);
         */
        

    }
}
