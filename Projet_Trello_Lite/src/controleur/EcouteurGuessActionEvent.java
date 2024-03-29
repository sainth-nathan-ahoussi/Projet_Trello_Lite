package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vues.ViewBase_Connexion;

public class EcouteurGuessActionEvent implements ActionListener{
	ViewBase_Connexion parent;
	
	public EcouteurGuessActionEvent(ViewBase_Connexion parent){
		this.parent = parent;
	}
	
	public void actionPerformed(ActionEvent e) {
		parent.guest();
	}

}
