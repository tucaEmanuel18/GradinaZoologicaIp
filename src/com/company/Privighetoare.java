package com.company;

public class Privighetoare extends Pasari{
    public Privighetoare(String nume, int varsta, int greutate, int cusca, String culoarePene) {
        super(nume, varsta, greutate, cusca,  culoarePene);
    }

    @Override
    public void mananca(String aliment) {
        System.out.println("Privighetoarea " + this.getNume() + " mananca " + aliment);
    }

    @Override
    public void misca() {
        System.out.println("Privighetoarea " + this.getNume() + " pluteste in aer.");
    }

    @Override
    public void sunet() {
        System.out.println("Privighetoarea " + this.getNume() + " face \"cip-cirip\".");
    }
}
