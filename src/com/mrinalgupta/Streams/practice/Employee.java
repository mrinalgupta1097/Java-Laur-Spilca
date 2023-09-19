package com.mrinalgupta.Streams.practice;
public class Employee {
    private int empId;
    private String name;
    int age;
    String gender;
    String department;
    int doj;
    double salary;

    public Employee(int empId, String name, int age, String gender, String department, int doj, double salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.doj = doj;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDoj() {
        return doj;
    }

    public void setDoj(int doj) {
        this.doj = doj;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", doj=" + doj +
                ", salary=" + salary +
                '}';
    }
}
