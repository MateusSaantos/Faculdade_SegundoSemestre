# ifndef fila_HEADER
# define fila_HEADER

#include <stdio.h>
#include <stdlib.h>

//Criar TProduto
typedef struct item{
	int codigo;
	char nome[80];
	char descricao[200];
	float preco;
	int quantidade;
	float peso;
} TProduto;

//Criar a Celula
typedef struct celula{
	TProduto item;
	struct celula *prox;
} TCelula;

//Criar a lista
typedef struct fila{
	TCelula *frente;
	TCelula *tras;
	int tamanho;
} TFila;

//Inicia lista vazia
void FFVazia(TFila *fila);

//Verifica se a lista esta vazia
int Vazia(TFila Fila);

//Enfileirar lista
void Enfileirar(TProduto x, TFila *Fila);

//Desenfileirar lista
void Desenfileirar(TFila *Fila, TProduto *Item);

//Ler produto
void LerProduto(TProduto *x);

//Imprimir Fila
void ImprimirFila(TFila Fila);

//Imprimir produto
void ImprimirProduto(TProduto x);

//Pesquisar Fila
int PesquisarFila(TFila *Fila, TProduto *Item);

//Excluir Fila
void Excluir(TFila *Fila, TProduto x);

//Compara Fila
int CompararFila(TFila *Fila, TFila *Fila2);

//Interseccao Fila
void Interseccao(TFila *Fila, TFila *Fila2, TFila *Fila3);

//Diferença Fila
void Diferenca(TFila *Fila, TFila *Fila2, TFila *Fila3);
# endif // INTERFACE_H_INCLUDED
