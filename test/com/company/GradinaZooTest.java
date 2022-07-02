package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GradinaZooTest {


    @Test
    public void test(){

        Leu leu=new Leu("Leu",7,10);
        Girafa girafa=new Girafa("Girafa",3,7);

        ArrayList<Animal> animale=new ArrayList<>();

        animale.add(leu);
        animale.add(girafa);


        GradinaZoo gradinaZoo=new GradinaZoo(animale);
        System.out.println(".............Afisare................");
        gradinaZoo.afisare();
        System.out.println(".............Mutare Cusca.............");
        gradinaZoo.mutareCusca(leu,55);
        gradinaZoo.afisare();
        System.out.println("..............Returnare nume.............");
        System.out.println(gradinaZoo.returnareNume(girafa));
        System.out.println("...............Update varsta..............");
        gradinaZoo.updateVarstaAnimal(leu,12);
        gradinaZoo.afisare();

    }

}