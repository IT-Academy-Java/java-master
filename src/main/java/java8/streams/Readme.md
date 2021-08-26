# API STREAM - Java SE 8

## [¿Que son los streams?](https://www.oracle.com/lad/technical-resources/articles/java/expresiones-lambda-api-stream-java-part2.html)
Son un nuevo modelo de datos que nos permite tratar las colecciones como si fueran etapas de un proceso ETL (Extract Transform and Load)
En java 8, toda colección tiene un método stream() que transformará dicha estructura en Stream. Por ejemplo vamos a crear una instancia llamada “streangs” de Stream de Strings.


## Características
- Crea flujo de datos continuos que contienen operadores para procesar secuencias de elemento.
- Los operadores reducen notablemente las tareas de transformaciones
- Transforma y compone flujos con los operadores map, filter, concat, distinct, flatmap, sorted, foreach, reduce ... etc
- Pueden ser creado desde listas, arrays o rangos
- Son inmutables
- 