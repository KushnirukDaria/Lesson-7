import json.Pagination;
import json.Response;
import person.Employee;
import person.EmployeeAgeComparator;
import person.EmployeeSalaryComparator;
import vehicle.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagination carPagination = new Pagination(10, 20, 100);
        Pagination employeePagination = new Pagination(10, 20, 100);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford", "Escort", 9000));
        cars.add(new Car("Honda", "Civic", 10000));
        cars.add(new Car("Zaz", "Lanos", 3000));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tolya", 10000, 25));
        employees.add(new Employee("Valera", 20000, 21));
        employees.add(new Employee("Iryna", 8000, 30));

        Response<Car> carResponse = new Response<>(cars, carPagination);
        Response<Employee> employeeResponse = new Response<>(employees, employeePagination);

        System.out.println("Cars sorted by price:");
        Collections.sort(carResponse.getData());
        carResponse.getData().forEach(System.out::println);

        System.out.println("Employees sorted by salary:");
        employeeResponse.getData().sort(new EmployeeSalaryComparator());
        employeeResponse.getData().forEach(System.out::println);

        System.out.println("Employees sorted by age:");
        employeeResponse.getData().sort(new EmployeeAgeComparator());
        employeeResponse.getData().forEach(System.out::println);


    }
}
