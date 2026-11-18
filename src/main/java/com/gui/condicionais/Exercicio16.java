package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
// compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
// escreva o custo total da compra.
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantidade de maçãs: ");
        int quantidade = entrada.nextInt();
        double preco;
        if (quantidade < 12) {
            preco = 1.30;
        } else {
            preco = 1.00;
        }
        System.out.printf("Total: R$ %.2f%n", quantidade * preco);
    }
}
