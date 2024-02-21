/* 
 * Nama File    : MTitik.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Main Program Titik
 * Tanggal      : 21 Februari 2023
 */

public class MTitik {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);
        
        t2 = new Titik(3.0,4.0);
        
        t3 = new Titik(5, 6);

        int counterTitik = Titik.getCounterTitik();

        System.out.println("Jumlah objek titik : " + counterTitik);
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

    }
}