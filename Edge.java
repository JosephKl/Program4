/**
 * Edge class: tracks vertices and respective weight.
 * @author Joseph Klaips
 */
public class Edge implements Edge210{

    /**
     * Private variables: "v1" is the first vertex, "v2" is the second vertex, "weight" is their weight.  
     */
    private int v1;
    private int v2;
    private double weight;
    
    /**
     * Edge ctor; establishes an edge and a weight between v1 and v2
     * @param v1 The "from" vertice
     * @param v2 The "to" vertice
     * @param weight The weight between v1 and v2
     */
    public Edge(int v1, int v2, double weight){
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    /**
     * @return v1, the "from" vetice
     */
    public int getVert1(){
        return v1;
    }

    /**
     * @return v2, the "to" vertice
     */
    public int getVert2(){
        return v2;
    }

    /**
     * Returns the edge weight, a positive number (greater than 0)
     * @return Returns the edge weight
     */
    public double getWeight(){
        return weight;
    }

    /**
     * Returns the "other" vertex in the edge
     * @param v This vert
     * @return Returns the other vert; if v is not on the edge, then vert1 is returned
     */
    public int otherVert( int v){
        if(v == v1){
            return v2;
        }
        return v1;
    }

    /**
     * Returns true if vert is part of the edge.
     * @param v The vert to check
     * @return Returns true if part of edge
     */
    public boolean hasVert( int v){
        if(v == v1 || v == v2){
            return true;
        }
        return false;
    }

    /**
     * Normalize the edge by ordering its verts, smallest first.
     */
    public void normalize(){
        
    }
}