package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 14)  Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
// contrário escrever NÃO É MAIOR QUE 10!
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Valor: ");
        double valor = entrada.nextDouble();
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
