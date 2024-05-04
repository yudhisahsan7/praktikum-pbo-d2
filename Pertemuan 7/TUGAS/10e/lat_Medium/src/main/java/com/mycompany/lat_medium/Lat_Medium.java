/*
 * Nama File    : Lat_Medium.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Main Lat_Medium
 * Tanggal      : 2 Mei 2023
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lat_medium;

/**
 *
 * @author LENOVO
 */
public class Lat_Medium {
    public static void main(String[] args) {
       Senjata ak47 = new Senjata("TAR");
       Senjata m16 = new Senjata("DOR");
       KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
       KontrolSenjata kontrolM16 = new KontrolSenjata(m16);
       
       kontrolAK47.menembak(2);
       kontrolAK47.isiPeluru(3);
       kontrolAK47.menembak(5);
       
       System.out.println("===============================");
       
       kontrolM16.menembak(1);
       kontrolM16.isiPeluru(5);
       kontrolM16.menembak(2);
    }
}
