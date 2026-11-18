package com.gui.aritmetica;

import java.util.Locale;
import java.util.Scanner;

// 9)  Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de
// reajuste.
// Calcular e escrever o valor do novo salário.
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Salário atual: ");
        double salario = entrada.nextDouble();
        System.out.print("Reajuste (%): ");
        double reajuste = entrada.nextDouble();
        double novoSalario = salario + salario * reajuste / 100;
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
    }
}
