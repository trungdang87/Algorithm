package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/reconstruct-itinerary/
public class ReconstructItinerary {
/*	public List<String> findItinerary(List<List<String>> tickets) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (List<String> l : tickets) {
			if (map.containsKey(l.get(0)))
				map.get(l.get(0)).add(l.get(1));
			else {
				List<String> des = new ArrayList<String>();
				des.add(l.get(1));
				map.put(l.get(0), des);
			}
		}
		for (List<String> l : map.values())
			Collections.sort(l);
		List<String> res = new ArrayList<String>();
		dfs("JFK", map, res);
		Collections.reverse(res);
		return res;
	}
	private void dfs(String string, Map<String, List<String>> map, List<String> res) {
        if(map.get(string)== null) {res.add(string);return ;}
		Iterator<String> ite = map.get(string).iterator();
		while (ite.hasNext()) {
            String des = ite.next();
            ite.remove();
            dfs(des,map,res);

		}
		res.add(string);
	}*/
	
	public List<String> findItinerary(List<List<String>> tickets){
		return findItinerary(tickets, "JFK");
	}
	public List<String> findItinerary(List<List<String>> tickets, String from){
		Map<String, List<String>> map = new HashMap<>();
		for(List<String> l : tickets) {
			List<String> destinations = map.getOrDefault(l.get(0), new ArrayList<>());
			destinations.add(l.get(1));
			map.put(l.get(0), destinations);
		}
        for(List<String> l : map.values()){
            Collections.sort(l);
        }
		List<String> result = new ArrayList<>();
		dfs(map, result, from);
        Collections.reverse(result);
        return result;
	}
    public void dfs(Map<String, List<String>> map, List<String> result, String from){
        if(map.get(from)==null){
            result.add(from);
            return;
        }
        Iterator<String> i = map.get(from).iterator();
        while(i.hasNext()){
            String destination = i.next();
            i.remove();
            dfs(map, result, destination);
        }
        result.add(from);
    }
    
	
	
	public static void main(String[] args) {
		//[JFK, MUC, LHR, SFO, SJC]
		//[JFK, ATL, JFK, SFO, ATL, SFO]
		ReconstructItinerary ob = new ReconstructItinerary();
		List<List<String>> list1 = new ArrayList();
		List<String> list11 = new ArrayList();
		list11.add("MUC"); list11.add("LHR");
		list1.add(list11);
		list11 = new ArrayList();
		list11.add("JFK"); list11.add("MUC");
		list1.add(list11);
		list11 = new ArrayList();
		list11.add("SFO"); list11.add("SJC");
		list1.add(list11);
		list11 = new ArrayList();
		list11.add("LHR"); list11.add("SFO");
		list1.add(list11);
		List<String> result = ob.findItinerary(list1, "JFK");
		System.out.println(result.toString()); //[JFK, MUC, LHR, SFO, SJC]
		
		List<List<String>> list2 = new ArrayList();
		List<String> list22 = new ArrayList();
		list22.add("JFK"); list22.add("SFO"); 
		list2.add(list22);
		list22 = new ArrayList();
		list22.add("JFK"); list22.add("ATL"); 
		list2.add(list22);
		list22 = new ArrayList();
		list22.add("SFO"); list22.add("ATL"); 
		list2.add(list22);
		list22 = new ArrayList();
		list22.add("ATL"); list22.add("JFK"); 
		list2.add(list22);
		list22 = new ArrayList();
		list22.add("ATL"); list22.add("SFO"); 
		list2.add(list22);
		List<String> result2 = ob.findItinerary(list2, "JFK");
		System.out.println(result2.toString()); //[JFK, ATL, JFK, SFO, ATL, SFO]
		
		List<List<String>> list3 = new ArrayList();
		List<String> list33 = new ArrayList();
		list33.add("A"); list33.add("B"); 
		list3.add(list33);
		list33 = new ArrayList();
		list33.add("B"); list33.add("C"); 
		list3.add(list33);
		
		List<String> result3 = ob.findItinerary(list3, "A");
		System.out.println(result3.toString()); //[A, B, C]
		
		
		
	}
	
	
}
