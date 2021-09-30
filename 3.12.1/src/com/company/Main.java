package com.company;

/**
 * Classe Main
 *
 * @author (Théophile Molinatti 21707388)
 * @version (30/09/2021 TD1)
 */
public class Main {

    public static void main(String[] args) {
        ChaineCryptee test = ChaineCryptee.deCryptee(null, 5);
        System.out.println(test.decrypte());

        ChaineCryptee test2 = ChaineCryptee.deEnClair(null, 5);
        System.out.println(test2.crypte());
    }
}
