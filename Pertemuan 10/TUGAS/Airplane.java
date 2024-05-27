/* 
 * Nama File    : Airplane.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File abstrak kelas airplane yang extend dari vehicle dan implement IFLayer
 * Tanggal      : 24 Mei 2024
 */

public abstract class Airplane extends Vehicle implements IFlyer {
    protected double maxLoad;
    
    public Airplane(double maxLoad) {
        this.maxLoad = maxLoad;
    }
    
    public abstract double calcFuelEfficiency();
    
    public abstract double calcTripDistance();
    
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName() + " taking off");
    }
    
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " landing");
    }
    
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " flying");
    }
}