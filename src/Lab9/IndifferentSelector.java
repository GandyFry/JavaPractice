package Lab9;

public class IndifferentSelector implements EmployeeSelector{
    @Override
    public boolean need(Employee employee) {
        return true;
    }
}
