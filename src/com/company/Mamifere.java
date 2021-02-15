package com.company;

public abstract class Mamifere extends Animal {
    private int nrPicioare;
    private String culoareBlana;

    public Mamifere(String nume, int varsta, int greutate, int nrPicioare, int cusca, String culoareBlana) {
        super(nume, varsta, greutate, cusca, "Blana");
        this.nrPicioare = nrPicioare;
        this.culoareBlana = culoareBlana;
    }

    @Override
    public StringBuffer print() {
        StringBuffer output = super.print();
        output.append(" " + " | nrPicioare: " + nrPicioare + " | culoare blana: " + culoareBlana + "\n");

        return output;
    }
}
