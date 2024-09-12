# 📚 Exercícios de Estrutura Sequencial em Java

Bem-vindo ao repositório de exercícios de estrutura sequencial em Java! 🚀 Este repositório contém uma série de programas simples para ajudar a entender os conceitos básicos de programação em Java. Abaixo, você encontrará uma breve descrição de cada exercício, juntamente com os códigos correspondentes.

## Exercícios

### 1. Olá Mundo
- **Descrição**: Um programa simples que exibe a mensagem "Alô Mundo!!" na tela.
```java
public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Alô Mundo!!");
    }
}
```
🔍 Objetivo: Introduzir a estrutura básica de um programa Java.

### 2. Número Informado
- **Descrição:** O programa solicita um número ao usuário e exibe a mensagem "O número informado foi [número]".

```java
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = numero.nextInt();
        System.out.println("O número informado foi " + num);
        numero.close();
    }
} 
```
🔍 Objetivo: Praticar a entrada e saída de dados em Java.

###Soma de Dois Números
- **Descrição:** O programa solicita dois números ao usuário e imprime a soma deles.

```java
import java.util.Scanner;

public class Exercicio3 {
    public static int Soma(int A, int B) {
        return A + B;
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
```
🔍 Objetivo: Demonstrar o uso de métodos e operações aritméticas.

###Média das Notas
- **Descrição:** O programa pede quatro notas bimestrais e calcula a média.

```java
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static float Soma(float n1, float n2, float n3, float n4) {
        return n1 + n2 + n3 + n4;
    }

    public static float Media(float soma) {
        return soma / 4;
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
```

🔍 Objetivo: Praticar a soma e a média de números.

##Conversão de Metros para Centímetros
- **Descrição:** O programa converte uma medida em metros para centímetros.

```java
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma medida em metros");
        double metros = sc.nextDouble();
        double cm = metros * 100;
        System.out.printf("Se eu transformar %.2f metros em cm, a medida vai ser %.1f cm", metros, cm);
        sc.close();
    }
}
```
🔍 Objetivo: Converter unidades de medida.

##Área de um Círculo
- **Descrição:** O programa calcula a área de um círculo com base no raio fornecido.

```java
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é %.2f cm²", area);
        sc.close();
    }
}
```
🔍 Objetivo: Calcular a área de uma figura geométrica.

### Área do Quadrado
- **Descrição:**  O programa calcula a área de um quadrado e mostra o dobro dessa área.

```java
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        double dobro = area * 2;
        System.out.printf("O dobro da área do quadrado é : %.2f", dobro);
        sc.close();
    }
}

```
🔍 Objetivo: Trabalhar com operações matemáticas e áreas.

### Salário Mensal
- **Descrição:**  O programa calcula o total do salário com base no valor da hora trabalhada e o número de horas trabalhadas no mês.

```java
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da hora trabalhada: ");
        double hora = sc.nextDouble();
        System.out.println("Digite quantas horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        double salario = hora * horasTrabalhadas;
        System.out.printf("O seu salário é %.2f reais", salario);
        sc.close();
    }
}
```
🔍 Objetivo: Calcular salários com base em entradas do usuário.

###Conversão Fahrenheit para Celsius
- **Descrição:** O programa transforma a temperatura fornecida em Fahrenheit para Celsius.

```java
import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = 5 * ((fahrenheit - 32) / 9);
        System.out.printf("A temperatura em Celsius é %.2fº", celsius);
        sc.close();
    }
}
```
🔍 Objetivo: Realizar conversão de unidades de temperatura.


### Conversão Celsius para Fahrenheit

- **Descrição**: Solicita a temperatura em graus Celsius e a transforma para graus Fahrenheit.

 ```java
  package com.Dani.ExerciciosEstruturaSequencial;

  import java.util.Locale;
  import java.util.Scanner;

  public class Exercicio10 {

      public static void main(String[] args) {

          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);

          System.out.println("Digite a temperatura em Celsius: ");
          double celsius = sc.nextDouble();

          double Fahrenheit = (celsius * 9/5) + 32;

          System.out.printf("A Temperatura em Fahrenheit: %.2f", Fahrenheit);

          sc.close();
      }
  }
 ```
🔍 Objetivo: Realizar conversão de unidades de temperatura.

### Cálculos Diversificados com Números Inteiros e Reais

-  **Descrição**: Solicita dois números inteiros e um número real. Calcula e mostra:
a. o produto do dobro do primeiro com metade do segundo.
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int A = sc.nextInt();

        System.out.println("Digite mais um número inteiro: ");
        int B = sc.nextInt();

        System.out.println("Digite um número real: ");
        double C = sc.nextDouble();

        int a = (A * 2) * (B / 2);
        double b = A * 3 + C;
        double c = Math.pow(C, 3);

        System.out.println("Primeiro = " + A + " ,Segundo = " + B + " ,Terceiro = " + C);
        System.out.printf(" a. o produto do dobro do primeiro com metade do segundo = %d %n" , a);
        System.out.printf(" b. a soma do triplo do primeiro com o terceiro = %.2f %n", b);
        System.out.printf(" c. o terceiro elevado ao cubo = %.2f %n", c);

        sc.close();
    }
}
```

🔍 Objetivo: realizar cálculos aritméticos diversos com dois números inteiros e um número real.

### Cálculo Peso ideal

- **Descrição**:  Calcula o peso ideal de uma pessoa com base em sua altura usando a fórmula (72.7 * altura) - 58.

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.printf("O seu peso ideal é %.2f Kg", pesoIdeal);

        sc.close();
    }
}
```
🔍 Objetivo: Calcular o peso ideal de uma pessoa com base na fórmula descrita

###Cálculo Peso Ideal baseado no sexo

- **Descrição**:  Calcula o peso ideal com base na altura e no sexo da pessoa:
Para homens: (72.7 * altura) - 58
Para mulheres: (62.1 * altura) - 44.7

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu sexo: ");
        String sexo = sc.nextLine();

        System.out.println("Digite sua altura: ");
        double h = sc.nextDouble();

        if (Objects.equals(sexo, "masculino") || Objects.equals(sexo, "M") || Objects.equals(sexo, "m") ||
                Objects.equals(sexo, "Homem") || Objects.equals(sexo, "homem") || Objects.equals(sexo, "Masculino")) {

            double homem = (72.7 * h) - 58;
            System.out.printf("Seu peso ideal é %.2f Kg", homem);
        }

        if (Objects.equals(sexo, "feminino") || Objects.equals(sexo, "F") || Objects.equals(sexo, "f") ||
                Objects.equals(sexo, "Mulher") || Objects.equals(sexo, "mulher") || Objects.equals(sexo, "Feminino")) {

            double mulher = (62.1 * h) - 44.7;
            System.out.printf("Seu peso ideal é %.2f Kg", mulher);
        }

        sc.close();
    }
}
```

🔍 Objetivo: Calcular o peso ideal com base na altura e no sexo da pessoa.

###Excesso de Peso
- **Descrição**: Calcula a multa para João Papo-de-Pescador com base no peso dos peixes, considerando uma multa de R$ 4,00 por quilo excedente do limite de 50 quilos.

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

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
```

🔍 Objetivo: Calcular a multa para João Papo-de-Pescador com base no peso dos peixes excedentes.

###Cálculo Geométrico 
- **Descrição**: Calcular áreas de diferentes figuras geométricas com base em três valores fornecidos.
a) Área do triângulo retângulo.
b) Área do círculo.
c) Área do trapézio.
d) Área do quadrado.
e) Área do retângulo.

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

    public static double Triangulo(double A, double C) {
        return A * C * 0.5;
    }

    public static double Circulo(double C) {
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
```
🔍 Objetivo: Calcular a área de figuras geométricas.

###Salário com Descontos

- **Descrição:** Calcula o salário bruto, descontos (IR, INSS, e sindicato) e o salário líquido com base no valor da hora trabalhada e no número de horas trabalhadas no mês.

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double inss = salarioBruto * 0.08;
        double ir = salarioBruto * 0.11;
        double sindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - (inss + ir + sindicato);

        System.out.printf("Salário Bruto: R$ %.2f %n", salarioBruto);
        System.out.printf("Desconto do INSS: R$ %.2f %n", inss);
        System.out.printf("Desconto do IR: R$ %.2f %n", ir);
        System.out.printf("Desconto do Sindicato: R$ %.2f %n", sindicato);
        System.out.printf("Salário Líquido: R$ %.2f %n", salarioLiquido);

        sc.close();
    }
}
```
🔍 Objetivo: Calcular salários  e seus  descontos com base em entradas do usuário.

### Cálculo de Latas de Tinta para Pintura: Quantidade e Custo
- **Descrição:** - Calcular a quantidade de latas de tinta necessárias para pintar uma área, considerando que a tinta cobre 3 metros quadrados por litro e que as latas têm 18 litros cada, custando R$ 80,00 cada.

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite quantos m² serão pintados");
        double metroQuadrado = sc.nextDouble();

        // 1 litro para 3m
        double litro = metroQuadrado / 3;

        // lata = 18l
        double lata = Math.ceil(litro / 18);

        double valor = lata * 80; // R$ 80,00

        System.out.printf("O valor de %.1f latas para %.3f m² = R$ %.2f.", lata, metroQuadrado, valor);

        sc.close();
    }
}
```
🔍 Calcular a quantidade de latas de tintas e o valor final da compra.

###Cálculo de Latas e Galões de Tinta para Pintura: Quantidade e Custo
- **Descrição:** Calcular a quantidade de tinta necessária para pintar uma área e o custo total em três cenários: usando apenas latas de 18 litros, usando apenas galões de 3,6 litros e misturando ambos para minimizar o desperdício. Considerar 10% de folga na quantidade de tinta.

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite quantos m² serão pintados");
        double metroQuadrado = sc.nextDouble();

        // acrescentar os 10% de folga
        double areaFolga = metroQuadrado * 1.1;

        // 1 litro para 6m
        double litros = areaFolga / 6;

        // a) comprar apenas as latas de 18l no valor de 80.
        double somenteLatas = Math.ceil(litros / 18);
        double valorLatas = somenteLatas * 80;

        // b) comprar apenas as latas de 3,6l no valor de 25.
        double somenteGaloes = Math.ceil(litros / 3.6);
        double valorGaloes = somenteGaloes * 25;

        // c) Misturar ambos para minimizar o desperdício
        // calcular a qtd de latas necessárias
        double lataMisturada = Math.floor(litros / 18);

        // restante dos litros a serem comprados
        double restante = litros - (lataMisturada * 18);

        // calcular a qtd de galões necessários
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
````
🔍 Objetivo:  Calcular a quantidade de latas de tintas e de galões de tinta, a quantidade necessária e  o valor final da compra.

###Velocidade do  Download

- **Descrição :** Calcular e informar o tempo aproximado necessário para fazer o download de um arquivo com base no tamanho do arquivo e na velocidade da conexão de internet

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite o Tamanho do arquivo em MB: ");
        double tamanho = sc.nextDouble();
        System.out.println("Digite a velocidade da sua internet em Mbps: ");
        double velocidade = sc.nextDouble();
        sc.close();

        // Converter a velocidade de Mbps para MBps (1 byte = 8 bits)
        double velocidadeMBps = velocidade / 8;
        double tempoEmSegundos = tamanho / velocidadeMBps;
        double tempoEmMinutos = tempoEmSegundos / 60;
        // Arredondar para cima o número de minutos para garantir que o tempo seja completo
        int minutos = (int) Math.ceil(tempoEmMinutos);
        System.out.printf("O tempo de download de um arquivo com %.2f MB = %d min", tamanho, minutos);
    }
}
```
🔍 Objetivo: Determinar o tempo estimado de download considerando a conversão de unidades e a velocidade da conexão.

###Cálculo do Valor da Compra

- **Descriçao: ** Calcular o valor total a ser pago por duas peças com base no código, número de peças e valor unitário de cada uma.

````java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
public class Exercicio20 {

    public static void main(String[] args) {
        int codigo, nPecas, codigo2, nPecas2;
        double valor, valor2, total;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código da peça: ");
        codigo = sc.nextInt();
        System.out.print("Digite o número de peças: ");
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
        System.out.printf("O valor da compra é R$ %.2f", total);

        sc.close();
    }
}
````
🔍 Objetivo: Determinar o custo total de duas peças.

###Diferença
- **Descrição: ** Calcular e exibir a diferença entre o produto de dois pares de inteiros de acordo com a fórmula: DIFERENCA = (A x B - C x D).

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Scanner;

// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
public class Exercicio21 {

    public static int Expressao(int A, int B, int C, int D){
        return A * B - C * D;
    }

    public static void main(String[] args) {
        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        D = sc.nextInt();
        int resultado = Expressao(A, B, C, D);
        System.out.printf("%d x %d - %d x %d = %d", A, B, C, D, resultado);
        sc.close();
    }
}
```
🔍 Objetivo: Calcular e exibir a diferença entre o produto de dois pares de inteiros.

### Área do círculo com 4 casas decimais

-  **Drescrição: ** Calcular e mostrar a área de um círculo com base no valor do raio fornecido, utilizando a fórmula da área com quatro casas decimais.

```java
package com.Dani.ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio²
// Considere o valor de π = 3.14159
public class Exercicio22 {

    public static double Area(double r) {
        return 3.14159 * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        double area = Area(raio);
        System.out.printf("A área do círculo é %.4f", area);
        sc.close();
    }
}
```
🔍 Objetivo: Calcular a área de uma figura geométrica.

💡 Dicas
Teste sempre: Certifique-se de testar cada programa para garantir que ele funciona corretamente.
Leia a documentação: Consulte a documentação oficial do Java para entender melhor os métodos e funções utilizados.
Espero que esses exercícios ajudem a solidificar seus conhecimentos em Java! 🚀💻
