package modele;

import java.util.ArrayList;

public class Cartes {

    private String Titre;
    private String Description;
    private String DateDebut;
    private String DateLimite;
    private String Status;
    private int NumCarte;
    private ArrayList<Commentaire> commentaires;
    private ArrayList<Etiquette> etiquette;
    private ListCarte ListParentes;
    private ArrayList<String> checklist;

    public Cartes(String titre, String description, String datedebut, String datelimite, String status, int numcarte) {
        this.Titre = titre;
        this.Description = description;
        this.DateDebut = datedebut;
        this.DateLimite = datelimite;
        this.Status = status;
        this.NumCarte = numcarte;
        this.commentaires = new ArrayList<>();
        this.etiquette = new ArrayList<>();
        this.ListParentes = new ListCarte();
        this.checklist = new ArrayList<>();
    }

    public String GetTitre() {
        return this.Titre;
    }

    public void SetTitre(String titre) {
        this.Titre = titre;
    }

    public String GetDescription() {
        return this.Description;
    }

    public void SetDescription(String description) {
        this.Description = description;
    }

    public String GetDateDebut() {
        return this.DateDebut;
    }

    public void SetDateDebut(String datedebut) {
        this.DateDebut = datedebut;
    }

    public String GetDateLimite() {
        return this.DateLimite;
    }

    public void SetDateLimite(String datelimite) {
        this.DateLimite = datelimite;
    }

    public String GetStatus() {
        return this.Status;
    }

    public void SetStatus(String status) {
        this.Status = status;
    }

    public int GetNumCarte() {
        return this.NumCarte;
    }

    public void SetNumCarte(int numcarte) {
        this.NumCarte = numcarte;
    }

    public ArrayList<Commentaire> GetCommentaires() {
        return commentaires;
    }
    
    public void AddComment(Commentaire commentaire) {
        commentaires.add(commentaire);
        System.out.println("Commentaire ajout�e");
    }
    
    public void AddEtiquette(Etiquette etiquette) {
    	this.etiquette.add(etiquette);
        System.out.println("etiquette ajout�e");
    }
    
    public void supEtiquette(Etiquette etiquette) {
    	this.etiquette.remove(etiquette);
        System.out.println("etiquette suprim�e");
    }
    

    public String getListParentes() {
        return ListParentes.getNomListe();
    }
    
    public void setListParentes(String nom) {
    	ListParentes.setNomListe(nom);
    }
    
    public void addChecklist(String tache) {
        checklist.add(tache);
    }

    public void removeChecklist(String tache) {
        checklist.remove(tache);
    }

    public ArrayList<String> getChecklist() {
        return checklist;
    }
    
}
