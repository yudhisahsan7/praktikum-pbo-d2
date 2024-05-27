/*RiverBarge
 * Nama File    : SerializePerson.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas RiverBarge
 * Tanggal      : 24 Mei 2024
 */

public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return this.maxLoad / 20;
    }

    public double calcTripDistance() {
        return this.maxLoad * 3;
    }
}
