package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que converta metros para centímetros.
public class Exercicio5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma medida em metros");
        double metros = sc.nextDouble();
        //1 metro = 100 cm
        double cm =  metros * 100;
        System.out.printf("Se eu transformar %.2f metros em cm, a medida vai ser %.1f cm", metros, cm);
        sc.close();
    }
}
