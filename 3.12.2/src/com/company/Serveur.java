package com.company;

import java.util.List;
import java.util.ArrayList;

public class Serveur {

    private List<Client> liste;

    public Serveur() {
        this.liste = new ArrayList<Client>();
    }

    public boolean connecter(Client client) {
        if (this.liste.size() < 10) {
            System.out.println("La demande du client : " + client.toString() + " est acceptée.");
            this.liste.add(client);
            return true;
        }

        else {
            System.out.println("La demande du client : " + client.toString() + " est refusée.");
            return false;
        }
    }

    public void diffuser(Client envoyeur, Client receveur, String message) {
        if (this.liste.contains(envoyeur) == false) {
            System.out.println("Impossible d'envoyer le message à " + receveur + " vous n'êtes pas connecté au serveur.");
        }

        else {
            System.out.println("Le message : " + message + " de : " + envoyeur.toString() + " à " + receveur + " est en cours d'envoi");
            receveur.recevoir(message);
        }
    }
}
