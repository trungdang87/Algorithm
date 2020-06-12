package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Java program to convert binary tree into its mirror 

/* Class containing left and right child of current 
Node3 and key value*/

//https://www.geeksforgeeks.org/write-an-efficient-c-function-to-convert-a-tree-into-its-mirror-tree/

/*
			1
		  /	  \
		3		2
			  /	  \
			5		4
 */

/*class Node3{
	int data;
	Node3 left;
	Node3 right;
	Node3(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}*/
class Node3{
	int data;
	Node3 left;
	Node3 right;
	Node3(int data){
		this.data = data;
		left = null;
		right=null;
	}
}

public class BinaryTreeMirror
{ 
	Node3 root; 

	void inOrder() 
	{ 
		inOrder(root); 
	} 

	/* Helper function to test mirror(). Given a binary 
    search tree, print out its data elements in 
    increasing sorted order.*/
	/*	void inOrder(Node3 Node3) 
	{ 
		if (Node3 == null) 
			return; 
		inOrder(Node3.left); 
		System.out.print(Node3.data + " "); 
		inOrder(Node3.right); 
	} */
	public void inOrder(Node3 root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	//https://www.geeksforgeeks.org/print-ancestors-of-a-given-node-in-binary-tree/
	/* If target is present in tree, then prints the ancestors 
    and returns true, otherwise returns false. */
	/*	boolean printAncestors(Node3 node, int target)  
	{ 
		 base cases 
		if (node == null) 
			return false; 

		if (node.data == target) 
			return true; 
		 If target is present in either left or right subtree  
        of this node, then print this node 
		if (printAncestors(node.left, target) 
				|| printAncestors(node.right, target))  
		{ 
			System.out.print(node.data + " "); 
			return true; 
		} 
		 Else return false 
		return false; 
	}*/ 
	public boolean printAncestors(Node3 root, int n) {
		if(root==null) return false;
		if(root.data == n) return true;
		if(printAncestors(root.left, n) || printAncestors(root.right, n)) {
			System.out.print( root.data + " ");
			return true;
		}
		return false;
	}

	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	//Convert array to binary tree										//	{ 1, 2, 3, 4, 5, 6, 6, 6, 6,6 };
	// Function to insert nodes in level order 							//				 1
	/*    public Node3 insertLevelOrder(int[] arr, Node3 root, int i) 	//			   /   \
    { 																	//           2      3
        // Base case for recursion 										//          /  \    / \
        if (i < arr.length) { 											//         4    5  6   6
            Node3 temp = new Node3(arr[i]); 							//        / \   /
            root = temp; 												//	     6   6 6
            // insert left child 										//	
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1); 	//
            // insert right child 										//
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2); 	//
        } 
        return root; 
    } */
	//Convert array to binary tree insertLevelOrder
	public Node3 insertLevelOrder(int[] arr, Node3 root, int i ) {
		if(i<arr.length) {
			root = new Node3(arr[i]);
			root.left = insertLevelOrder(arr, root.left, i*2+1);
			root.right = insertLevelOrder(arr, root.right, i*2+2);
		}
		return root;
	}
	
	
	//insert an element in level order binary tree //BFS technque
	//1 
	//2 3 
	//4 9 5 
	//7 
/*	public Node3 insertLevelOrder(Node3 root, int data) {
		if(root == null) {
			root = new Node3(data);
			return root;
		}
		Queue<Node3> nodesToProcess = new LinkedList<>();
	     nodesToProcess.add(root);
	     while (true) {
	         Node3 actualNode = nodesToProcess.poll();
	         // Left child has precedence over right one
	         if (actualNode.left == null) {
	             actualNode.left = new Node3(data);
	             break;
	         }
	         if (actualNode.right == null) {
	             actualNode.right = new Node3(data);
	             break;
	         }
	         // I have both children set, I will process them later if needed
	         nodesToProcess.add(actualNode.left);
	         nodesToProcess.add(actualNode.right);
	     }
	     return root;
	}*/
	//insertLevelOrder
	public Node3 insertLevelOrder(Node3 root, int n) {
		if(root==null) {
			root = new Node3(n);
			return root;
		}
		Queue<Node3> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node3 node = queue.poll();
			if(node.left==null) {
				node.left = new Node3(n);
				break;
			}
			if(node.right==null) {
				node.right = new Node3(n);
				break;
			}
			queue.add(node.left);
			queue.add(node.right);
		}
		return root;
		
	}

	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	// This method mainly calls insertRec() 
	/*    void insertBST(int key) { 
       root = insertBSTUtil(root, key); 
    } 

    // A recursive function to insert a new key in BST 
    Node3 insertBSTUtil(Node3 root, int key) { 
        // If the tree is empty, return a new node 
        if (root == null) { 
            root = new Node3(key); 
            return root; 
        } 
        // Otherwise, recur down the tree //
        if (key < root.data) 
            root.left = insertBSTUtil(root.left, key); 
        else if (key > root.data) 
            root.right = insertBSTUtil(root.right, key); 
        // return the (unchanged) node pointer 
        return root; 
    } 
	 */	
	//insertBST(Node3 root, int key)
	public void insertBST(Node3 root, int key) {
		this.root = insertBSTUtil(root, key);
	}
	public Node3 insertBSTUtil(Node3 root, int key) {
		if(root==null) {
			root = new Node3(key);
			return root;
		}
		if(key < root.data) {
			root.left = insertBSTUtil(root.left, key);
		}
		else if(key > root.data) {
			root.right = insertBSTUtil(root.right, key);
		}
		return root;
	}

	//https://leetcode.com/problems/kth-smallest-element-in-a-bst/	
	/*	  public int kthSmallestBST(Node3 root, int k) {
		    ArrayList<Integer> nums = inorderBST(root, new ArrayList<Integer>());
		    return nums.get(k - 1);
		  }

    public ArrayList<Integer> inorderBST(Node3 root, ArrayList<Integer> arr) {		//			3
	    if (root == null) return arr;												//		   /  \
	    inorderBST(root.left, arr);													//		  2    4
	    arr.add(root.data);															//		 /  
	    inorderBST(root.right, arr);												//		1	
	    return arr;
	  }*/
	public int kthSmallestBST(Node3 root, int k) {
		List<Integer> list = new ArrayList<>();
		kthSmallestBST(root, list);
		return list.get(k-1);
	}
	public void kthSmallestBST(Node3 root, List<Integer> list) {
		if(root==null) return;
		kthSmallestBST(root.left, list);
		list.add(root.data);
		kthSmallestBST(root.right, list);
	}


	//https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
	// A utility function to search a given key in BST 
	/*	  public Node3 searchBST(Node3 root, int key) 
	  { 
	      // Base Cases: root is null or key is present at root 
	      if (root==null || root.data==key) 
	          return root; 

	      // val is greater than root's key 
	      if (root.data > key) 
	          return searchBST(root.left, key); 

	      // val is less than root's key 
	      return searchBST(root.right, key); 
	  } */
	//https://leetcode.com/problems/search-in-a-binary-search-tree/
	public Node3 searchBST(Node3 root, int n) {
		if(root==null) return root;
		if(root.data==n) return root;
		if(n < root.data) return searchBST(root.left, n);
		return searchBST(root.right, n);
	}

	/*	
	//IS BINARY SEARCH TREE?????
	public boolean isBST()  { 
        return isBSTUtil(root, Integer.MIN_VALUE, 
                               Integer.MAX_VALUE); 
    } 
     Returns true if the given tree is a BST and its 
      values are >= min and <= max. 
    public boolean isBSTUtil(Node3 node, int min, int max) 
    { 
         an empty tree is BST 
        if (node == null) 
            return true; 

         false if this node violates the min/max constraints 
        if (node.data <= min || node.data => max) 
            return false; 

         otherwise check the subtrees recursively 
        tightening the min/max constraints 
        // Allow only distinct values 
        return (isBSTUtil(node.left, min, node.data-1) && 
                isBSTUtil(node.right, node.data+1, max)); 
    } 
	 */	
	//https://leetcode.com/problems/validate-binary-search-tree/
	//leetcode solution is a little different because of the problem rules???
	public boolean isBST(Node3 root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean isBST(Node3 root, int min, int max) {
		if(root==null) return true;
		if(root.data <= min || root.data >= max) return false;
		return isBST(root.left, min, root.data ) && isBST(root.right, root.data, max);
	}


	//https://www.geeksforgeeks.org/level-order-tree-traversal/
	//read above for recursion solution
	/*void printLevelOrder() 
	{ 
		int h = height(root); 
		int i; 
		for (i=1; i<=h; i++) {
			printGivenLevel(root, i); 
			System.out.println();
		}
	} 
	int height(Node3 root) 
	{ 
		if (root == null) 
			return 0; 
		else
		{ 
			 compute  height of each subtree 
			int lheight = height(root.left); 
			int rheight = height(root.right); 

			 use the larger one 
			return Math.max(lheight, rheight) + 1;
		} 
	} 
	void printGivenLevel (Node3 root ,int level) 
	{ 
		if (root == null) 
			return; 
		if (level == 1) {
			System.out.print(root.data + " "); 
		}
		else if (level > 1) 
		{ 
			printGivenLevel(root.left, level-1); 
			printGivenLevel(root.right, level-1); 
		} 
	} */
	//printLevelOrder()
	public void printLevelOrder(Node3 root) {
		int height = height(root);
		for(int i=1; i<=height; i++) {
			printLevelOrder(root, i);
			System.out.println();
		}
	}
	public void printLevelOrder(Node3 root, int level) {
		if(root==null) return;
		if(level==1) {
			System.out.print(root.data + " ");
		}
		if(level>1) {
			printLevelOrder(root.left, level - 1);
			printLevelOrder(root.right, level - 1);
		}
	}
	public int height (Node3 root) {
		if(root==null) return 0;
		int left = height(root.left);
		int right = height(root.right);
		return Math.max(left, right) + 1;
	}
    
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    
    //https://massivealgorithms.blogspot.com/2019/02/leetcode776-split-bst.html	
    //https://stackoverflow.com/questions/43752944/split-a-binary-search-tree
/*    	public ArrayList<Node3> splitBST(Node3 root, int v){
    		ArrayList<Node3> list = new ArrayList<>();
    		list.add(null); list.add(null);
    		if(root==null) return list;
    		if(root.data <= v) {
    			list = splitBST(root.right, v);
    			root.right = list.get(0);
    			list.set(0, root);
    		}
    		else {
    			list = splitBST(root.left, v);
    			root.left = list.get(1);
    			list.set(1, root);
    		}
    		return list;    		
    	}*/
    //splitBST (think of 1->3 and v=2)
	public List<Node3> splitBST(Node3 root, int v){
		List<Node3> result = new ArrayList<>();
		result.add(null);
		result.add(null);
		if(root==null) return result;
		if(root.data<=v) {
			result = splitBST(root.right, v);
			root.right = result.get(0);
			result.set(0, root);
		}
		else {
			result = splitBST(root.left, v);
			root.left = result.get(1);
			result.set(1, root);
		}
		return result;
	}
	
	//http://tiancao.me/Leetcode-Unlocked/LeetCode%20Locked/c1.30.html
	//https://yeqiuquan.blogspot.com/2017/06/298-binary-tree-longest-consecutive.html
/*	int longestConsecutive = 1;
    public int longestConsecutive(Node3 root) {
        if (root == null) {
            return 0;
        }
        longestConsecutive(root, 0, root.data);
        return longestConsecutive;
    }
    public void longestConsecutive(Node3 root, int curr, int target) {
        if (root == null) {
            return;
        }
        if (root.data == target) {
            curr++;
        }
        else {
            curr = 1;
        }
        longestConsecutive = Math.max(longestConsecutive, curr);
        longestConsecutive(root.left, curr, root.data + 1);
        longestConsecutive(root.right, curr, root.data + 1);
    }*/
	//longestConsecutive
	int result = 0;
	public int longestConsecutive(Node3 root) {
		if(root==null) return 0;
		longestConsecutive(root, 0, root.data);
		return result;
	}
	public void longestConsecutive(Node3 root, int curConsecutive, int target) {
		if(root==null) return;
		if(root.data==target) {
			curConsecutive++;
		}
		else {
			curConsecutive=1;
		}
		result = Math.max(result,  curConsecutive);
		longestConsecutive(root.left, curConsecutive, root.data + 1);
		longestConsecutive(root.right, curConsecutive, root.data + 1);
	}

	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	public static void main(String args[]) 
	{ 
		/* creating a binary tree and entering the Node3s */
		BinaryTreeMirror tree = new BinaryTreeMirror(); 
		tree.root = new Node3(1); 
		tree.root.left = new Node3(2); 
		tree.root.right = new Node3(3); 
		tree.root.left.left = new Node3(4); 
		tree.root.left.right = new Node3(5); 

		/* print inorder traversal of the input tree */
		System.out.println("Inorder traversal of input tree is :"); 
		tree.inOrder(); 
		System.out.println(""); //4 2 5 1 3 

		System.out.println();
		System.out.println("Ancestor nodes of 4 are ");
		tree.printAncestors(tree.root, 4); //2 1


		System.out.println();
		System.out.println("Ancestor nodes of 5 are ");
		tree.printAncestors(tree.root, 5); //2 1
		System.out.println();

		System.out.println("Convert array to binary tree");
		int[] arrToTree = { 1, 2, 3, 4, 5, 6, 6, 6, 6,6 };
		tree.root = tree.insertLevelOrder(arrToTree, tree.root, 0);
		tree.inOrder();

		System.out.println();
		System.out.println();
		System.out.println("Add an element in level order into binary tree (9) ");
		BinaryTreeMirror tree1 = new BinaryTreeMirror();
		tree1.root = new Node3(1);
		tree1.root.left = new Node3(2); 
		tree1.root.right = new Node3(3); 
		tree1.root.left.left = new Node3(4); 
		tree1.root.right.left = new Node3(5);
		tree1.root.left.left.left = new Node3(7);
		tree1.insertLevelOrder(tree1.root, 9);
		tree1.printLevelOrder(tree1.root);
		
		System.out.println();
		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Binary Search Tree");
		
		//BINARY SEARCH TREE
		BinaryTreeMirror BSTree = new BinaryTreeMirror();
		BSTree.insertBST(BSTree.root, 3);
		BSTree.insertBST(BSTree.root,2);
		BSTree.insertBST(BSTree.root,4);
		BSTree.insertBST(BSTree.root,1);
		System.out.println("Binary Search Tree inorder: ");
		BSTree.inOrder();
		System.out.println();
		System.out.println("Kth smallest element in Binary Search Tree");
		System.out.println("1st smallest element is: " +BSTree.kthSmallestBST(BSTree.root, 1));
		System.out.println("2nd smallest element is: " +BSTree.kthSmallestBST(BSTree.root, 2));
		System.out.println("3rd smallest element is: " +BSTree.kthSmallestBST(BSTree.root, 3));
		System.out.println("4th smallest element is: " +BSTree.kthSmallestBST(BSTree.root, 4));
		System.out.println();
		System.out.println("Search for element in BST (2):");
		System.out.println(BSTree.searchBST(BSTree.root, 2).data);
		System.out.println();
		System.out.println("Is binary search tree? (false) : " + tree.isBST(tree.root));
		System.out.println("Is binary search tree? (true) : " + BSTree.isBST(BSTree.root));
		System.out.println("print tree each level: ");
		tree.printLevelOrder(tree.root);
		
		//splitBST
		System.out.println();
		BinaryTreeMirror BSTree2 = new BinaryTreeMirror();
		BSTree2.insertBST(BSTree2.root,5);       //		5					2				5
		BSTree2.insertBST(BSTree2.root,2);		//	  /   \				   /			   /  \
		BSTree2.insertBST(BSTree2.root,7);		//	 2      7			  1				  4	   7
		BSTree2.insertBST(BSTree2.root,1);		//	/ \    / \								  / \
		BSTree2.insertBST(BSTree2.root,4);		// 1   4  6   8								 6   8
		BSTree2.insertBST(BSTree2.root,6);
		BSTree2.insertBST(BSTree2.root,8);
		System.out.println("splitBST at (3)");
		List<Node3> splitList = BSTree2.splitBST(BSTree2.root, 3);//change int to test, 2 or 3 are same
		System.out.println("First tree:");
		BSTree2.printLevelOrder(splitList.get(0));
		System.out.println("Second tree:");
		BSTree2.printLevelOrder(splitList.get(1));
		
		//longestConsecutive
		System.out.println("longestConsecutive (2) because we have 7->8");
		System.out.println(BSTree2.longestConsecutive(BSTree2.root));

	} 
} 



