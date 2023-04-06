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
		Cat jim = new Cat("jim", 18, 100);
		Dog tim = new Dog("tim", 4);
		tim.speak();
		Dog bob = new Dog("bob", 7);
		bob.speak();
		Dog bill = new Dog("bill", 11);
		bill.speak();
		
		jim.speak();
		
		int x = bill.getAge();
		System.out.println(x);
		
		jim.setAge(10);
		jim.speak();
	}
	
}
