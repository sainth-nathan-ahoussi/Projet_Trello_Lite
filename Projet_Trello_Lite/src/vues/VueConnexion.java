package vues;

import modele.Tableau;
import modele.Utilisateur;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;

import controleur.EcouteurAnnulerActionEvent;
import controleur.EcouteurConnexionActionEvent;
import controleur.EcouteurGuessActionEvent;
import controleur.EcouteurInscriptionActionEvent;

import java.awt.*;


public class VueConnexion extends JPanel implements ViewBase, ViewBase_Connexion  {
	private JTextField identifiantField;
    private JPasswordField motDePasseField;
    private JFrame fenetreConnexion;
    //private Utilisateur utilisateur;
    private Tableau tableau;
	//private Utilisateur utilisateur;

    public VueConnexion() {
    	fenetreConnexion = new JFrame ("Connexion");
    	fenetreConnexion.setSize (250, 250);
    	fenetreConnexion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
    	fenetreConnexion.setLayout(new GridLayout(4, 1));
        JPanel identifiantPanel = new JPanel(new FlowLayout());
        JLabel identifiantLabel = new JLabel("Identifiant : ");
        identifiantField = new JTextField(19);
        identifiantPanel.add(identifiantLabel);
        identifiantPanel.add(identifiantField);

        // Panel pour le mot de passe
        JPanel motDePassePanel = new JPanel(new FlowLayout());
        JLabel motDePasseLabel = new JLabel("Mot de passe: ");
        motDePasseField = new JPasswordField(19);
        motDePassePanel.add(motDePasseLabel);
        motDePassePanel.add(motDePasseField);
        

        // Panel pour les boutons
        JPanel boutonsPanel = new JPanel(new FlowLayout());
        JButton guestButton = new JButton("Guest");
        JButton InscriptionButton = new JButton("Inscription");
        boutonsPanel.add(guestButton);
        boutonsPanel.add(InscriptionButton);
        
        
        JPanel boutonsPanel2 = new JPanel(new FlowLayout());
        JButton connexionButton = new JButton("Connexion");
        JButton annulerButton = new JButton("Annuler");
        boutonsPanel2.add(connexionButton);
        boutonsPanel2.add(annulerButton);
        
        // Ajout des panels au panel principal
        fenetreConnexion.add(identifiantPanel);
        fenetreConnexion.add(motDePassePanel);
        fenetreConnexion.add(boutonsPanel);
        fenetreConnexion.add(boutonsPanel2);
        
        annulerButton.addActionListener(new EcouteurAnnulerActionEvent(this));
        connexionButton.addActionListener(new EcouteurConnexionActionEvent(this));
        guestButton.addActionListener(new EcouteurGuessActionEvent(this));
        InscriptionButton.addActionListener(new EcouteurInscriptionActionEvent(this));
        
        fenetreConnexion.setResizable(false);
        fenetreConnexion.setVisible(true);
        fenetreConnexion.setLocationRelativeTo(null); 
    }

    public void cancel() {
    	fenetreConnexion.dispose();
	}

	
	public void connexion() {
		 String identifiant = identifiantField.getText();
		 String motDePasse = new String(motDePasseField.getPassword());
		 //String identifiant_vrai = utilisateur.GetMailUtilisateur();
		 
      // Verification de l'identifiant et du mot de passe
		// if (utilisateur.GetMailUtilisateur().equals(identifiant) && utilisateur.checkPassword(motDePasse)) {
			 JOptionPane.showMessageDialog(null, "Connexion reussie !");
			 fenetreConnexion.dispose();
			 if(tableau.GetNomTableau() == null ) {
				 VueCreerTableau p = new VueCreerTableau();
			 }else {
				 VueTableau p = new VueTableau();
			 }
			 
		 } else {
           JOptionPane.showMessageDialog(null, "Identifiant ou mot de passe incorrect !");
       }
		
	}
	
	public void guest() {
		  JOptionPane.showMessageDialog(null, "Connexion en tant qu'invite!");
		  VueCreerTableau p = new VueCreerTableau();
		  fenetreConnexion.dispose();
		
	}

	@Override
	public void inscription() {
		JOptionPane.showMessageDialog(null, "Redirection vers la page d'inscription !");
		VueInscription p = new VueInscription();
		
	}

	
    

}
