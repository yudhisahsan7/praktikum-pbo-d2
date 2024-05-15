/* 
 * Nama File    : ReadSerializedPerson.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Program untuk serialisasi objek Person
 * Tanggal      : 15 Mei 2024
 */

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("Serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
