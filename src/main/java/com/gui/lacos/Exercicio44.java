package com.gui.lacos;

import java.util.Locale;
import java.util.Scanner;

// 44) Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido
// um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero  e imprimir o
// resultado
// da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA).
public class Exercicio44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Primeiro valor: ");
        double primeiro = entrada.nextDouble();
        double segundo;
        do {
            System.out.print("Segundo valor (diferente de zero): ");
            segundo = entrada.nextDouble();
        } while (segundo == 0);
        System.out.println("Resultado da divisão: " + (primeiro / segundo));
    }
}
