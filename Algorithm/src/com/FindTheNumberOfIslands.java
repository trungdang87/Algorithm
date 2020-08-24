package com;

import java.util.Arrays;

public class FindTheNumberOfIslands {
	/*	
	static final int ROW = 5, COL = 5;

	static boolean isSafe(int[][] matrix, int row, int col, boolean[][] visited) {
		return(row >=0) && (row < ROW) && (col >= 0) && (col < COL) && (matrix[row][col] == 1 && !visited[row][col]);
	}
	static void DFS(int[][] matrix, int row, int col, boolean[][] visited) {
		int[] rowIndex = new int[] {-1,-1,-1,0,0,1,1,1};
		int[] colIndex = new int[] {-1,0,1,-1,1,-1,0,1};
		visited[row][col] = true;
		for(int k=0; k<8; k++) {
			if(isSafe(matrix,row + rowIndex[k], col + colIndex[k], visited)) {
				DFS(matrix, row + rowIndex[k], col + colIndex[k], visited);
			}
		}
	}
	static int count(int[][] matrix) {
		boolean[][] visited = new boolean[ROW][COL];
		int count = 0;
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				if(matrix[i][j] == 1 && !visited[i][j]) {
					DFS(matrix, i, j, visited);
					++count;
				}
			}
		}
		return count;
	}
	 */
	
	//find number of islands and biggest island
	public int[] count(int[][] matrix) {
		int[] result = new int[2];
		int[] count = new int[1];
		int max = 0;
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(isSafe(matrix, i, j, visited)) {
					count[0] = 0;
					result[0]++;
					dfs(matrix, i, j, visited, count);
					result[1] = Math.max(count[0], result[1]);
				}
			}
		}
		return result;
	}
	public void dfs(int[][] matrix, int r, int c, boolean[][] visited, int[] count) {
		if(isSafe(matrix, r, c, visited)) {
			visited[r][c] = true;
			count[0]++;
			dfs(matrix, r-1, c, visited, count);
			dfs(matrix, r+1, c, visited, count);
			dfs(matrix, r, c-1, visited, count);
			dfs(matrix, r, c+1, visited, count);
		}
	}
	public boolean isSafe(int[][] matrix, int r, int c, boolean[][] visited) {
		return r>=0 && r<matrix.length && c>=0 && c<matrix[0].length && !visited[r][c] && matrix[r][c]==1;
	}
	
	
	public static void main(String[] args) {
		int[][] matrix = new int[][] { 	
			{ 1, 1, 0, 0, 0 }, 
			{ 0, 1, 0, 0, 1 }, 
			{ 1, 0, 0, 1, 1 }, 
			{ 0, 0, 0, 0, 0 }, 
			{ 1, 0, 1, 0, 1 }
		};

		int[][] matrix2 = new int[][] { 	
			{ 1, 1, 0, 0 }, 
			{ 1, 1, 0, 1 }, 
			{ 0, 0, 0, 1 }, 
			{ 0, 0, 0, 0 }, 
			{ 1, 0, 1, 1 }
		};



		FindTheNumberOfIslands ob = new FindTheNumberOfIslands();
		int[] result = ob.count(matrix);
		System.out.println(Arrays.toString(result));

		int[] result2 = ob.count(matrix2);
		System.out.println(Arrays.toString(result2));
		//[6, 3]
		//[4, 4]
	}
}


