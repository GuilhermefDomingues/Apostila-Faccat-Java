package com.gui.aritmetica;

import java.util.Locale;
import java.util.Scanner;

// 11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
// mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
// efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
// vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final
// do
// vendedor.
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantidade de carros vendidos: ");
        int carros = entrada.nextInt();
        System.out.print("Valor total das vendas: ");
        double vendas = entrada.nextDouble();
        System.out.print("Salário fixo: ");
        double fixo = entrada.nextDouble();
        System.out.print("Comissão por carro: ");
        double comissao = entrada.nextDouble();
        double salario = fixo + carros * comissao + vendas * 0.05;
        System.out.printf("Salário final: R$ %.2f%n", salario);
    }
}
