/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista06_07;

import com.mycompany.lista06_07.classes.AdapterSomador;
import com.mycompany.lista06_07.classes.Cliente;
import com.mycompany.lista06_07.classes.SomadorEsperado;
import com.mycompany.lista06_07.classes.SomadorExistente;

/**
 *
 * @author Mateus
 */
public class LISTA06_07 {

    public static void main(String[] args) {
        
        SomadorExistente somador = new SomadorExistente();
        
        SomadorEsperado somadorAdaptado = new AdapterSomador(somador);
        
        Cliente c = new Cliente(somadorAdaptado);
        int soma = c.executar();
        
        System.out.println(soma);
    }
}
