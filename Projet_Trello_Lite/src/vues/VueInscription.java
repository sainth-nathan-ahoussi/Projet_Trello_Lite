package vues;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.EcouteurAnnulerActionEvent;
import controleur.EcouteurSinscrireActionEvent;
import modele.Utilisateur;

public class VueInscription extends JPanel implements ViewBase, ViewBase_Inscription{
	 private JTextField identifiantField, nameField, surnameField, MailField;
	 private JPasswordField motDePasseField;
	 private JFrame fenetreInscription;
	 private Utilisateur utilisateur;
	 
	public VueInscription() {
		fenetreInscription = new JFrame ("Inscription");
		fenetreInscription.setSize (550,450);
		fenetreInscription.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fenetreInscription.setLayout(new GridLayout(5, 1));
		
//		 JPanel identifiantPanel = new JPanel(new FlowLayout());
//	     JLabel identifiantLabel = new JLabel("Identifiant : ");
//	     identifiantField = new JTextField(19);
//	     identifiantLabel.setToolTipText("Entrez votre Identifiant");
//	     identifiantPanel.add(identifiantLabel);
//	     identifiantPanel.add(identifiantField);
	     
	     
	     JPanel namePanel = new JPanel(new FlowLayout());
	     JLabel nameLabel = new JLabel("Name : ");
	     nameField = new JTextField(19);
	     nameLabel.setToolTipText("Entrez votre Prenom");
	     namePanel.add(nameLabel);
	     namePanel.add(nameField);
	     
	     
	     
	     JPanel SurnamePanel = new JPanel(new FlowLayout());
	     JLabel SurnameLabel = new JLabel("Surname : ");
	     surnameField = new JTextField(19);
	     SurnamePanel.setToolTipText("Entrez votre Nom");
	     SurnamePanel.add(SurnameLabel);
	     SurnamePanel.add(surnameField);
	     
	     
	     
	     JPanel PasswordPanel = new JPanel(new FlowLayout());
	     JLabel PasswordLabel = new JLabel("Password : ");
	     motDePasseField = new JPasswordField(19);
	     PasswordPanel.setToolTipText("Un mot de passe doit contenir au minimum 8 caracteres,au moins une lettre minuscule et une lettre majuscule, un caractere special et un chiffre pour etre efficace");
	     PasswordPanel.add(PasswordLabel);
	     PasswordPanel.add(motDePasseField);
	     
	     
	     
	     JPanel MailPanel = new JPanel(new FlowLayout());
	     JLabel MailLabel = new JLabel("Mail : ");
	     MailField = new JTextField(19);
	     MailPanel.setToolTipText("Entrez un mail fonctionnel");
	     MailPanel.add(MailLabel);
	     MailPanel.add(MailField);
		
	     
	     JPanel boutonInscrire = new JPanel();
	     JButton InscriptionButton = new JButton("S'inscrire");
	     JButton annulerButton = new JButton("Annuler");
	     boutonInscrire.add(InscriptionButton);
	     boutonInscrire.add(annulerButton);
	     
	     annulerButton.addActionListener(new EcouteurAnnulerActionEvent(this));
	     InscriptionButton.addActionListener(new EcouteurSinscrireActionEvent(this));
	     
//	     fenetreInscription.add(identifiantPanel);
	     fenetreInscription.add(namePanel);
	     fenetreInscription.add(SurnamePanel);
	     fenetreInscription.add(PasswordPanel);
	     fenetreInscription.add(MailPanel);
	     fenetreInscription.add(boutonInscrire);

		
		fenetreInscription.setResizable(false);
		fenetreInscription.setVisible(true);
		fenetreInscription.setLocationRelativeTo(null); 
		
		
	}
	
	public void cancel() {
		fenetreInscription.dispose();
	}
	
	public void sinscrire() {
         String prenom = nameField.getText();
         String nom = surnameField.getText();
         String motDePasse = new String(motDePasseField.getPassword());
         String mail = MailField.getText();
         int numUti = 0;
         String typeMembre = "Utilisateur Constant";

        // Création de l'utilisateur avec les informations spécifiées
         if(motDePasse.length() < 8) {
        	 JOptionPane.showMessageDialog(null, "Votre mot de passse est trop court !");
        	 }else {
        		 int i = 0;
        		 boolean valide = false;
        		 while(i < mail.length()-1 && mail.charAt(i)!='@' ) { 
        			 i++;
        			 if(mail.charAt(i)=='@') {
        				 Utilisateur utilisateur = new Utilisateur(numUti+1, prenom, nom, mail,motDePasse, typeMembre);
          				 JOptionPane.showMessageDialog(null, "Inscription reussie !");
          				 VueConnexion p = new  VueConnexion();
          				 valide = true;
          				fenetreInscription.dispose();
          				 break;
        			 }	  
        		 }
        		 if(valide == false) {
        			 JOptionPane.showMessageDialog(null, "Votre mail n'est pas valide !");
        		 }
        		  	 	 
        		 
        	 }
         
         }

}
