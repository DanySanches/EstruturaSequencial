package com.Dani.ExerciciosEstruturaSequencial;

//Faça um Programa que pergunte quanto você ganha por hora e o
// número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//a) salário bruto.
//b)quanto pagou ao INSS.
//c)quanto pagou ao sindicato.
//d)o salário líquido.
//e)calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.

import java.util.Locale;
import java.util.Scanner;
public class Exercicio16 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da hora trabalhada: ");
        double hora = sc.nextDouble();

        System.out.println("Digite quantas horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        double salarioBruto = hora * horasTrabalhadas;

        //11%
        double impostoRenda = salarioBruto * 0.11;

        //8%
        double inss = salarioBruto * 0.08;

        //5%
        double sindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;


        System.out.printf("Salario Bruto: R$ %.2f \n", salarioBruto);
        System.out.printf("IR :         - R$ %.2f\n", impostoRenda);
        System.out.printf("INSS :       - R$ %.2f\n", inss);
        System.out.printf("Sindicato:   - R$ %.2f\n", sindicato);
        System.out.println("__________________________");
        System.out.printf("Total:         R$ %.2f ", salarioLiquido);

        sc.close();

    }
}
