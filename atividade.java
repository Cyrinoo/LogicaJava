package com.mycompany.atividade;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade; 
        this.altura = altura; 
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pedro Cyrino", 17, 1.65);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
    }
}
