package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 24)  Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
// ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
// ultrapassar este valor, calcular e escrever o seu salário total.
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Salário fixo: ");
        double fixo = entrada.nextDouble();
        System.out.print("Total das vendas: ");
        double vendas = entrada.nextDouble();
        double comissao;
        if (vendas <= 1500) {
            comissao = vendas * 0.03;
        } else {
            comissao = 1500 * 0.03 + (vendas - 1500) * 0.05;
        }
        System.out.printf("Salário total: R$ %.2f%n", fixo + comissao);
    }
}
