# LAMBDA

## [What is a Lambda](https://www.oracle.com/lad/technical-resources/articles/java/expresiones-lambda-api-stream-java.html)?
- A lambda is a function
- A function is a computation that takes parameters and returns a value
- Until Java 8, functions could only be implemented using methods
- A lambda enables functions to be passed around or stored like data

```
List<Camisa> camisas  = …
    
    List<Camisa> camisasRojas = filtrar(camisas, 
    (Camisa c) ­> “ROJO”.equals(c.getColor()));
```

## Functional Interfaces
Una interface funcional se define como una interface que tiene uno y solo un método abstracto y
que éste sea diferente a los métodos definidos en java.lang.Object(equals, hascode, clone ... etc). 
La interface puede tener métodos por defecto y estáticos sin que esto afecte su condición de ser interface funcional.

Existe una nueva anotación denominada **@FunctionalInterface** que permite al compilador realizar la validación de que la interface tenga solamente un método abstracto. A continuación se muestra un código que no compilará, debido a que la interface define más de un método abstracto:

```
@FunctionalInterface
public interface  MiInterface {     
    int getNum(); 
    String getString(); 
    String toString(); 
}
```

Nótese que la interface anterior define tres métodos abstractos, sin embargo +toString():String es uno de los métodos definidos en la clase java.lang.Object y por lo tanto no cuenta para la regla de interfaces funcionales. Lo cual nos deja con dos métodos abstractos y es por ello que el compilador mostrará el error: “MiInterface is not a functional interface”.

Java SE 8 define 4 grandes grupos de interfaces funcionales agrupadas en el paquete **java.util.function**


1. **Consumer<T>**: Define el método +accept(T):void y es usada para consumir métodos del parámetro T, causando posibles efectos secundarios.
```
Consumer<Integer> print = (a) ­> System.out.println(a);
```

Ahora la misma expresión lambda usando métodos de referencia:
```
Consumer<Integer> print = System.out::println;
```
2. **Supplier<T>**: Define el método +get():T y es usada para la creación de objetos.


3. **Predicate<T>**: Define  el  método  +test(T):boolean  y  es  usada  para validación de criterios.


4. **Function<T, R>**: Define el método +apply(T):R y es usada para convertir de un valor T a otro valor R.
```
Function<String, String> function1 = param -> "Hola que ase,  " + param;
System.out.println(function1.apply("helena"));
```

5. Runnable
```
public interface Runnable{
    void run();
}

Runnable alert = () => System.out.println("Hello lambdas!!!!");
```
