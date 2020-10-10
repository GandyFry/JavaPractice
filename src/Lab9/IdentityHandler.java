package Lab9;

public class IdentityHandler implements EmployeeHandler{
    @Override
    public Employee handleEmployee(Employee employee) {
        return employee;
    }
}
