/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova01_02.classe;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Vetor {

    private int tamanho;
    private String vetor[];
    int soma = 2;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String[] getVetor() {
        return vetor;
    }

    public void setVetor(String[] vetor) {
        this.vetor = vetor;
    }

    public Vetor(int tamanho) {
        this.vetor = new String[tamanho];
    }

    public int VerificaVetor() {
        for (int x = 0; x < this.vetor.length; x++) {
            if (this.vetor[x] == null) {
                return 1;
            }
        }
        return 0;
    }

    public void ConcatVetor() {
        String[] vetorConcat = new String[this.tamanho * soma];

        for (int x = 0; x < this.vetor.length; x++) {
            vetorConcat[x] = this.vetor[x];
        }

        this.vetor = new String[this.tamanho * soma];
        
        for (int x = 0; x < this.vetor.length; x++) {
            this.vetor[x] = vetorConcat[x];
        }

        soma = soma + 1;

    }

    public void cadastrar() {

        if (VerificaVetor() == 0) {
            ConcatVetor();
        } else {
            Scanner ler = new Scanner(System.in);
            String nome;

            for (int x = 0; x < this.vetor.length; x++) {
                if (this.vetor[x] == null) {
                    System.out.println("Informe seu nome: ");
                    nome = ler.next();
                    this.vetor[x] = nome;
                    cadastrar();
                }
            }
        }
    }
}
