/* 
 * Nama File    : Bird.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas Bird yang extend dari Animal dan implement IFlyer
 * Tanggal      : 24 Mei 2024
 */

public class Bird extends Animal implements IFlyer {
    public Bird() {

    }
    public void eat() {
        System.out.println("Bird Eating");
    }

    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " taking off");
    }
    
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " landing");
    }
    
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " flying");
    }

    public void buildNest() {
        System.out.println(this.getClass().getSimpleName() + " build a nest");
    }

    public void layEggs() {
        System.out.println(this.getClass().getSimpleName() + " lay an egg");
    }
}
