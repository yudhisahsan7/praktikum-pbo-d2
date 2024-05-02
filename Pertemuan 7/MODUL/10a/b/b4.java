/* 
 * Nama File    : B4.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Polimorfisme Ad Hoc:Coercion
 * Tanggal      : 2 Mei 2023
 */

public class b4 {
    public static void main(String[] args) {
        int z = 78;
        char output = (char) z;
        System.out.println(output);
    }
    /*
     * Pada baris ini, kita mencoba menginisialisasi variabel output dengan nilai dari variabel z, yang merupakan int.
     * Namun, kita melakukan casting ke tipe data char. 
     * Hal ini akan berhasil dieksekusi karena kita melakukan casting secara eksplisit dari int ke char.
     * ASCII 78 mewakili karakter 'N', jadi nilai variabel output akan menjadi karakter 'N'.
     */
}
