/* 
 * Nama File    : SerializePerson.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Program untuk serialisasi objek Person
 * Tanggal      : 15 Mei 2024
 */

import java.io.*;

class Person implements Serializable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");

        try (FileOutputStream fileStream = new FileOutputStream("person.ser");
             ObjectOutputStream objectStream = new ObjectOutputStream(fileStream)) {

            objectStream.writeObject(person);
            System.out.println("Person object has been serialized");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
