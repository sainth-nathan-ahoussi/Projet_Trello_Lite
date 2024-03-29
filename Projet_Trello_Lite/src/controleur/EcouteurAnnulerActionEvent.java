package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;

import vues.ViewBase;

public class EcouteurAnnulerActionEvent implements ActionListener {
	ViewBase parent;
	public EcouteurAnnulerActionEvent(ViewBase parent){
		this.parent = parent;
	}
	public void actionPerformed(ActionEvent e) {
		parent.cancel();
	}
	
}

