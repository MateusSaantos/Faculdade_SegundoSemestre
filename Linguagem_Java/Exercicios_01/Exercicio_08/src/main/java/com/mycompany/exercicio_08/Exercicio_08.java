/*
Crie uma classe IntegerSet para representar um conjunto de n´umeros inteiros. Cada
objeto da classe IntegerSet pode armazenar inteiros no intervalo de 0 at´e um valor m´aximo espec´ıfico
para cada objeto. O conjunto deve ser representado por um array de booleanos. O elemento do array na
posi¸c˜ao i ´e verdadeiro se e somente se o inteiro i pertencer ao conjunto. O construtor inicializa o objeto
como um conjunto vazio (isto ´e, um conjunto cuja representa¸c˜ao de array cont´em todos os valores falso).
Forne¸ca m´etodos para implementar as opera¸c˜oes de uni˜ao, interse¸c˜ao e diferen¸ca de conjuntos. Forne¸ca
um m´etodo para inserir um novo elemento no conjunto e outro m´etodo para excluir um elemento do
conjunto. Forne¸ca ainda um m´etodo para converter um conjunto para string. Fa¸ca uma aplica¸c˜ao para
testar a classe.
 */

package com.mycompany.exercicio_08;

import com.mycompany.componentes.IntegerSet;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Exercicio_08 {

    public static void main(String[] args) {
        int tamanho, valor;
        String texto;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o tamanho dos conjuntos: ");
        tamanho = ler.nextInt();
        
        IntegerSet ij = new IntegerSet(tamanho);
        
        int conjuntoA[] = new int[tamanho];
        int conjuntoB[] = new int[tamanho];
        int uniao[] = new int[tamanho + tamanho];
        int intersecao[] = new int[tamanho + tamanho];
        int remover[] = new int[tamanho + tamanho];
        
        System.out.println("VAMOS PREENCHER O PRIMEIRO CONJUNTO: ");
        conjuntoA = ij.conjunto(tamanho);
        
        System.out.println("VAMOS PREENCHER O SEGUNDO CONJUNTO: ");
        conjuntoB = ij.conjunto(tamanho);
        
        System.out.println("VAMOS REALIZAR A UNIAO DOS CONJUNTOS: ");
        uniao = ij.uniao(conjuntoA, conjuntoB, tamanho);
        
        for(int x = 0; x < uniao.length; x++){
            System.out.println(uniao[x]);
        }
        
        System.out.println("VAMOS REALIZAR A INTERSEÇÃO DOS CONJUNTOS: ");
        intersecao = ij.intersecao(conjuntoA, conjuntoB, tamanho);
        
        for(int x = 0; x < intersecao.length; x++){
            System.out.println(intersecao[x]);
        }
        
        System.out.println("INFORME O VALOR QUE DESEJA REMOVER DO CONJUNTO");
        valor = ler.nextInt();
        remover = ij.remover(conjuntoA, tamanho, valor);
        
        System.out.println("CONJUNTO COM O VALOR REMOVIDO");
        for(int x = 0; x < remover.length; x++){
            if(remover[x] == -1){
                
            } else {
                System.out.println(remover[x]);
            }
        }
        
        System.out.println("TRANSFORMANDO O CONJUNTO EM STRING");
        System.out.println(ij.texto(conjuntoA));
    }
}
