package com.company;

/**
 * Classe ChaineCryptee
 *
 * @author (Théophile Molinatti 21707388)
 * @version (30/09/2021 TD1)
 */
public class ChaineCryptee {
    private String chaine;
    private int decalage;

    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    private ChaineCryptee(String chaine, int decalage) {
        this.chaine = chaine;
        this.decalage = decalage;
    }

    public static ChaineCryptee deCryptee(String chaine, int decalage) {
        return new ChaineCryptee(chaine, decalage);
    }

    public static ChaineCryptee deEnClair(String chaine, int decalage) {
        return new ChaineCryptee(chaine, decalage);
    }

    /**
     * Méthode qui permet de crypter une chaine de caractère
     *
     * @return  La chaine crypté
     */
    public String crypte() {
        String chaine_crypte = "";

        if (this.chaine == null) {
            System.out.println("ERR : chaine vide");
        }

        else {
            for (int i = 0; i < chaine.length(); i++) {
                chaine_crypte += decaleCaractere(this.chaine.charAt(i), this.decalage);
            }
        }

        return chaine_crypte;
    }

    /**
     * Méthode qui permet de décrypter une chaine de caractère
     *
     * @return  La chaine décrypté
     */
    public String decrypte() {
        String chaine_clair = "";

        if (this.chaine == null) {
            System.out.println("ERR : chaine vide");
        }

        else {
            for (int i = 0; i < chaine.length(); i++) {
                chaine_clair += decaleCaractere(this.chaine.charAt(i), -this.decalage);
            }
        }

        return chaine_clair;
    }

    /**
     * Méthode qui permet de décaler chaque caractère de la chaine de caractère
     *
     * @param c le caractère à décaler
     * @param decalage décalage du caractère
     * @return     La chaine décrypté
     */
    private static char decaleCaractere(char c, int decalage) {
        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }
}
