package com.company;

import java.util.ArrayList;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {

    public static void main(String[] args) {

        Animal urs = new Urs("Billy", 5, 90, 5,"brun");
        Animal tigru = new Tigru("Tigris", 3, 89, 6,"alb");
        Animal vultur = new Vultur("Eagle", 2, 15, 7,"Negru cu alb");
        Zoo zoo = new Zoo("Iasi", "2324534");
        zoo.adauga(urs);
        zoo.adauga(tigru);
        zoo.adauga(vultur);

        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(zoo.printeazaAnimalele().toString());
            myWriter.close();
        } catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }

        System.out.println(zoo.printeazaAnimalele().toString());

    }
}
