package com.company;

public abstract class Mamifere extends Animal {
    private int nrPicioare;
    private String culoareBlana;

    public Mamifere(String nume, int varsta, int greutate, int nrPicioare, String culoareBlana) {
        super(nume, varsta, greutate, "Blana");
        this.nrPicioare = nrPicioare;
        this.culoareBlana = culoareBlana;
    }


}
