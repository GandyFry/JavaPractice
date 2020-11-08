package Lab78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Company {
    List<Employee> staff = new ArrayList<>();
    double income = 0;

    void hire(Employee employee) {
        staff.add(employee);
    }

    void hireAll(List<Employee> stuff) {
        this.staff.addAll(stuff);
    }

    void fire(int index) {
        staff.remove(index);
    }

    double getIncome() {
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).getEmployeePosition().getClass() == Manager.class) {
                income += ((Manager) staff.get(i).getEmployeePosition()).getCash();
            }
        }
        return income;
    }


    List<Employee> getTopSalaryStaff(int count) {
        Comparator<Employee> comparator = Comparator.comparing(obj -> obj.getEmployeePosition().calcSalary(obj.getBaseSalary(), this));
        Collections.sort(staff, comparator);
        return staff.subList(0, count);
    }

    List<Employee> getLowestSalaryStaff(int count) {
        Comparator<Employee> comparator = Comparator.comparing(obj -> obj.getEmployeePosition().calcSalary(obj.getBaseSalary(), this));
        Collections.sort(staff, comparator);
        Collections.reverse(staff);
        return staff.subList(0, count);
    }
}
