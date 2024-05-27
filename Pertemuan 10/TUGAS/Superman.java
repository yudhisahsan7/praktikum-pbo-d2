/* 
 * Nama File    : Superman.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas Superman
 * Tanggal      : 24 Mei 2024
 */

public class Superman extends Kryptonian {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    public void Eat() {
        System.out.println("Superman juga harus makan seperti pada manusia umumnya");
    }

    public void takeOff() {
        System.out.println(this.name + " taking off");
    }

    public void land() {
        System.out.println(this.name + " landing");
    }

    public void fly() {
        System.out.println(this.name + " flying");
    }

    public void leapBuilding() {
        System.out.println(this.name + "sedang loncat dari gedung yang tinggi");
    }

    public void stopBullet() {
        System.out.println(this.name + "dapat menghetikan peluru");
    }
}