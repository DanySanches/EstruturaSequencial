package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Tendo como dados de entrada a altura de uma pessoa,
// construa um algoritmo que calcule seu peso ideal,
// usando a seguinte fórmula: (72.7*altura) - 58
public class Exercicio12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.printf("O seu peso ideal é %.2f Kg", pesoIdeal);

        sc.close();
    }
}
