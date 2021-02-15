package com.company;

public class Tigru extends Mamifere{
    public Tigru(String nume, int varsta, int greutate, int cusca, String culoareBlana) {
        super(nume, varsta, greutate, 4, cusca, culoareBlana);
    }

    @Override
    public void mananca(String aliment) {
        System.out.println("Tigrul " + this.getNume() + " mananca " + aliment);
    }

    @Override
    public void misca() {
        System.out.println("Tigrul " + this.getNume() + " alearga.");
    }

    @Override
    public void sunet() {
        System.out.println("Tigrul " + this.getNume() + " racneste \" RAWR \" !");
    }
}
