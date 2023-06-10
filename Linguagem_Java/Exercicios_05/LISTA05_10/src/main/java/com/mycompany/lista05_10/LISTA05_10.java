/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista05_10;

import com.mycompany.lista05_10.classes.Calculator;
import com.mycompany.lista05_10.classes.Calculator.InvalidOperationException;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class LISTA05_10 {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner ler = new Scanner(System.in);
        int menu;
        
        System.out.println("CALCULADORA");
        
        try {
            System.out.println("CALCULADORA");
            System.out.print("1 - DIVIDIR \n 2 - LOG 10");
            menu = ler.nextInt();
            
            if (menu == 1) {
                System.out.print("Informe o primeiro valor: ");
                double x = ler.nextDouble();
                System.out.print("Digite o divisor: ");
                double y = ler.nextDouble();
                double r = c.div(x, y);
                System.out.println("Resultado da divisão é: " + r);
                
            } else if (menu == 2) {
                System.out.print("Digite o número: ");
                double x = ler.nextDouble();
                double r = c.log10(x);
                System.out.println("Resultado do logaritmo é: " + r);
            }
        } catch (InvalidOperationException e) {
            System.err.println("DADOS INCORRETOS!");
            System.err.println(e.getMessage());
            e.printStackTrace();
            
        } catch (Exception e) {
            System.err.println("DADOS INCORRETOS!");
            System.err.println(e.getMessage());
            e.printStackTrace();
            
        } 
    }
}
