# LAMBDAS
# Description
Practica exclusiva a les lambdes, un concepte difícil d'entendre però molt útil un cop assolit.
Per a tots els exercicis s‘ha de utilitzar el API de Java Lambdas and Streams de Java 8.

## Fase 1
- Tenint una llista de cadenes de noms propis, escriu un mètode que retorne una llista de totes les cadenes que comencen amb la lletra 'a' (mayuscula) i tenen exactament 3 lletres. Imprimeix el resultat. 
- Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers. Cada element hauria d'anar precedit per la lletra "e" si el nombre és parell, i precedit de la lletra "o" si el nombre és imparell. Per exemple, si la llista d'entrada és (3,44), la sortida hauria de ser "o3, e44". Imprimeix el resultat. 
- Tenint una llista de Strings, escriu un mètode que retorne una llista de totes les cadenes que continguen la lletra ‘o’ i imprimeix el resultat. 
- Has de fer el mateix que en el punt anterior, però retornant una llista que incloga els elements amb més de 5 lletres. Imprimeix el resultat. 
- Crea una llista amb els nombs dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda. 
- Has de fer la mateixa impressió del punt anterior però fent-ho mitjançant method reference.

## Fase 2
- Crea una Functional Interface que continga un mètode abstracte getPiValue (), que retorna un valor double; en una altra classe, instancie la interfície i assigneu-li mitjançant una lambda el valor 3.1415. Invoca el mètode getPiValue de la instància d'interfície i imprimeix el resultat.

## Fase 3
Crea una Functional Interface que continga un mètode abstracte reverse (), que retorne un valor String; en una altra classe, injecta a la interfície creada mitjançant una lambda el cos del mètode, de manera que torne la mateixa cadena que rep com a paràmetre però a l'inrevés. Invoca la instància de la interfície passant-li una cadena i comprovant el resultat. 