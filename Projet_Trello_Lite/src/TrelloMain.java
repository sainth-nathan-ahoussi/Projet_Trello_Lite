
import java.util.ArrayList;

import modele.*;

public class TrelloMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> autorisation = new ArrayList<String>();
		autorisation.add("a");
		
		//initialisation
		Projet p = new Projet("test","lucratif","blablaabla");
		Membres m1 = new Membres("Admin",autorisation);
		Membres m2 = new Membres("Regular",autorisation);
		Utilisateur u = new Utilisateur(0, "sa", "lu", "oh@ah.com", "123", "d");
		Tableau t = new Tableau("nul", 0, true);
		ListCarte lc = new ListCarte(0, "nulCarte","carte de nul");
		Cartes ca1 = new Cartes("nul", "rien", "10/03/2020", "20/03/2020", "pas fini", 0);
		Cartes ca2 = new Cartes("nul2", "rien", "10/03/2020", "20/03/2020", "pas fini", 1 );
		Commentaire co1 = new Commentaire("nul", "blablalblabla", "12/03/2020");
		Etiquette e1 = new Etiquette("c'est nul", "rouge");
		
		//test
		System.out.println("////////////////Projet///////////////");
		System.out.println();
				
		p.addMember(m1);
		p.addMember(m2);
		if(p.isMember(m1))
			System.out.println("le Member et dans le projet");
		
		else
			System.out.println("le Member et pas dans le projet");
		p.displayProjectInfo();
		
		System.out.println();
		System.out.println("////////////////Membres///////////////");
		System.out.println();
		
		if(m1.HasPermission("a"))
			System.out.println("il a la permission");
		else
			System.out.println("il a pas la permission");
		m1.GrantPermission("a");
		m1.GrantPermission("b");
		
		System.out.println();
		System.out.println("////////////////Utilisateur///////////////");
		System.out.println();
		
		u.displayUserInfo();
		if(u.checkPassword("123"))
			System.out.println("le mdp est correct");
		else
			System.out.println("le mdp est incorrect");
		u.resetPassword("1234");
		
		System.out.println();
		System.out.println("////////////////Tableau///////////////");
		System.out.println();
		
		t.addListCarte(lc);
		t.removeListCarte(lc);
		
		System.out.println();
		System.out.println("////////////////ListCarte///////////////");
		System.out.println();
		
		lc.AddCard(ca1);
		System.out.println(lc.GetCard(0).GetTitre());
		lc.GetCard(1);
		lc.UpdateCard(0, ca2);
		lc.DeleteCard(ca2);
		lc.ClearList();
		
		System.out.println();
		System.out.println("////////////////Cartes///////////////");
		System.out.println();
		
		ca1.AddComment(co1);
		ca1.AddEtiquette(e1);
		ca1.supEtiquette(e1);
	}

}
