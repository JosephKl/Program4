import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Graph class.
 * 
 * @author Joseph Klaips
 */
public class Graph implements Graph210 {

    /**
     * Private varibles; ArrayList of edges and a file reader.
     */
    private ArrayList<Edge210> edgeList;
    private Scanner reader;

    /**
     * Graph ctor, creates a new ArrayList of edges.
     */
    public Graph() {
        edgeList = new ArrayList();
    }

    /**
     * Returns the number of vertices in the graph; verts are numbered 0 to V-1.
     * 
     * @return Returns the number of vertices
     */
    public int numVerts() {
        return edgeList.size() * 2;
    }

    /**
     * Returns the number of edges in the graph; edges are numbered 0 to E-1.
     * 
     * @return Returns the number of edges
     */
    public int numEdges() {
        return edgeList.size();
    }

    /**
     * Adds an edge to the graph.
     * 
     * @param v1     is vert1, from vert
     * @param v2     is vert2, to vert
     * @param weight Edge weight
     * @return Returns the edge just added; on error, null is returned
     */
    public Edge210 addEdge(int v1, int v2, double weight) {
        Edge210 edge = new Edge(v1, v2, weight);
        edgeList.add(edge);
        return edge;
    }

    /**
     * Returns a list of edges connected to the vertex.
     * 
     * @param v The vertex
     * @return Returns a list of edges connected to the vertex; null is never
     *         returned an empty list is returned if 1) no edges, or 2) a bad vert
     *         is specified;
     */
    public List<Edge210> edges(int v) {
        ArrayList<Edge210> edges = new ArrayList();
        edges.add(edgeList.get(v));
        return edges;
    }

    /**
     * Returns a list of all edges in the graph.
     * 
     * @return Returns a list of all edges; never null
     */
    public List<Edge210> allEdges() {
        ArrayList<Edge210> allEdges = new ArrayList();
        for (Edge210 e : edgeList) {
            allEdges.add(e);
        }
        return allEdges;
    }

    /**
     * Two steps: 1) Normalize each edge in the graph, and 2) Properly sort all
     * edges. We do this so that we can (easily) compare two normalized graphs.
     */
    public void normalizeEdges() {

    }

    /**
     * Prompts the user to enter a file.
     * 
     * @return The name of the file
     */
    public String getFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a file: ");
        String file = scanner.nextLine();
        return file;
    }

    /**
     * https://www.youtube.com/watch?v=3RNYUKxAgmw Opens the user entered file.
     */
    public void openFile() {
        try {
            reader = new Scanner(new File(getFile()));
        } catch (Exception e) {
            System.out.println("Try another file.");
        }
    }

    /**
     * https://www.youtube.com/watch?v=3RNYUKxAgmw Reads the user entered file to
     * establish vetices, edges, and weights.
     */
    public void readFile() {
        while (reader.hasNext()) {
            int v1 = reader.nextInt();
            int v2 = reader.nextInt();
            double weight = reader.nextDouble();
            //edgeList.add(addEdge(v1, v2, weight));
            addEdge(v1,v2,weight);
        }
    }

    

}

