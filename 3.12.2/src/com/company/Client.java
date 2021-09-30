package com.company;

public class Client {
    private String nom;

    public Client(String nom) {
        this.nom = nom;
    }

    public boolean seConnecter(Serveur serveur) {
        System.out.println("Demande de connexion pour : " + this.nom);
        return serveur.connecter(this);
    }

    public void envoyer(Serveur serveur, Client client, String message) {
        System.out.println(this.nom + " envoie : " + message + " à " + client.toString());
        serveur.diffuser(this, client, message);
    }

    public void recevoir(String message) {
        System.out.println("Message reçu : " + message);
    }

    public String toString() {
        return this.nom;
    }
}
