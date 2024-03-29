package modele;

import java.util.ArrayList;

public class ListCarte {

	private int NumListe;
    private String NomListe;
    private String DescriptionListe;
    private ArrayList<Cartes> cartes = new ArrayList<Cartes>();

    public ListCarte() {};
    public ListCarte(int numListe, String nomListe, String descriptionListe) {
        NumListe = numListe;
        NomListe = nomListe;
        DescriptionListe = descriptionListe;
        cartes = new ArrayList<Cartes>();
    }

    public int getNumListe() {
		return NumListe;
	}

	public void setNumListe(int numListe) {
		NumListe = numListe;
	}

	public String getNomListe() {
		return NomListe;
	}

	public void setNomListe(String nomListe) {
		NomListe = nomListe;
	}

	public String getDescriptionListe() {
		return DescriptionListe;
	}

	public void setDescriptionListe(String descriptionListe) {
		DescriptionListe = descriptionListe;
	}

	public void AddCard(Cartes carte) {
        cartes.add(carte);
        System.out.println("Carte ajout�");
    }

    public void DeleteCard(Cartes carte) {
        cartes.remove(carte);
        System.out.println("Carte suprim�");
    }
    
    public int GetCardCount() {
        return cartes.size();
    }
    
    public Cartes GetCard(int index) {
        if (index >= 0 && index < cartes.size()) {
            return cartes.get(index);
        }
        else
        	System.out.println("index incorrect");
        return null;
    }
    
    public ArrayList<Cartes> GetAllCards() {
        return cartes;
    }

    public void UpdateCard(int index, Cartes nouvelleCarte) {
        if (index >= 0 && index < cartes.size()) {
            cartes.set(index, nouvelleCarte);
            System.out.println("carte modifier");
        }
    }

    public void ClearList() {
        cartes.clear();
        System.out.println("Liste vid�e");
    }



}
