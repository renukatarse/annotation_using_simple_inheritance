package com.scp.bollywood;
import org.hibernate.cfg.AnnotationConfiguration;

    import org.hibernate.Session;  
    import org.hibernate.SessionFactory;  
	import org.hibernate.Transaction;  
	import org.hibernate.cfg.Configuration;  
	  
public class TestFilmstars {


	public static void main(String[] args) {
		
		
	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	Session session= sf.openSession();
	Transaction tx=session.beginTransaction();

	Filmstars f = new Filmstars();
    f.setActorName("R.Madhvan");	
    f.setFilm("RHTDM");
    
    session.save(f);
   
    
    tx.commit();
   session.close();
   
		     }  
}


