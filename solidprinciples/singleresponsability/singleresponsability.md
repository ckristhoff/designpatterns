# Single Responsability Principle (Principio de Única Responsabilidad)

> *"Una clase debería tener una sola razón para ser modificada"*

Tener más de una responsabilidad hace que una clase o función sea dificil de leer, de probar y mantener. Es decir, hace que el código fuente sea menos flexible y se incrementa al máximo el nivel de acoplamiento.

Analicemos el siguiente ejemplo:

```java
public class Employee {
  public void calculatePay() {
    // calcula el salario del empleado
    ...
  }
  public void save() {
    // almacena la información del empleado en la base de datos
    ...
  }
  public void doTask() {
    // ejecuta la tarea asignada al empleado
    ...
  }
}
```

Podemos concluir que la función `calculatePay` es responsabilidad de la política de cálculo de salario de la empresa, mientras que `save` es responsabilidad de la arquitectura del sistema, más especificamente de la lógica de persistencia en base de datos, y `doTask` es una responsabilidad propia del empleado ya que es él quien debe hacer la tarea para la que fue contratado.

Cuando alguna de las funcionalidades cambie o se agregen nuevas, vamos a tener que cambiar dicha clase lo que aumentará la probabilidad de colisión, complejidad y posibles bugs.

La solución es asignar las responsabilidades a las clases correspondientes.

Ver [ejemplo implementado en Java](java).
