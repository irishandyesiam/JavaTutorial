package tutorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,7,3,4,5};
		String[] names = new String[5];
		
		int count = 0;
		for (int element:arr) {
			System.out.println(count + " " + element);
			count++;
		}
		
	}

}
