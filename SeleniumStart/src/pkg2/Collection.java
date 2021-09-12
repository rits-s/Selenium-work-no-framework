package pkg2;

import java.util.*;

public class Collection {
	public static void main(String[] args) {
		/*HashSet <Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(14);
		hs.add(16);
		hs.add(12);
		
		for(Integer i:hs) {
			System.out.println(i); //output random
		}*/
		
		/*LinkedHashSet <Integer> ls = new LinkedHashSet<>();
		ls.add(12);
		ls.add(11);
		ls.add(16);
		ls.add(12);
		
		for(Integer i:ls) {
			System.out.println(i); //output in sequence
	}
}*/
			
		/*TreeSet <Integer> ts = new TreeSet<>();
		ts.add(12);
		ts.add(11);
		ts.add(16);
		ts.add(12);
		
		for(Integer i:ts) {
			System.out.println(i); //output in ascending order
	}*/
				
	/*	ArrayList <Integer> al = new ArrayList<>();
		al.add(12);
		al.add(11);
		al.add(16);
		al.add(12);
		
		for(Integer i:al) {
			System.out.println(i); //output in sequence
	}*/
		
		
		/*LinkedList <Integer> ls = new LinkedList<>();
		ls.add(12);
		ls.add(11);
		ls.add(16);
		ls.add(12);
		
		for(Integer i:ls) {
			System.out.println(i); //output in sequence
	}*/
		
		/*HashMap <Integer, String> hm = new HashMap<>();
		hm.put(12,"A");
		hm.put(14, "C");
		hm.put(16,"B");
		hm.put(12, "A");
		hm.put(15, "A");
		
		Set<Integer> allKeys = hm.keySet();
		for(Integer i:allKeys) {
			System.out.println(i + hm.get(i)); //output random, no duplicate keys, duplicate values accepted
		}*/	
		
		/*LinkedHashMap <Integer, String>lm = new LinkedHashMap<>();
		lm.put(12, "a");
		lm.put(14, "b");
		lm.put(16, "c");
		lm.put(12, "a");
		lm.put(15, "a");
		
		Set<Integer>allKey = lm.keySet();
		for(Integer i:allKey) {
			System.out.println(i+lm.get(i));
		}*/
		
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("A", 12);
		tm.put("B", 14);
		tm.put("C", 16);
		tm.put("A", 12);
		tm.put("A", 15);
		
		Set<String> allKeiys = tm.keySet();
		for(String i:allKeiys) {
			System.out.println(i+ tm.get(i));
		}
		
		
		
		
		
		
		
}
}
