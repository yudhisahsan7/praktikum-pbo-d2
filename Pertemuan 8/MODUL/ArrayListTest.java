/* 
 * Nama File    : ArrayListTest.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Program penggunaan objek ArrayList sebagai Collection Class
 * Tanggal      : 8 Mei 2024
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        strings.remove("praktikum");

        for(String s : strings) {
            System.out.println(s + " ");
        }
    }
}