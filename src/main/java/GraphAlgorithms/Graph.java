package GraphAlgorithms;

import java.util.ArrayList;

public class Graph {
	private int V;
	private int E;
	private ArrayList<Integer>[] adj;

	public void Graph(int v) {
		this.V = v;
		for (int i = 0; i < v; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}

	public void numberOfEdges() {

	}

	public boolean validateEdge() {
		return false;
	}

	public void addEdge() {

	}
}
