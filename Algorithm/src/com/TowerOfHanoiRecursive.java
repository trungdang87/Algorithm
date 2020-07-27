package com;

public class TowerOfHanoiRecursive {
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Tower of Hanoi recursive
	//think n = 1, then n = 2
/*	public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
	{ 
		if (n == 1) 
		{ 
			System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
			return; 
		} 
		towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
		System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
		towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
	}*/
	
	public static void tower(int x, char from, char to, char aux) {
		if(x==1) {
			System.out.println("Move disk " + x + " from " + from + " to " + to);
			return;
		}
		tower(x - 1, from, aux, to);
		System.out.println("Move disk " + x + " from " + from + " to " + to);
		tower(x - 1, aux, to, from);
	}
	
	public static void main(String[] args) {
		TowerOfHanoiRecursive.tower(2, 'A', 'C','B');

	}

}
