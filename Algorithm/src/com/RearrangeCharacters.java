package com;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*class KeyComparator implements Comparator<Key> { 

    // Overriding compare()method of Comparator 
    public int compare(Key k1, Key k2) 
    { 
           if (k1.freq < k2.freq) 
               return 1; 
           else if (k1.freq > k2.freq) 
               return -1; 
           return 0; 
    } 
} 

class Key { 
    int freq; // store frequency of character 
    char ch; 
    Key(int val, char c)  
    { 
        freq = val;  
        ch = c; 
    } 
} 

public class RearrangeCharacters { 
    static int MAX_CHAR = 26;  

    // Function to rearrange character of a string 
    // so that no char repeat twice 
    static void rearrangeString(String str) 
    { 
           int n = str.length(); 

           // Store frequencies of all characters in string 
           int[] count = new int[MAX_CHAR]; 

           for (int i = 0; i < n; i++) 
                count[str.charAt(i) - 'a']++; 

            // Insert all characters with their frequencies 
            // into a priority_queue  
            PriorityQueue<Key> pq = new PriorityQueue<>(new 
                                                        KeyComparator()); 
            for (char c = 'a'; c <= 'z'; c++) { 
                 int val = c - 'a'; 
                 if (count[val] > 0) 
                     pq.add(new Key(count[val], c)); 
            } 

            // 'str' that will store resultant value 
            str = "" ; 

            // work as the previous visited element 
            // initial previous element be. ( '#' and 
            // it's frequency '-1' ) 
            Key prev = new Key(-1, '#'); 

            // traverse queue 
            while (pq.size() != 0) { 

                   // pop top element from queue and add it 
                   // to string. 
                   Key k = pq.peek(); 
                   pq.poll(); 
                   str = str + k.ch; 

                   // If frequency of previous character is less 
                   // than zero that means it is useless, we 
                   // need not to push it  
                   if (prev.freq > 0) 
                       pq.add(prev); 

                   // make current character as the previous 'char' 
                   // decrease frequency by 'one' 
                   (k.freq)--; 
                    prev = k; 
            } 

            // If length of the resultant string and original 
            // string is not same then string is not valid 
            if (n != str.length()) 
                System.out.println("Not possible"); 
            else
                System.out.println(str); 
    } */


//My solution
/*public static void rearrangeString(String s) {
	Map<Character,Integer> map = new HashMap<>();
	for(int i = 0; i<s.length(); i++) {
		if(map.containsKey(s.charAt(i))) {
			map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
		}
		else {
			map.put(s.charAt(i), 1);
		}
	}
	PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue() - a.getValue());
	pq.addAll(map.entrySet());
	Map.Entry<Character, Integer> pre = null;
	String result = "";
	while(!pq.isEmpty()) {
		Map.Entry<Character, Integer> m = pq.poll();
		result = result+m.getKey();
		if(pre!=null && pre.getValue()>0) {
			pq.add(pre);
		}
		m.setValue(m.getValue() - 1);
		pre = m;
	}
	if(result.length() != s.length()) {
		System.out.println("not possible");
	}
	else {
		System.out.println(result);
	}
}*/



public class RearrangeCharacters { 
	////https://leetcode.com/problems/reorganize-string/
	//rearrangeString
	public static void rearrangeString(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue() - a.getValue());
		pq.addAll(map.entrySet());
		Map.Entry<Character, Integer> pre = null;
		String result = "";
		while(!pq.isEmpty()) {
			Map.Entry<Character, Integer> m = pq.poll();
			result = result + m.getKey();
			if(pre!=null && pre.getValue()>0) {
				pq.add(pre);
			}
			m.setValue(m.getValue() - 1);
			pre = m;
		}
		if(result.length() == s.length()) {
			System.out.println(result);
		}
		else {
			System.out.println("no solution");
		}
	}
	//https://leetcode.com/problems/reorganize-string/
	// Driver program to test above function  
	public static void main(String args[]) 
	{ 
		rearrangeString("aaabc");
		rearrangeString("aaabbc");
		rearrangeString("aa");
		rearrangeString("aaaabc");
		//acaba
		//abacba
		//Not possible
		//Not possible
	} 
} 