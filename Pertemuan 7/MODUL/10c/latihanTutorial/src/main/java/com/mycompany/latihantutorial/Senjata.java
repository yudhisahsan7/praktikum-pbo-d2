/*
 * Nama File    : LatihanTutorial.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Senjata
 * Tanggal      : 2 Mei 2023
*/

package com.mycompany.latihantutorial;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public String getBunyi() {
        return bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }
    
    public void menembak(int jumlah) {
        for(int i = 0; i < jumlah; i++) {
            System.out.print(this.getBunyi() + " ");
        }
        System.out.println("");
    }
    
    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk() {
        if (isMenusuk()) {
            return "Jleb!";
        }
        else {
            return "Gagal, belum pasang bayonet";
        }
    }
    
}
