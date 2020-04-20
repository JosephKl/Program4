import java.io.File;
import java.util.*;

/**
 * Main class for Program 4
 * @author Joseph Klaips
 */

public class Program4 {
    
    /**
     * @param args
     */
    public static void main(String args[]){
        
        //A graph is created, a file is opened, and the file is read.
        Graph graph = new Graph();
        graph.openFile(); 
        graph.readFile();

        //User commands
        System.out.println("\nCommands: \nnumVerts = Prints number of Vertices");
        System.out.println("numEdges = Prints number of Edges");
        System.out.println("addEdge = Adds to the graph");
        System.out.println("exit = Ends program\n");
        //System.out.println("minSpan = Min Spanning Tree");

        //User makes a choice 
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        //As long as the user does not enter "exit", they may continue to enter commands 
        while(choice != "exit"){
            if(choice.equals("numVerts")){
                System.out.println(graph.numVerts());
                choice = scanner.nextLine();
            }
            if(choice.equals("numEdges")){
                System.out.println(graph.numEdges());
                choice = scanner.nextLine();
            }
            if(choice.equals("addEdge")){
                Scanner scanner2 = new Scanner(System.in);

                System.out.println("Vert1: ");
                int v1 = scanner2.nextInt();

                System.out.println("Vert2: ");
                int v2 = scanner2.nextInt();

                System.out.println("Weight: ");
                double weight = scanner2.nextDouble();
                
                graph.addEdge(v1,v2,weight);
                choice = scanner.nextLine();
            }
        }
    }
}