package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Scanner;

//Faça um Programa que peça dois números e imprima a soma.
public class Exercicio3 {



    public static int Soma(int A ,int B){
        return  A + B;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int A = sc.nextInt();
        System.out.println("Digite o segundo número");
        int B = sc.nextInt();
        int somar = Soma(A, B);
        System.out.printf("%d + %d = %d", A, B, somar);
        sc.close();

    }
}
