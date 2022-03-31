package Reservation;
import java.util.Scanner;

public class BusReservation extends BusBasicInfo {
	Scanner scan=new Scanner(System.in);
	//BusBasicInfo b=new BusBasicInfo();
	public void Sleeper(BusBasicInfo b) {
		int a=10;
		int amt=900;
		
		//int b=a-no_of_tickets;
		if(b.no_of_tickets<=a) {
			
			int pay=b.no_of_tickets*amt;
			
			System.out.println("Amount is: "+pay);
			System.out.println("Enter Your UPI ID: ");
			int upi=scan.nextInt();
			System.out.println("=====Tickets Booked=====");
			System.out.println("*****Enjoy Your Journey******");
		}
		else {
			System.out.println("Sorry,Tickets Not Available");
		}
	}
		
		
		

	void Semi_Sleeper(BusBasicInfo c) {
		int b=20;
		int amt2=500;
		int pay2;
		if(c.no_of_tickets<=b) {
			pay2=c.no_of_tickets*amt2;
			System.out.println("Your Amount is: "+pay2);
			System.out.println("Enter UPI: ");
			int upi=scan.nextInt();
			System.out.println("=====Tickets Booked=====");
			System.out.println("*****Enjoy Your Journey******");
		}
		else {
			System.out.println("Sorry,Tickets Not Available");
			
		}
	}
	public void Non_Ac(BusBasicInfo d) {
		int c=40;
		int amt3=200;
		int pay3;
		if(d.no_of_tickets<=c) {
			pay3=d.no_of_tickets*amt3;
			System.out.println("Your Amount is: "+pay3);
			System.out.println("Enter Your UPI: ");
			int upi=scan.nextInt();
			System.out.println("=======Tickets Booked======");
			System.out.println("*****Enjoy Your Journey******");
			
		}
		else {
			System.out.println("Sorry,Tickets Not Available");
		}
		scan.close();
		
	}
	

}
