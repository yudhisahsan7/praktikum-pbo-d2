/* 
 * Nama File    : MTitik.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Main Program Garis
 * Tanggal      : 28 Februari 2023
 */

 public class MGaris {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;
        Titik t4;
        Garis g1;
        Garis g2;
        Garis g3;

        t1 = new Titik(1.6,2);
        t2 = new Titik(5.8,2.7);
        t3 = new Titik(8.9,3);
        t4 = new Titik(7,8);

        g1 = new Garis(t1,t2);
        g2 = new Garis(t3,t4);

        System.out.println("G1: TAwal(" + g1.getTitikAwal().getAbsis() + ", " + g1.getTitikAwal().getOrdinat() + ")");
        System.out.println("G1: TAkhir(" + g1.getTitikAkhir().getAbsis() + ", " + g1.getTitikAkhir().getOrdinat() + ")");
        System.out.println("G2: TAwal(" + g2.getTitikAwal().getAbsis() + ", " + g2.getTitikAwal().getOrdinat() + ")");
        System.out.println("G2: TAkhir(" + g2.getTitikAkhir().getAbsis() + ", " + g2.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\nPanjang G1 : " + g1.getPanjang());
        System.out.println("Panjang G2 : " + g2.getPanjang());

        System.out.println("\nGradien G1 : " + g1.getGradien());
        System.out.println("Gradien G2 : " + g2.getGradien());

        System.out.println("\nRefleksiY untuk G1");
        g3 = g1.getRefleksiY();
        System.out.println("G3: TAwal(" + g3.getTitikAwal().getAbsis() + ", " + g3.getTitikAwal().getOrdinat() + ")");
        System.out.println("G3: TAkhir(" + g3.getTitikAkhir().getAbsis() + ", " + g3.getTitikAkhir().getOrdinat() + ")");

        System.out.println("\nisTegakLurus");
        System.out.println("Apakah g1 tegak lurus dengan g3? " + g1.isTegakLurus(g3));
    }
}