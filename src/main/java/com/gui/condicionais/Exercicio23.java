package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 23) Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém
// erros , identifique os erros no algoritmo apresentado abaixo:
// Enunciado:  Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma  pessoa, calcule
// e mostre seu peso ideal, utilizando as seguintes fórmulas:
// - para sexo masculino:  peso ideal = (72.7 * altura) - 58
// - para sexo feminino:  peso ideal = (62.1 * altura) - 44.7
// inicio
// ler nome
// ler sexo
// se sexo = M então
// peso_ideal <- (72.7 * altura) - 58
// senão
// peso_ideal <- (62.1 * altura) – 44.7
// fim_se
// escrever  peso_ideal
// fim
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Altura em metros: ");
        double altura = entrada.nextDouble();
        System.out.print("Sexo (M/F): ");
        String sexo = entrada.next();
        double pesoIdeal;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Sexo inválido. Informe M ou F.");
            return;
        }
        System.out.printf("%s, peso ideal segundo a fórmula: %.2f kg%n", nome, pesoIdeal);
    }
}
