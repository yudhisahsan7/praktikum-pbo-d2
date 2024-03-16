/* 
 * Nama File    : Student.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Student
 * Tanggal      : 16 Maret 2023
 */

package org.participant;
import java.util.ArrayList;
import java.util.List;
import org.person.Person;
import org.course.Course;

public class Student extends Person {
    private int studentID;
    private List<Course> courseEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.courseEnrolled = new ArrayList<>();
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void getDetails() {
        super.getDetails();
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
