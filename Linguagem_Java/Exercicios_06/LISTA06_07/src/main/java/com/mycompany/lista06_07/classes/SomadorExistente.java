/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_07.classes;

import java.util.List;

/**
 *
 * @author Mateus
 */
public class SomadorExistente {
    public int somaLista(List<Integer> lista){
        int resultado = 0;
        
        for(int i : lista) resultado += i;
        return resultado;
    }
}
