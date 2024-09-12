package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
public class Exercicio7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        double dobro = area * 2;

        System.out.printf("O Dobro da área do quadrado é : %.2f " , dobro);

        sc.close();


    }
}
