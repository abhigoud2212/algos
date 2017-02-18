package GraphAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class DiGraph {
	private int V;
	private int E;
	private ArrayList<Integer>[] adj;

	public DiGraph(int v) {
		if (v < 0)
			throw new IllegalArgumentException("The Number cannot be less than 0");
		this.V = v;
		this.E = 0;
		adj = (ArrayList<Integer>[]) new ArrayList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}

	public int numberOfEdges() {
		return E;
	}

	private boolean validateEdge(int v) {
		if (v < 0 || v >= V)
			throw new ArrayIndexOutOfBoundsException("Edge Not Valid : " + v);
		return true;

	}

	public void addEdge(int v, int w) {
		validateEdge(v);
		validateEdge(w);
		adj[v].add(w);
		E++;
	}

	public List<Integer> iterable(int v) {
		return adj[v];
	}

	public static void main(String[] args) {
		DiGraph G = new DiGraph(5);
		G.addEdge(0, 1);
		G.addEdge(3, 1);
		G.addEdge(1, 2);
		G.addEdge(1, 3);
		G.addEdge(3, 4);
		G.addEdge(2, 4);
		System.out.println(G.V);
		System.out.println(G.E);
		for (int i : G.iterable(1)) {
			System.out.println("Edge from 1 : " + i);
		}

	}
}
