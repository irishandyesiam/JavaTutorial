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
		Level lvl = Level.HIGH;
		//To convert to string example: String en = lvl.toString();
		//									System.out.println(en);
		
		//Create an arr to hold ALL values of Enum and display
		Level[] arr = Level.values();
		for (Level e : arr) {
			System.out.println(e);
		}
		//System.out.println(Level.values());  This will print out the RAM address
		
		//check what value constant is
		if (lvl == Level.LOW) {
			System.out.println(lvl);
		}else if (lvl == Level.MEDIUM) {
			System.out.println(lvl);
		}else {
			System.out.println(lvl);
		}
	}
	
	
}
