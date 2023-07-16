#include <windows.h>
#include <stdio.h>
#include <stdlib.h>
#include "interface.h"

int main()
{
    TPilha pilha;
    TProduto produto;

    FPVazia(&pilha);

    MENU(&pilha);

    LiberarPilha(&pilha);

    return 0;
}
