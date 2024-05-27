/* 
 * Nama File    : Truck.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas Truck
 * Tanggal      : 24 Mei 2024
 */

public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return this.maxLoad / 10;
    }

    public double calcTripDistance() {
        return this.maxLoad * 5;
    }

    @Override
    public String toString() {
        return "Truk adalah angkutan darat yang sangat handal";
    }
}
