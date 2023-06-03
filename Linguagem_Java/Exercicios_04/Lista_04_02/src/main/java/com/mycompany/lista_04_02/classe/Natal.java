/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_04_02.classe;

/**
 *
 * @author Mateus
 */
public class Natal extends CartaoWeb{
    
    public Natal(String destinatario){
        super(destinatario);
    }
    
    @Override
    public void showMessage(){
       System.out.println("Feliz Natal " + getDestinatario() + "!");
    }
}
