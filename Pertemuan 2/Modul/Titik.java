/* 
 * Nama File    : Titik.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Titik
 * Tanggal      : 28 Februari 2023
 */

public class Titik {
    private double absis;
    private double ordinat;

    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
    }

    public Titik(double a, double o) {
        this.absis = a;
        this.ordinat = o;
    }

    // overloading untuk integer
    public Titik(int a, int o) {
        this.absis = a;
        this.ordinat = o;
    }

    public void setAbsis(double a) {
        this.absis = a;
    }

    public void setOrdinat(double o) {
        this.ordinat = o;
    }

    public double getAbsis() {
        return this.absis;
    }

    public double getOrdinat() {
        return this.ordinat;
    }

    public double getJarakPusat() {
        return Math.sqrt((getAbsis()*getAbsis())+(getOrdinat()*getOrdinat()));
    }

    public void refleksiX() {
        setOrdinat(this.getOrdinat()*-1);
    }

    public void refleksiY() {
        setAbsis(this.getAbsis()*-1);
    }

    public Titik getRefleksiX() {
        return new Titik(this.getAbsis(),this.getOrdinat()*-1);
    }

    public Titik getRefleksiY() {
        return new Titik(this.getAbsis()*-1,this.getOrdinat());
    }   
}