package com.company;

final class Fraction {
    private double numerateur;
    private double denominateur;

    public Fraction(double numerateur, double denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur) {
        this(numerateur, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    public final static Fraction ZEROS = new Fraction(0, 1);
    public final static Fraction UN = new Fraction(1, 1);

    public void getNumerateur() {
        System.out.println("numérateur : " + this.numerateur);
    }

    public void getDenominateur() {
        System.out.println("dénominateur : " + this.denominateur);
    }

    public void getFraction() {
        System.out.println("Fraction : " + this.numerateur + "/" + this.denominateur);
    }

    public double getValeur() {
        return (this.numerateur/this.denominateur);
    }

    public Fraction addition(Fraction fraction) {
        double new_numerateur = (this.numerateur * fraction.denominateur) + (fraction.numerateur * this.denominateur);
        double new_denominateur = this.denominateur * fraction.denominateur;
        return new Fraction(new_numerateur, new_denominateur);
    }

    private int pgcd(double numerateur, double denominateur) {
        int val = 0;
        for(int i = 1; i <= numerateur && i <= denominateur; i++) {
            if((numerateur % i == 0) && (denominateur % i == 0))
                val = i;
        }

        return val;
    }

    public boolean sontEgales(Fraction fraction) {
        int frac1_pgcd = pgcd(this.numerateur, this.denominateur);
        int frac2_pgcd = pgcd(fraction.numerateur, fraction.denominateur);

        System.out.println(frac1_pgcd + "   " + frac2_pgcd);

        if ((this.numerateur/frac1_pgcd == fraction.numerateur/frac2_pgcd) && (this.denominateur/frac1_pgcd == fraction.denominateur/frac2_pgcd)) {
            return true;
        }

        else {
            return false;
        }
    }

    public boolean sontLesMeme(Fraction fraction) {
        if (this.equals(fraction)) {
            return true;
        }

        else {
            return false;
        }
    }

    public String toString() {
        return (this.numerateur + "/" + this.denominateur);
    }
}
