/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06_08.classes;

/**
 *
 * @author Mateus
 */
public class AdapterFarenheitParaCelsius implements MedidorCelsiusIF{
    private MedidorFarenheit medidorFarenheit;

   public AdapterFarenheitParaCelsius(MedidorFarenheit medidorFarenheit) {
      this.medidorFarenheit = medidorFarenheit;
   }

   @Override
   public double medirTemperatura() {
      double temperaturaFarenheit = medidorFarenheit.getTemperaturaFarenheit();
      double celsius = temperaturaFarenheit - 32;
      
      celsius = celsius / 1.8;
      
      return celsius;
   }
}
