package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do
estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por
quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
Imprima os dados do programa com as mensagens adequadas.*/
public class Exercicio14 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos Kg de peixe: ");
        double kg = sc.nextDouble();

        double limite = 50.0;
        double multa = 4.0;

        if (kg > limite) {
            double excesso = kg - limite;
            double total = excesso * multa;
            System.out.printf("O valor da multa é R$ %.2f por Kg, você ultrapassou %.3f kg \n", multa, excesso);
            System.out.printf("O valor total da sua multa é R$ %.2f \n", total);

        } else {
            System.out.printf("Não foi gerada multa, o limite é 50Kg e sua pesca pesou %.3f kg", kg);
        }

        sc.close();
    }
}
