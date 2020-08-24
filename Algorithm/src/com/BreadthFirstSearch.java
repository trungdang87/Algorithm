package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* public class BreadthFirstSearch {
	//Breadth First Search (BFS using queue)

	private int v; // # of vertices
	private LinkedList<Integer> [] adj; //adjacency Lists

	public BreadthFirstSearch(int v) {
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
		BreadthFirstSearch g = new BreadthFirstSearch(4); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		System.out.println("Following is Breadth First Traversal "+ 
				"(starting from vertex 2)"); 

		g.BFS(2); //Output: 2 0 3 1


	}

} */
public class BreadthFirstSearch{
	int v;
	ArrayList<Integer>[] adj;
	BreadthFirstSearch(int v){
		this.v = v;
		this.adj = new ArrayList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new ArrayList<>();
		}
	}
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	public void bfs(int s) {
		boolean[] visited = new boolean[this.v];
		bfsUtil(s, visited);
	}
	public void bfsUtil(int s, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		while(!queue.isEmpty()) {
			s = queue.poll();
			System.out.print(s + " ");
			visited[s] = true;
			Iterator<Integer> i = adj[s].iterator();
			while(i.hasNext()) {
				s = i.next();
				if(!visited[s]) {
					queue.add(s);
				}
			}
		}
	}
	
	public static void main(String args[]) 
	{ 
		BreadthFirstSearch g = new BreadthFirstSearch(4); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		System.out.println("Following is Breadth First Traversal "+ 
				"(starting from vertex 2)"); 

		g.bfs(2); //Output: 2 0 3 1


	}
	
}



