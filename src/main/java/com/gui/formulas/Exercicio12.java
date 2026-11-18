package com.gui.formulas;

import java.util.Locale;
import java.util.Scanner;

// 12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
// correspondente em graus Celsius (baseado na fórmula abaixo):
// C / 5 = (F - 32) / 9
// Observação: Para testar se a sua resposta está correta saiba que 100 °C = 212 F
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Temperatura em Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temperatura em Celsius: %.2f%n", celsius);
    }
}
