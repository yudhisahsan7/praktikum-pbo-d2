/* 
 * Nama File    : LambdaMap.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 * Tanggal      : 29 Mei 2024
 */


import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122112321", "Budi Haryadi");
        mahasiswaMap.put("24060122114562", "Chou Zhou");
        mahasiswaMap.put("24060122119887", "Samuel Milano");

        mahasiswaMap.forEach((nim,nama) -> {
            System.out.println(nim + " : " + nama);
        });
    }
}
