/* 
 * Nama File    : Titik.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Titik
 * Tanggal      : 21 Februari 2023
 */

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik;

    Titik() {
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    Titik(double a, double o) {
        this.absis = a;
        this.ordinat = o;
        counterTitik++;
    }

    // overloading untuk integer
    Titik(int a, int o) {
        this.absis = a;
        this.ordinat = o;
        counterTitik++;
    }

    void setAbsis(double a) {
        this.absis = a;
    }

    void setOrdinat(double o) {
        this.ordinat = o;
    }

    double getAbsis() {
        return this.absis;
    }

    double getOrdinat() {
        return this.ordinat;
    }

    static int getCounterTitik() {
        return counterTitik;
    }
}