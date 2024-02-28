/* 
 * Nama File    : MTitik.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Main Program Titik
 * Tanggal      : 28 Februari 2023
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

        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        System.out.println("Jarak Titik t1 ke pusat : " + t1.getJarakPusat());
        System.out.println("Jarak Titik t2 ke pusat : " + t2.getJarakPusat());
        System.out.println("Jarak Titik t3 ke pusat : " + t3.getJarakPusat());

        System.out.println("\nRefleksiX Titik 1");
        t1.refleksiX();
        System.out.println("Titik 1 setelah direfleksi");
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        Titik t4 = t1.getRefleksiX();
        System.out.println("t4(" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
    }
}