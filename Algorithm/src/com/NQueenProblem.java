package com;

import java.util.Arrays;

//Back tracking
/*public class NQueenProblem {
	private static final int N = 4;

	public static void printSolution(int[][] board) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isSafe(int[][] board, int i, int j) {
		for(int col=j-1; col>=0; col--) {
			if(board[i][col] == 1)
				return false;
		}
		for(int row=i-1, col=j-1; row>=0 && col>=0; row--, col--) {
			if(board[row][col] == 1) {
				return false;
			}
		}
		for(int row=i+1, col=j-1; row<N && col>=0; row++, col--) {
			if(board[row][col] == 1) {
				return false;
			}
		}
		return true;
	}

	public static boolean solveNQ() {
		int board[][] = {	{0,0,0,0},
							{0,0,0,0},
							{0,0,0,0},
							{0,0,0,0}	};
		if(solveNQUtil(board, 0) == false) {
			System.out.println("Solution does not exit");
			return false;
		}

		printSolution(board);
		return true;
	}


	public static boolean solveNQUtil(int[][] board, int col) {
		if(col >= N) {
			return true;
		}

		for(int i=0; i<N; i++) {
			if(isSafe(board, i, col)) {
				board[i][col] = 1;
				if(solveNQUtil(board, col + 1) == true)
					return true;
			}
			board[i][col] = 0;

		}
		return false;
	}

	public static void main(String[] args) {
		NQueenProblem.solveNQ();


	}
}
 */

//https://leetcode.com/problems/n-queens/
public class NQueenProblem{
	int N = 4;
	public void solveNQ() {
		int[][] board = {{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}};
		solveNQUtil(board, 0);
	}
	public void solveNQUtil(int[][] board, int col) {
		if(col>=N) {
			printBoard(board);
			return;
		}
		for(int r=0; r<N; r++) {
			if(isSafe(board, r, col)) {
				board[r][col] = 1;
				solveNQUtil(board, col+1);
			}
			board[r][col] = 0;
		}
	}
	public boolean isSafe(int[][] board, int row, int col) {
		for(int c=col-1; c>=0; c--) {
			if(board[row][c]==1) return false;
		}
		for(int r=row-1, c=col-1; r>=0 && c>=0; r--, c--) {
			if(board[r][c]==1) return false;
		}
		for(int r=row+1, c=col-1; r<N && c>=0; r++, c--) {
			if(board[r][c]==1) return false;
		}
		return true;
	}
	public void printBoard(int[][] board) {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
	}
	public static void main(String[] args) {
		NQueenProblem ob = new NQueenProblem();
		ob.solveNQ();
		
	}
}










