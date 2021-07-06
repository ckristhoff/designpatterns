package solidprinciples.singleresponsability.java;

public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee();

    // llamada a la responsabilidad de la clase Empleado
    employee.doTask();

    // llamado a las responsabilidades separadas
    EmployeeDataBaseManager employeeDataBaseManager = new EmployeeDataBaseManager();
    employeeDataBaseManager.save(employee);

    EmployeePayCalculator employeePayCalculator = new EmployeePayCalculator();
    employeePayCalculator.calculatePay(employee);
  }
}
