package auxillary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GraphStructure {
	Graph g;

	public GraphStructure() {
		this.g = new Graph();
	}

	public Graph getGraph() {
		return g;
	}

	public class Vertex {
		private String lable;

		public Vertex(String lable) {
			this.lable = lable;
		}

		public String getLable() {
			return lable;
		}

		@Override
		public String toString() {
			return "Vertex [lable=" + lable + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(lable);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Vertex other = (Vertex) obj;
			return Objects.equals(lable, other.lable);
		}

	}

	public class Graph {
		private Map<Vertex, List<Vertex>> adjVertices = new HashMap<>();

		public Graph() {
		}

		public Map<Vertex, List<Vertex>> getAdjVertices() {
			return adjVertices;
		}

		public List<Vertex> getAdjVertices(String label) {
			return adjVertices.get(new Vertex(label));
		}

		public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
			this.adjVertices = adjVertices;
		}

		public void addVertex(String lable) {
			Vertex v = new Vertex(lable);
			adjVertices.put(v, new ArrayList<>());
		}

		public void removeVertex(String lable) {
			Vertex v = new Vertex(lable);
			adjVertices.values().stream().forEach(e -> e.remove(v));
			adjVertices.remove(v);
		}

		public void addEdge(String lable1, String lable2) {
			Vertex v1 = new Vertex(lable1);
			Vertex v2 = new Vertex(lable2);
			adjVertices.get(v1).add(v2);
			adjVertices.get(v2).add(v1);
		}

		public void removeEdge(String lable1, String lable2) {
			Vertex v1 = new Vertex(lable1);
			Vertex v2 = new Vertex(lable2);
			List<Vertex> edges1 = adjVertices.get(v1);
			List<Vertex> edges2 = adjVertices.get(v2);
			if (edges1 != null) {
				edges1.remove(v2);
			}
			if (edges2 != null) {
				edges2.remove(v1);
			}
		}

		@Override
		public String toString() {
			return "Graph [adjVertices=" + adjVertices + "]";
		}

	}
}
