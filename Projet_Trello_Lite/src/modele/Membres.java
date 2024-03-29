package modele;

import java.util.ArrayList;

public class Membres {

	private static int NUM_MEMBRE_GEN = 0;
	
	private int NumMembre;
	private ArrayList<String> Autorisations;
	private String TypeMembre;
	
	public Membres( String TypeMembre,ArrayList<String> autorisations ){
		this.NumMembre = NUM_MEMBRE_GEN;
		this.TypeMembre = TypeMembre;
		this.Autorisations = autorisations;
		NUM_MEMBRE_GEN++;
	}

	public ArrayList<String> GetRight() {
		return this.Autorisations;
	}
	
	public void SetRight(ArrayList<String> autorisations) {
		this.Autorisations = autorisations;
	}
	
	public int GetNumMembre() {
		return this.NumMembre;
	}
	
	public void SetNumMembre(int numMembre) {
		this.NumMembre = numMembre;
	}
	
	public String GetTypeMembre() {
		return this.TypeMembre;
	}
	
	public void SetTypeMembre(String typeMembre) {
		this.TypeMembre = typeMembre;
	}
	
	public ArrayList<String> GetAutorisations() {
		return this.Autorisations;
	}
	
	public void SetAutorisations(String autorisations ) {
		this.Autorisations.add(autorisations);
	}
	
	public boolean HasPermission(String permission) {
		boolean result = false;
		int indP = 0;
		while(!result && indP < this.Autorisations.size()) {
			result = this.Autorisations.get(indP) == permission;
			indP++;
		}
		return result;
	}
	
	public void GrantPermission(String permission) {
	    if (!HasPermission(permission)) {
	       this.Autorisations.add(permission) ;
	       System.out.println("L'autorisation a été ajouté");
	    }else {
	    	System.out.println("L'autorisation a dÃ©jÃ  Ã©tÃ© donnÃ©e");
	    }
	}
	
	public void RevokePermission(String permission) {
		boolean result = false;
		int indP = 0;
		while(indP < Autorisations.size() && !result) {
			if (this.Autorisations.get(indP) == permission) {
				this.Autorisations.remove(indP);
				System.out.println("La permission a ete retire");
				result = true;
			}
			indP++;
		}
		if (!result)
			System.out.println("La permission n'a pas ete retire");
	}
	
	public boolean IsAdmin() {
		if(this.TypeMembre == "Admin") {
			return true ;
		}else {
			return false ;
		}
	}
	
	public boolean IsRegularMember() {
		if(this.TypeMembre == "Regular") {
			return true ;
		}else {
			return false ;
		}
	}
	
	public boolean IsGuest() {
		if(this.TypeMembre == "Guest") {
			return true ;
		}else {
			return false ;
		}
	}
	
}
