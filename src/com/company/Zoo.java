package com.company;

import java.util.ArrayList;

public class Zoo {
    private String oras;
    private String adresa;
    private ArrayList<Animal> listaAnimale;

    public Zoo(String oras, String adresa) {
        this.oras = oras;
        this.adresa = adresa;
        this.listaAnimale = new ArrayList<Animal>();
    }

    public void adauga(Animal animal){
        listaAnimale.add(animal);
    }

    public boolean elimina(Animal animal){
        if( listaAnimale.remove(animal)){
            return true;
        }
        return false;
    }

    public StringBuffer printeazaAnimalele(){
        StringBuffer output = new StringBuffer();
        for(Animal animal : listaAnimale){
            output.append(animal.print());
        }
        return output;
    }
}
