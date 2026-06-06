package org.senai.Model;


public class Animal {

    //Atributos
    String nome;
    int idade;

    public Animal() {}

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Metodos
    String emitirSom(){

        return null;
    };

    @Override
    public String toString() {
        return "Nome: " + nome + " Idade: " + idade + "(" + getClass().getSimpleName() + ")";
    }
}
