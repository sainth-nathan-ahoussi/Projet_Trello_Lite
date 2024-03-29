package vues;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.EcouteurAnnulerActionEvent;

public class VueAjoutChecklist extends JPanel implements ViewBase{
	private JTextField taskAdd;
	private JFrame fenetreAjoutChecklist;
	public VueAjoutChecklist() {
		fenetreAjoutChecklist  = new JFrame ("Ajout Checklist");
    	fenetreAjoutChecklist.setSize (350, 150);
    	fenetreAjoutChecklist.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	
    	fenetreAjoutChecklist.setLayout(new GridLayout(2, 1));
    	
    	JPanel taskAddPanel = new JPanel(new FlowLayout());
    	JLabel taskAddLabel = new JLabel("Ajouter une tache à votre checklist : ");
    	taskAdd = new JTextField(29);
        taskAddPanel.add(taskAddLabel);
        taskAddPanel.add(taskAdd);
        
        JPanel boutonsPanel = new JPanel(new FlowLayout());
        JButton boutonValider = new JButton("Valider");
        JButton annulerButton = new JButton("Annuler");
    	
        annulerButton.addActionListener(new EcouteurAnnulerActionEvent(this));
        
        boutonsPanel.add(boutonValider);
        boutonsPanel.add(annulerButton);
        
      
        
        fenetreAjoutChecklist.add(taskAddPanel);
        fenetreAjoutChecklist.add(boutonsPanel);
        
        
        fenetreAjoutChecklist.setResizable(false);
        fenetreAjoutChecklist.setVisible(true);
        fenetreAjoutChecklist.setLocationRelativeTo(null); 
        
	}

	public void cancel() {
		fenetreAjoutChecklist.dispose();
	}
}
