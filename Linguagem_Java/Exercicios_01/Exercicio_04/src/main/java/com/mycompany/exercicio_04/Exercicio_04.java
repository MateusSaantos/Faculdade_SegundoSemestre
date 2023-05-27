/*
Criar um algoritmo que carregue uma matriz 12 × 4 com os valores das vendas de uma
loja, em que cada linha represente um mˆes do ano, e cada coluna, uma semana do mˆes. Para simplificar,
considere que cada mˆes possui somente 4 semanas. Calcule e imprima:
(a) Total vendido em cada mˆes do ano;
(b) Total vendido em cada semana durante todo o ano
(c) Total vendido no ano.
 */
package com.mycompany.exercicio_04;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Exercicio_04 {

    public static void main(String[] args) {
        double mes = 0, total = 0;

        Scanner ler = new Scanner(System.in);

        double vendas[][] = new double[12][4];

        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.println("Informe o valor da semanal: ");
                vendas[x][y] = ler.nextDouble();
            }
        }

        System.out.println("=== VENDAS POR MES ===");
        
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 4; y++) {
                mes = mes + vendas[x][y];
            }
            System.out.println("VENDAS DO MÊS " + (x + 1) + ": " + mes);
            mes = 0;
        }

        System.out.println("=== VENDAS POR SEMANA ===");
        
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.println("MÊS " + (x + 1) + " SEMANA " + (y + 1) + " VENDAS: " + vendas[x][y]);
            }
        }
        
        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 4; y++) {
                total = total + vendas[x][y];
            }
        }
        
        System.out.println("=== VENDAS DO ANO ===");
        
        System.out.println("TOTAL DE VENDAS NO ANO: " + total);
    }
}
