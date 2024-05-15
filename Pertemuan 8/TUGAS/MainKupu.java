/* 
 * Nama File    : MainKupu.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Program Main Kupu
 * Tanggal      : 8 Mei 2024
 */

public class MainKupu {
    public static void main(String[] args) {
        Ulat K;
        Data<Kupu> anu;

        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
