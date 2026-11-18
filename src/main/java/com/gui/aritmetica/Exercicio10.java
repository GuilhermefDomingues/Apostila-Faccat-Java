package com.gui.aritmetica;

import java.util.Locale;
import java.util.Scanner;

// 10)  O custo de um carro novo ao consumidor é a soma do custo de fábrica com  a porcentagem do
// distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do
// distribuidor
// seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
// calcular e escrever o custo final ao consumidor.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Custo de fábrica: ");
        double custoFabrica = entrada.nextDouble();
        double custoFinal = custoFabrica + custoFabrica * 0.28 + custoFabrica * 0.45;
        System.out.printf("Custo ao consumidor: R$ %.2f%n", custoFinal);
    }
}
