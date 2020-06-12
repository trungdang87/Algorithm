package com;

public class DFSFindLongestLink {

	//int count;
	//int max;
	/*public int solution(int[] A) {
    	count = 0;
    	max = 0;
        int n = A.length;
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(!visited[i]){
            	count = 0;
                DFS(visited, A,i);
            }
        }
        return max;
    }*/
	/*public void DFS(boolean[] visited, int[] A, int i){
        visited[i] = true;
        count++;
        max = Math.max(max, count);
        if(!visited[A[i]]) {
        	DFS(visited, A, A[i]);
        }
    }*/
	public int solution(int[] arr) {
		int max = 0;
		int[] count = new int[1];
		boolean[] visited = new boolean[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(!visited[i]) {
				count[0] = 0;
				dfs(arr, i, visited, count);
				max = Math.max(max, count[0]);
			}
		}
		return max;
	}
	public void dfs(int[] arr, int i, boolean[] visited, int[] count) {
		count[0]++;
		visited[i] = true;
		if(!visited[arr[i]]) {
			dfs(arr, arr[i], visited, count);
		}
	}


	public static void main(String[] args) {

		int[] a = {5,4,0,3,1,6,2};
		//0-5, 1-4, 2-0, 3-3, 4-1, 5-6, 6-2
		int[] b = {1,2,0,3,4,5,6};
		//0-1, 1-2, 2-0, 3-3, 4-4, 5-5, 6-6
		DFSFindLongestLink ob = new DFSFindLongestLink();
		System.out.println(ob.solution(a)); //4
		System.out.println(ob.solution(b)); //3

	}

}
