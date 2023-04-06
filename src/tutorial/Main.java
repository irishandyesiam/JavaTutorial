package tutorial;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object Orientated Programming
		Scanner sc = new Scanner(System.in);
		//sc.next();
		int x = 5;
		String h = "hello";
		h.length();
		
		//Calling method with argument
		tim("TIMMM!", 4);
	}
	
	// This is called a 'method' otherwise known as 'function'. Parameters. 
	public static void tim(String str, int x) {
		for (int i = 0; i < x; i++) {
		System.out.println(str);
		}
	}
}
