package com.gui.aritmetica;

import java.util.Scanner;

// 8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
// brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao
// total
// de eleitores.
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Total de eleitores: ");
        int eleitores = entrada.nextInt();
        if (eleitores <= 0) {
            System.out.println("O total de eleitores deve ser maior que zero.");
            return;
        }
        System.out.print("Votos brancos: ");
        int brancos = entrada.nextInt();
        System.out.print("Votos nulos: ");
        int nulos = entrada.nextInt();
        System.out.print("Votos válidos: ");
        int validos = entrada.nextInt();
        System.out.printf("Brancos: %.2f%%%n", brancos * 100.0 / eleitores);
        System.out.printf("Nulos: %.2f%%%n", nulos * 100.0 / eleitores);
        System.out.printf("Válidos: %.2f%%%n", validos * 100.0 / eleitores);
    }
}
