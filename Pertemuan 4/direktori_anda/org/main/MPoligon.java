/* 
 * Nama File    : PersegiPanjang.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File program Main Poligon
 * Tanggal      : 13 Maret 2023
 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga = new Segitiga(10, 10, 3);

        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas() + "\n");
        
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}
