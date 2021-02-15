package com.company;

public class Sarpe extends Reptile{
    public Sarpe(String nume, int varsta, int greutate, int cusca, String culoare) {
        super(nume, varsta, greutate, cusca,"Solzi", culoare);
    }

    @Override
    public void mananca(String aliment) {
        System.out.println("Sarpele " + this.getNume() + " mananca " + aliment);
    }

    @Override
    public void misca() {
        System.out.println("Sarpele " + this.getNume() + " se taraste prin iarba.");
    }

    @Override
    public void sunet() {
        System.out.println("Sarpele " + this.getNume() + " face \" sst \"!");
    }
}
