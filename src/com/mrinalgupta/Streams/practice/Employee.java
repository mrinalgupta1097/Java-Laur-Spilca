package com.mrinalgupta.Streams.practice;
/**
 * The type Employee.
 */
public class Employee {
    private int empId;
    private String name;
    /**
     * The Age.
     */
int age;
    /**
     * The Gender.
     */
String gender;
    /**
     * The Department.
     */
String department;
    /**
     * The Doj.
     */
int doj;
    /**
     * The Salary.
     */
double salary;

    /**
     * Instantiates a new Employee.
     *
     * @param empId the emp id
     * @param name the name
     * @param age the age
     * @param gender the gender
     * @param department the department
     * @param doj the doj
     * @param salary the salary
     */
public Employee(int empId, String name, int age, String gender, String department, int doj, double salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.doj = doj;
        this.salary = salary;
    }

    /**
     * Gets emp id.
     *
     * @return the emp id
     */
public int getEmpId() {
        return empId;
    }

    /**
     * Sets emp id.
     *
     * @param empId the emp id
     */
public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets department.
     *
     * @return the department
     */
public String getDepartment() {
        return department;
    }

    /**
     * Sets department.
     *
     * @param department the department
     */
public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets doj.
     *
     * @return the doj
     */
public int getDoj() {
        return doj;
    }

    /**
     * Sets doj.
     *
     * @param doj the doj
     */
public void setDoj(int doj) {
        this.doj = doj;
    }

    /**
     * Gets salary.
     *
     * @return the salary
     */
public double getSalary() {
        return salary;
    }

    /**
     * Sets salary.
     *
     * @param salary the salary
     */
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
