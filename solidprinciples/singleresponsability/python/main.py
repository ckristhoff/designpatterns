from employee_pay_calculator import EmployeePayCalculator
from employee_database_manager import EmployeeDataBaseManager
from employee import Employee


if __name__=='__main__':
  employee = Employee()

  # llamada a la responsabilidad de la clase empleado
  employee.doTask

  # llamado a las responsabilidades separadas
  employee_data_base_manager = EmployeeDataBaseManager()
  employee_data_base_manager.save(employee)

  employee_pay_calculator = EmployeePayCalculator()
  employee_pay_calculator.calculatePay(employee)
