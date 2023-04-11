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
		Level lvl = Level.LOW;
		System.out.println(lvl.getLvl());
		//System.out.println(Level.valueOf("LOW"));
		
		lvl.setLvl(5);
		System.out.println(lvl.getLvl());
	}
	
	
}
