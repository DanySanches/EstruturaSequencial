package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
public class Exercicio8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada: ");
        double hora = sc.nextDouble();

        System.out.println("Digite quantas horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        double salario = hora * horasTrabalhadas;

        System.out.printf("O seu salário é  %.2f reais", salario);
        sc.close();

    }
}
