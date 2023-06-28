/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_01;

import com.mycompany.lista03_01.componentes.Cachorro;
import com.mycompany.lista03_01.componentes.Peixe;

/**
 *
 * @author Mateus
 */
public class Lista03_01 {

    public static void main(String[] args) {
        System.out.println("SISTEMA DE ANIMAIS: ");
        Cachorro c = new Cachorro();
        
        c = c.cadastrarCachorro();
        
        Peixe p = new Peixe();
        
        p = p.cadastrarPeixe();
        
        
        System.out.println(p.toString());
        System.out.println(c.toString());
    }
}
