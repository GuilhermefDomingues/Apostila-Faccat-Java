package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 15)  Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo ).
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Valor: ");
        double valor = entrada.nextDouble();
        if (valor >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}
