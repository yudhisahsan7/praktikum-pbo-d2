/* 
 * Nama File    : ProgramMedium.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Program Main ProgramMedium
 * Tanggal      : 24 Mei 2024
 */

import java.util.ArrayList;
import java.util.List;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck(10000);
        System.out.println(truck);

        SeaPlane seaPlane = new SeaPlane(5000);
        System.out.println(seaPlane);

        Helicopter copter = new Helicopter(3000);
        System.out.println(copter);

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());

        armadaSeaPlane.add(seaPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());

        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());

        System.out.println("############################");

        ArmadaKendaraan<Vehicle> armadaKendaraan = new ArmadaKendaraan<>();
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println("Menambahkan armada baru");
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

    }
}