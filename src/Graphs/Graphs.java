package Graphs;
import java.util.ArrayList;

public class Graphs {
    ArrayList<ArrayList<Integer>> graph;
    int nodes;

    public Graphs(int nodes) {
        this.nodes = nodes;
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < nodes; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    public ArrayList<Integer> get(int id) {
        return graph.get(id);
    }

}
