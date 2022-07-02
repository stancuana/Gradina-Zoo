package com.company;

import java.util.ArrayList;

public class GradinaZoo extends Animal{

    private ArrayList<Animal> animals;


    public GradinaZoo(ArrayList<Animal> animals){
        this.animals=animals;
    }



    @Override
    public void updateVarstaAnimal(Animal animal,int varsta) {
        for(Animal animal1:animals){
            animal1.updateVarstaAnimal(animal1,varsta);
        }
    }

    @Override
    public void mutareCusca(Animal animal,int cuscaNoua) {
        for(Animal animal1:animals){
            animal1.mutareCusca(animal1,cuscaNoua);
        }
    }

    @Override
    public String returnareNume(Animal animal) {
        for(Animal animal1:animals){
            return animal1.returnareNume(animal1);
        }
        return null;
    }


    public void afisare(){

        for(int i=0; i<animals.size();i++){

            System.out.println(animals.get(i).toString());
        }
    }


}
