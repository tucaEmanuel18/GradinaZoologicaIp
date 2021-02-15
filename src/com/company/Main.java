package com.company;

import java.util.ArrayList;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {

    public static void main(String[] args) {

        Animal urs = new Urs("Billy", 5, 90, 5,"brun");
        Animal tigru = new Tigru("Tigris", 3, 89, 6,"alb");
        Animal vultur = new Vultur("Eagle", 2, 15, 7,"Negru cu alb");
        Animal privighetoare = new Privighetoare("Mimi", 1, 1, 242, "roscat");
        Animal sarpe = new Sarpe("Sisi", 2, 1, 20, "Galben");
        Animal testoasa = new Testoasa("Bobo", 70, 25, 42, "verde-inchis");
        Zoo zoo = new Zoo("Iasi", "2324534");
        zoo.adauga(urs);
        zoo.adauga(tigru);
        zoo.adauga(vultur);
        zoo.adauga(privighetoare);
        zoo.adauga(sarpe);
        zoo.adauga(testoasa);

        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(zoo.printeazaAnimalele().toString());
            myWriter.close();
        } catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }

        System.out.println(zoo.printeazaAnimalele().toString());

        urs.mananca("mure");
        testoasa.mananca("Salata");
        tigru.sunet();
        privighetoare.sunet();
        vultur.misca();
        sarpe.misca();

    }
}
