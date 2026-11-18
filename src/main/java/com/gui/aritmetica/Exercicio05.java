package com.gui.aritmetica;

import java.util.Locale;
import java.util.Scanner;

// 5) Escreva um algoritmo para ler  um valor (do teclado) e escrever  (na tela) o seu antecessor .
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        System.out.println("Antecessor: " + (numero - 1));
    }
}
