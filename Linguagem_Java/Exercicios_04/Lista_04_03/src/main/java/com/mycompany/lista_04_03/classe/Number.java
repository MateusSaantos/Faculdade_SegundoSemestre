/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_04_03.classe;

/**
 *
 * @author Mateus
 */

public class Number {
    private int value;
    
    public Number(int value){
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    //@Override
    @Override
    public boolean equals(Object compara) {
        if (compara == this) {
            return true;
        }

        if (!(compara instanceof Number)) {
            return false;
        }

        Number other = (Number) compara;
        return this.value == other.value;
    }
    
    //@Override
    @Override
    public int hashCode() {
        int valor = 13;
        
        valor = valor * value;
        
        return valor;
    }
    
    //@Override
    @Override
    public String toString() {
        return "" + value;
    }
}


