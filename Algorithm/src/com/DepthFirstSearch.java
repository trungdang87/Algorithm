package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/*
public class DepthFirstSearch {

	//Depth First Search DFS of a connected graph (DFS using stack)

	private int v; // # of vertices

	// Array  of lists for Adjacency List Representation 
	private LinkedList<Integer> adj[];

	DepthFirstSearch(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList();
		}
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v's list
	}

	// A function used by DFS
	void DFSUtil(int v, boolean visited[]) {
		//Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		//Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				DFSUtil(n, visited);
			}
		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS(int v) {
		// Mark all the vertices as not visited(set as 
		// false by default in java)
		boolean visited[] = new boolean[this.v];

		// Call the recursive helper function to print DFS traversal
		DFSUtil(v, visited);

	}
	public static void main(String[] args) {
		DepthFirstSearch g = new DepthFirstSearch(4); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		System.out.println("Following is Depth First Traversal "+ 
				"(starting from vertex 2)"); 
		g.DFS(2); 
		//output 2 0 1 3
	}

} */

public class DepthFirstSearch{
	int v;
	ArrayList<Integer>[] adj;
	DepthFirstSearch(int v){
		this.v = v;
		adj = new ArrayList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new ArrayList<>();
		}
	}
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	public void dfs(int s) {
		boolean[] visited = new boolean[this.v];
		dfsUtil(s, visited);
	}
	public void dfsUtil(int s, boolean[] visited) {
		visited[s] = true;
		System.out.print(s + " ");
		Iterator<Integer> i = adj[s].iterator();
		while(i.hasNext()) {
			s = i.next();
			if(!visited[s]) {
				dfsUtil(s, visited);
			}
		}
	}
	
	
	public static void main(String[] args) {
		DepthFirstSearch g = new DepthFirstSearch(4); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		System.out.println("Following is Depth First Traversal "+ 
				"(starting from vertex 2)"); 
		g.dfs(2); 
		//output 2 0 1 3
	}
}









