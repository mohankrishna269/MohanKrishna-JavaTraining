package Reservation;
import java.util.Scanner;

public class DriverClass {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("*********Welcome to Bus Reservation**********");
		//BusBasicInfo bus=new BusBasicInfo(name)
		System.out.println("Enter Your Name: ");
		String name=scan.next();
		System.out.println("Enter Your phn_no: ");
		String phn_no=scan.next();
		System.out.println("Enter Your Email: ");
		String mail_id=scan.next();
		System.out.println("Enter Date of Journey:");
		String date_of_journey=scan.next();
		System.out.println("Enter the Number of Tickets:");
		int no_of_tickets=scan.nextInt();
		BusBasicInfo b=new BusBasicInfo(name,phn_no,mail_id,date_of_journey,no_of_tickets);
		System.out.println("Please Select a bus:");
		System.out.println("1.Sleeper/AC");
		System.out.println("2.Semi-Sleeper/AC");
		System.out.println("3.NON-AC");
		int choice=scan.nextInt();
		BusReservation obj=new BusReservation();
		switch(choice)
		{
		case 1:
			obj.Sleeper(b);
			break;
			
		case 2:
		
			obj.Semi_Sleeper(b);
			break;
		
		case 3:
		       
			obj.Non_Ac(b);
			break;
		}
		scan.close();
		
		
		
		
		
	}

}
