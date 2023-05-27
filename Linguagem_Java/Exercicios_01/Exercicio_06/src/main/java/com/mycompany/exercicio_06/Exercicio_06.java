/*
Descreva em no m´aximo 200 palavras o que ´e um autom´ovel e o que ele faz. Liste
os substantivos e verbos separadamente. Cada substantivo corresponde a um objeto que precisar´a ser
constru´ıdo para implementar um sistema, nesse caso, um carro. Selecione 5 dos objetos que vocˆe listou
e, para cada um, liste v´arios atributos e comportamentos. Descreva brevemente como esses objetos
interagem entre si e com outros objetos na sua descri¸c˜ao. Estes passos que vocˆe seguiu s˜ao t´ıpicos do
projeto orientado a objetos.
*/

package com.mycompany.exercicio_06;

/**
 *
 * @author Mateus
 */
public class Exercicio_06 {

    public static void main(String[] args) {
        System.out.println("=== O QUE É UM AUTOMOVEL ===");
        System.out.println("Um automovel é basicamente um objeto ou uma ferramenta que serve para transportar pessoas \n"
                + "para diversos locais ou regioes, é um acessorio que potencializa a velocidade de locomoção \n"
                + "de uma ou mais pessoas.");
        
        System.out.println("=== SUBSTANTIVOS ===");
        System.out.println("PNEU - Modelo, Estado de conservação, Calibragem, Rotação");
        System.out.println("MARCHA - 1, 2, 3, 4, 5, Ré, Neutro");
        System.out.println("BANCO - Inclinação, Declinação, Ajuste, Cinto de Segurança");
        System.out.println("VOLANTE - Rotação Esquerda, Rotação Direita, Busina");
        System.out.println("FAROL - Alto, Baixo, Desligado, Pisca alerta");
        
        System.out.println("=== INTERAÇÃO DOS OBJETOS ===");
        System.out.println("Os objetos interagem entre si quase que em sua totalidade, vou dar um exemplo simples. Quando a \n"
                + "MARCHA esta na 1, os PNEUS vão estar em ROTAÇÃO, o BANCO vai estar INCLINADO e com o CINTO DE SEGURANÇA \n"
                + "o VOLANTE em alguma ROTAÇÃO e o FAROL BAIXO ou ALTO, assim todos os objetos estão com funções ativadas.");
        
    }
}
