package com.gui.aritmetica;

import java.util.Locale;
import java.util.Scanner;

// 7)  Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
// dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Anos: ");
        int anos = entrada.nextInt();
        System.out.print("Meses: ");
        int meses = entrada.nextInt();
        System.out.print("Dias: ");
        int dias = entrada.nextInt();
        int totalDias = anos * 365 + meses * 30 + dias;
        System.out.println("Idade em dias: " + totalDias);
    }
}
