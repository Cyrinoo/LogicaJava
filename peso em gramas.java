/* Faça um programa que 
receba o peso de uma pessoa em quilos, calcule 
e mostre esse peso em gramas. */

package com.mycompany.lista.de.exercicio.java;
import java.util.Scanner;

public class ListaDeExercicioJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite seu peso em quilos: ");
        double quilos = entrada.nextDouble();
        double gramas = (quilos*1000);
        System.out.println("Digite o peso em gramas: "+gramas);

        
    }
}
