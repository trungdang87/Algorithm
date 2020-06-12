package com;
import java.util.*;
import java.util.LinkedList;
import java.io.*;

public class DisconnectedGraph {

	private int v; // # of vertices

	//Array of lists for Adjacency List representation
	private LinkedList<Integer> [] adj;
	
	DisconnectedGraph(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	//Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	//The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS() {
		boolean[] visited = new boolean[this.v];
		for(int i=0; i<this.v; i++) {
			if(!visited[i]) {
				DFSUtil(i, visited);
			}
		}
	}
	
	//A function used by DFS
	void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(v + " ");
		
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n]) {
				DFSUtil(n, visited);
			}
		}
	}
	


	public static void main(String[] args) {
	       DisconnectedGraph g = new DisconnectedGraph(5); 
	       
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
