package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 17)  Ler as notas da 1a. e 2a. avaliações de umaluno. Calcular a média aritmética simples e escrever
// uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
// aluno é aprovado). Escrever também a média calculada.
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Primeira nota: ");
        double n1 = entrada.nextDouble();
        System.out.print("Segunda nota: ");
        double n2 = entrada.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.printf("Média: %.2f%n", media);
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
