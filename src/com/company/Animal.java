package com.company;

public abstract class Animal {
    private String nume;
    private int varsta;
    private  int greutate;
    private String protectieExterioara;

    public Animal(String nume, int varsta, int greutate, String protectieExterioara) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        this.protectieExterioara = protectieExterioara;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getGreutate() {
        return greutate;
    }

    public String getProtectieExterioara() {
        return protectieExterioara;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void setProtectieExterioara(String protectieExterioara) {
        this.protectieExterioara = protectieExterioara;
    }

    public abstract void mananca(String aliment);
    public abstract void misca();
    public abstract void sunet();

}
