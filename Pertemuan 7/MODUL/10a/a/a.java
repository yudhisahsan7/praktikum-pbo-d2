/* 
 * Nama File    : B1.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Polimorfisme Ad Hoc:Overloading
 * Tanggal      : 2 Mei 2023
 */


/*
 * Method overloading adalah kemampuan dalam pemrograman untuk mendefinisikan beberapa metode
 * dengan nama yang sama di dalam sebuah kelas, tetapi dengan parameter-parameter yang berbeda.
 *
 * Syarat-syarat yang harus dipenuhi untuk mendapatkan method overloading adalah:
    1. Nama Metode Sama: Nama metode harus sama untuk setiap metode yang ingin di-overload di dalam sebuah kelas.
    2. Parameter yang Berbeda: Setiap metode yang di-overload harus memiliki daftar parameter yang berbeda.
 */

//  contoh

class Calculator {
   //  method overloading
   public int kali(int a, int b) {
      return a * b;
   }

   // method overloading
   public double kali(double a, double b) {
      return a * b;
   }
}

public class a {
   public static void main(String[] args) {
      Calculator calc = new Calculator();

      System.out.println(calc.kali(4, 5));
      System.out.println(calc.kali(6.3, 4.8));
   }
}