/* Faça um programa que leia as seguintes informações de uma pessoa:  
nome, idade, peso, altura; tudo como String. 
A seguir, converse para os tipos corretos e escreva os dados na tela.
*/
package com.mycompany.lista.de.exercicio.java;
import java.util.Scanner;

public class ListaDeExercicioJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite sua idade: ");
        String idadeS = entrada.nextLine();
        int idade = Integer.parseInt(idadeS);
        
        System.out.println("Digite seu peso: ");
        String pesoS = entrada.nextLine();
        double peso = Double.parseDouble(pesoS);

        System.out.println("Digite sua altura: ");
        String alturaS = entrada.nextLine();
        double altura = Double.parseDouble(alturaS);
        
        System.out.println("nome:"+nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        
        entrada.close();
        
        
}}