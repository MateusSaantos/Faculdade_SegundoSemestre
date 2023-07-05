/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova2_01;

import com.mycompany.prova2_01.classe.Data;

/**
 *
 * @author Mateus
 */
public class Prova2_01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Data d = new Data(30, 12, 2022);
        
        System.out.println(d.toString());
        
        System.out.println(d.avancaData());
    }
}
