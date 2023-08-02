package pro.sky.skypro.spring26.collections.service;

import org.springframework.stereotype.Service;
import pro.sky.skypro.spring26.collections.Employee;
import pro.sky.skypro.spring26.collections.exceptions.EmployeeAlreadyAddedException;
import pro.sky.skypro.spring26.collections.exceptions.EmployeeNotFoundException;
import pro.sky.skypro.spring26.collections.exceptions.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    private int maxEmployees = 5;

    public Employee addNewEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.size() >= maxEmployees) {
            throw new EmployeeStorageIsFullException("Лист сотрудников переполнен");
        }
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Сотрудник уже находится в листе");
        }
        employees.add(employee);
        return employee;
    }

    public Employee deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
        employees.remove(employee);
        return employee;
    }

    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        } else return employee;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
