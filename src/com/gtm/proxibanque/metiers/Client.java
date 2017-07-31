package com.gtm.proxibanque.metiers;

public class Client extends Personne {
	
	private float soldeTotal;
	private Compte compte;
	
	
	public Client(String nom, String prenom, String adresse, int codepostal, String ville, String numerotelephone) {
		super(nom, prenom, adresse, codepostal, ville, numerotelephone);
	}
	
	
	

}
