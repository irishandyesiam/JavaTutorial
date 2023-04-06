package tutorial;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// key, value
		Map m = new HashMap();
		m.put("tim", 5);
		m.put("joe", "x");
		m.put(11, 999);
		//overwrite m.put(11, 998);
		
		System.out.println(m);
		System.out.println(m.get(11));
	}
	
}
