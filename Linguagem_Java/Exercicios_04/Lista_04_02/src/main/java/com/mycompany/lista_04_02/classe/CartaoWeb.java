/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_04_02.classe;

/**
 *
 * @author Mateus
 */
public abstract class CartaoWeb {
    private String destinatario;
    
    public abstract void showMessage();
    
    public CartaoWeb(String destinatario){
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
