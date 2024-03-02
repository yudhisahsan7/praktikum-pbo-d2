/* 
 * Nama File    : Student.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Student
 * Tanggal      : 1 Maret 2023
 */

package Tugas;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> courseEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.courseEnrolled = new ArrayList<>();
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

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    public int getStudentID() {
        return this.studentID;
    }

    public void getDetails() {
        System.out.println("Nama \t: " + this.getName());
        System.out.println("Age \t: " + this.getAge());
        System.out.println("Address : " + this.getAddress());
        System.out.println("Student ID : " + this.getStudentID() + "\n");
    }

    public void enrollInCourse(Course course) {
        courseEnrolled.add(course);
    }

    public void viewEnrolledCourses() {
        for(int i = 0; i < courseEnrolled.size(); i++) {
            courseEnrolled.get(i).getDetails();
        }
    }
    

    public static void studentDisplayMenu() {
        System.out.println(" -----------------------------------" );
        System.out.println("|          DATA MAHASISWA           |");
        System.out.println("| ================================= |");
        System.out.println("| <1> Tambah Mahasiswa              |");
        System.out.println("| <2> Lihat Detail Mahasiswa        |");
        System.out.println("| <3> Lihat Mata Kuliah yang diambil|");
        System.out.println("| <4> Keluar                        |");
        System.out.println("|                                   |");
        System.out.println(" -----------------------------------");
    }
}
