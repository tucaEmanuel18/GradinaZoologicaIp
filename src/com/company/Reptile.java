package com.company;

public abstract class Reptile extends Animal {
    private String culoare;

    public Reptile(String nume, int varsta, int greutate, int cusca, String protectieExterioara, String culoare) {
        super(nume, varsta, greutate, cusca, protectieExterioara);
        this.culoare = culoare;
    }
}
