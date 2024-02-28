/* 
 * Nama File    : Garis.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Garis
 * Tanggal      : 28 Februari 2023
 */
public class Garis {
    private Titik tAwal;
    private Titik tAkhir;

    public Garis(Titik tAwal, Titik tAkhir) {
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
    }

    public void setTitikAwal(Titik tAwal) {
        this.tAwal = tAwal;
    }

    public void setTitikAkhir(Titik tAkhir) {
        this.tAkhir = tAkhir;
    }

    public Titik getTitikAwal() {
        return this.tAwal;
    }

    public Titik getTitikAkhir() {
        return this.tAkhir;
    }

    public double getPanjang() {
        double x1 = getTitikAwal().getAbsis();
        double x2 = getTitikAkhir().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double y2 = getTitikAkhir().getOrdinat();
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt((deltaX * deltaX) + (deltaY - deltaY));
    }

    public double getGradien() {
        double x1 = getTitikAwal().getAbsis();
        double x2 = getTitikAkhir().getAbsis();
        double y1 = getTitikAwal().getOrdinat();
        double y2 = getTitikAkhir().getOrdinat();
        return (y2-y1)/(x2-x1);
    }
    
    public Garis getRefleksiY() {
        return new Garis(getTitikAwal().getRefleksiY(),getTitikAkhir().getRefleksiY());
    }

    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }
}
