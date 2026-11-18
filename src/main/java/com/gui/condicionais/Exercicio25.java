package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 25)  Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular
// e
// escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for
// maior
// ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Número da conta: ");
        String conta = entrada.next();
        System.out.print("Saldo: ");
        double saldo = entrada.nextDouble();
        System.out.print("Débito: ");
        double debito = entrada.nextDouble();
        System.out.print("Crédito: ");
        double credito = entrada.nextDouble();
        double saldoAtual = saldo - debito + credito;
        System.out.printf("Conta %s - saldo atual: R$ %.2f%n", conta, saldoAtual);
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}
