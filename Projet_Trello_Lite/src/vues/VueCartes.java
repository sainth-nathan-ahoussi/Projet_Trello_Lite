package vues;

import javax.swing.*;

import controleur.EcouteurAnnulerActionEvent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

//
//import javax.swing.JLabel;
//import javax.swing.JPanel;
import modele.Cartes;
import modele.ListCarte;

public class VueCartes extends JPanel implements ViewBase{
	private Cartes carte;
	private ListCarte liste;
	JCheckBox cb;
	private JFrame fenetreCarte;
	
	VueCartes(Cartes carte){
	    fenetreCarte = new JFrame (carte.GetTitre());
		fenetreCarte.setSize(850, 700);
		fenetreCarte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		int nbline = 20 ;
		int nbcolumn = 5;
		JPanel[][] panelHolder = new JPanel[nbline][nbcolumn];
		BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
		fenetreCarte.setLayout(boxLayout);
		fenetreCarte.setLayout(new GridLayout(nbline, nbcolumn));
	
				
		this.carte = carte;
		
		for(int m = 0; m < nbline; m++) {
			   for(int n = 0; n < nbcolumn; n++) {
			      panelHolder[m][n] = new JPanel();
			      fenetreCarte.add(panelHolder[m][n]);
			   }
		}
		
		//JLabel affichageTitre = new JLabel ("Titre  :");
		JLabel titre = new JLabel(carte.GetTitre());
		titre.setForeground(Color.BLACK);
		titre.setFont(new Font("Arial", Font.BOLD, 16));
		
		JLabel list = new JLabel("dans la liste" + carte.getListParentes() );
		list.setForeground(Color.GRAY);
		list.setFont(new Font("Arial", Font.BOLD, 13));
		
		
		JLabel affichageDescription = new JLabel (" Description ");
		affichageDescription.setForeground(Color.BLACK);
		affichageDescription.setFont(new Font("Arial", Font.BOLD, 16));
	
		
		JLabel description = new JLabel(carte.GetDescription());
		JLabel affichageDateDebut = new JLabel ("DateDebut  :" + carte.GetDateDebut() );
		JLabel affichageDateLimite = new JLabel ("DateLimite  :" + carte.GetDateLimite());
		JLabel affichageStatus = new JLabel ("Status  :" + carte.GetStatus() );	
		
	
		JButton edit = new JButton("Edit");
		edit.setBackground(Color.lightGray);
		// Elements
			// Titre
		panelHolder[0][0].add(titre);
		panelHolder[1][0].add(list);
		
		
			// Description
		panelHolder[2][0].add(affichageDescription);
		panelHolder[2][0].add(edit);
		panelHolder[3][0].add(description);
		
			//Checklist
		JLabel checklist = new JLabel ("Checklist");
		checklist.setForeground(Color.BLACK);
		checklist.setFont(new Font("Arial", Font.BOLD, 16));
		panelHolder[4][0].add(checklist);
		JButton Delete = new JButton("Delete");
		Delete.setBackground(Color.lightGray);
		panelHolder[4][3].add(Delete);
		
		// Controlleur?
		ArrayList<String> Checklist = carte.getChecklist();
		for (int i = 0; i < Checklist.size(); i++) {
		    String task = Checklist.get(i);
		    int t= 100;
		    cb = new JCheckBox(task);
		    cb.setBounds(100,t,150,20);
		    panelHolder[5 + i][0].add(cb);
		    t += 50;
		}
		JButton AddItem = new JButton("Add an Item");
		AddItem.setBackground(Color.lightGray);
		panelHolder[Checklist.size()+5][0].add(AddItem);
		
		// AJOUTER À LA CARTE
		JLabel AjoutaCarte = new JLabel ("AJOUTER A LA CARTE");	
		JButton Membres = new JButton("Membres");
		Membres.setBackground(Color.lightGray);
		JPanel membresPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		membresPanel.add(Membres);
		
		
		JButton Etiquette = new JButton("Etiquettes");
		Etiquette.setBackground(Color.lightGray);
		JButton Checklist1 = new JButton("Checklist");
		Checklist1.setBackground(Color.lightGray);
		JButton DateLimite = new JButton("Date limite");
		DateLimite.setBackground(Color.lightGray);
		JButton Piecejointe = new JButton("Piece jointe");
		Piecejointe.setBackground(Color.lightGray);
		
		panelHolder[3][4].add(AjoutaCarte);
		panelHolder[4][4].add(membresPanel);
		panelHolder[5][4].add(Etiquette);
		panelHolder[6][4].add(Checklist1);
		panelHolder[7][4].add(DateLimite);
		panelHolder[8][4].add(Piecejointe);
		
		
		// Actions
		JLabel actions = new JLabel ("ACTIONS");
		JButton Deplacer = new JButton("Deplacer");
		Deplacer.setBackground(Color.lightGray);
		JButton Copier = new JButton("Copier");
		Copier.setBackground(Color.lightGray);
		JButton Suivre = new JButton("Suivre");
		Suivre.setBackground(Color.lightGray);
		JButton Archiver = new JButton("Archiver");
		Archiver.setBackground(Color.lightGray);
		JButton Partager = new JButton("Partager");
		Partager.setBackground(Color.lightGray);
		
		JButton annulerButton = new JButton("Annuler");
		annulerButton.addActionListener(new EcouteurAnnulerActionEvent(this));
		
		panelHolder[13][4].add(actions);
		panelHolder[14][4].add(Deplacer);
		panelHolder[15][4].add(Copier);
		panelHolder[16][4].add(Suivre);
		panelHolder[17][4].add(Archiver);
		panelHolder[18][4].add(Partager);
		
		panelHolder[18][0].add(annulerButton);
	
		fenetreCarte.setVisible(true);
		fenetreCarte.setResizable(false);
		fenetreCarte.setLocationRelativeTo(null); 
	}

	public void cancel() {
		fenetreCarte.dispose();
	}
	
}

