package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 19)  Ler dois valores (considere que não serão lidos valores iguais)  e escrever o maior deles.
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Primeiro valor: ");
        double a = entrada.nextDouble();
        System.out.print("Segundo valor (diferente do primeiro): ");
        double b = entrada.nextDouble();
        if (a > b) {
            System.out.println("Maior: " + a);
        } else {
            System.out.println("Maior: " + b);
        }
    }
}
