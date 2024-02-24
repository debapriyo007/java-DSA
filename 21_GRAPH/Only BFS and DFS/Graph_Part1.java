import java.util.*;
public class Graph_Part1 {

    static class Edge{
        int src;
        int dest;
        int cost;

        //constructor.
        Edge(int src , int dest, int cost){
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }
    }


    public static void main(String[] args) {
        
        /*
                     (5)
                0 -------- 1
                          / \
                     (1) /   \  (3)
                        /     \
                       2-------3
                       |   (1)
                       |
                  (2)  |
                       4
        */

        //here,  Vertex are 5
        int V = 5;
        //amar kache joto size er vertex ache same size er arrayList banabo.
        ArrayList<Edge> graph[] = new ArrayList[V];
        //akhon amar graph a null value ache .
        //ami empty korbo.
        for(int i = 0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        //Now i store my info.

        // 0'th Index.
        graph[0].add(new Edge(0, 1, 5));

        //1st index.
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2nd index.
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //3rd Index.
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        //4th index.

        graph[4].add(new Edge(4,2,2));



        //QUESTION : Print all (2)Node neghibour
        for( int i = 0;i<graph[2].size();i++){
            Edge e = graph[2].get(i); //src , dest, wt
            System.out.println("Neighbour: "+e.dest);
        }


    }
}