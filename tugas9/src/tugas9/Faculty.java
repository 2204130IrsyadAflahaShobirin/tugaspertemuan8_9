/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author User
 */
public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Getters and setters for officeHours, rank
    // ...

    @Override
    public String toString() {
        return super.toString() + ", Office Hours: " + officeHours + ", Rank: " + rank;
    }
}
