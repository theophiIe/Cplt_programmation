package com.company;

import java.util.List;
import java.util.ArrayList;

public class Dossier extends Fichier{
    private List<Fichier> liste;

    public Dossier(String nom) {
        super(nom, 0);
        this.liste = new ArrayList<Fichier>();
    }

    public void add(Fichier fichier) {
        this.liste.add(fichier);
        System.out.println("Ajout du fichier : " + fichier.getNom() + " dans le dossier : " + this.getNom());
        this.setTaille(this.getTaille() + fichier.getTaille());
    }

    public void afficheContenu() {
        for (Fichier fichier : liste) {
            System.out.println(fichier.getNom() + " : " + fichier.getTaille());
        }
    }
}
