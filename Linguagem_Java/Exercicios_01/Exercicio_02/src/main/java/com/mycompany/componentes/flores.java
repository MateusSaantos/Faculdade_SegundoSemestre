/*
 */
package com.mycompany.componentes;

import java.util.Scanner;

/**
 *
 * @author Mateus
 */

public class flores {
    public String nome;
    public int quantidade;
    public int minima;
    
    Scanner ler = new Scanner(System.in);
    
    public void cadastrarFlores(){
        System.out.println("Informe o nome da flor: ");
        nome = ler.next();
        
        System.out.println("Informe a quantidade em estoque: ");
        quantidade = ler.nextInt();
        
        System.out.println("Informe a quantidade minima: ");
        minima = ler.nextInt();
    }
}
