package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vues.ViewBase_Inscription;

public class EcouteurSinscrireActionEvent implements ActionListener{
	ViewBase_Inscription parent;
	
	public EcouteurSinscrireActionEvent(ViewBase_Inscription parent){
		this.parent = parent;
	}
	
	public void actionPerformed(ActionEvent e) {
		parent.sinscrire();
	}

}
