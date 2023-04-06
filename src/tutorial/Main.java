package tutorial;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> t = new ArrayList<Integer>();
		//LinkedList??? Faster at certain opperations.
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		t.get(0);
		t.set(1, 5);
		//t.size();
		//t.Empty();
		t.subList(1, 4);
		
		System.out.println(t.subList(1, 4));
	}
	
}
