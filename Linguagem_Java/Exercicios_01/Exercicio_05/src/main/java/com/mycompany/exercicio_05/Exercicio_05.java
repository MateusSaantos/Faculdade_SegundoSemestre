/*
Criar um algoritmo que entre com valores inteiros para uma matriz m3×3 e imprima a
matriz final, conforme mostrado a seguir:
1 2 3
4 5 6
7 8 9

A matriz gira 90◦

7 4 1
8 5 2
9 6 3
 */
package com.mycompany.exercicio_05;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Exercicio_05 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int invertida[][] = new int[3][3];

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("Informe o valor da matriz: ");
                matriz[x][y] = ler.nextInt();
            }
        }
        
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                invertida[x][y] = matriz[3 - y - 1][x];
                
                System.out.print("[ " + invertida[x][y] + " ]");
            }
            System.out.println("");
        }
    }
}
