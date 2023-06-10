/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista05__04;

/**
 *
 * @author Mateus
 */
public class LISTA05__04 {

    public static void main(String[] args) {
        
            System.out.println("Inicio da main");
            metodo1();
            System.out.println("Fim da main");
    }
    
    static void metodo1(){
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    
    static void metodo2(){
        System.out.println("Inicio do metodo2");
        int[] array = new int[10];
        
        try {
            for(int i = 0; i <= 15; i++){
            array[i] = i;
            System.out.println(i);
        }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Alerta \nTodas as posições do vetor já foram preenchidas!");
        }
        System.out.println("Fim do metodo2");
    }
}
