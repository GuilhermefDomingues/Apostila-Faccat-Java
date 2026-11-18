package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 26)  Faça um algoritmo para ler: quantidade atual em estoque, quantidade  máxima em estoque e
// quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
// média = quantidade máxima + quantidade mínima)/2). Se a quantidade em  estoque for maior ou igual
// a quantidade média escrever a mensagem 'Não efetuar compra', senão e screver a mensagem 'Efetuar
// compra'.
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantidade atual: ");
        int atual = entrada.nextInt();
        System.out.print("Quantidade máxima: ");
        int maxima = entrada.nextInt();
        System.out.print("Quantidade mínima: ");
        int minima = entrada.nextInt();
        double media = (maxima + minima) / 2.0;
        System.out.println("Quantidade média: " + media);
        if (atual >= media) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
