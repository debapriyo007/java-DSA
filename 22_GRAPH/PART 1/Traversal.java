import java.util.*;
public class Traversal {

    static class Edge{
        int src;
        int dest;
        int cost;

        Edge(int src, int dest, int cost){
            this.src = src;
            this.dest = dest;
            this.cost = cost;
        }
    }


    //Create Graph Methord.
    public static void createGraph( ArrayList<Edge>grap[]){
        for(int i = 0;i<grap.length;i++){
            grap[i] = new ArrayList<>();
        }

        grap[0].add(new Edge(0, 1, 1)); // i make all edge cost as 1
        grap[0].add(new Edge(0, 2, 1));


        grap[1].add(new Edge(1, 0, 1));
        grap[1].add(new Edge(1, 3, 1));


        grap[2].add(new Edge(2, 0, 1));
        grap[2].add(new Edge(2, 4, 1));



        grap[3].add(new Edge(3, 1, 1));
        grap[3].add(new Edge(3, 4, 1));
        grap[3].add(new Edge(3, 5, 1));



        grap[4].add(new Edge(4, 2, 1));
        grap[4].add(new Edge(4, 3, 1));
        grap[4].add(new Edge(4, 5, 1));



        grap[5].add(new Edge(5, 3, 1));
        grap[5].add(new Edge(5, 4, 1));
        grap[5].add(new Edge(5, 6, 1));



        grap[6].add(new Edge(6, 5, 1));

    }


    // BFS Traversal Methord...  
    // Time Complexity -> 0(V+E)  SC -> 0(V)
    

    public static void bfs(ArrayList<Edge>grap[]){
        Queue<Integer> q = new LinkedList<>();
        // Created a boolean array to track which node i visited, and i don't want to print one node multiple time
        boolean visted[] = new boolean[grap.length];
        //your source can be any node.
        //here i take my src as 0 | src = 0
        //add that in queue.
        q.add(0);  //source = 0
        while (!q.isEmpty()){
            int currNode = q.remove();

            if(!visted[currNode]){  //mane, ami j node gulo te visit korini 
                //then visit currnode.
                System.out.print(currNode + " "); //print
                //Now make visited for currNode is True 
                visted[currNode] = true;
                //add all current Node neighbour.
                for( int i = 0;i<grap[currNode].size();i++){ //this code is find out all neighbour for a particular node.
                    Edge e = grap[currNode].get(i);
                    q.add(e.dest); //add all neighbour
                }
            }
        }
    }

    // DFS Traversal Methord...
    // Time Complexity - 0(V+E)
    public static void dfs(ArrayList<Edge>graph[], int currNode, boolean visted[]){
         //visit my currentNode.
         System.out.print(currNode+ " ");
         visted[currNode] = true;

         //call for current node neighbour.
         for( int i = 0;i<graph[currNode].size();i++){
            Edge e = graph[currNode].get(i);
            if(!visted[e.dest]){
                dfs(graph, e.dest, visted);
            }
        }

    }

    public static void main(String[] args) {
        
/*
                    "BFS"     

                   1 ------ 3
                  /         | \
                 /          |  \
                0           |   5 
                 \          |  /  \
                  \         | / ^  \
                   2 ------ 4   |    6
                ^  ^        ^   |    ^ 
                |  |        |   |    |
             level0|      level2|   level4
                   |            |
                level1        level3


            RULE OF BFS TRAVERSAL:

            * Go immediate neighbour.
              so, for example (0) immediate neighbour is (1) , (2)
            
            * Similar to LEVEL-ORDER Traversal.


         
         
 */



        int V = 7;
        ArrayList<Edge>grap[] = new ArrayList[V];
        createGraph(grap);

        //print bfs traversal
        System.out.print("BFS Traversal is :");
        bfs(grap);
 
        System.out.println();

        System.out.print("DFS Traversal is :");
        //call Dfs traversal.
        dfs(grap, 0,new boolean[V]); 

    }
}
