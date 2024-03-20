/* 
 * Nama File    : MLingkaran.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Kelas implementasi IArea berupa cara menghitung luas lingkaran
 * Tanggal      : 20 Maret 2023
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jari - jari : ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
    }
}
