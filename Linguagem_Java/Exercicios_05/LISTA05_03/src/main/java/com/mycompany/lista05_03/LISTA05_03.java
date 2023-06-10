/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista05_03;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mateus
 */
public class LISTA05_03 {

    public static void main(String[] args) {
        
         ArrayList<Integer> inteiros = new ArrayList<Integer>();
         
         for (int x = 0; x < 50; x++) {
            int valor = (int)(Math.random() * 100);
            inteiros.add(valor);
        }
         
        int menor = Collections.min(inteiros);
        int maior = Collections.max(inteiros); 
        
        System.out.println("MENOR VALOR: " + menor);
        System.out.println("MAIRO VALOR: " + maior);
        
        int quantidade = Collections.frequency(inteiros, menor);
        
        System.out.println("QUANTIDADE DE VEZES QUE MENOR VALOR APARECEU: " + quantidade);
        
        Collections.sort(inteiros);
        
        System.out.println("NUMEROS ORDENADOS: ");
        for(int x = 0; x < inteiros.size(); x++){
            int inteiro = inteiros.get(x);
            System.err.println(inteiro);
        }
    }
}
