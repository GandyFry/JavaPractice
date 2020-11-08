package Lab78;

class TopManager implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary(double baseSalary, Company company) {
        if (company.getIncome() >= 10000000)
            return baseSalary * 2.5;
        else
            return baseSalary;
    }
}
