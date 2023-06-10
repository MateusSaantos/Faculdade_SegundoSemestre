/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista05_05;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class LISTA05_05 {

    public static void main(String[] args) {
        try{
            dividir();
        } catch (java.util.InputMismatchException e){
            System.out.println("São validos apenas numeros! Vamos começar novamente");
            dividir();
        }catch (java.lang.ArithmeticException e){
            System.out.println("Não existe divisão por 0! Vamos começar novamente");
            dividir();
        }  
    }
    
    static void dividir(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Eu sei dividir!");
        System.out.println("Informe o primeiro valor: ");
        int x = teclado.nextInt();
        System.out.println("Informe o segundo valor: ");
        int y = teclado.nextInt();
        double r = (x / y);
        
        System.out.println("O resultado da divisão é " + r);
    }
}
