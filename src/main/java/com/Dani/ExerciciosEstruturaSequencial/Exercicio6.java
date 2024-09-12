package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Scanner;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é %.2f cm", area);

        sc.close();
    }
}
