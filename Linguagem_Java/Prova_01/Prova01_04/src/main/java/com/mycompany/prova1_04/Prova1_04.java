/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova1_04;

import com.mycompany.prova1_04.classe.Circulo;
import com.mycompany.prova1_04.classe.Quadrado;

/**
 *
 * @author Mateus
 */
public class Prova1_04 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Circulo c = new Circulo(8);
        System.out.println("AREA: " + c.area());
        System.out.println("COMPRIMENTO: " + c.comprimento());
        
        Quadrado q = new Quadrado(8, 8);
        System.out.println("AREA: " + q.area());
        System.out.println("COMPRIMENTO: " + q.comprimento());
        
    }
}
