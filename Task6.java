package guvi.task9;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		        
		        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Month: ");
                System.out.println("Enter the Rent per day: ");
                System.out.println("Enter the Month: ");
                int month=sc.nextInt();
                double rent=sc.nextDouble();
                int days=sc.nextInt();
                
                double totalroomrent=rent*days;
                

		       
		        switch (month) {
		            case 4:
		            case 5:
		            case 6:
		            case 11:
		            case 12:
		                
		            	totalroomrent=totalroomrent*1.20;
		            	
		                break;
		           
		        }

		        System.out.println(totalroomrent);
		     

		        
		      		    }
		}

