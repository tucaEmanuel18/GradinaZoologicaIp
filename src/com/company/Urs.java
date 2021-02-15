package com.company;

public class Urs extends Mamifere{

    public Urs(String nume, int varsta, int greutate, String culoareBlana) {
        super(nume, varsta, greutate, 4, culoareBlana);
    }

    @Override
    public void mananca(String aliment) {
        System.out.println("Ursul "  + this.getNume() + " mananca " + aliment);
    }

    @Override
    public void misca() {
        System.out.println("Ursul " + this.getNume() + " se misca!");
    }

    @Override
    public void sunet() {
        System.out.println("Ursul " + this.getNume()  + " face \"mooor\"!");
    }
}
