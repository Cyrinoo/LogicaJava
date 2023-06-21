/* Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. 
Faça ̧a um programa que receba o salário fixo do funcionário e o 
valor de suas vendas,  calcule e mostre a comissão e seu salário final*/

package com.mycompany.lista.de.exercicio.java;
import java.util.Scanner;

public class ListaDeExercicioJava {
    public static void main(String[] args) {
    double salfixo;
    salfixo = 0.04;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o Valor da sua venda: ");
        double vendas = entrada.nextDouble();
        double salFinal = (salfixo * vendas);
        System.out.println("A comissão final do salario é de: "+salFinal); 
    }
} 
