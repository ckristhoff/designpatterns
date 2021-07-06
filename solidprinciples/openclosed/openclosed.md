# Open/Closed Principle (Principio Abierto/Cerrado)

> *"Las entidades de software (clases, modulos, funciones, etc.) deben estar abiertas para su extensión, pero cerradas para modificaciones*

La idea es escribir el código fuente para que sea fácil agregar nuevas funcionalidades sin cambiar el código existente, para lograr esto usaremos interfaces o clases abstractas, así podremos cambiar la implementación de las clases concretas manteniendo la interfaz intacta.

Analicemos el siguiente ejemplo:

```java
public class CreditCalculator {
  public void calculatePay(credit) {
    if(credit.type == "A") {
      ...
    }
    else if(credit.type == "B") {
      ...
    }
    else {
      ...
    }
  }
}
```

Si se crea un nuevo tipo de crédito, vamos a necesitar cambiar el comportamiento de la función `calculatePay`. Para aplicar el patrón usaremos una abstracción para separar los distintos comportamientos en una clase concreta y cuando se requiera crear un nuevo tipo de crédito se creará una nueva clase con el comportamiento específico.

Ver [ejemplo implementado en Java](java).
