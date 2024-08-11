package DFS;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

import auxillary.GraphStructure;
import auxillary.GraphStructure.Graph;
import auxillary.GraphStructure.Vertex;

/**
 * Realization for DFS algorithm 
 */
public class BasicRealization {

	public static void main(String[] args) {
		GraphStructure gs = new GraphStructure();
		Graph g = gs.getGraph();
		/*
		 *   [1]
		 * 	 / \
		 * [2] [3]
		 *	 \ /
	     *	 [4]
		 */
		g.addVertex("1");
		g.addVertex("2");
		g.addVertex("3");
		g.addVertex("4");

		g.addEdge("1", "2");
		g.addEdge("1", "3");
		g.addEdge("4", "2");
		g.addEdge("4", "3");
		
		System.out.println(depthFirstTraversal(g, "1")); 
		
	}
	public static Set<String> depthFirstTraversal(Graph graph, String root) {
		Set<String> visited = new LinkedHashSet<String>();
	    Stack<String> stack = new Stack<String>();
	    stack.push(root);
	    while (!stack.isEmpty()) {
	        String vertex = stack.pop();
	        if (!visited.contains(vertex)) {
	            visited.add(vertex);
	            for (Vertex v : graph.getAdjVertices(vertex)) {              
	                stack.push(v.getLable());
	            }
	        }
	    }
	    return visited;
	}
	
	

}
