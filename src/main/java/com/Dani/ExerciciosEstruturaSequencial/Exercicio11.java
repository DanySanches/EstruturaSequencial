package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça 2 números inteiros e um número real.
// Calcule e mostre:
// a. o produto do dobro do primeiro com metade do segundo.
//b. a soma do triplo do primeiro com o terceiro.
//c.o terceiro elevado ao cubo.
public class Exercicio11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int A = sc.nextInt();

        System.out.println("Digite mais um número inteiro: ");
        int B = sc.nextInt();

        System.out.println("Digite um número real: ");
        double C = sc.nextDouble();

        int a = (A * 2) * (B / 2);

        double b = A * 3 + C;

        double c = Math.pow(C, 3);

        System.out.println("Primeiro = " + A + " ,Segundo = " + B + " ,Terceiro = " + C);
        System.out.printf(" a. o produto do dobro do primeiro com metade do segundo = %d %n" , a);
        System.out.printf(" b. a soma do triplo do primeiro com o terceiro = %.2f %n", b);
        System.out.printf(" c.o terceiro elevado ao cubo = %.2f %n", c);

        sc.close();

    }
}
