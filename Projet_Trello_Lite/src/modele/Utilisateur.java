package modele;

public class Utilisateur {

    private int NumUtilisateur;
    private String NomUtilisateur;
    private String PrenomUtilisateur;
    private String MailUtilisateur;
    private String MotPasseUtilisateur;
    private String TypeUtilisateur;

    public Utilisateur(int numUtilisateur,String prenomUtilisateur, String nomUtilisateur,  String mailUtilisateur, String motPasseUtilisateur, String typeUtilisateur) {
        this.NumUtilisateur = numUtilisateur;
        this.NomUtilisateur = nomUtilisateur;
        this.PrenomUtilisateur = prenomUtilisateur;
        this.MailUtilisateur = mailUtilisateur;
        this.MotPasseUtilisateur = motPasseUtilisateur;
        this.TypeUtilisateur = typeUtilisateur;
    }

    public int GetNumUtilisateur() {
        return this.NumUtilisateur;
    }

    public void SetNumUtilisateur(int numUtilisateur) {
        this.NumUtilisateur = numUtilisateur;
    }

    public String GetNomUtilisateur() {
        return this.NomUtilisateur;
    }

    public void SetNomUtilisateur(String nomUtilisateur) {
        this.NomUtilisateur = nomUtilisateur;
    }

    public String GetPrenomUtilisateur() {
        return this.PrenomUtilisateur;
    }

    public void SetPrenomUtilisateur(String prenomUtilisateur) {
        this.PrenomUtilisateur = prenomUtilisateur;
    }

    public String GetMailUtilisateur() {
        return this.MailUtilisateur;
    }

    public void SetMailUtilisateur(String mailUtilisateur) {
        this.MailUtilisateur = mailUtilisateur;
    }

    public String GetMotPasseUtilisateur() {
        return this.MotPasseUtilisateur;
    }

    public void SetMotPasseUtilisateur(String motPasseUtilisateur) {
        this.MotPasseUtilisateur = motPasseUtilisateur;
    }

    public String GetTypeUtilisateur() {
        return this.TypeUtilisateur;
    }

    public void SetTypeUtilisateur(String typeUtilisateur) {
        this.TypeUtilisateur = typeUtilisateur;
    }
    
    public void displayUserInfo() {
        System.out.println("Informations de l'utilisateur :");
        System.out.println("Numéro d'utilisateur : " + NumUtilisateur);
        System.out.println("Nom : " + NomUtilisateur);
        System.out.println("Prénom : " + PrenomUtilisateur);
        System.out.println("Adresse e-mail : " + MailUtilisateur);
        System.out.println("Type d'utilisateur : " + TypeUtilisateur);
    }

    
    public boolean checkMail(String mail) {
        return this.MailUtilisateur == mail ;
    }
    
    public boolean checkPassword(String password) {
        return MotPasseUtilisateur == password ;
    }

    public void resetPassword(String newPassword) {
        MotPasseUtilisateur = newPassword;
        System.out.println("Le mot de passe a été réinitialisé avec succès.");
    }

   
}
