package tutorial;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set, HashSet, TreeSet, LinkedHashSet
		
		Set<Integer> t = new TreeSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(9);
		t.add(5);
		t.add(-8);
		t.remove(9);
		t.isEmpty();
		t.clear();
		
		boolean x = t.isEmpty();
		
		System.out.println(t);
	}
	
}
