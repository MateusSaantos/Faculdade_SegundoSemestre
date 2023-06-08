/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista06_08;

import com.mycompany.lista06_08.classes.AdapterFarenheitParaCelsius;
import com.mycompany.lista06_08.classes.MedidorFarenheit;

/**
 *
 * @author Mateus
 */
public class LISTA06_08 {

    public static void main(String[] args) {
        
      MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
      
      AdapterFarenheitParaCelsius adapter = new AdapterFarenheitParaCelsius(medidorFarenheit);
      
      double celsius = adapter.medirTemperatura();
      
      System.out.println("CELSIUS: " + celsius);
    }
}
