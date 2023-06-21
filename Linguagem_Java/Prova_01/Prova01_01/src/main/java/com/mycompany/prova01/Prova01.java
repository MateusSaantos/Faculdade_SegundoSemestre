/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova01;

import com.mycompany.prova01.classe.IngressoVip;

/**
 *
 * @author Mateus
 */
public class Prova01 {

    public static void main(String[] args) {
        
        IngressoVip i = new IngressoVip();
        
        i.setValor(100.00);
        i.setAdicional(50.00);
        
        System.out.println("VALOR DOS INGRESSOS");
        
        i.imprimeValor();
        
        System.out.println("VALOR DO INGRESSO VIP: " + i.valorIngressoVip());
        
        System.out.println("DIFERENÇA: " + i.getAdicional());
       
    }
}
