package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("TD1 : 3.12.2");

        Serveur serveur = new Serveur();
        Client c1 = new Client("Théophile");
        Client c2 = new Client("Clothilde");
        Client c3 = new Client("Faustine");

        c1.seConnecter(serveur);
        c2.seConnecter(serveur);

        c1.envoyer(serveur, c2, "Bonjour, ça va?");
        c3.envoyer(serveur, c1, "ouais je sais");
        c2.envoyer(serveur, c1, "ouais, et toi?");
    }
}
