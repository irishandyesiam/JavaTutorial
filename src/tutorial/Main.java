package tutorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a number: ");
		int x = sc.nextInt();
		
		while (x != 10) {
			System.out.println("Type 10...");
			System.out.print("Type a number: ");
			x = sc.nextInt();
		}
	}

}
