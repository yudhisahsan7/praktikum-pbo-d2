/* 
 * Nama File    : B1.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Polimorfisme Ad Hoc:Coercion
 * Tanggal      : 2 Mei 2023
 */

public class b1 {
    public static void main(String[] args) {
        int output = 'a';
        System.out.println(output);
    }
    /*
     * Dalam ASCII, 'a' memiliki nilai 97. Namun, variabel `output` dideklarasikan sebagai `int`. 
     * Java secara otomatis akan melakukan konversi karakter ke integer sesuai dengan nilai ASCII-nya. 
     * Jadi, berhasil dieksekusi. Output akan menjadi nilai ASCII dari karakter 'a', yaitu 97.
     */
}