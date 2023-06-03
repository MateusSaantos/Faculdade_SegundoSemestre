/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_04_03;

/**
 *
 * @author Mateus
 */
public class Lista_04_03 {

    public static void main(String[] args) {
        
        Number x = 10;
        Number y = 20;
        
        System.out.println("Testando o metodo toString: ");
        System.out.println(x.toString());
        System.out.println(y.toString());
        
        System.out.println("Testando o metodo hashCode: ");
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        
        System.out.println("Testando o metodo equals: ");
        System.out.println(x.equals(y));
        System.out.println(y.equals(y));
        
        System.out.println("Testando se o valor é igual: ");
        if(x == y){
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
        
    }
}
