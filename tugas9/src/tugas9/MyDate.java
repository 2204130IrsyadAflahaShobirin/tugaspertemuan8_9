/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author User
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters and setters for day, month, year
    // ...

    // Metode untuk memvalidasi tanggal
    private boolean isValidDate() {
        if (month < 1 || month > 12) {
            return false;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear()) {
            daysInMonth[1] = 29;
        }

        if (day < 1 || day > daysInMonth[month - 1]) {
            return false;
        }

        return true;
    }

    // Metode untuk memeriksa tahun kabisat
    private boolean isLeapYear() {
        if (year % 4 != 0) {
            return false;
        }

        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

