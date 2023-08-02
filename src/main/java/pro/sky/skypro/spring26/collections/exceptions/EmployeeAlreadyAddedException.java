package pro.sky.skypro.spring26.collections.exceptions;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException(String message) {
        super(message);
    }
}