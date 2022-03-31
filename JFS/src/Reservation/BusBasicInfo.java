package Reservation;

public class BusBasicInfo {
	String name,phn_no,mail_id,date_of_journey;
	int no_of_tickets;
	public BusBasicInfo() {}
	public BusBasicInfo(String name, String phn_no, String mail_id, String date_of_journey, int no_of_tickets) {
		super();
		this.name = name;
		this.phn_no = phn_no;
		this.mail_id = mail_id;
		this.date_of_journey = date_of_journey;
		this.no_of_tickets = no_of_tickets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhn_no() {
		return phn_no;
	}
	public void setPhn_no(String phn_no) {
		this.phn_no = phn_no;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getDate_of_journey() {
		return date_of_journey;
	}
	public void setDate_of_journey(String date_of_journey) {
		this.date_of_journey = date_of_journey;
	}
	public int getNo_of_tickets() {
		return no_of_tickets;
	}
	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	@Override
	public String toString() {
		return "BusBasicInfo [name=" + name + ", phn_no=" + phn_no + ", mail_id=" + mail_id + ", date_of_journey="
				+ date_of_journey + ", no_of_tickets=" + no_of_tickets + "]";
	}
	

	
	

}
