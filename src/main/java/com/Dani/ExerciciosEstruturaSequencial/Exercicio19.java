package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado
// de download do arquivo usando este link (em minutos).
public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite o Tamanho do arquivo em MB: ");
        double tamanho = sc.nextDouble();
        System.out.println("Digite a velocidade da suas internet em Mbps: ");
        double velocidade = sc.nextDouble();
        sc.close();

        // Converter a velocidade de Mbps para MBps (1 byte = 8 bits)
        double velocidadeMBps = velocidade / 8;
        double tempoEmSegundos = tamanho / velocidadeMBps;
        double  tempoEmMinutos = tempoEmSegundos / 60;
        // Arredondar para cima o número de minutos para garantir que o tempo seja completo
        int minutos = (int) Math.ceil(tempoEmMinutos);
        System.out.printf("O tempo de download de um arquivo com %.2f MB = %d min", tamanho, minutos);

    }
}
