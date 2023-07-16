#include <stdio.h>
#include <stdlib.h>
#include "pilha.h"
#include "fila.h"

void FPVazia(TPilha *Pilha){
	Pilha->topo = (TCelula*) malloc(sizeof(TCelula));
	Pilha->fundo = Pilha->topo;
	Pilha->topo->prox = NULL;
	Pilha->tamanho = 0;
}

int Vazia(TPilha Pilha){
	return (Pilha.topo == Pilha.fundo);
}

void Empilhar(TProduto x, TPilha *Pilha){
	TCelula* Aux;
	Aux = (TCelula*) malloc(sizeof(TCelula));
	Pilha->topo->item = x;
	Aux->prox = Pilha->topo;
	Pilha->topo = Aux;
	Pilha->tamanho++;
}

void Desempilhar(TPilha *Pilha, TProduto *Item){
	TCelula* q;
	if(Vazia(*Pilha)){
		printf("\nErro: Pilha vazia!");
		return;
	}

	q = Pilha->topo;
	Pilha->topo = q->prox;
	*Item = q->prox->item;
	free(q);
	Pilha->tamanho--;
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

void ImprimirPilha(TPilha *Pilha){
    TProduto item;
    TPilha Pilha2;
    FPVazia(&Pilha2);

    while(!Vazia(*Pilha)){
        Desempilhar(Pilha, &item);
        Empilhar(item, &Pilha2);
    }

    while(!Vazia(Pilha2)){
        Desempilhar(&Pilha2, &item);
        ImprimirProduto(item);
        Empilhar(item, Pilha);
    }
    free(Pilha2.topo);
}

int PesquisarPilha(TPilha *Pilha, TProduto *x){
    TProduto y;
    TPilha Aux;
    FPVazia(&Aux);
    int flag = 0;

    while(!Vazia(*Pilha)){
        Desempilhar(Pilha, &y);
        if(strcmp(x->nome, y.nome) == 0){
            *x = y;
            flag = 1;
        }
        Empilhar(y, &Aux);
    }
    while(!Vazia(Aux)){
		Desempilhar(&Aux, &y);
		Empilhar(y, Pilha);
	}
	free(Aux.topo);

	if(flag == 1){
		return 1;

	} else {
		x->codigo = -1;
		return 0;
	}
}

void LiberarPilha(TPilha *Pilha){
    TPilha x;

    while(!Vazia(*Pilha)){
        Desempilhar(Pilha, &x);
    }
    free(Pilha->topo);
}
