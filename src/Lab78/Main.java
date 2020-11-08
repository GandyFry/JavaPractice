package Lab78;

import java.util.List;

public class Main {
    String setName(){
        int rand = (int)(Math.random()*3);
        switch (rand){
            case 0:
                return "Владимир";
            case 1:
                return "Иван";
            case 2:
                return "Аркадий";
        }
        return null;
    }

    String setSurname(){
        int rand = (int)(Math.random()*3);
        switch (rand){
            case 0:
                return "Пупкин";
            case 1:
                return "Щербаков";
            case 2:
                return "Путин";
        }
        return null;
    }

    public static void main(String[] args) {
        Company company = new Company();
        Main main = new Main();
        for (int i =0;i<180;i++){
            Employee employee = new Employee();
            EmployeePosition operator = new Operator();
            employee.setEmployeePosition(operator);
            employee.setBaseSalary((Math.random()*30000)+30000);
            employee.setName(main.setName());
            employee.setSurname(main.setSurname());
            company.hire(employee);
        }

        for (int i = 0; i < 80; i++){
            Employee employee = new Employee();
            EmployeePosition manager = new Manager();
            employee.setEmployeePosition(manager);
            employee.setBaseSalary((Math.random()*20000)+100000);
            employee.setName(main.setName());
            employee.setSurname(main.setSurname());
            company.hire(employee);
        }

        for (int i = 0; i < 10; i++){
            Employee employee = new Employee();
            EmployeePosition topManager = new TopManager();
            employee.setEmployeePosition(topManager);
            employee.setBaseSalary((Math.random()*20000)+100000);
            employee.setName(main.setName());
            employee.setSurname(main.setSurname());
            company.hire(employee);
        }

        System.out.println("Top list:");
        List<Employee> staffDown = company.getLowestSalaryStaff(15);
        for (int i = 0; i < 15; i++){
            System.out.println((int)staffDown.get(i).getEmployeePosition().calcSalary(staffDown.get(i).getBaseSalary(),
                    company) + " руб. Должность " + company.staff.get(i).getEmployeePosition().getJobTitle()
                    + " " + staffDown.get(i).getName() + " " + staffDown.get(i).getSurname());
        }

        System.out.println("Lowset list:");
        List<Employee> staffUp = company.getTopSalaryStaff(30);
        for (int i = 0; i<30; i++){
            System.out.println((int)staffUp.get(i).getEmployeePosition().calcSalary(staffUp.get(i).getBaseSalary(),
                    company) + " руб. Должность " + company.staff.get(i).getEmployeePosition().getJobTitle()
                    + " " + staffUp.get(i).getName() + " " + staffUp.get(i).getSurname());
        }

        for (int i = 0; i < company.staff.size(); i += 2){
            company.fire(i);
        }

        System.out.println("Увальнение 50% работников.");

        System.out.println("Top list:");
        staffDown = company.getLowestSalaryStaff(15);
        for (int i = 0; i < 15; i++){
            System.out.println((int)staffDown.get(i).getEmployeePosition().calcSalary(staffDown.get(i).getBaseSalary(),
                    company) + " руб. Должность " + company.staff.get(i).getEmployeePosition().getJobTitle()
                    + " " + staffDown.get(i).getName() + " " + staffDown.get(i).getSurname());
        }

        System.out.println("Lowset list:");
        staffUp = company.getTopSalaryStaff(30);
        for (int i = 0; i<30; i++){
            System.out.println((int)staffUp.get(i).getEmployeePosition().calcSalary(staffUp.get(i).getBaseSalary(),
                    company) + " руб. Должность " + company.staff.get(i).getEmployeePosition().getJobTitle()
                    + " " + staffUp.get(i).getName() + " " + staffUp.get(i).getSurname());
        }

    }
}

