package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça a temperatura em graus Fahrenheit,
// transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).
public class Exercicio9 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = 5 * ((fahrenheit -32) / 9) ;

        System.out.printf("A temperatura em Celsius é %.2fº ",celsius);

        sc.close();

    }
}
