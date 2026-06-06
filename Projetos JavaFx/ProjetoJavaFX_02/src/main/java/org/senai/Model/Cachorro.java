package org.senai.Model;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade){
       super(nome, idade);
    }
    @Override
    public String emitirSom() {
        System.out.println("Au Au");

        return null;
    }




}
