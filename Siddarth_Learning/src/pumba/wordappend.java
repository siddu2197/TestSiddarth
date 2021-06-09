package pumba;

import java.util.Scanner;

public class wordappend {
	public void shop(char no)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
	do {
	
		switch(no)
		{
			case 'I':
		{
			System.out.println("Welcome to INDIGO");
			System.out.println("Flight Details are");
			System.out.println("DEL-MAA");
			System.out.println("Dep: 20:00 || Arr: 22:45");
			System.out.println("Available Classes are  *X    *Y   *Z");
			System.out.println("Press 1 for booking, Press 2 to cancel");
			choice=sc.nextInt();
			if(choice==1)
			{
				getprice();
			}
			else
				System.out.println("Thank You!");
			break;	
		}
		
			case 'V':
		{
			System.out.println("Welcome to Vistara");
			System.out.println("Flight Details are");
			System.out.println("DEL-BOM");
			System.out.println("Dep: 11:25 || Arr: 12:55");
			System.out.println("Available Classes are *Y  *F");
			System.out.println("Press 1 for booking, Press 2 to cancel");
			break;	
		}
			
			case 'G':
		{
			System.out.println("Welcome to GoAir");
			System.out.println("Flight details are");
			System.out.println("DEL-CCU");
			System.out.println("Dep: 04:10 || Arr: 06:00");
			System.out.println("Available classes are *X   *F");
			System.out.println("Press 1 for booking, Press 2 to cancel");
			break;
		}
			case 'X':
			{
				System.out.println("Logging out");
				break;
	        }
	}
}while(no!='X'); //do-while loop
}// Function closure
}// Class closure
