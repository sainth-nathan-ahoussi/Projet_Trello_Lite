package modele;

import java.util.ArrayList;

public class Tableau {

	private String NomTableau;
	private int NumTableau  ;
	private boolean FondTableau;
	private ArrayList<ListCarte> ListCarte;
	private ArrayList<String> membres;

    public Tableau(String nomTableau, int numTableau, boolean fondTableau) {
        this.NomTableau = nomTableau;
        this.NumTableau = numTableau;
        this.FondTableau = fondTableau;
        this.ListCarte = new ArrayList<ListCarte>();
        this.membres = new ArrayList<String>();
    }

    public String GetNomTableau() {
        return this.NomTableau;
    }

    public void  SetNomTableau(String nomTableau) {
        this.NomTableau = nomTableau;
    }

    public int GetNumTableau() {
        return this.NumTableau;
    }

    public void  SetNumTableau(int numTableau) {
        this.NumTableau = numTableau;
    }

    public boolean hasFondTableau() {
        return this.FondTableau;
    }

    public void SetFondTableau(boolean fondTableau) {
        this.FondTableau = fondTableau;
    }
    
    public void addListCarte(ListCarte lc) {
    	ListCarte.add(lc);
        System.out.println("List de Carte ajout�");
    }

    public void removeListCarte(ListCarte lc) {
    	ListCarte.remove(lc);
        System.out.println("List de Carte suprim�");
    }


	public void setMembres(Utilisateur utilisateur ) {
		membres.add(utilisateur.GetNomUtilisateur());
	}
    
	public ArrayList<String> getMembres() {
		return this.membres;
	}

}