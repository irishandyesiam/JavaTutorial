package tutorial;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an array of characters or string, count all those characters into a map, key=letter How many times does a letter appear?
		Map m = new HashMap();
		m.put("tim", 5);
		m.put("joe", "x");
		m.put("11", 999);
		
		m.containsValue("b");
		m.containsKey(5);
		m.values();
		m.get("tim");
		
		m.clear();
		
		System.out.println(m);
	
	}
	
}
