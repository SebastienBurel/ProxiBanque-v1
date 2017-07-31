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
			System.out.println("Le client " + client.getNom() + " " + client.getPrenom() + " a bien été créé dans la base de données");
		} else {
			System.out.println("Impossible de créer un nouveau client : vous ne pouvez pas gérer plus de 10 clients.");

		}

	}

	public void modifierClient() {

	}

	public void lireClient(String nom, String prenom) {
		for (Client client : this.clients) {
			if (nom == client.getNom() && prenom == client.getPrenom()) {
				System.out.println("Données du client " + nom + " " + prenom + " : Adresse = " + client.getAdresse() + ", code postal = " + client.getCodepostal() + ", ville = " + client.getVille() + ", numero de téléphone = "
						+ client.getNumerotelephone());
			} else {
				System.out.println("Cette personne n'est pas enregistrée comme client.");
			}

		}

	}

//	public void supprimerClient(String nom, String prenom) {
//		for (Client client : this.clients) {
//			if (nom == client.getNom() && prenom == client.getPrenom()) {
//				System.out.println("Le client " + client.getNom() + " " + client.getPrenom() + " a bien été supprimé dans la base de données");
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
				System.out.println("Le client " + client.getNom() + " " + client.getPrenom() + " a bien été supprimé dans la base de données");
				System.out.println(clients.size());
			} else {

				System.out.println("Action impossible, ce client n'existe pas");
			}

		}
	}

	
		
	}

