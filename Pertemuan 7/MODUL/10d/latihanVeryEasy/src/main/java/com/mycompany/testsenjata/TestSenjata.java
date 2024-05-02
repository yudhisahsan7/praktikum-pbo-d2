/*
 * Nama File    : TestSenjata.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Main TestSenjata
 * Tanggal      : 2 Mei 2023
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testsenjata;

/**
 *
 * @author LENOVO
 */
public class TestSenjata {

    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumah Peluru AK47 : " + ak47.getPeluru());
        
        System.out.println("AK7 menembak");
        ak47.menembak();
    }
}
