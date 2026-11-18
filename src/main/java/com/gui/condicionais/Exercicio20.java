package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 20) Ler dois valores (considere que não serão lidos valores iguais)  e escrevê-los em ordem
// crescente.
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Primeiro valor: ");
        double a = entrada.nextDouble();
        System.out.print("Segundo valor (diferente do primeiro): ");
        double b = entrada.nextDouble();
        if (a < b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }
    }
}
