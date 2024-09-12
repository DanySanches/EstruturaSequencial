package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
public class Exercicio4 {


    public static float Soma(float n1, float n2, float n3, float n4){
        return n1 + n2 + n3 + n4;
    }

    public static float Media(float soma){
        return soma/4;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float n3 = sc.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float n4 = sc.nextFloat();
        float somar = Soma(n1, n2, n3, n4);
        float calcularMedia = Media(somar);
        System.out.printf("A média do aluno foi = %.2f", calcularMedia);
        sc.close();
    }

}
