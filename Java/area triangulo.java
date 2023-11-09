/* Faça um programa que pede para o usuário digitar a altura e a base de um 
triangulo, em seguida calcule e escreva a sua área.*/

package com.mycompany.lista.de.exercicio.java;
import java.util.Scanner;

public class ListaDeExercicioJava {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       System.out.println("Digite a Base do Triangulo: ");
       double base = entrada.nextDouble();
       System.out.println("Digite a altura do Triangulo: ");
       double altura = entrada.nextDouble();
       double area = (base*altura) / 2;
       System.out.println("A Área do Triagulo é:"+area);
    }
}
