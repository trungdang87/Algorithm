package com;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearchDisconnectedGraph {
/*	private int v;
	private LinkedList<Integer>[] adj;
	DepthFirstSearchDisconnectedGraph(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i<v; i++) {
			adj[i] = new LinkedList();
		}
	}
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	public void DFS() {
		boolean[] visited = new boolean[this.v];
		for(int i = 0; i<this.v; i++) {
			if(!visited[i]) {
				DFSUtil(i, visited);
			}
		}
	}
	public void DFSUtil(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");
		
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				DFSUtil(n, visited);
			}
		}
	}*/
	private int v;
	private LinkedList[] adj;
	DepthFirstSearchDisconnectedGraph(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList();
		}
	}
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	public void DFS() {
		boolean[] visited = new boolean[this.v];
		for(int i=0; i<v; i++) {
			if(!visited[i]) {
				DFSUtil(visited, i);
			}
		}
	}
	public void DFSUtil(boolean[] visited, int s) {
		visited[s] = true;
		System.out.print(s + " ");
		Iterator<Integer> i = adj[s].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				DFSUtil(visited, n);
			}
		}
	}
	
	public static void main(String[] args) {
		DepthFirstSearchDisconnectedGraph g = new DepthFirstSearchDisconnectedGraph(5);
	        g.addEdge(0, 4); 
	        g.addEdge(1, 2); 
	        g.addEdge(1, 3); 
	        g.addEdge(1, 4); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 4); 
	        System.out.println("Following is Depth First Traversal"); 
	        g.DFS(); 
	}
}
