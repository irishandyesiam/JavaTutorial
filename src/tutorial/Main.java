package tutorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if (s.equals("tim")) {
			System.out.println("You typed tim");
		}
		else if (s.equals("hello")) {
			System.out.println("Hi!");
		}
		else {
			System.out.println("Print");
		}
		
		
	}

}
