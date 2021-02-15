package com.company;

public class Testoasa extends Reptile{
    public Testoasa(String nume, int varsta, int greutate, int cusca, String culoare) {
        super(nume, varsta, greutate, cusca ,"Carapace", culoare);
    }

    @Override
    public void mananca(String aliment) {
        System.out.println("Testoasa " + this.getNume() + " mananca " + aliment);
    }

    @Override
    public void misca() {
        System.out.println("Testoasa " + this.getNume() + " merge.");
    }

    @Override
    public void sunet() {
        System.out.println("Testoasa " + this.getNume() + " face \" CRRR \" !");
    }
}
