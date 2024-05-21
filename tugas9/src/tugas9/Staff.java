/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author User
 */
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, String title) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.title = title;
    }

    // Getter and setter for title
    // ...

    @Override
    public String toString() {
        return super.toString() + ", Title: " + title;
    }
}

