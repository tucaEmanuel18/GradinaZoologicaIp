package com.company;

public class Vultur extends Pasari{
    public Vultur(String nume, int varsta, int greutate, int cusca, String culoarePene) {
        super(nume, varsta, greutate, cusca, culoarePene);
    }

    @Override
    public void mananca(String aliment) {
        System.out.println("Vulturul "  + this.getNume() + " mananca " + aliment + ".");
    }

    @Override
    public void misca() {
        System.out.println("Vulturul " + this.getNume() + " se misca!");
    }

    @Override
    public void sunet() {
        System.out.println("Vulturul " + this.getNume()  + " face \"yaaaaa\"!");
    }
}
