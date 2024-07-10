package ImplementGraph.Using2DMatrix;

public class Graph {
    int [][] adjMatrix;
    Graph(int nodes){
        adjMatrix = new int[nodes][nodes]; // 4 x 4 [0...]
    }

    //method to add edges. -> [[0, 2], [0, 1], [2, 0]]
    public void  addEdgesInMatrix(int edges[][], boolean isDirected){
        for(int []edge : edges){
            // see i've two node.
            int u = edge[0];
            int v = edge[1];

            //directed graph.
            if(isDirected){
                adjMatrix[u][v] = 1;
            }else{
                // if undirected graph.
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }

        }
    }


    //add edges with weights.
    public void  addEdgesInMatrixWithWeight(int edges[][], boolean isDirected){
        for(int []edge : edges){

            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            //directed graph.
            if(isDirected){
                adjMatrix[u][v] = wt;
            }else{
                // if undirected graph.
                adjMatrix[u][v] = wt;
                adjMatrix[v][u] = wt;
            }
        }
    }

    public void print2DMatrix(){
        for (int i = 0;i<adjMatrix.length;i++){
            System.out.print("Row " + i + "-> ");
            for(int j = 0;j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
        int edges[][] = {{0, 2},{0, 1},{1, 3}};
        int nodes = 4;

        Graph graph = new Graph(nodes);
        graph.addEdgesInMatrix(edges, false);
        System.out.println(" <----  Undirected Graph Representation -->");
        graph.print2DMatrix();


        Graph graph2 = new Graph(nodes);
        graph2.addEdgesInMatrix(edges, true);
        System.out.println(" <----  Directed Graph Representation -->");
        graph2.print2DMatrix();
        */

        int edges[][] = {{0, 2, 10}, {0, 1, 20}, {1, 3, 30}}; //edges with their weights.
        int nodes = 4;
        Graph graph = new Graph(nodes);
        graph.addEdgesInMatrixWithWeight(edges, false);
        System.out.println(" <----  Weighted-Undirected Graph Representation -->");
        graph.print2DMatrix();


        Graph graph2 = new Graph(nodes);
        graph2.addEdgesInMatrixWithWeight(edges, true);
        System.out.println(" <----  Weighted-Directed Graph Representation -->");
        graph2.print2DMatrix();
    }
}
