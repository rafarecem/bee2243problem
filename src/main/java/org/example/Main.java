package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();
        // armazenar as alturas das colunas
        int[] colunas = new int[N];
        // preencher as colunas
        System.out.println("Digite os valores das colunas:");
        for (int i = 0; i < N; i++) {
            colunas[i] = scanner.nextInt();
        }
        // armazenar as alturas
        int[] esquerda = new int[N];
        int[] direita = new int[N];
        esquerda[0] = 1;
        //preencher a esquerda com as alturas maximas possiveis
        for (int i = 1; i < N; i++) {
            esquerda[i] = Math.min(colunas[i], esquerda[i - 1] + 1);
        }
        direita[N - 1] = 1;
        //preenche o array direita com as alturas maximas possiveis
        for (int i = N - 2; i >= 0; i--) {
            direita[i] = Math.min(colunas[i], direita[i + 1] + 1);
        }
        int resultado = 0;
        //calcula a alturas maxima em qualquer posição
        for (int i = 0; i < N; i++) {
            resultado = Math.max(resultado, Math.min(esquerda[i], direita[i]));
        }
        System.out.println("Resultado: " + resultado);
    };
}