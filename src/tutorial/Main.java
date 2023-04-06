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
		String str = "hello my name is tim and i am cool";
		
		for(char x:str.toCharArray()) {
			if (m.containsKey(x)) {
				int old = (int) m.get(x);
				m.put(x, old+1);
			}
			else {
				m.put(x, 1);
			}
		}
		System.out.println(m);
	}
	
}
