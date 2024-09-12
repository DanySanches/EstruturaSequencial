package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o
// valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
public class Exercicio20 {

    public static void main(String[] args) {
        int codigo, nPecas, codigo2, nPecas2;
        double valor, valor2, total;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código a peça: ");
        codigo = sc.nextInt();
        System.out.print("Digite número de peças: ");
        nPecas = sc.nextInt();
        System.out.print("Digite o valor: ");
        valor = sc.nextDouble();
        System.out.println("Digite o código da segunda peça");
        codigo2 = sc.nextInt();
        System.out.println("Digite o número de peças: ");
        nPecas2 = sc.nextInt();
        System.out.println("Digite o valor: ");
        valor2 = sc.nextDouble();
        total = valor * nPecas + valor2 * nPecas2;
        System.out.printf("O valor da compra é R$ %.2f " , total);

        sc.close();
    }
}