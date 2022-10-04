package companyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Department> departments = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            String[] tokens = scanner.nextLine().split("\\s+");

            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String employeeDepartment = tokens[3];

            Employee employee = null;

            switch (tokens.length){
                case 4:
                    employee = new Employee(name, salary, position, employeeDepartment);
                    break;
                case 5:
                    if (tokens[4].contains("@")){
                        String employeeEmail = tokens[4];
                        employee = new Employee(name, salary, position, employeeDepartment, employeeEmail);
                    } else {
                        int employeeAge = Integer.parseInt(tokens[4]);
                        employee = new Employee(name, salary, position, employeeDepartment, employeeAge);
                    }
                    break;
                case 6:
                    String email = tokens[4];
                    int age = Integer.parseInt(tokens[5]);
                    employee = new Employee(name, salary, position, employeeDepartment, email, age);
                    break;
            }

            boolean departmentExists = departments.stream()
                    .anyMatch(department -> department.getName().equals(employeeDepartment));

            if (!departmentExists){
                Department department = new Department(employeeDepartment);
                departments.add(department);
            }

            Department currentDepartment = departments.stream()
                    .filter(department -> department.getName().equals(employeeDepartment))
                    .findFirst()
                    .get();

            currentDepartment.getEmployees().add(employee);
        }

        Department highestPaidDepartment = departments.stream()
                .max(Comparator.comparingDouble(Department::calculateAverageSalary))
                .get();

        System.out.println("Highest Average Salary: " + highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees().stream()
                .sorted((first, second) -> Double.compare(second.getSalary(), first.getSalary()))
                .forEach(System.out::println);
    }
}
