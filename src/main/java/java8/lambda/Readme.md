# FUNCTIONAL INTERFACES

1. Consumer
```
Code block
```


2. Supplier
```
Code block
```

3. Predicate
```
Code block
```

4. Functions
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
