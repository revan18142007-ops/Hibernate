import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver" );
		
		con.setProperty("hibernate.connection.url","jdbc:mysql://db01.dbhost.dev:5051/db_4559z2s7r" );
		//username
		con.setProperty("hibernate.connection.username","user_4559z2s7r" );
		// password
		
		con.setProperty("hibernate.connection.password","p4559z2s7r" );
		// Hibernate settings
		con.setProperty("hibernate.hbm2ddl.auto","update" );
		con.setProperty("hibernate.show_sql","true" );
		con.setProperty("hibernate.formet_sql","true" );
		
		con.addAnnotatedClass(Students.class);
		
		SessionFactory sessionFactory=con.buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Students student = new Students(102, "Revan", "revanrevan1814@gmail.com", "addvanced java programing");
		session.beginTransaction();
		session.persist(student);
		
		
		session.getTransaction().commit();
		System.out.println("Successfully Inatlled");
	}

}
