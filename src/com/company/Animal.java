package com.company;

public class Animal extends Protocol{

    private String nume;
    private int varsta;
    private int nrCusca;


    public Animal(String nume, int varsta, int nrCusca) {
        this.nume=nume;
        this.varsta=varsta;
        this.nrCusca=nrCusca;
    }

    public Animal() {
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getNrCusca() {
        return nrCusca;
    }

    public void setNrCusca(int nrCusca) {
        this.nrCusca = nrCusca;
    }


    @Override
    public String toString() {
        return
                "Nume: " + this.nume + "\n"+
                "Varsta: " + this.varsta +"\n"+
                "Nr cusca: " + this.nrCusca +"\n";
    }

    @Override
    public boolean equals(Object object){

        Animal animal=(Animal) object;
        return (this.nume.equals(animal.nume));
    }


    @Override
    public void updateVarstaAnimal(Animal animal,int varsta) {
        animal.setVarsta(varsta);
        animal.getVarsta();
    }

    @Override
    public void mutareCusca(Animal animal,int cuscaNoua) {
        animal.setNrCusca(cuscaNoua);
        animal.getNrCusca();
    }

    @Override
    public String returnareNume(Animal animal) {
        return animal.getNume();
    }
}
