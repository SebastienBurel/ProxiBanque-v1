package com.gtm.proxibanque.presentation;

import com.gtm.proxibanque.metiers.Client;
import com.gtm.proxibanque.metiers.Conseiller;

public class MainProxiBanque {

	public static void main(String[] args) {
		
		Conseiller a = new Conseiller();
		a.creerClient(new Client("Altier", "Jules", "700 route du paradis", 80000, "Nice", "568888"));
		a.creerClient(new Client("Burel", "Sebastien", "643 route de Layrac", 31340, "Toulouse", "0611167004"));
		a.creerClient(new Client("Burel", "Jonathan", "700 route de Layrac", 78555, "Bordeaux", "65"));
		a.creerClient(new Client("XYZ", "Patrick", "rue des pilotis", 50000, "Paris", "5687"));
		
		
		a.supprimerClient("Burel", "Jonathan");
		
		a.lireClient("Burel", "Sebastien");
	}

}
