#include <stdio.h>
#include <stdlib.h>

#include "interface.h"


void MSG_MENU( )
{
    system("cls");
    printf("\n\n\t>>>>>>>>>>>>>>>>>>>>>>> OPCOES DE MENU <<<<<<<<<<<<<<<<<<<<<<<<");
    printf("\n\n\t1. EMPILHAR");
    printf("  \n\t2. DESEMPILHAR");
    printf("  \n\t3. PESQUISAR");
    printf("  \n\t4. IMPRIMIR");
    printf("  \n\t5. SAIR");
}

void MENU(TPilha *pilha1){
    TProduto produto;
    int opcao=0;
    int i, n;
    do
    {
        MSG_MENU();
        printf("\n\nDigite uma opcao: ");
        fflush(stdin);
        scanf("%d", &opcao);
        switch(opcao)
        {
            case 1:
                printf("\nInforme a quantidade de produtos a serem inseridos: ");
                scanf("%d", &n);
                for(i = 0; i < n; i++){
                    LerProduto(&produto);
                    Empilhar(produto, pilha1);
                }
                                system("PAUSE");
                break;
            case 2:

                Desempilhar(pilha1, &produto);
                                system("PAUSE");
                break;

            case 3:
                printf("\nInforme o nome do produto: ");
                   fflush(stdin);
                   fgets(produto.nome, 80, stdin);
                   PesquisarPilha(pilha1, &produto);
                    if(produto.codigo > 0){
                       printf("\nProduto Encontrado!");
                       ImprimirProduto(produto);
                       free(&produto);
                    } else{
                       printf("\nProduto nao encontrado!");
                       free(&produto);
                    }
                                system("PAUSE");
                break;
            case 4:
                ImprimirPilha(pilha1);
                break;
            case 5:
                system("cls");
                printf("\n\n\n\t >>>>>> MSG: Saindo do MODULO...!!! <<<<<<");
                system("PAUSE");
                break;
            default:
                system("cls");
                printf("\n\n\n\t >>>>>> MSG: Digite uma opcao valida!!! <<<<<<");
                system("PAUSE");
            } // fim do bloco switch
    } while(opcao != 5);
}
