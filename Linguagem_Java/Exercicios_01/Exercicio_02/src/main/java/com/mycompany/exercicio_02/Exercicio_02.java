/*
 Uma floricultura conhecedora de sua clientela gostaria de fazer um algoritmo que
pudesse controlar sempre um estoque m´ınimo de determinadas plantas, pois todo dias, pela manh˜a, o
dono faz novas aquisi¸c˜oes. Criar um algoritmo que deixe cadastrar 50 tipos de plantas e nunca deixar
o estoque ficar abaixo do ideal. Para cada planta, o dono gostaria de cadastrar o nome, o estoque ideal
e a quantidade em estoque. Dessa forma o algoritmo pode calcular a quantidade que o dono da loja
precisa comprar no pr´oximo dia. Essa quantidade a ser comprada deve ser impressa (quando maior que
zero) como uma lista para o dono da floricultura
 */

package com.mycompany.exercicio_02;

import com.mycompany.componentes.flores;

/**
 *
 * @author Mateus
 */
public class Exercicio_02 {
    
    public static void main(String[] args) {
        
        flores flor[] = new flores[50];
        
        for(int x = 0; x < flor.length; x++){
            flores f = new flores();
            
            f.cadastrarFlores();
            flor[x] = f;
        }
        
        System.out.println("LISTA DE FLORES A COMPRAR: ");
        
        for(int x = 0; x < flor.length; x++){            
            if(flor[x].quantidade < flor[x].minima){
                int quantidade;
                
                quantidade = flor[x].minima - flor[x].quantidade; 
                
                System.out.println(flor[x].nome + " QUANTIDADE: " + quantidade);
                
            }
        }
    }
}
