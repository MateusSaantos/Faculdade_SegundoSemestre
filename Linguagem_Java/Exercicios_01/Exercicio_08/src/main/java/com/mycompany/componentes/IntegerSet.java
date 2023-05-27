/*
 */
package com.mycompany.componentes;

import java.util.Scanner;

public class IntegerSet {

    int tamanho;
    public boolean[] resposta = new boolean[tamanho];

    public IntegerSet(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[] conjunto(int tamanho) {
        Scanner ler = new Scanner(System.in);

        int valor;
        int vetorConjunto[] = new int[tamanho];

        for (int x = 0; x < tamanho; x++) {
            System.out.println("Informe valor para o conjunto: ");
            valor = ler.nextInt();
            vetorConjunto[x] = valor;
        }
        return vetorConjunto;
    }

    public boolean[] verificaVerdadeiroFalso(int[] conjuntoA, int[] conjuntoB) {
        System.out.println("TO AQUI");
        for (int x = 0; x < conjuntoA.length; x++) {
            System.out.println("TO AQUI");
            if (conjuntoA[x] == conjuntoB[x]) {
                resposta[x] = true;
            } else {
                //resposta[x] = false;
            }
        }
        return resposta;
    }

    public int[] uniao(int[] conjuntoA, int[] conjuntoB, int tamanho) {
        int controle = 0;
        int uniao[] = new int[tamanho + tamanho];

        for (int x = 0; x < conjuntoA.length; x++) {
            for (int y = 0; y < conjuntoB.length; y++) {
                if (conjuntoA[x] == conjuntoB[y]) {
                    uniao[controle] = conjuntoA[x];

                    controle = controle + 1;
                }
            }
        }
        return uniao;
    }
    
        public int[] intersecao(int[] conjuntoA, int[] conjuntoB, int tamanho) {
        int controle = 0;
        int intersecao[] = new int[tamanho + tamanho];

        for (int x = 0; x < conjuntoA.length; x++) {
            for (int y = 0; y < conjuntoB.length; y++) {
                if (conjuntoA[x] != conjuntoB[y]) {
                    for(int z = 0; z < intersecao.length; z++){
                       if(intersecao[z] != conjuntoB[y]){
                           intersecao[z] = conjuntoB[y];
                       }
                       else{
                           
                       }
                    }
                }
            }
        }
        return intersecao;
    }
        
    public int[] remover(int[] uniao, int tamanho,int valor) {
        int controle = 0;
        int remover[] = new int[tamanho];

        for (int x = 0; x < uniao.length; x++) {
            if(uniao[x] == valor){
                remover[controle] = -1;
                
                controle = controle + 1;
            }
        }
        return remover;
    }  
    
    public String texto(int[] vetor){
        String texto;
        
        texto = vetor.toString();
        
        return texto;
    }
        
        
}