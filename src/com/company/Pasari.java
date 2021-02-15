package com.company;

public abstract class Pasari extends Animal{
    private String culoarePene;

    public Pasari(String nume, int varsta, int greutate, int cusca, String culoarePene) {
        super(nume, varsta, greutate, cusca , "Pene");
        this.culoarePene = culoarePene;
    }

    @Override
    public StringBuffer print() {
        StringBuffer output = super.print();
        output.append(" | culoare pene: " + culoarePene + "\n");

        return output;
    }

}
