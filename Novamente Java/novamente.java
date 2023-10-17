package com.mycompany.pessoinha;
public class Pessoinha {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Pietra";
        pessoa1.idade = 16;
        pessoa1.altura = 1.56;
        System.out.println(pessoa1.nome+" tem "+pessoa1.idade+" anos e "+pessoa1.altura+" metros de altura!");
    }
}