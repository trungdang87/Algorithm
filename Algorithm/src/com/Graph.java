package com;

import java.util.Iterator;
import java.util.LinkedList;

//Depth First Search DFS of a connected graph (DFS using stack)
/*public class Graph{
	private int v; // # of vertices

	// Array  of lists for Adjacency List Representation 
	private LinkedList<Integer> adj[];

	Graph(int v){
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
		Graph g = new Graph(4); 

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

}*/


//Breadth First Search (BFS using queue)
/*public class Graph {
	private int v; // # of vertices
	private LinkedList<Integer> [] adj; //adjacency Lists

	public Graph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList();
		}
	}

	//function to add an edge into the graph
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	//Prints BFS traversal from a given source s
	public void BFS(int s) {
		// Mark all the vertices as not visited(By default 
        // set as false)
		boolean[] visited = new boolean[this.v];

		//Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		//Mark the current node as visited and print it
		visited[s] = true;
		queue.add(s);

		while(queue.size() != 0) {
			//Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");

			//Get all adjacent vertices of the dequeued vertex s
			//If an adjacent has not been visited, then mark it visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String args[]) 
    { 
        Graph g = new Graph(4); 

        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 

        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 

        g.BFS(2); 
    } 

}*/




















