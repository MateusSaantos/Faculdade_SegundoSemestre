/*
Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos
de inform´atica para representar uma fatura de um item vendido na loja. Uma fatura deve incluir as
seguintes informa¸c˜oes como atributos:
(a) o n´umero do item faturado,
(b) a descri¸c˜ao do item,
(c) a quantidade comprada do item e;
(d) o pre¸co unit´ario do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade n˜ao for positiva,
ela deve ser configurada como 0. Se o pre¸co por item n˜ao for positivo ele deve ser configurado como
0.0. Forne¸ca um m´etodo set e um m´etodo get para cada vari´avel de instˆancia. Al´em disso, forne¸ca um
m´etodo chamado getInvoiceAmount que calcula o valor da fatura (isso ´e, multiplica a quantidade pelo
pre¸co por item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra
as capacidades da classe Invoice. */

package com.mycompany.exercicio_07;

import com.mycompany.componentes.Invoice;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Exercicio_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int codigo, quantidade;
        String descricao;
        double valor, total;
        
        System.out.println("CADASTRO DE FATURA");
        
        System.out.println("Informe o código do produto: ");
        codigo = ler.nextInt();
        
        System.out.println("Informe a descrição do produto: ");
        descricao = ler.next();
        
        System.out.println("Informe a quantidade do produto: ");
        quantidade = ler.nextInt();
        
        if(quantidade < 0){
            quantidade = 0;
        }
        
        System.out.println("Informe o valor do produto: ");
        valor = ler.nextDouble();
        
        if(valor < 0){
            valor = 0;
        }
        
        Invoice i = new Invoice(codigo, descricao, quantidade, valor);
        
        total = i.getInvoiceAmount();
        
        System.out.println("CODIGO: " + i.getCodigo() + " PRODUTO: " + i.getDescricao());
        System.out.println("VALOR TOTAL DA FATURA: " + total);
    }
}
