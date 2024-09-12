package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit
public class Exercicio10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double Fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("A Temperatura em Fahrenheit: %.2f", Fahrenheit);

        sc.close();

    }
}
