#include <stdio.h>
#include <stdlib.h>

#include "interface.h"

int main(){
    TFila fila, filaB, filaC;
	TProduto produto;

	FFVazia(&fila);
	FFVazia(&filaB);
	FFVazia(&filaC);

	MENU(&fila, &filaB, &filaC);

	//Liberar(&fila);

	return 0;
}

//FIM
