package solidprinciples.singleresponsability.java;

public class Employee {
  // public void calculatePay() { // responsabilidad de
  //   // calcula el salario del empleado
  //   System.out.println("Total a pagar: $100");
  // }

  // public void save() { // responsabilidad de EmployeeDataBaseManager
  //   // almacena la información del empleado en la base de datos
  //   System.out.println("Guardado en base de datos");
  // }

  public void doTask() { // única responsabilidad propia de la clase Empleado
    // ejecuta la tarea asignada al empleado
    System.out.println("Ejecutando tarea...");
    System.out.println("Tarea ejecutada.");
  }
}
