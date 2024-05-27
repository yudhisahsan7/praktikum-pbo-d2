/* 
 * Nama File    : Vehicle.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas Vehicle
 * Tanggal      : 24 Mei 2024
 */

public abstract class Vehicle {
    public double calcFuelEfficiency;
    public double calcTripDistance;
    public String toString() {
        return this.getClass().getSimpleName();
    }
}