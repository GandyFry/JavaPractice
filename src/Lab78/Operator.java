package Lab78;

class Operator implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary, Company company) {
        return baseSalary;
    }
}
