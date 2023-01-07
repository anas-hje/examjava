package pricipal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.exemple.Utils.HibernateUtils;

import Dao.DaoImmeuble;
import entities.Immeuble;
import entities.Rue;

public class main {

	public static void main(String[] args) {
		// tous les immeubles 
		Session session = HibernateUtils.getSessionfactory().getCurrentSession(); 
		Transaction t = session.beginTransaction();
		
		List<Immeuble> Immeubles = session.createQuery("from Immeuble").getResultList();
		
		System.out.println("Liste des Immeuble : ");
		for(Immeuble i:Immeubles) {
			System.out.println(i);
			for(Rue r : i.getRue()) {
				System.out.println(" - " + i);
			}
		}
		
		t.commit();
		session.close();
		 
		
		//tous les immeubles d'une rue donne par l'utilisateur 
		
        // Supprimer une appartement
		
		// Modifier un Etage
	}

}
