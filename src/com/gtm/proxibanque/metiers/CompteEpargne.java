package com.gtm.proxibanque.metiers;

public class CompteEpargne extends Compte {
	private float taux;
	
	public void afficherTaux()
	{
		System.out.println("le taux du compte épargne s'élève à "+taux);
	}

}
