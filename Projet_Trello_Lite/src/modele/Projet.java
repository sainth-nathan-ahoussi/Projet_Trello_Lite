package modele;

import java.util.ArrayList;

public class Projet {

	private String NomProjet;
	private String TypeProjet;
	private String DescriptionProjet;
	private ArrayList<Membres> membres;

	public Projet (String nomProjet, String typeProjet, String descriptionProjet) {
        this.NomProjet = nomProjet;
        this.TypeProjet = typeProjet;
        this.DescriptionProjet = descriptionProjet;
        this.membres = new ArrayList<>();
    }
	
	public ArrayList<Membres> GetMembers() {
        return membres;
    }

	public void ChangeRight(int numMembre, String nouvellesAutorisations) {
        for (Membres m : membres) {
            if (m.GetNumMembre() == numMembre) {
                m.SetAutorisations(nouvellesAutorisations);
                //break;
            }
        }
    }
	
	public void addMember(Membres membre) {
	    membres.add(membre);
	}
	
	public void removeMember(Membres membre) {
	    membres.remove(membre);
	}

	public boolean isMember(Membres membre) {
		boolean result = false;
		int indM = 0;
		while(!result && indM < this.membres.size()) {
			result = this.membres.get(indM) == membre;
			indM++;
		}
		return result;
	}
		
	public void displayProjectInfo() {
	    System.out.println("Informations du projet :");
	    System.out.println("Nom du projet : " + NomProjet);
	    System.out.println("Type de projet : " + TypeProjet);
	    System.out.println("Description du projet : " + DescriptionProjet);
	    System.out.println("Membres du projet :");
	    for (Membres membre : membres) {
	        System.out.println("- " + membre.GetNumMembre());
	    }
	}



}