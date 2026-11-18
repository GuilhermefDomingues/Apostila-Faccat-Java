package com.gui.formulas;

import java.util.Locale;
import java.util.Scanner;

// 13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
// Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da
// média final é:
// mediafinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Primeira nota: ");
        double n1 = entrada.nextDouble();
        System.out.print("Segunda nota: ");
        double n2 = entrada.nextDouble();
        System.out.print("Terceira nota: ");
        double n3 = entrada.nextDouble();
        double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        System.out.printf("Média final: %.2f%n", media);
    }
}
