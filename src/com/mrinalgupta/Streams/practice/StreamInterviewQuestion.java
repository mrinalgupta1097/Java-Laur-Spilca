package com.mrinalgupta.Streams.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamInterviewQuestion {
  static List<Employee> employeeList = new ArrayList<>();

  public static void main(String[] args) {
    employeeList.add(new Employee(111, "Jeya", 30, "Female", "HR", 2011, 25000.0));
    employeeList.add(new Employee(122, "Polish", 29, "Male", "Sales", 2015, 18500.0));
    employeeList.add(new Employee(133, "Thomas", 26, "Male", "Administartion", 2012, 18700.0));
    employeeList.add(new Employee(144, "Gowthami", 29, "Female", "Development", 2014, 33500.0));
    employeeList.add(new Employee(155, "Nisha", 25, "Female", "HR", 2013, 22000.0));
    employeeList.add(new Employee(166, "Issac", 40, "Male", "Maintenance", 2016, 12000.0));
    employeeList.add(new Employee(177, "Sharmila", 30, "Female", "Finance", 2010, 29000.0));
    employeeList.add(new Employee(188, "Linga", 33, "Male", "Development", 2015, 35000.0));
    employeeList.add(new Employee(199, "John", 34, "Male", "Sales", 2016, 14500.0));
    employeeList.add(new Employee(200, "Jeyam", 36, "Male", "Maintenance", 2015, 17000.0));
    employeeList.add(new Employee(211, "kumar", 37, "Male", "Administartion", 2014, 18700.0));
    employeeList.add(new Employee(222, "Joshi", 25, "Male", "Development", 2016, 29000.0));
    employeeList.add(new Employee(233, "Reddy", 29, "Male", "Finance", 2013, 27000.0));
    employeeList.add(new Employee(244, "Denwer", 28, "Male", "Sales", 2017, 18000.));
    employeeList.add(new Employee(255, "Alia", 26, "Female", "Administartion", 2018, 13000.0));
    employeeList.add(new Employee(266, "Sangavi", 36, "Female", "Development", 2015, 29000.0));
    employeeList.add(new Employee(277, "Anuja", 32, "Female", "Development", 2012, 38000.0));

    // find no of male and no of female employee and return result as map
    Map<String, Long> genderCount =
        employeeList.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    System.out.println(genderCount);

    // print every department in company
    System.out.println();
    System.out.println("print every department in company");
    employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

    // average age of employees
    System.out.println();
    System.out.println("average age of employees");
    System.out.println(employeeList.stream().mapToInt(Employee::getAge).average().getAsDouble());
    // or
    System.out.println("average age of employees: using collectors");
    System.out.println(employeeList.stream().collect(Collectors.averagingInt(Employee::getAge)));
    // average age by genders
    System.out.println("average age of employees: by gender");
    System.out.println(
        employeeList.stream()
            .collect(
                Collectors.groupingBy(
                    Employee::getGender, Collectors.averagingInt(Employee::getAge))));
    // highest paid employee
    System.out.println();
    System.out.println("highest paid employee");
    employeeList.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .map(Employee::getName).limit(1).forEach(System.out::println);
    System.out.println(
        employeeList.stream()
            .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
            .get()
            .getName());
  }
}
