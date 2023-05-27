/*
Escreva uma fun¸c˜ao recursiva que calcule a sequencia dada por:
F(1) = 1 (1)
F(2) = 2 (2)
F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2) (3)
*/

package com.mycompany.exercicio_03;

import com.mycompany.componentes.Funcao;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Funcao f = new Funcao();
        
        int valor;
        
        System.out.println("Informe um valor: ");
        valor = ler.nextInt();
        
        System.out.println(f.formula(valor));
    }
}
