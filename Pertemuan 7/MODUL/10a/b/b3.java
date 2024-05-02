/* 
 * Nama File    : B3.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Polimorfisme Ad Hoc:Coercion
 * Tanggal      : 2 Mei 2023
 */

public class b3 {
    public static void main(String[] args) {
        int y = 25;
        double output = y;
        System.out.println(output);
    }
    /*
    Pada baris ini, kita mencoba menginisialisasi variabel `output` dengan nilai dari variabel `y`, yang merupakan int.
    Java akan secara otomatis melakukan coercion dari tipe data int ke double
    karena double memiliki rentang nilai yang lebih besar daripada int. 
    Jadi, ini berhasil dieksekusi. Variabel `output` akan memiliki nilai 25.0.
     */
}
