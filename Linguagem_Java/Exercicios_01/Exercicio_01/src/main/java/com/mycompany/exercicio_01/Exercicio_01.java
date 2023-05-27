/*
Exercicio 1. A gerente do cabeleireiro Sempre Bela tem uma tabela em que registra os ”pes”, as
maos e o servico de podologia das cinco manicures. Sabendo-se que cada uma ganha 50% do que
faturou ao mes, criar um algoritmo que possa calcular e imprimir quanto cada uma vai receber, uma
vez que nao tem carteiras
 */


public class Exercicio_01 {

    public static void main(String[] args) {
        
        manicure manicures[] = new manicure[5];
        
        for(int x = 0; x < manicures.length; x++){
            manicure m = new manicure();

            m.cadastrarManicure();
            
            manicures[x] = m;

        }
            
        System.out.println("REPASSE PARA MANICURES: ");
        
        for(int x = 0; x < manicures.length; x++){
            System.out.println("MANICURE: " + manicures[x].getNome() + " VALOR: " + manicures[x].getValor());
        }
    }
}