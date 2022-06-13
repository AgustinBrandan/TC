grammar programa;

@header {
package tp1;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

LA : '{' ;
LC : '}' ;

PA : '(' ;
PC : ')' ;



DATO_TIPO_INT : 'int' ;
DATO_TIPO_DOUBLE : 'double' ;
DATO_TIPO_VOID : 'void' ;
DATO_TIPO_FLOAT : 'float' ;

CS_WHILE : 'while' ;
CS_IF : 'if' ;
CS_FOR : 'for' ;

MAS : '+' ;
MENOS : '-' ;
MULT: '*' ;
DIV : '/' ;


MENOR_QUE : '<' ; 
MAYOR_QUE : '>' ;
MENOR_0_IGUAL : '<=' ;
MAYOR_0_IGUAL : '>=' ;
COMP_IGUAL: '==' ;
DISTINTO : '!=' ;


IGUAL : '=' ;
PYQ : ';' ;
COMA : ',' ;

OR : '||' ;
AND : '&&' ;

RETURN : 'return' LA

WS : [ \n\t\r]+ -> skip;


programa :  instrucciones;


instrucciones :  instruccion instrucciones
              |  bloque instrucciones
              |
              ;


bloque : LA instrucciones LC ;



instruccion : declaracion PYQ
            | asignacion PYQ
            | iwhile
            | iif
            | ifor
            | funcion PYQ
            | declaracion_funcion PYQ
            | definicion_funcion
            | finalizar_con_return PYQ
            ;

verificador : ID | ENTERO ;


/*  INICIO DECLARACION  */
declaracion :  tipo_de_datos asignacion_simple;

tipo_de_datos : DATO_TIPO_INT 
              | DATO_TIPO_DOUBLE 
              | DATO_TIPO_FLOAT
              ;

asignacion_simple : ID IGUAL verificador
                  | ID IGUAL COMA asignacion_simple
                  | ID
                  | ID COMA asignacion_simple
                  ;

/* FIN DECLARACION */

/* INICIO ASIGNACION */
asignacion : ID IGUAL opal ;

opal : exp ;

exp : term e ;

e : MAS   term e
  | MENOS term e
  |
  ;

term : factor t ;

t : MULT factor t
  | DIV  factor t
  |
  ;

factor : ID
       | ENTERO
       | PA exp PC
       ;

/* FIN ASIGNACION */


/* INICIO ESTRUCTURAS DE CONTROL */

logico_comp : OR 
            | AND
            ;

comparacion : MAYOR_QUE
            | MENOR_QUE 
            | MAYOR_0_IGUAL 
            | MENOR_0_IGUAL 
            | COMP_IGUAL 
            | DIST        O 
            ;

comp : verificador logico_comp comp
     | verificador
     ;

bloque_estructuras_de_control : verificador comparacion verificador bloque_estructuras_de_control
                              | PA comp comparacion verificador  bloque_estructuras_de_control
                              | PA comp bloque_estructuras_de_control
                              | PC comparacion verificador bloque_estructuras_de_control
                              | PC logico_comp bloque_estructuras_de_control
                              | PC
                              | logico_comp bloque_estructuras_de_control
                              |
                              ; 

pos_pre_incremento : verificador MAS MAS 
                   | verificador MENOS MENOS
                   | MAS MAS verificador
                   | MENOS MENOS verificador
                   ;


bloque_for : PA ( (declaracion | asignacion) PYQ bloque_estructuras_de_control  PYQ pos_pre_incremento ) PC ;


iwhile : CS_WHILE PA bloque_estructuras_de_control PC bloque ;
  

iif : CS_IF PA bloque_estructuras_de_control  PC bloque  ;


ifor : CS_FOR bloque_for bloque ;

/* FIN ESTRUCTURAS DE CONTROL */


/* INICIO ACEPTAR FUNCIONES Y LLAMADAS DE FUNCIONES */


una_o_mas_variables : declaracion una_o_mas_variables
                    | declaracion
                    |
                    ; 

tipo_de_funcion : VOID ;

funcion : tipo_de_datos ID PA una_o_mas_variables PC
        | ID PA PC
        ;


declaracion_funcion : tipo_de_datos ID PA param_declaracion PC;
                    
definicion_funcion: tipo_de_datos ID PA param_definicion PC bloque;

param_declaracion : tipo_de_datos(ID | )
		              | tipo_de_datos (ID | ) COMA param_declaracion
                  |
		              ;

param_definicion : tipo_de_datos ID
		             | tipo_de_datos ID COMA param_definicion
                 |
	            	 ; 

/* FIN ACEPTAR FUNCIONES Y LLAMADAS DE FUNCIONES */

finalizar_con_return : RETURN ( term | )  ;
 
