/* 
 * Nama File    : Animal.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File abstrak kelas Animal
 * Tanggal      : 24 Mei 2024
 */

public abstract class Animal {
    public abstract void eat();
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
