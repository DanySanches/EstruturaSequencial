package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Scanner;

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = numero.nextInt();
        System.out.println("O número informado foi " + num);

        numero.close();

    }

}
