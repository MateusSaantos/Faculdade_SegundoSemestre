/*
 Fazer um programa para receber um n´umero do usu´ario e decompˆo-lo em fatores
primos. Os fatores primos devem ser armazenados em um array com o tamanho exato (dica: primeiro
determinar quantos s˜ao os fatores primos, depois criar o array para armazen´a-los).
*/

package com.mycompany.exercicio_10;

import com.mycompany.componentes.Fatoracao;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */

public class Exercicio_10 {

    public static void main(String[] args) {
        int valor, tamanho;
        
        Scanner ler = new Scanner(System.in);
        Fatoracao f = new Fatoracao();
        
        System.out.println("Informe um valor");
        valor = ler.nextInt();
        
        tamanho = f.tamanho(valor);
        
        int vetor[] = new int[tamanho];
        
        vetor = f.vetor(tamanho, valor);
        
        for(int x = 0; x < vetor.length; x++){
            System.out.println(vetor[x]);
        } 
    }
}
