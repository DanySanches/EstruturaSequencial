package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class Exercicio15 {


    public static double Triangulo(double A, double C) {
        return A * C * 0.5;
    }

    public static double Circulo(double C) {
        //PI = 3.14159
        // return 3.14159 * C * C
        //return Math.PI * Math.pow(C , 2)
        return Math.PI * C * C;
    }

    public static double Trapezio(double A, double B, double C) {
        return (A + B) / 2 * C;
    }

    public static double Quadrado(double B) {
        return B * B;
    }

    public static double Retangulo(double A, double B) {
        return A * B;
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double A = sc.nextDouble();
        System.out.println("Digite um segundo número: ");
        double B = sc.nextDouble();
        System.out.println("Digite um terceiro número: ");
        double C = sc.nextDouble();
        double triangulo = Triangulo(A, C);
        System.out.printf("a) A área do triângulo retângulo que tem a base %.3f e altura %.3f é %.3f %n", A, C, triangulo);
        double ciruclo = Circulo(C);
        System.out.printf("b) A área do círculo cujo o raio é %.3f é = %.3f %n", C, ciruclo);
        double trapezio = Trapezio(A, B, C);
        System.out.printf("c) A área do Trapézio em que as bases são %.3f e %.3f e altura é %.3f = %.3f %n", A, B, C, trapezio);
        double quadrado = Quadrado(B);
        System.out.printf("d) A área do quadrado cujo os lados são %.3f é = %.3f %n", B, quadrado);
        double retangulo = Retangulo(A, B);
        System.out.printf("e) A área do retângulo que tem a base %.3f e altura %.3f é %.3f %n", A, B, retangulo);
        sc.close();
    }
}



