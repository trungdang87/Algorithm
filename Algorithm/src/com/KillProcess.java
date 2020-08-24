package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input: 
ppid = [3, 0, 5, 3, 10, 5]
pid =  [1, 3, 10, 5, 11, 12]
kill = 5
Output: [5, 10, 11, 12]
Explanation: 
           3
         /   \
        1     5
             / \
            10  12
           /
          11
Kill 5 will also kill 10.
*/



//https://leetcode.com/articles/kill-process/
public class KillProcess {
/*	
	//tree solution
	class Node {
        int val;
        List < Node > children;
        Node(int val){
        	this.val = val;
        	children = new ArrayList();
        }
    }
    public List < Integer > killProcess(List < Integer > pid, List < Integer > ppid, int kill) {
        HashMap < Integer, Node > map = new HashMap < > ();
        for (int id: pid) {
            Node node = new Node(id);
            map.put(id, node);
        }
        for (int i = 0; i < ppid.size(); i++) {
            if (ppid.get(i) > 0) {
                Node parent = map.get(ppid.get(i));
                parent.children.add(map.get(pid.get(i)));
            }
        }
        List < Integer > l = new ArrayList < > ();
        l.add(kill);
        getAllChildren(map.get(kill), l);
        return l;
    }
    public void getAllChildren(Node pn, List < Integer > l) {
        for (Node n: pn.children) {
            l.add(n.val);
            getAllChildren(n, l);
        }
    }*/
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	/*
	Input: 
	ppid = [3, 0, 5, 3, 10, 5]
	pid =  [1, 3, 10, 5, 11, 12]
	kill = 5
	Output: [5, 10, 11, 12]
	Explanation: 
	           3
	         /   \
	        1     5
	             / \
	            10  12
	           /
	          11
	Kill 5 will also kill 10.
	*/
	class Node{
		int val;
		List<Node> children;
		Node(int val){
			this.val = val;
			children = new ArrayList<>();
		}
	}
	public List<Integer> killProcess(List<Integer> ppid, List<Integer> pid, int kill){
		Map<Integer, Node> map = new HashMap<>();
		for(Integer i : pid) {
			map.put(i, new Node(i));
		}
		map.put(0,  new Node (0));
		for(int i=0; i<ppid.size(); i++) {
			Node parent = map.get(ppid.get(i));
			parent.children.add(map.get(pid.get(i)));
		}
		List<Integer> result = new ArrayList<>();
		result.add(kill);
		getChildren(map.get(kill), result);
		return result;
	}
	public void getChildren(Node killNode, List<Integer> result) {
		for(Node n : killNode.children) {
			result.add(n.val);
			getChildren(n, result);
		}
	}
	
    
    public static void main (String[] args) {
    	List<Integer> ppid = new ArrayList();
    	ppid.add(3);ppid.add(0);ppid.add(5);ppid.add(3);ppid.add(10);ppid.add(5);
    	List<Integer> pid = new ArrayList();
    	pid.add(1);pid.add(3);pid.add(10);pid.add(5);pid.add(11);pid.add(12);
   
    	KillProcess ob = new KillProcess();
    	
    	List<Integer> result1 = ob.killProcess(ppid,pid, 10);
    	System.out.println(result1.toString()); //[10, 11]
    	
    	List<Integer> result = ob.killProcess(ppid,pid, 5);
    	System.out.println(result.toString()); //[5, 10, 11, 12]
    	
    	List<Integer> result3 = ob.killProcess(ppid, pid,  3);
    	System.out.println(result3.toString()); //[3, 1, 5, 10, 11, 12]
    	
    	List<Integer> result2 = ob.killProcess(ppid, pid,  0);
    	System.out.println(result2.toString()); //[0, 3, 1, 5, 10, 11, 12]
    }
    
    
	//HashMap + Depth First Search
/*	public List < Integer > killProcess(List < Integer > pid, List < Integer > ppid, int kill) {
        HashMap < Integer, List < Integer >> map = new HashMap < > ();
        for (int i = 0; i < ppid.size(); i++) {
            if (ppid.get(i) > 0) {
                List < Integer > l = map.getOrDefault(ppid.get(i), new ArrayList < Integer > ());
                l.add(pid.get(i));
                map.put(ppid.get(i), l);
            }
        }
        List < Integer > l = new ArrayList < > ();
        l.add(kill);
        getAllChildren(map, l, kill);
        return l;
    }
    public void getAllChildren(HashMap < Integer, List < Integer >> map, List < Integer > l, int kill) {
        if (map.containsKey(kill))
            for (int id: map.get(kill)) {
                l.add(id);
                getAllChildren(map, l, id);
            }
    }*/
    
    
    
    
    
}
