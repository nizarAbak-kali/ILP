/* Fichier compil?? vers C */
#include <stdio.h>
#include <stdlib.h>

#include "ilp.h"

ILP_Object ilp_program ()
{
return ILP_LessThanOrEqual( ILP_Integer2ILP(44) ,  ILP_Integer2ILP(44) ) ;
}

int main (int argc, char *argv[]) {
  ILP_print(ilp_program());
  ILP_newline();
  return EXIT_SUCCESS;
}
/* fin */
