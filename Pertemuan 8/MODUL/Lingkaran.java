/* 
 * Nama File    : Lingkaran.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Implementasi Lingkaran sebagai Bangun Datar
 * Tanggal      : 8 Mei 2024
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}
