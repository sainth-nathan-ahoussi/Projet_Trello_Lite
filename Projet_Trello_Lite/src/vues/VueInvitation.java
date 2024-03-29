package vues;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.EcouteurAnnulerActionEvent;
//Membres membre
import modele.Membres;

public class VueInvitation extends JPanel implements ViewBase {
	 private JTextField identifiantMailusers,AutorisationUsers;
	 static JComboBox comboboxRole;
	 private JTextField linkBoard;
	 private JFrame fenetreInvitation;
	
	public VueInvitation() {
		fenetreInvitation = new JFrame ("Invitation");
		fenetreInvitation.setSize(600, 500);
		fenetreInvitation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//Partie recherche utilisateur
		fenetreInvitation.setLayout(new GridLayout(5, 1));
		JPanel identifiantPanel = new JPanel(new FlowLayout());
		JLabel nomUtilisateurs = new JLabel("Entrez l'email ou le nom de l'utilisateur :");
		identifiantPanel.add(nomUtilisateurs);
        identifiantMailusers = new JTextField();
        identifiantMailusers.setColumns(16);
        identifiantPanel.add(identifiantMailusers);
        
      
        //Partie Autorisations 
        String Role[] = { "Add as Members", "Add as Observers", "Add as Admin" }; 
        comboboxRole = new JComboBox(Role);
        JPanel p = new JPanel(new FlowLayout());
        
        JPanel AutorisationPanel = new JPanel(new FlowLayout());
		JLabel Autorisation = new JLabel("Entrez les autorisations du membre :");
		AutorisationPanel.add(Autorisation);
		AutorisationUsers = new JTextField();
		AutorisationUsers.setColumns(16);
        AutorisationPanel.add(AutorisationUsers);

        
        //Partie Lien Tableau
        JPanel linkBoardpanel = new JPanel(new FlowLayout());
        JButton buttonCopy = new JButton("Copy");
        buttonCopy.setBounds(250, 38, 72, 45);
        buttonCopy.setBackground(Color.green);
        linkBoard = new JTextField("https://trello.com/invite/b/hgdjd");
        //linkBoard.setBounds(250, 38, 72, 45);
        linkBoard.add(buttonCopy);
        Dimension d = linkBoardpanel.getSize();
        System.out.println (d);
        

        //Partie Envoie 
        JPanel boutonSendInvitepanel = new JPanel(new FlowLayout());
        JButton boutonSendInvite = new JButton("Send Invitation");
        JButton annulerButton = new JButton("Annuler");
        boutonSendInvite.setBackground(Color.white);
        boutonSendInvitepanel.add(boutonSendInvite);
        boutonSendInvitepanel.add(annulerButton);
        
        annulerButton.addActionListener(new EcouteurAnnulerActionEvent(this));
        fenetreInvitation.add(identifiantPanel);
        
        p.add(comboboxRole);  
        fenetreInvitation.add(p);
        
        fenetreInvitation.add(AutorisationPanel);
        
        linkBoardpanel.add(linkBoard);
        fenetreInvitation.add(linkBoard);
        
        
        fenetreInvitation.add(boutonSendInvitepanel);
        
        fenetreInvitation.setVisible(true);
        
        
        
	}

	public void cancel() {
		fenetreInvitation.dispose();
	}
	
  
}
