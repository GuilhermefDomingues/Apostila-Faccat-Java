package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 22)  A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
// de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com umacréscimo de 50%.
// Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
// o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido
// trabalhadas
// (considere que o mês possua 4 semanas exatas).
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Horas trabalhadas no mês: ");
        double horas = entrada.nextDouble();
        System.out.print("Valor da hora: ");
        double valorHora = entrada.nextDouble();
        double salario;
        if (horas > 160) {
            salario = 160 * valorHora + (horas - 160) * valorHora * 1.5;
        } else {
            salario = horas * valorHora;
        }
        System.out.printf("Salário total: R$ %.2f%n", salario);
    }
}
