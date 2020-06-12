package com;

public class PrintDiamondShape 
{ 

	// Prints diamond pattern 
	// with 2n rows 
/*	static void printDiamond(int n) 
	{ 
		int space = n - 1; 

		// run loop (parent loop)  
		// till number of rows 
		for (int i = 0; i < n; i++) 
		{ 
			// loop for initially space,  
			// before star printing 
			for (int j = 0; j < space; j++) 
				System.out.print(" "); 

			// Print i+1 stars 
			for (int j = 0; j <= i; j++) 
				System.out.print("* "); 

			System.out.print("\n"); 
			space--; 
		} 

		// Repeat again in 
		// reverse order 
		space = 0; 

		// run loop (parent loop)  
		// till number of rows 
		for (int i = n; i > 0; i--) 
		{ 
			// loop for initially space,  
			// before star printing 
			for (int j = 0; j < space; j++) 
				System.out.print(" "); 

			// Print i stars 
			for (int j = 0; j < i; j++) 
				System.out.print("* "); 

			System.out.print("\n"); 
			space++; 
		} 
	} */
	
	public static void print(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		print(5);
	}
	
	
	
	
	//Facebook interview question
/*	public static void printArray(int[] arr) {
		int space = 2;
		int index = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			space--;
			for(int j=0; j<=i; j++) {
				System.out.print(arr[index++] + " ");
				
			}
			System.out.println();
		}
		space = 1;
		for(int i=1; i>=0; i--) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			space++;
			for(int j=0; j<=i; j++) {
				System.out.print(arr[index++]+" ");
			}
			System.out.println();
		}
	}
	// Driver Code 
	public static void main(String[] args)  
	{ 
		int[] arr = {1,2,3,4,5,6,7,8,9};
		printArray(arr);

	} 
	*/
	
	
	
} 