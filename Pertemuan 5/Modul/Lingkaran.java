/* 
 * Nama File    : Lingkaran.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Kelas implementasi IArea berupa cara menghitung luas lingkaran
 * Tanggal      : 20 Maret 2023
 */
import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}
