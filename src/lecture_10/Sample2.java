package lecture_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sample2 {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		ArrayList<Integer> la = new ArrayList<>();
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(123);
		hs.contains(123);
		
		TreeSet<Integer> ts = new TreeSet<>();
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		Map<String, Integer> m = new TreeMap<>();
		m.put("aba", 1);
		m.put("ttt", 45);
		System.out.println(m.get("aba"));
		m.containsKey("aba");
		//m.remove("aba");
		Set<String> s = m.keySet();
		for(String key : s)
			System.out.println(key + " " + m.get(key));
		Set<Entry<String, Integer>> sa = m.entrySet();
		for(Entry<String, Integer> e : sa) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
	}
}
