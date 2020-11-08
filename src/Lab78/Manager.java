package Lab78;

class Manager implements EmployeePosition {
    private double cash = (Math.random() * 25000) + 115000;

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary, Company company) {
        return baseSalary + cash * 0.05;
    }

    public double getCash() {
        return cash;
    }
}
