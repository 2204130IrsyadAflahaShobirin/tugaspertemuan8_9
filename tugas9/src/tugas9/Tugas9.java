/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas9;

/**
 *
 * @author User
 */
public class Tugas9 {
    public static void main(String[] args) {
        // Buat objek Person
        Person person = new Person("Alice", "123 Main St", "555-1212", "alice@example.com");

        // Buat objek Student
        Student student = new Student("Bob", "456 Elm St", "555-3434", "bob@example.com", Student.SOPHOMORE);

        // Buat objek Employee
        Employee employee = new Employee("Charlie", "789 Oak St", "555-5656", "charlie@example.com", "101", 50000, new MyDate(2020, 10, 1));

        // Buat objek Faculty
        Faculty faculty = new Faculty("David", "123 Main St", "555-1212", "david@example.com", "202", 65000, new MyDate(2015, 8, 1), 10, "Professor");

        // Buat objek Staff
        Staff staff = new Staff("Emily", "456 Elm St", "555-3434", "emily@example.com", "102", 40000, new MyDate(2018, 3, 1), "Receptionist");

        // Tampilkan informasi objek Person
        System.out.println(person);

        // Tampilkan informasi objek Student
        System.out.println(student);

        // Tampilkan informasi objek Employee
        System.out.println(employee);

        // Tampilkan informasi objek Faculty
        System.out.println(faculty);

        // Tampilkan informasi objek Staff
        System.out.println(staff);
    }
}
