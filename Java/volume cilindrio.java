/* Faça um programa que calcula e mostra o volume de um cilindro.*/

package com.mycompany.lista.de.exercicio.java;
import java.util.Scanner;

public class ListaDeExercicioJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       System.out.println("Digite o raio do cilindo: ");
       double raio = entrada.nextDouble();
       System.out.print("Digite a altura do cilindro: ");
       double altura = entrada.nextDouble();
       double volume = Math.PI * Math.pow(raio,2) * altura;
       System.out.println("O volume do cilindro é de: "+volume);
        }
}
