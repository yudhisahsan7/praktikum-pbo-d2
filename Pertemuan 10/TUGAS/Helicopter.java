/* 
 * Nama File    : Helicopter.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas Helicopter
 * Tanggal      : 24 Mei 2024
 */
public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(double maxLoad) {
        super(maxLoad);
    }

    public double calcFuelEfficiency() {
        return this.maxLoad/20;
    }

    public double calcTripDistance() {
        return this.maxLoad*6;
    }

    @Override
    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
