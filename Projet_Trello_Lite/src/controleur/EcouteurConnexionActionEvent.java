package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vues.ViewBase;
import vues.ViewBase_Connexion;

public class EcouteurConnexionActionEvent implements ActionListener {
	ViewBase_Connexion parent;
	
	public EcouteurConnexionActionEvent(ViewBase_Connexion parent){
		this.parent = parent;
	}
	
	public void actionPerformed(ActionEvent e) {
		parent.connexion();
	}

}
