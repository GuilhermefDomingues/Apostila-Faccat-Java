package com.gui.lacos;

import java.util.Locale;
import java.util.Scanner;

// 45)  Reescreva o exercício anterior utilizando a estrutura ENQUANTO.
public class Exercicio45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Primeiro valor: ");
        double primeiro = entrada.nextDouble();
        System.out.print("Segundo valor (diferente de zero): ");
        double segundo = entrada.nextDouble();
        while (segundo == 0) {
            System.out.print("Segundo valor (diferente de zero): ");
            segundo = entrada.nextDouble();
        }
        System.out.println("Resultado da divisão: " + (primeiro / segundo));
    }
}
