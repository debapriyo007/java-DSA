package ImplementGraph.UsingAdjList;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    class Pair{
        int node;
        int weight;
        Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "(" + node + "," + weight + ")";
        }
    }

     List<List<Integer>>adjList; //[[], [], [] , []]
     List<List<Pair>>adjListWithWeight;
    Graph(int nodes){
        adjList = new ArrayList<>();
        adjListWithWeight = new ArrayList<>();
        for(int i = 0;i<nodes;i++){
            adjList.add(new ArrayList<>());
            adjListWithWeight.add(new ArrayList<>());
        }
    }

    //add edges intoList.
    public void addEdgesInList(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            //for directed.
            if(isDirected){
                adjList.get(u).add(v);
            }else{
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }
    
    //add edges with weight into List.
    public void addEdgesInListWithWeight(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            //for directed.
            if(isDirected){
                Pair pair = new Pair(v, wt); // pass (node, weight) . j node tar kache jacche sey node ta pass korbo r wt ta.
                adjListWithWeight.get(u).add(pair);
            }else{
                Pair pair1 = new Pair(v, wt); // pass (node, weight) . j node tar kache jacche sey node ta pass korbo r wt ta.
                Pair pair2 = new Pair(u, wt); // pass (node, weight) . j node tar kache jacche sey node ta pass korbo r wt ta.
                adjListWithWeight.get(u).add(pair1);
                adjListWithWeight.get(v).add(pair2);
            }
        }
    }

    public void printAdjList(){
        for(int i = 0;i<adjList.size();i++){
            System.out.print(i+ " -> ");
            System.out.print("[");
            for(int j = 0;j<adjList.get(i).size();j++){
                System.out.print(adjList.get(i).get(j));
                // if it's not last index then print ',(coma)' only.
                if(j!= adjList.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public void printAdjListForWeight(){
        for(int i = 0;i<adjListWithWeight.size();i++){
            System.out.print(i+ " -> ");
            System.out.print("[");
            for(int j = 0;j<adjListWithWeight .get(i).size();j++){
                System.out.print(adjListWithWeight.get(i).get(j));
                // if it's not last index then print ',(coma)' only.
                if(j!= adjList.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }



    
    public static void main(String[] args) {

        /*
         int edges[][] = {{0, 2},{0, 1},{1, 3}};
         int nodes = 4;

        Graph graph = new Graph(nodes);
        graph.addEdgesInList(edges, false);
        System.out.println("Undirected Graph Representation -->");
//        System.out.println(adjList);
        graph.printAdjList();

        Graph graph2 = new Graph(nodes);
        graph2.addEdgesInList(edges, true);
        System.out.println("Directed Graph Representation -->");
//        System.out.println(adjList);
        graph2.printAdjList();

        */

        int edges[][] = {{0, 2, 10}, {0, 1, 20}, {1, 3, 30}}; //edges with their weights.
        int nodes = 4;
        Graph graph = new Graph(nodes);
        graph.addEdgesInListWithWeight(edges,false);
        System.out.println("Weighted Undirected Graph --->");
        graph.printAdjListForWeight();


        Graph graph2 = new Graph(nodes);
        graph2.addEdgesInListWithWeight(edges,true);
        System.out.println("Weighted Directed Graph --->");
        graph2.printAdjListForWeight();
    }
}
