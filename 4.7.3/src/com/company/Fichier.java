package com.company;

public class Fichier {
    private String nom;
    private int taille;

    public Fichier(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom() {
        return this.nom;
    }

    public int getTaille() {
        return this.taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
