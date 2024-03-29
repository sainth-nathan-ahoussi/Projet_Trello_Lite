package modele;

public class Commentaire {

	private String NomCommentaire;
	private String Contenue;
	private String DateEnvoie;

	public Commentaire (String nomcommentaire, String contenue, String dateenvoie ){
		this.NomCommentaire = nomcommentaire; 
		this.Contenue = contenue ;
		this.DateEnvoie = dateenvoie  ;
	}
	
	public String GetNomCommentaire() {
		return this.NomCommentaire ;
	}
	
	public void SetNomCommentaire(String nomcommentaire) {
		 this.NomCommentaire = nomcommentaire ;
	}
	
	public String GetContenue() {
		return this.Contenue ;
	}
	
	public void SetContenue(String contenue) {
		 this.Contenue = contenue ;
	}
	
	public String GetDateEnvoie() {
		return this.DateEnvoie ;
	}
	
	public void SetDateEnvoie(String dateenvoie) {
		 this.DateEnvoie = dateenvoie ;
	}
}