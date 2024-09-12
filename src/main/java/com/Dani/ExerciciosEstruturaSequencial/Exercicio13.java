package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

//Tendo como dado de entrada a altura (h) de uma pessoa,
// construa um algoritmo que calcule seu peso ideal,
// utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7
public class Exercicio13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu sexo: ");
        String sexo = sc.nextLine();

        System.out.println("Digite sua altura: ");
        double h = sc.nextDouble();

        if (Objects.equals(sexo, "masculino") || Objects.equals(sexo, "M") || Objects.equals(sexo, "m") ||
                Objects.equals(sexo, "Homem") || Objects.equals(sexo, "homem") || Objects.equals(sexo, "Masculino")) {

            double homem = (72.7 * h) - 58;
            System.out.printf("Seu peso ideal é %.2f Kg", homem);
        }


        if (Objects.equals(sexo, "feminino") || Objects.equals(sexo, "F") || Objects.equals(sexo, "f") ||
                Objects.equals(sexo, "Mulher") || Objects.equals(sexo, "mulher") || Objects.equals(sexo, "Feminino")) {

            double mulher = (62.1 * h) - 44.7;
            System.out.printf("Seu peso ideal é %.2f Kg", mulher);
        }

        sc.close();

    }
}
