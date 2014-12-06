package poker;

import java.util.ArrayList;
import java.util.Collections;

import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException; 

public class PlayHand {

	private static SessionFactory sessionfactory; 
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		try{

	          sessionfactory = new Configuration().configure().
	                  addAnnotatedClass(Hand.class).
	                  buildSessionFactory();  
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }

		for (int gCount = 0; gCount <= 2000000; gCount++) {
			Deck d = new Deck();

			for (int hCnt = 0; hCnt <= 2; hCnt++) {
				Hand h = new Hand(d);
				h.EvalHand();
			}
		}

	}
	
	public Hand addHand(String strength, String Hi, String Lo, String Kicker){
		return null;
	}
}

