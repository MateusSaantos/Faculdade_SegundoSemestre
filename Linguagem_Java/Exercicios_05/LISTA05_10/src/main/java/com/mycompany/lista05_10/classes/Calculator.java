/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05_10.classes;

/**
 *
 * @author Mateus
 */
public class Calculator {
    public double div(double x, double y) throws InvalidOperationException {
        if (y == 0) {
            throw new InvalidOperationException("Não é possível dividir por zero.");
        }
        return x / y;
    }
    
    public double log10(double x) throws InvalidOperationException {
        if (x <= 0) {
            throw new InvalidOperationException("Não existe log de numero menor ou igual a zero");
        }
        return Math.log10(x);
    }
    
    public class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}
}
