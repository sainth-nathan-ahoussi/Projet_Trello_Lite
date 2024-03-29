package vues;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.EcouteurAnnulerActionEvent;
import modele.Tableau;

public class VueCreerTableau extends JPanel implements ViewBase {
	private JTextField SaisienomTableau;
	private JFrame fenetreCreerTableau;
	
	public VueCreerTableau(){
		fenetreCreerTableau = new JFrame ("Creation Tableau");
		fenetreCreerTableau.setSize(300, 300);
		fenetreCreerTableau.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		fenetreCreerTableau.setLayout(new GridLayout(4, 1));
		
		
		JPanel nomTableaupanel = new JPanel(new FlowLayout());
		JLabel nomTableau = new JLabel("Entrez le nom du tableau :");
		SaisienomTableau = new JTextField(19);
		nomTableaupanel.add(nomTableau);
		nomTableaupanel.add(SaisienomTableau);
		
		
		JLabel FondTableau = new JLabel("Ajoutez un fond au Tableau ? :");	
		JPanel FondTableautext = new JPanel();
		JPanel boutonsFondPanel =  new JPanel(new FlowLayout());
		JButton OuiButton = new JButton("Oui");
        JButton NonButton = new JButton("Non");
        
        JPanel boutonFinalPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton creerTableauButton = new JButton("Creer");
        JButton annulerButton = new JButton("Annuler");
        boutonFinalPanel.add(creerTableauButton);
        boutonFinalPanel.add(annulerButton);
        
        
        FondTableautext.add(FondTableau);
        boutonsFondPanel.add(FondTableautext);
        boutonsFondPanel.add(OuiButton);
        boutonsFondPanel.add(NonButton);
        
        annulerButton.addActionListener(new EcouteurAnnulerActionEvent(this));
        
        JPanel AjouterMembre = new JPanel(new FlowLayout());
        JButton boutonAjouter =  new JButton("Ajouter un Membre");
        AjouterMembre.add(boutonAjouter);
		
       
        fenetreCreerTableau.add(nomTableaupanel);
        fenetreCreerTableau.add(boutonsFondPanel);
        fenetreCreerTableau.add(AjouterMembre);
        fenetreCreerTableau.add(boutonFinalPanel);
        
//        creerTableauButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String nomTableau = nomTableauField.getText();
//
//                // Création du tableau avec le nom spécifié
//                Tableau tableau = new Tableau(nomTableau);
//                JOptionPane.showMessageDialog(null, "Tableau créé avec succès !");
//            }
//        });
//
//        annulerButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                fenetreCreerTableau.dispose(); // Fermer la fenêtre de création du tableau
//            }
//        });
	
		fenetreCreerTableau.setResizable(false);
		fenetreCreerTableau.setVisible(true);
		fenetreCreerTableau.setLocationRelativeTo(null); 
	}

	public void cancel() {
		fenetreCreerTableau.dispose();
	}
}
