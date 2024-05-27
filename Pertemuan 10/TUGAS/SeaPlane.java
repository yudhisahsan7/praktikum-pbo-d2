/* 
 * Nama File    : SeaPlane.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas Seaplane
 * Tanggal      : 24 Mei 2024
 */

public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane(double maxLoad) {
        super(maxLoad);
    }

    public double calcFuelEfficiency() {
        return this.maxLoad / 30;
    }

    public double calcTripDistance() {
        return this.maxLoad * 8;
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

    @Override
    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
