
#include <stdio.h>
#include <stdlib.h>

#include "interface.h"


void MSG_MENU( )
{
    system("cls");
    printf("\n\n\t>>>>>>>>>>>>>>>>>>>>>>> OPCOES DE MENU <<<<<<<<<<<<<<<<<<<<<<<<");
    printf("\n\n\t1. ENFILEIRAR");
    printf("  \n\t2. EXCLUIR");
    printf("  \n\t3. IMPRIMIR");
    printf("  \n\t4. PESQUISAR");
    printf("  \n\t5. COMPARAR FILA");
    printf("  \n\t6. INTERSECCAO FILA");
    printf("  \n\t7. DIFERECA FILA");
    printf("  \n\t8. ENFILEIRA E DESENFILEIRAR");
    printf("  \n\t9. SAIR");
}

void MENU(TFila *fila, TFila *filaB, TFila *filaC){
    //Variaveis inteiras
    TProduto produto;
    TProduto pesquisar;

    int codigo;
    int opcao = 0;
    int controle;

    do
    {
        MSG_MENU();
        printf("\n\nDigite uma opcao: ");
        fflush(stdin);
        scanf("%d", &opcao);
        switch(opcao)
        {
            case 1:
                //CADASTRAR PRODUTO

                LerProduto(&produto);

                printf("Informe em qual FILA deseja cadastrar: \n");
                printf("1 - FILA A\n");
                printf("2 - FILA B\n");
                scanf("%d", &controle);

                if(controle == 1){
                    Enfileirar(produto, fila);
                } else if(controle == 2){
                    Enfileirar(produto, filaB);
                } else {
                    printf("Opção invalida! Produto nao cadastrado.\n");
                }

                system("PAUSE");
                break;
            case 2:
                //EXCLUIR PRODUTO

                printf("Informe o codigo do produto: \n");
			    scanf("%d", &codigo);
			    produto.codigo = codigo;

                printf("Informe em qual FILA deseja excluir: \n");
                printf("1 - FILA A\n");
                printf("2 - FILA B\n");
                scanf("%d", &controle);

                if(controle == 1){
                    Excluir(fila, produto);
                } else if(controle == 2){
                    Excluir(filaB, produto);
                } else {
                    printf("Opção invalida! Produto nao excluido.\n");
                }

                system("PAUSE");
                break;
            case 3:
                //IMPRIMIR FILA

                printf("Informe em qual FILA deseja imprimir: \n");
                printf("1 - FILA A\n");
                printf("2 - FILA B\n");
                scanf("%d", &controle);

                if(controle == 1){
                    ImprimirFila(*fila);
                } else if(controle == 2){
                    ImprimirFila(*filaB);
                } else {
                    printf("Opção invalida! Lista nao impressa.\n");
                }

                system("PAUSE");
                break;
            case 4:
                //PESQUISAR FILA

                printf("Informe a descrição do produto que deseja pesquisar:\n");
                setbuf(stdin, NULL);
                fgets(pesquisar.nome, 100, stdin);

                printf("Informe em qual FILA deseja imprimir: \n");
                printf("1 - FILA A\n");
                printf("2 - FILA B\n");
                scanf("%d", &controle);

                if(controle == 1){

                    PesquisarFila(fila, &pesquisar);

                    if(pesquisar.codigo != -1){
                        printf("================================ PRODUTO ================================ \n");
                        ImprimirProduto(pesquisar);
                        //free(&pesquisar);

                    } else {
                        printf("Produto não localizado!\n");
                        //free(&pesquisar);
                    }

                } else if(controle == 2){
                    PesquisarFila(filaB, &pesquisar);

                    if(pesquisar.codigo != -1){
                        printf("================================ PRODUTO ================================ \n");
                        ImprimirProduto(pesquisar);
                        //free(&pesquisar);

                    } else {
                        printf("Produto não localizado!\n");
                        //free(&pesquisar);
                    }

                } else {
                    printf("Opção invalida! Produto nao pesquisado.\n");
                }

                system("PAUSE");
                break;
            case 5:
                //COMPARAR FILA

                CompararFila(fila, filaB);

                system("PAUSE");
                break;
            case 6:
                //INTERSECCAO FILA

                Interseccao(fila, filaB, filaC);

                printf("================================ INTERSECCAO ================================ \n");
                ImprimirFila(*filaC);

                system("PAUSE");
                break;
            case 7:
                //SAIR

                Diferenca(fila, filaB, filaC);

                printf("================================ DIFERENCA ================================ \n");
                ImprimirFila(*filaC);

                system("PAUSE");
                break;
            case 8:
                //SAIR

                printf("Funcao em desenvolvimento! \n");

                system("PAUSE");
                break;
            case 9:
                //SAIR

                system("cls");
                printf("\n\n\n\t >>>>>> MSG: Saindo do MODULO...!!! <<<<<<");
                system("PAUSE");
                break;
            default:
                system("cls");
                printf("\n\n\n\t >>>>>> MSG: Digite uma opcao valida!!! <<<<<<");
                system("PAUSE");
            } // fim do bloco switch
    } while(opcao != 9);
}

