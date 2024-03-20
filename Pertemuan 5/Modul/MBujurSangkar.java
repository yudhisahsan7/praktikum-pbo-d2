/* 
 * Nama File    : MBujurSangkar.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 * Tanggal      : 20 Maret 2023
 */

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       BujurSangkar bs = new BujurSangkar();
       System.out.print("Masukkan sisi bujur sangkar : ");
       double sisi = scan.nextDouble();
       System.out.println("Luas Bujur Sangkar dengan sisi " + sisi + " adalah " + bs.hitungLuas(sisi));
    }
}
