package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("TD1 : 4.7.3");

        Arborescence arbo = new Arborescence();

        Dossier d1 = new Dossier("D1");
        Dossier d2 = new Dossier("D2");
        Dossier d3 = new Dossier("D3");
        Dossier d4 = new Dossier("D4");

        Fichier f1 = new Fichier("F1", 10);
        Fichier f2 = new Fichier("F2", 5);
        Fichier f3 = new Fichier("F3", 30);
        Fichier f4 = new Fichier("F4", 100);

        d1.add(f1);
        d2.add(f2);
        d3.add(f3);
        d3.add(f4);

        arbo.add(d1);
        arbo.add(d1, d2);
        arbo.add(d4, d3);

        d1.afficheContenu();
    }
}
