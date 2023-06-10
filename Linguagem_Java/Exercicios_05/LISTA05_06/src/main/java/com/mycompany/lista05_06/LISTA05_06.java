/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista05_06;

import com.mycompany.lista05_06.classe.Conta;
import com.mycompany.lista05_06.classe.ContaExcepition;

/**
 *
 * @author Mateus
 */
public class LISTA05_06 {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        
        System.out.println("BANCO DIGITAL");
        
        minhaConta.depositar(100);
        minhaConta.setLimite(100);
        
        try {
            minhaConta.saca(1000);
        } catch (ContaExcepition e) {
            System.out.println(e.getMessage());
        }
    }
}
