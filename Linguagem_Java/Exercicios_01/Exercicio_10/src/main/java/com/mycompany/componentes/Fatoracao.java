/*
 */
package com.mycompany.componentes;

/**
 *
 * @author Mateus
 */
public class Fatoracao {

    public int tamanho(int valor) {
        int tamanho = 0, y = valor;
        int controle = 2;

        for (int x = 0; x <= y; x++) {
            if (valor % controle == 0) {
                tamanho = tamanho + 1;
                valor = valor / controle;
            } else {
                controle = controle + 1;
            }
        }

        return tamanho;
    }

    public int[] vetor(int tamanho, int valor) {
        int controle = 2, controleVetor = 0, y = valor;

        int vetor[] = new int[tamanho];

        for (int x = 0; x <= y; x++) {
            if (valor % controle == 0) {
                vetor[controleVetor] = controle;

                valor = valor / controle;

                controleVetor = controleVetor + 1;
            } else {
                controle = controle + 1;
            }
        }

        return vetor;
    }
}
