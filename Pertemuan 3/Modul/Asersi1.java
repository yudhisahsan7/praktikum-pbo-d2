/* 
 * Nama File    : Asersi1.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Program untuk menunjukkan asersi
 * Tanggal      : 6 Maret 2023
 */
public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        }
        else {
            assert(x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
            
        }
    }
}
