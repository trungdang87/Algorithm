package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;



public class ZZZZ {
	int cur = Integer.MAX_VALUE;
    int min = Integer.MAX_VALUE;
    //this works but "time limit exceeded"
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add(beginWord);
        wordList.remove(beginWord);
        System.out.println(wordList.toString() + "@@@@@@@@@@");
        helper(beginWord, endWord,list, wordList, result);

        List<List<String>> result2 = new ArrayList<>();
        
        System.out.println("WTFWTF " + result.toString());
        System.out.println("MIN MIN " + min);
        for(List<String> l : result){
            if(min== Integer.MAX_VALUE || l.size() == min){
                result2.add(new ArrayList<>(l));
            }
        }
        
        
        return result2;
    }
    public void helper(String b, String e, List<String> list, List<String> wordList, List<List<String>> result){
        if(list.get(list.size() - 1).equals(e)){
        	System.out.println("RRRRRRRR " + list.toString());
            cur = list.size();
            System.out.println("RRRRRRRR " + result.toString());
            if(!result.isEmpty() && result.get(result.size() - 1).size() > cur){
                min = Math.min(cur, result.get(result.size() - 1).size());
                result.add(new ArrayList<>(list));
                return;
            }
            result.add(new ArrayList<>(list));
            System.out.println("RRRRRRRR " + result.toString());
            return;
        }
        
        for(String s : wordList){
            if(isSafe(list.get(list.size() - 1), s)){
            	System.out.println(list.toString());
                List<String> remainWords = new ArrayList<>(wordList);
                remainWords.remove(s);
                list.add(s);
                helper(s, e, list, remainWords, result);
                
                list.remove(list.size() - 1);
            }
            
        }
    }
    public boolean isSafe(String a, String b){
        int count = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == b.charAt(i)) continue;
            count++;
        }
        return count==1;
    }

	public static void main(String args[]){  
		ZZZZ ob = new ZZZZ();
		List<String> wordList = new ArrayList<>();
		wordList.add("hot");
		wordList.add("dog");
		wordList.add("dot");
		List<List<String>> result = ob.findLadders("hot", "dog", wordList);
		for(List<String> l : result) {
			System.out.println(l.toString());
		}
		
	}

}
