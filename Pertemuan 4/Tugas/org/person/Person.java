/* 
 * Nama File    : Person.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Supertype Person
 * Tanggal      : 16 Maret 2023
 */


package org.person;
public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public void getDetails() {
        System.out.println("Nama \t: " + this.getName());
        System.out.println("Age \t: " + this.getAge());
        System.out.println("Address : " + this.getAddress());
    }
}
