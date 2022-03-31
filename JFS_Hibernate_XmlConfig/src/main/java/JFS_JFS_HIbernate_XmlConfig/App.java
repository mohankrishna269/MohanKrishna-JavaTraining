package JFS_JFS_HIbernate_XmlConfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure().addAnnotatedClass(Laptop.class);
		config.configure().addAnnotatedClass(Person.class);
		
		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(
				config.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Person person=new Person();
		Person person1=new Person();
		Laptop laptop=new Laptop();
		laptop.setId(5);
		laptop.setName("Asus");
		laptop.setPrice(50000);
	
		Laptop lap=new Laptop();
		lap.setId(6);
		lap.setName("Acer");
		lap.setPrice(50000);
		laptop.getPerson().add(person);
		
		
	    
		//session.getTransaction().commit();
		
		//laptop.setPrice(70000);
		//session.save(lap);
		lap.setPrice(70000);
		//session.getTransaction().commit();
		
		
		person.setP_id(5);
		person.setP_name("Rahul");
		person.getLaptop().add(lap);
		person1.setP_id(6);
		person1.setP_name("Nirmal");
		person1.getLaptop().add(laptop);
		
		session.save(laptop);
		session.save(lap);
		session.save(person);
		session.save(person1);
		
		
		session.getTransaction().commit();

	}

}
