/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8;

/**
 *
 * @author User
 */
class Segitiga extends Geometris {

    private double sisi1;
    private double sisi2;
    private double sisi3;
    private String warna;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
    private boolean terisi;

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    public boolean isTerisi() {
        return terisi;
    }
    // Konstruktor tanpa argumen
    public Segitiga() {
        this(1.0, 1.0, 1.0);
    }

    // Konstruktor dengan sisi yang ditentukan
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Metode pengakses
    public double getSisi1() {
        return sisi1;
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    // Menghitung luas segitiga
    @Override
    public double getLuas() {
        double s = (sisi1 + sisi2 + sisi3) / 2.0;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    // Menghitung keliling segitiga
    @Override
    public double getKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    // Menampilkan deskripsi string
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + ", sisi2 = " + sisi2 + ", sisi3 = " + sisi3;
    }
}
