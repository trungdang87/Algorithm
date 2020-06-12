package com;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {
	/*	public static int search(int[] nums, int target) {
        return searcher(nums,0, nums.length-1,target);
    }
    private static int searcher(int[] a, int left, int right, int target){
        //[4,5,6,7,0,1,2] 0,6,0
        if(left >right)return -1;
        int mid = (left+right)/2;
        if(a[mid]==target)return mid;
        if(a[left]<=a[mid]){
            if(target>=a[left] && target<a[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        else{
             if(target<=a[right] && target>a[mid]){
                 left = mid+1;
            }
            else{ 
                right=mid-1;
            }
        }
        return searcher(a, left, right,target);
    }*/
	//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
	public static int search(int[] arr, int n) {
		return search(arr, 0, arr.length-1, n);
	}
	public static int search(int[] arr, int l, int r, int n) {
		if(l>r) return -1;
		else {
			int m = (l+r)/2;
			if(arr[m] == n) return m;
			if(arr[l] < arr[m]) {
				if(arr[l] <= n && n<arr[m]) {
					r = m-1;
				}
				else l = m+1;
			}
			else {
				if(arr[m] < n && n <= arr[r]) {
					l = m+1;
				}
				else {
					r=m-1;
				}
			}
			return search(arr,l,r,n);
		}
	}
	//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
	public static void main(String[] args) {
		System.out.println(SearchInRotatedSortedArray.search(new int[] {4,5,6,7,0,1,2}, 0));//4
		System.out.println(SearchInRotatedSortedArray.search(new int[] {4,5,6,7,0,1,2}, 3));//-1
	}


}
