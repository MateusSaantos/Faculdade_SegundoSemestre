/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_07.classes;

/**
 *
 * @author Mateus
 */
public class Cliente {
   private SomadorEsperado somador;
   
   public Cliente(SomadorEsperado somador){
       this.somador = somador;
   }
   
   public int executar(){
       int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       
       int soma = somador.somaVetor(vetor); 
       
       return soma;
   }
}
