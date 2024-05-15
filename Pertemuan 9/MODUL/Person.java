/* 
 * Nama File    : Person.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Person database model
 * Tanggal      : 15 Mei 2024
 */

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public Person(int i, String n) {
        this.id = i;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
