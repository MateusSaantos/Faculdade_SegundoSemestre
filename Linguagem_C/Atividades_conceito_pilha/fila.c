#include <stdio.h>
#include <stdlib.h>
#include "fila.h"

//Inicia lista vazia
void FFVazia(TFila *Fila){
	Fila->frente = (TCelula*) malloc(sizeof(TCelula));
	Fila->tras = Fila->frente;
	Fila->frente->prox = NULL;
	Fila->tamanho = 0;
}

//Verifica se a lista esta vazia
int Vazia(TFila Fila){
	return (Fila.frente == Fila.tras);
}

//Enfileirar lista
void Enfileirar(TProduto x, TFila *Fila){
	Fila->tras->prox = (TCelula*) malloc(sizeof(TCelula));
	Fila->tras = Fila->tras->prox;
	Fila->tras->item = x;
	Fila->tras->prox = NULL;
	Fila->tamanho++;
}

//Ler um produto
void LerProduto(TProduto *x){
    printf("CODIGO: ");
    scanf("%d", &x->codigo);

    printf("NOME: ");
    setbuf(stdin, NULL);
    fgets(x->nome, 100, stdin);

    printf("DESCRICAO: ");
    setbuf(stdin, NULL);
    fgets(x->descricao, 100, stdin);

    printf("PRECO: ");
    scanf("%f", &x->preco);

    printf("QUANTIDADE: ");
    scanf("%d", &x->quantidade);

    printf("PESO: ");
    scanf("%f", &x->peso);
}

//Desenfileirar lista
void Desenfileirar(TFila *Fila, TProduto *Item){
	TCelula* Aux;
	if(!Vazia(*Fila)){
		Aux = Fila->frente->prox;
		Fila->frente->prox = Aux->prox;
		*Item = Aux->item;
		free(Aux);

		if(Fila->frente->prox == NULL){
			Fila->tras = Fila->frente;
		}
		Fila->tamanho--;
	}
}

//Imprime Fila
void ImprimirFila(TFila Fila){
	TCelula* Aux;
	Aux = Fila.frente;
	printf("================================ PRODUTOS ================================\n");
	while(Aux -> prox != NULL){
			ImprimirProduto(Aux->prox->item);
            Aux = Aux -> prox;
	}
}

//Imprime Produto
void ImprimirProduto(TProduto x){
    printf("CODIGO: %d \n", x.codigo);
    printf("NOME: %s \n", x.nome);
    printf("DESCRICAO: %s \n", x.descricao);
    printf("PRECO: %f \n", x.preco);
    printf("QUANTIDADE: %d \n", x.quantidade);
    printf("PESO: %f \n", x.peso);
    printf("================================          ================================\n");
}

//Pesquisa na Fila
int PesquisarFila(TFila *Fila, TProduto *Item){
    TProduto y;
	TFila Aux;
	FFVazia(&Aux);
	int flag = 0;

	while(!Vazia(*Fila)){
		Desenfileirar(Fila, &y);
		if(strcmp(Item->nome, y.nome) == 0){
			flag = 1;
			*Item = y;
		}
		Enfileirar(y, &Aux);
	}
	while(!Vazia(Aux)){
		Desenfileirar(&Aux, &y);
		Enfileirar(y, Fila);
	}
	free(Aux.frente);

	if(flag == 1){
		return 1;

	} else {
		Item->codigo = -1;
		return 0;
	}
}

//Excluir produto
void Excluir(TFila *Fila, TProduto x){
	TProduto item;
	TFila Fila2;
	FFVazia(&Fila2);
	int flag = 0;

	while (!Vazia(*Fila)){
		Desenfileirar(Fila, &item);
		if(item.codigo != x.codigo){
			Enfileirar(item, &Fila2);
		}
		if(item.codigo == x.codigo){
            flag = 1;
		}
	}
	while (!Vazia(Fila2)){
		Desenfileirar(&Fila2, &item);
		Enfileirar(item, Fila);
	}

	if(flag == 1){
        printf("Produto excluido com sucesso!");
	} else {
        printf("Produto nao encontrado!");
	}
}

//Comparar fila
int CompararFila(TFila *Fila, TFila *Fila2){
    TProduto x, y;
    TFila Aux1, Aux2;
    FFVazia(&Aux1);
    FFVazia(&Aux2);
    int contador = 0;

    if(Fila->tamanho != Fila2->tamanho){
        printf("\nFilas diferentes!\n");
        return 0;
    }

    while(!Vazia(*Fila)){
        Desenfileirar(Fila, &x);
        while(!Vazia(*Fila2)){
            Desenfileirar(Fila2, &y);
            if(x.codigo == y.codigo){
                contador++;
            }
            Enfileirar(y, &Aux2);
        }
        Enfileirar(x, &Aux1);

        while(!Vazia(Aux2)){
            Desenfileirar(&Aux2, &y);
            Enfileirar(y, Fila2);
        }
    }

    while(!Vazia(Aux1)){
        Desenfileirar(&Aux1, &x);
        Enfileirar(x, Fila);
    }

    if(contador == Fila->tamanho){
        printf("\nFilas iguais!\n");
        return 1;

    } else {
        printf("\nFilas diferentes!\n");
        return 0;
    }
}

//Interseccao fila
void Interseccao(TFila *Fila, TFila *Fila2, TFila *Fila3){
    TProduto x, y;
    TFila Aux1, Aux2;
    FFVazia(&Aux1);
    FFVazia(&Aux2);

    while(!Vazia(*Fila)){
        Desenfileirar(Fila, &x);
        while(!Vazia(*Fila2)){
            Desenfileirar(Fila2, &y);
            if(x.codigo == y.codigo){
                Enfileirar(x, Fila3);
            }
            Enfileirar(y, &Aux2);
        }
        Enfileirar(x, &Aux1);
        while(!Vazia(Aux2)){
            Desenfileirar(&Aux2, &y);
            Enfileirar(y, Fila2);
        }
    }
    while(!Vazia(Aux1)){
        Desenfileirar(&Aux1, &x);
        Enfileirar(x, Fila);
    }
}

void Diferenca(TFila *Fila, TFila *Fila2, TFila *Fila3){
    TProduto x, y;
    TFila Aux1, Aux2;
    FFVazia(&Aux1);
    FFVazia(&Aux2);

    while(!Vazia(*Fila)){
        Desenfileirar(Fila, &x);
        while(!Vazia(*Fila2)){
            Desenfileirar(Fila2, &y);
            if(x.codigo != y.codigo){
                Enfileirar(x, Fila3);
            }
            Enfileirar(y, &Aux2);
        }
        Enfileirar(x, &Aux1);
        while(!Vazia(Aux2)){
            Desenfileirar(&Aux2, &y);
            Enfileirar(y, Fila2);
        }
    }
    while(!Vazia(Aux1)){
        Desenfileirar(&Aux1, &x);
        Enfileirar(x, Fila);
    }
}

