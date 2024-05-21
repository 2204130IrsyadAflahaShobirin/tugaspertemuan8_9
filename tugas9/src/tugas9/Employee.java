/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author User
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate hireDate;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getters and setters for office, salary, hireDate
    // ...

    @Override
    public String toString() {
        return super.toString() + ", Office: " + office + ", Salary: " + salary + ", Hire Date: " + hireDate;
    }
}

