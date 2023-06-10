/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista05_01b;

import com.mycompany.lista05_01b.classes.Produtos;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class LISTA05_01B {

    public static void main(String[] args) {
        Produtos p = new Produtos();
        Scanner ler = new Scanner(System.in);
        
        int flag = 0;
        
        System.out.println("CADASTRO DE PRODUTOS");
        
        while(flag != 2){
            p.cadastrar();
            
            System.out.println("Deseja cadastrar outro produto? \n 1 - SIM \n 2 - NÃO");
            flag = ler.nextInt();
        }
        
        p.imprimir();
    }
}
