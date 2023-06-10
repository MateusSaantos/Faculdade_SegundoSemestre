/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista05_09;

/**
 *
 * @author Mateus
 */
public class LISTA05_09 {

    public static void main(String[] args) {

        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Main");
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        System.out.println("someMethod");
        someMethod2();
    }

    public static void someMethod2() throws Exception {
        throw new Exception("LANÇANDO EXCEPTION");
    }
}
