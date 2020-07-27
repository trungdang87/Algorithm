package com;

//https://leetcode.com/discuss/interview-question/349617

public class SubtreeWithMaxAverage {
	TreeNode root;
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			this.val = val;
			left = null;
			right=null;
		}
	}

	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//Solution from web
/*	class ResultType {
        TreeNode node;
        int sum;
        int size;
        public ResultType(TreeNode node, int sum, int size) {
            this.node = node;
            this.sum = sum;
            this.size = size;
        }
    }
	ResultType result = null;
	public TreeNode findSubtree2(TreeNode root) {
        // Write your code here
        if (root == null) {
            return null;
        }
        
        ResultType rootResult = helper(root);
        return result.node;
    }
	public ResultType helper(TreeNode root) {
        if (root == null) {
            return new ResultType(null, 0, 0);
        }
        ResultType leftResult = helper(root.left);
        ResultType rightResult = helper(root.right);
        
        ResultType currResult = new ResultType(
                    root, 
                    leftResult.sum + rightResult.sum + root.val, 
                    leftResult.size + rightResult.size + 1);
        if (result == null 
            || currResult.sum * result.size > result.sum * currResult.size) {
            result = currResult;
        }
        return currResult;
    }
    	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    //Solution Simplified from above
    class Node{
		TreeNode node;
		int sum;
		int size;
		Node(TreeNode node, int sum, int size){
			this.node = node;
			this.sum = sum;
			this.size = size;
		}
	}
	Node  result;
	public TreeNode solution(TreeNode root) {
		if(root==null) return null;
		helper(root);
		return result.node;
	}
	public Node helper(TreeNode root) {
		if(root==null) return new Node(null, 0, 0);
		Node leftNode = helper(root.left);
		Node rightNode = helper(root.right);
		Node curNode = new Node(root, leftNode.sum + rightNode.sum + root.val, leftNode.size + rightNode.size + 1);
		if(result==null || curNode.sum/curNode.size > result.sum/result.size) result = curNode;
		return curNode;
	} */
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//solution
	
	
	
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public static void main(String[] args) {
		SubtreeWithMaxAverage tree1 = new SubtreeWithMaxAverage();
		tree1.root = new TreeNode(20);
		tree1.root.left = new TreeNode(12);
		tree1.root.right = new TreeNode(18);
		tree1.root.left.left = new TreeNode(5);
		tree1.root.left.right = new TreeNode(3);
		tree1.root.right.left = new TreeNode(5);
		tree1.root.right.right = new TreeNode(8);
		
		System.out.println(tree1.solution(tree1.root).val); //18
	}
	
	
	//EXAMPLE
	/*
	Given an N-ary tree, find the subtree with the maximum average. Return the root of the subtree.
	A subtree of a tree is the node which have at least 1 child plus all its descendants. The average value of a subtree is the sum of its values, divided by the number of nodes.

	Example 1:

	Input:
			 20
		   /   \
		 12     18
	  /    \   / \
	5      3  5    8

	Output: 18
	Explanation:
	There are 3 nodes which have children in this tree:
	12 => (12 + 5 + 3) / 3 = 6.6
	18 => (18 + 5 + 8) / 3 = 10.3
	20 => (12 + 5 + 3 + 18 + 5 + 8 + 20) / 7 = 10.1

	18 has the maximum average so output 18.
	*/

}
