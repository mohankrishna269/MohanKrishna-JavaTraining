package JFS_JFS_HIbernate_XmlConfig;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int p_id;
	private String p_name;
	
	@OneToMany(mappedBy = "person")
	private List<Laptop> laptop=new ArrayList<Laptop>();
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int p_id, String p_name) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	

}
