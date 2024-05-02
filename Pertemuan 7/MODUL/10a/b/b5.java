/* 
 * Nama File    : B5.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Polimorfisme Ad Hoc:Coercion
 * Tanggal      : 2 Mei 2023
 */

public class b5 {
    public static void main(String[] args) {
        char a = 'a';
        double output = a;
        System.out.println(output);
    }
    /*
     * Pada baris ini, kita mencoba menginisialisasi variabel `output` dengan nilai dari variabel `a`, yang merupakan char.
     * Kita mencoba melemparkan nilai char ke variabel double tanpa melakukan konversi tipe data secara eksplisit.
     * Hal ini akan gagal karena kita mencoba melakukan coercion dari tipe data char ke double secara langsung tanpa casting.
     */
}
