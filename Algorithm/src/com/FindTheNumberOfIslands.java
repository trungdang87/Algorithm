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
	public  int[] count(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int[] result = new int[2];
		int[] count = new int[1];
		boolean[][] visited = new boolean[row][col];
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				if(isSafe(matrix, r, c, row, col, visited)) {
					count[0] = 0;
					result[0]++;
					dfs(matrix, r, c, row, col, visited,count);
					result[1] = Math.max(result[1], count[0]);
				}
			}
		}
		return result;
	}
	public void dfs(int[][] matrix, int r, int c, int row, int col, boolean[][] visited, int[] count) {
		count[0]++;
		visited[r][c] = true;
		int[] rows = {0,-1,1,0};
		int[] cols = {-1,0,0,1};
		for(int i=0; i<4; i++) {
			if(isSafe(matrix, r+rows[i], c+cols[i], row, col, visited)) {
				dfs(matrix, r+rows[i], c+cols[i], row, col, visited, count);
			}
		}
	}
	public boolean isSafe(int[][] matrix, int r, int c, int row, int col, boolean[][]visited) {
		return r>=0 && r<row && c>=0 && c<col && !visited[r][c] && matrix[r][c]==1;
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


