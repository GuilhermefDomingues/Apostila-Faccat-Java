package com.gui.aritmetica;

import java.util.Locale;
import java.util.Scanner;

// 6)  Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
// área do retângulo.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Base: ");
        double base = entrada.nextDouble();
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Área: " + (base * altura));
    }
}
