package modele;

public class Etiquette {

    private String TitreEtiquette;
    private String CouleurEtiquette;
    
    public Etiquette(String titreEtiquette, String couleurEtiquette) {
        this.TitreEtiquette = titreEtiquette;
        this.CouleurEtiquette = couleurEtiquette;
    }
    
    public String GetTitreEtiquette() {
        return this.TitreEtiquette;
    }
    
    public void SetTitreEtiquette(String titreEtiquette) {
        this.TitreEtiquette = titreEtiquette;
    }
    
    public String GetCouleurEtiquette() {
        return this.CouleurEtiquette;
    }
    
    public void SetCouleurEtiquette(String couleurEtiquette) {
        this.CouleurEtiquette = couleurEtiquette;
    }
}
