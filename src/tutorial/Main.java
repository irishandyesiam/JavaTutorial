package tutorial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,7,3,4,5};
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i =0;i < names.length; i++) {
			System.out.println("input: ");
			String input = sc.nextLine();
			names[i] = input;
		}
		
		for (String n:names) {
			System.out.println(n);
			if(n.equals("tim")) {
				break;
			}
		}
	}

}
