/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_04_02;

import com.mycompany.lista_04_02.classe.Aniversario;
import com.mycompany.lista_04_02.classe.CartaoWeb;
import com.mycompany.lista_04_02.classe.DiaDosNamorados;
import com.mycompany.lista_04_02.classe.Natal;

/**
 *
 * @author Mateus
 */
public class Lista_04_02 {

    public static void main(String[] args) {
        System.out.println("MENSAGENS: ");
        
        CartaoWeb[] cartao = new CartaoWeb[3];
        
        cartao[0] = new DiaDosNamorados("Mateus");
        cartao[1] = new Natal("Mateus");
        cartao[2] = new Aniversario("Mateus");
        
        for(int x = 0; x < cartao.length; x++){
            cartao[x].showMessage();
        }
    }
}
