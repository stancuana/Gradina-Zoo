package com.company;

public class Leu extends Animal{

    public Leu(String nume, int varsta, int nrCusca) {
        super(nume, varsta, nrCusca);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object object) {
        Leu leu=(Leu) object;
        return (super.getNume().equals(leu.getNume()));
    }



    @Override
    public void updateVarstaAnimal(Animal animal, int varsta) {
        super.updateVarstaAnimal(animal, varsta);
    }

    @Override
    public void mutareCusca(Animal animal, int cuscaNoua) {
        super.mutareCusca(animal, cuscaNoua);
    }

    @Override
    public String returnareNume(Animal animal) {
        return super.returnareNume(animal);
    }
}
