/*
F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2)
 */
package com.mycompany.componentes;

/**
 *
 * @author Mateus
 */
public class Funcao {
    
    public int formula(int valor){
        int resposta;
        
        if(valor == 1){
            resposta = 1;
        } else if(valor == 2){
            resposta = 2;
        } else {
            resposta = 2 * formula(valor - 1) + 3 * formula(valor - 2);
        }
        
        return resposta;
    }
}
