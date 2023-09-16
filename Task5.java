package guvi.task9;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		
		       
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter the marks: ");
		        int marks = scanner.nextInt();

		       
		        if (marks > 100) {
		            System.out.println("Invalid Input");
		        } else {
		           
		            char grade;
		            if (marks >= 90) {
		                grade = 'A';
		            } else if (marks >= 80) {
		                grade = 'B';
		            } else if (marks >= 70) {
		                grade = 'C';
		            } else if (marks >= 60) {
		                grade = 'D';
		            } else if (marks >= 50) {
		                grade = 'E';
		            } else {
		                grade = 'F';
		            }

		            
		            System.out.println("Grade: " + grade);
		        }

		       
		        scanner.close();
		    }
		}
