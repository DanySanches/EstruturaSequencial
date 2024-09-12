package com.Dani.ExerciciosEstruturaSequencial;


import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159
public class Exercicio22 {

    public static double Area( double area, double r){

        return  area = 3.14159 * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do  raio: ");
        double raio = sc.nextDouble();
        double area = Area(raio, raio);
        System.out.printf("A área do círculo é %.4f", area);
        sc.close();
    }
}
