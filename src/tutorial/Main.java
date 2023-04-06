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
		Dog tim = new Dog("tim", 4);
		tim.speak();
		Dog bob = new Dog("bob", 7);
		bob.speak();
		Dog bill = new Dog("bill", 11);
		bill.speak();
		
		tim.speak();
		
		int x = bill.getAge();
		System.out.println(x);
		
		tim.setAge(10);
		tim.speak();
	}
	
}
