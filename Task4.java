package guvi.task9;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		
	

		
		       
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter the number of rows: ");
		        int numRows = scanner.nextInt();

		       
		        
		        for (int i = 1; i <= numRows; i++) {
		            // Print leading spaces
		            for (int j = 1; j < i; j++) {
		                System.out.print(" ");
		            }

		            
		            System.out.print("*");

		            
		            for (int k = 1; k < 2 * (numRows - i); k++) {
		                System.out.print(" ");
		            }

		            
		            if (i > 1 && i < numRows) {
		                System.out.print("*");
		            }

		            
		            System.out.println();
		        }
		    }
		}
	