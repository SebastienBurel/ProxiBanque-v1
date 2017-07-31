package com.gtm.proxibanque.metiers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Conseiller extends Personne {
	private Collection<Client> clients;

	public Conseiller() {
		this.clients = new HashSet<>();
	}

	public void creerClient(Client client) {

		if (clients.size() < 10) {

			this.clients.add(client);
			System.out.println("Le client " + client.getNom() + " " + client.getPrenom() + " a bien �t� cr�� dans la base de donn�es");
		} else {
			System.out.println("Impossible de cr�er un nouveau client : vous ne pouvez pas g�rer plus de 10 clients.");

		}

	}

	public void modifierClient() {

	}

	public void lireClient(String nom, String prenom) {
		for (Client client : this.clients) {
			if (nom == client.getNom() && prenom == client.getPrenom()) {
				System.out.println("Donn�es du client " + nom + " " + prenom + " : Adresse = " + client.getAdresse() + ", code postal = " + client.getCodepostal() + ", ville = " + client.getVille() + ", numero de t�l�phone = "
						+ client.getNumerotelephone());
			} else {
				System.out.println("Cette personne n'est pas enregistr�e comme client.");
			}

		}

	}

//	public void supprimerClient(String nom, String prenom) {
//		for (Client client : this.clients) {
//			if (nom == client.getNom() && prenom == client.getPrenom()) {
//				System.out.println("Le client " + client.getNom() + " " + client.getPrenom() + " a bien �t� supprim� dans la base de donn�es");
//				this.clients.remove(client);
//				break;
//
//			} else {
//				System.out.println("Action impossible, ce client n'existe pas");
//			}
//		}
//
//	}

	public void supprimerClient(String nom, String prenom) {
		Iterator<Client> it = clients.iterator();
		while (it.hasNext()) {
			Client client = it.next();
			if (nom == client.getNom() && prenom == client.getPrenom()) {
				it.remove();
				System.out.println("Le client " + client.getNom() + " " + client.getPrenom() + " a bien �t� supprim� dans la base de donn�es");
				System.out.println(clients.size());
			} else {

				System.out.println("Action impossible, ce client n'existe pas");
			}

		}
	}

	
		
	}

