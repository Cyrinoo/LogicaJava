/* Faça um programa que leia o 
horário expresso em segundos e mostre-o em horas, minutos e segundos 
package com.mycompany.lista.de.exercicio.java;
import java.util.Scanner; */

public class ListaDeExercicioJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite seu horario em segundos: ");
        double segundos = entrada.nextDouble();
        double horas = (segundos / 3600);
        double minutos = (segundos % 3600)/60;
System.out.println("O horario em segundos é de: "+segundos+", Pode se dizer que em minutos é de: "+minutos+" e em horas é de: " + horas);       
    }
}
