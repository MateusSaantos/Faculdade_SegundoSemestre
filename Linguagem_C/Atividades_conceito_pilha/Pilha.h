#ifndef PILHA_HEADER
#define PILHA_HEADER
#include <stdio.h>
#include <stdlib.h>

typedef struct {
	int codigo;
	char nome[80];
	char descricao[200];
	float preco;
	int quantidade;
	float peso;
} TProduto;

typedef struct celula{
	TProduto item;
	struct celula *prox;
} TCelula;

typedef struct fila{
	TCelula *fundo;
	TCelula *topo;
	int tamanho;
} TPilha;

void FPVazia(TPilha *Pilha);

int Vazia(TPilha Pilha);

void Empilhar(TProduto x, TPilha *Pilha);

void Desempilhar(TPilha *Pilha, TProduto *Item);

void LerProduto(TProduto *x);

void ImprimirProduto(TProduto x);

void ImprimirPilha(TPilha *Pilha);

int PesquisarPilha(TPilha *Pilha, TProduto *x);

#endif
