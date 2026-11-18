package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 18)  Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
// poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ano atual: ");
        int anoAtual = entrada.nextInt();
        System.out.print("Ano de nascimento: ");
        int nascimento = entrada.nextInt();
        if (anoAtual - nascimento >= 16) {
            System.out.println("Poderá votar este ano.");
        } else {
            System.out.println("Não poderá votar este ano.");
        }
    }
}
