/* 
 * Nama File    : AngkaSialException.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Tanggal      : 6 Maret 2023
 */
public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial!");
    }
}
