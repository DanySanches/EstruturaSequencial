package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa para uma loja de tintas.
// O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e
// que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
// usuário a quantidades de latas de tinta a serem compradas e o preço total.
public class Exercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite quantos m² serão pintados");
        double metroQuadrado = sc.nextDouble();

        //1l para 3m
        double litro = metroQuadrado / 3;

        // lata = 18l
        double lata = Math.ceil(litro / 18);

        double valor = lata * 80; //R$ 80,00


        System.out.printf("O valor de %.1f latas para %.3f m² = R$ %.2f.", lata, metroQuadrado, valor);


        sc.close();

    }

}
