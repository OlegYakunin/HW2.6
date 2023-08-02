package pro.sky.skypro.spring26.collections;

import java.util.Objects;

public class Employee {
    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Last name: " + lastName + ", first name: " + firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName);
    }





    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }
}
