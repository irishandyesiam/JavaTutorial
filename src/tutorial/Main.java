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
		Student bill = new Student("Joe");
		Student tim = new Student("Tim");
		
		System.out.println(joe.equals(bill));
		System.out.println(tim.equals(bill));
	}
	
	
}
