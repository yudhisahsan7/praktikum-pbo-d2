/* 
 * Nama File    : Airport.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas Airport
 * Tanggal      : 24 Mei 2024
 */

public class Airport {
    private Airplane airplane;
    private String name;

    public Airport(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Izin mendarat diberikan";
        } else {
            return "Izin mendarat ditolak";
        }
    }
}