/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_02.classes;

/**
 *
 * @author Mateus
 */
public class Incremental {
    private static Incremental inc;
    
    private static int count = 0;
    private int numero;
    
    private Incremental(){
        numero = ++count;
    }
    
    public static Incremental iniciaIncremental(){
        if(inc == null){
            inc = new Incremental();
        }
        return inc;
    }
    
    public String toString(){
        return "Incremental " + numero;
    }
}
