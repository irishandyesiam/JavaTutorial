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
		// LinkedHashMap - keeps order of keys as elements are added
		Map m = new LinkedHashMap();
		m.put("tim", 5);
		m.put("joe", "x");
		m.put("11", 999);
		
		System.out.println(m);
	
	}
	
}
