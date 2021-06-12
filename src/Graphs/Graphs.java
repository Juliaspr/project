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

    public void delete(int source, int destination)
    {
        for (int i = 0; i < graph.get(destination).size(); i++)
        {
            if (graph.get(destination).get(i).equals(source))
            {
                graph.get(destination).remove(i);
                break;
            }
        }
        for (int i = 0; i < graph.get(source).size(); i++)
        {
            if (graph.get(source).get(i) == destination)
            {
                graph.get(source).remove(i);
                break;
            }
        }
    }
}
