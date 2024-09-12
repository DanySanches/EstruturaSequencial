package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
public class Exercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite quantos m² serão pintados");
        double metroQuadrado = sc.nextDouble();

        // acrescentar os 10% de folga
        double areaFolga = metroQuadrado * 1.1;

        //1 litro para 6m
        double litros = areaFolga / 6;

        //a) comprar apenas as latas de 18l no  valor de 80.
        double somenteLatas = Math.ceil(litros / 18);
        double valorLatas = somenteLatas * 80;

        //b)comprar apenas as latas de 3,6l no  valor de 25.
        double somenteGaloes = Math.ceil(litros / 3.6);
        double valorGaloes = somenteGaloes * 25;

        //c) Misturar ambos para minimizar o desperdicio
        // calcular a qtd de latas necessarias
        double lataMisturada = Math.floor(litros / 18);

        // restante dos litros a serem comprados
        double restante = litros - (lataMisturada * 18);

        // calcular a qtd de galões necessarios
        double galaoMisturado = Math.ceil(restante / 3.6);
        double valorLataMisturada = lataMisturada * 80;
        double valorGalaoMisturado = galaoMisturado * 25;
        double valorTotal = valorLataMisturada + valorGalaoMisturado;

        System.out.printf("Área a ser pintada: %.2f m²\n", metroQuadrado);
        System.out.printf("Quantidade de tinta necessária (com folga): %.2f litros\n\n", litros);

        System.out.println("Opção 1: Comprar apenas latas de 18 litros");
        System.out.printf("Quantidade de latas: %.0f\n", somenteLatas);
        System.out.printf("Preço total: R$ %.2f\n\n", valorLatas);

        System.out.println("Opção 2: Comprar apenas galões de 3,6 litros");
        System.out.printf("Quantidade de galões: %.0f\n", somenteGaloes);
        System.out.printf("Preço total: R$ %.2f\n\n", valorGaloes);

        System.out.println("Opção 3: Misturar latas e galões");
        System.out.printf("Quantidade de latas: %.0f\n", lataMisturada);
        System.out.printf("Quantidade de galões: %.0f\n", galaoMisturado);
        System.out.printf("Preço total: R$ %.2f\n", valorTotal);

        sc.close();
    }
}
