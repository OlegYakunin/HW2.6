package pro.sky.skypro.spring26.collections.service;

import pro.sky.skypro.spring26.collections.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addNewEmployee(String firstName, String lastName);

    Employee deleteEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);
    List<Employee> getEmployees();




}
