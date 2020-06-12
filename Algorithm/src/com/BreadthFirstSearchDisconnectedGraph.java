package com;

import java.util.Iterator;
import java.util.LinkedList;

/* public class BreadthFirstSearchDisconnectedGraph {
	private int v;
	private LinkedList<Integer>[] adj;
	BreadthFirstSearchDisconnectedGraph(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i<v; i++) {
			adj[i] = new LinkedList();
		}
	}
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	public void BFS() {
		boolean[] visited = new boolean[this.v];
		for(int i=0; i<this.v; i++) {
			if(!visited[i]) {
				BFSUtil(i, visited);
			}
		}
	}
	public void BFSUtil(int v, boolean[] visited) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[v] = true;
		queue.add(v);
		while(queue.size() != 0) {
			v = queue.poll();
			System.out.print(v + " ");
			Iterator<Integer> i = adj[v].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		BreadthFirstSearchDisconnectedGraph g = new BreadthFirstSearchDisconnectedGraph(5); 
        g.addEdge(0, 4); 
        g.addEdge(1, 2); 
        g.addEdge(1, 3); 
        g.addEdge(1, 4); 
        g.addEdge(2, 3); 
        g.addEdge(3, 4); 
        System.out.println("Following is Breadth First Traversal"); 
        g.BFS(); //output = 0 4 1 2 3 
	}
}*/

public class BreadthFirstSearchDisconnectedGraph{
	private int v;
	private LinkedList<Integer>[] adj;
	BreadthFirstSearchDisconnectedGraph(int v){
		this.v = v;
		this.adj = new LinkedList[v];
		for(int i = 0; i<v; i++) {
			adj[i] = new LinkedList();
		}
	}
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	public void BFS() {
		boolean[] visited = new boolean[this.v];
		for(int i=0; i<this.v; i++) {
			if(!visited[i]) {
			BFSUtil(visited, i);}
		}
	}
	public void BFSUtil(boolean[] visited, int s) {
		LinkedList<Integer> queue = new LinkedList();
		visited[s] = true;
		queue.add(s);
		while(!queue.isEmpty()) {
			s = queue.poll();
			System.out.print(s + " ");
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int c = i.next();
				if(!visited[c]) {
					visited[c] = true;
					queue.add(c);
				}
			}
		}
	}
	public static void main(String[] args) {
		BreadthFirstSearchDisconnectedGraph g = new BreadthFirstSearchDisconnectedGraph(5); 
        g.addEdge(0, 4); 
        g.addEdge(1, 2); 
        g.addEdge(1, 3); 
        g.addEdge(1, 4); 
        g.addEdge(2, 3); 
        g.addEdge(3, 4); 
        System.out.println("Following is Breadth First Traversal"); 
        g.BFS(); //output = 0 4 1 2 3 
	}
}







