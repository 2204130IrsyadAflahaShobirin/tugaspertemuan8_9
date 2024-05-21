/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas8;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Tugas8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sisi1: ");
        double sisi1 = scanner.nextDouble();

        System.out.print("Masukkan sisi2: ");
        double sisi2 = scanner.nextDouble();

        System.out.print("Masukkan sisi3: ");
        double sisi3 = scanner.nextDouble();

        System.out.print("Masukkan warna: ");
        String warna = scanner.next();

        System.out.print("Masukkan apakah terisi (true/false): ");
        boolean terisi = scanner.nextBoolean();

        // Buat objek Segitiga
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);
        System.out.print("Masukkan warna: ");

        // Tampilkan informasi segitiga
        System.out.println(segitiga);
        System.out.println("Luas: " + segitiga.getLuas());
        System.out.println("Keliling: " + segitiga.getKeliling());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.isTerisi());
    }
}
