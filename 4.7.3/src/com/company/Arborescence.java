package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Arborescence {
    private HashMap<Dossier, List<Dossier>> arborescence;
    private Dossier root = new Dossier("root");

    public Arborescence() {
        this.arborescence = new HashMap<Dossier, List<Dossier>>();
        List<Dossier> liste = new ArrayList<Dossier>();
        this.arborescence.put(root, liste);
    }

    public void add(Dossier ajout_dossier) {
        this.arborescence.get(this.root).add(ajout_dossier);
    }

    public void add(Dossier dossier, Dossier ajout_dossier) {
        if (this.arborescence.containsKey(dossier) == false) {
            System.out.println("ERR : le dossier " + dossier.getNom() + " n'existe pas");
        }

        else {
            if (this.arborescence.get(dossier).isEmpty()) {
                List<Dossier> liste = new ArrayList<Dossier>();
                liste.add(ajout_dossier);
                this.arborescence.replace(dossier, liste);
            }

            else {
                this.arborescence.get(dossier).add(ajout_dossier);
            }
        }
    }
}
