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
		Student joe = new Student("Joe");
		Student bill = new Student("Bill");
		Student tim = new Student("Tim");
		Student nick = new Student("Bill");
		
		System.out.println(joe.equals(bill));
		System.out.println(bill.equals(nick));
		System.out.println(tim.equals(bill));
		System.out.println(joe.compareTo(bill));
		System.out.println(joe.compareTo(bill) > 0);
		System.out.println(joe.compareTo(tim));
		System.out.println(joe.compareTo(tim) > 0);
	}
	
	
}
