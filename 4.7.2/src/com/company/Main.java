package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("TD1 : 4.7.2");

        Fraction test = new Fraction(8, 10);
        test.getNumerateur();
        test.getDenominateur();
        test.getFraction();
        System.out.println(test.getValeur());
        System.out.println(test.toString());

        Fraction test2 = new Fraction(80, 100);

        if (test2.sontEgales(test)) {
            System.out.println(test2.toString() + " et " + test.toString() + " sont égales");
        }

        else {
            System.out.println(test2.toString() + " et " + test.toString() + " ne sont pas égales");
        }

        if (test2.sontLesMeme(test)) {
            System.out.println(test2.toString() + " et " + test.toString() + " sont les mêmes");
        }

        else {
            System.out.println(test2.toString() + " et " + test.toString() + " ne sont pas les mêmes");
        }
    }
}
