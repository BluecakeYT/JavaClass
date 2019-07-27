import java.io.*;
import java.util.*;

class Graph
{
    private int V;
    private LinkedList<Integer> adj[];


    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
            adj[i] = new LinkedList();
    }


    public void addEdge(int v, int w) {

        adj[v].add(w);
    }



    public void findPath(int s) {
          int numMoves = 0;

        boolean visited[] = new boolean[V];


        LinkedList<Integer> queue = new LinkedList<Integer>();


        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0) {
            numMoves++;
            s = queue.poll();

            System.out.print(s+" ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {

                int n = i.next();
                if (!visited[n]) {

                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println("Moves: " + numMoves);
    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);


        g.findPath(2);
    }
}
