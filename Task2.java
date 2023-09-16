package guvi.task9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String inputString = sc.nextLine();
		
		StringBuilder reversedString = new StringBuilder();
		
		for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString.append(inputString.charAt(i));
        }
		String result = reversedString.toString();
        System.out.println("Reversed string: " + result);
		
		
		
		
		
			
	}

}
