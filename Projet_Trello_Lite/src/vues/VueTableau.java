package vues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

import modele.Tableau;
//
public class VueTableau extends JPanel {
	private JMenuBar menuBar;
	private JMenu Listetableau,nameboard,JoinBoard,Favoris,VisibiliteWorkspace;
	private JMenu boardMenu,MembersTableau,inviteMembers;
//	
	private JMenuItem CreateBoard,PrivateBoard,PublicBoard;
	private JButton ajouterListeButton;
	private Tableau tableau;
	private JFrame fenetreTableau;
//	
	public VueTableau() {
		fenetreTableau = new JFrame ("Tableau");
		fenetreTableau.setSize(1300, 900);
		fenetreTableau.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetreTableau.setLayout(new GridLayout(1, 1));
//		int nbline = 1;
//		int nbcolumn = 9;
//		JPanel[][] mainPanel = new JPanel[nbline][nbcolumn];
//	
//		
//		// Cr�ation de la barre de menu 
		 menuBar = new JMenuBar();
//		 
//		 
//		 //Ajout des secteurs de la barre de menu
		 Listetableau = new JMenu("Tableaux");
		 CreateBoard =  new JMenuItem("Creer un tableau");
		 nameboard = new JMenu(tableau.GetNomTableau());
		 Favoris = new JMenu("*");
		 VisibiliteWorkspace = new JMenu("Workspace Visibilite");
		 inviteMembers = new JMenu("Invite");
		 MembersTableau = new JMenu("Members");
		 boardMenu = new JMenu("Board Menu");
//		 
		 JRadioButtonMenuItem  publicMenuItem = new JRadioButtonMenuItem("Public");
		 JRadioButtonMenuItem  priveMenuItem = new JRadioButtonMenuItem("Privé");
//	 
//		//Ajout du menu à la barre des menus 
		menuBar.add(Listetableau);
		Listetableau.add(CreateBoard);
		VisibiliteWorkspace.add(priveMenuItem);
		VisibiliteWorkspace.add(publicMenuItem);
		menuBar.add(nameboard);
		menuBar.add(Favoris);
		menuBar.add(VisibiliteWorkspace);
		menuBar.add(inviteMembers);

		for (String membre : tableau.getMembres()) {
			JMenuItem membreItem = new JMenuItem(membre);
			MembersTableau.add(membreItem);
		}

		menuBar.add(MembersTableau);

		menuBar.add(boardMenu);
//		
//		
//		
		//JButton buttonAddCard = new JButton(" + Add another card");
		ajouterListeButton = new JButton("Add a list");
//	
//		
//		for(int m = 0; m < nbline; m++) {
//			   for(int n = 0; n < nbcolumn; n++) {
//				   mainPanel[m][n] = new JPanel();
//				   fenetreTableau.add(mainPanel[m][n]);
//			   }
//		}
		ajouterListeButton.setLocation(10,  10);
//		mainPanel[0][0].add(ajouterListeButton);
		JPanel mainPanel = new JPanel(new GridBagLayout());
      GridBagConstraints constraints = new GridBagConstraints();
      constraints.gridx = 0;
      constraints.gridy = 0;
      constraints.fill = GridBagConstraints.HORIZONTAL;
      constraints.anchor = GridBagConstraints.NORTHWEST;
//
      fenetreTableau.setLayout(new BorderLayout());
      fenetreTableau.add(menuBar, BorderLayout.NORTH);
      fenetreTableau.add(mainPanel, BorderLayout.CENTER);
      fenetreTableau.add(ajouterListeButton, BorderLayout.WEST);
	  fenetreTableau.setJMenuBar(menuBar);
////		
//		fenetreTableau.setLayout(new BorderLayout());
//        fenetreTableau.add(menuBar, BorderLayout.NORTH);
//       fenetreTableau.add(ajouterListeButton, BorderLayout.WEST);
//
		
		fenetreTableau.setResizable(false);
		fenetreTableau.setVisible(true);
		fenetreTableau.setLocationRelativeTo(null); 
	}
}

//
//        // Menu Invite
////        inviterMembresItem = new JMenuItem("Inviter des membres");
////        inviterMembresItem.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                // Ouvrir la fenêtre d'invitation (VueInvitation)
////                JFrame fenetreInvitation = new VueInvitation();
////                fenetreInvitation.setVisible(true);
////            }
////        });

//        ajouterListeButton = new JButton("Ajouter une liste");
//        mainPanel = new JPanel(new GridBagLayout());
//        GridBagConstraints constraints = new GridBagConstraints();
//        constraints.gridx = 0;
//        constraints.gridy = 0;
//        constraints.fill = GridBagConstraints.HORIZONTAL;
//        constraints.anchor = GridBagConstraints.NORTHWEST;
//
//        fenetreTableau.setLayout(new BorderLayout());
//        fenetreTableau.add(menuBar, BorderLayout.NORTH);
//        fenetreTableau.add(mainPanel, BorderLayout.CENTER);
//        fenetreTableau.add(ajouterListeButton, BorderLayout.WEST);
//
////        ajouterListeButton.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                VueCreerListe vueCreerListe = new VueCreerListe();
////                mainPanel.add(vueCreerListe);
////                fenetreTableau.revalidate();
////                fenetreTableau.repaint();
////            }
////        });
//
//      
//    }
//}
