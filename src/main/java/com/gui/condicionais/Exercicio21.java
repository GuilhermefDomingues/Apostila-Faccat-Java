package com.gui.condicionais;

import java.util.Locale;
import java.util.Scanner;

// 21) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem
// os
// minutos)  e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
// de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Hora inicial (0 a 23): ");
        int inicio = entrada.nextInt();
        System.out.print("Hora final (0 a 23): ");
        int fim = entrada.nextInt();
        int duracao;
        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }
        System.out.println("Duração: " + duracao + " horas");
    }
}
