package com.company;

public abstract class Animal {
    private String nume;
    private int varsta;
    private  int greutate;
    private String protectieExterioara;
    private int cusca;

    public Animal(String nume, int varsta, int greutate, int cusca, String protectieExterioara) {
        if(varsta < 0 || varsta > 100) {
            varsta = 0;
        }
        if(greutate < 0 || greutate > 500) {
            greutate = 0;
        }
        if(cusca < 0 || cusca > 1000) {
            cusca = 0;
        }
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        this.cusca = cusca;
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
    public StringBuffer print(){
        StringBuffer output = new StringBuffer();
        output.append(nume + " | varsta: " + varsta + " | greutate: " + greutate
                + " | cusca: " + cusca + " | protectieExterioara: " + protectieExterioara);
        return output;
    }

}
