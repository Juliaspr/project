package Graphs;
import java.util.ArrayList;

public class Graphs {
    ArrayList<ArrayList<Integer>> graph;
    int node;

    public Graphs(int nodes) {
        this.node = nodes;
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < nodes; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }
}
