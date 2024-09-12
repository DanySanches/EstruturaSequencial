package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
public class Exercicio21 {

    public static int Expressao(int A, int B, int C, int D){
        return  A * B - C * D;
    }

    public static void main(String[] args) {
        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A : ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B : ");
        B = sc.nextInt();
        System.out.println("Digite o valor de C : ");
        C = sc.nextInt();
        System.out.println("Digite o valor de D : ");
        D = sc.nextInt();
        int  resultado = Expressao(A,B,C,D);
        System.out.printf("%d x %d - %d x %d = %d", A, B, C,D, resultado);
        sc.close();

    }
}
