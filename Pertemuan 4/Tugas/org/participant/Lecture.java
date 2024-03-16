/* 
 * Nama File    : Lecture.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Lecture
 * Tanggal      : 16 Maret 2023
 */

package org.participant;
import java.util.ArrayList;
import java.util.List;
import org.person.Person;
import org.course.Course;

public class Lecture extends Person{
    private int employeeID;
    private List<Course> courseTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.courseTaught = new ArrayList<>();
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Employee ID : " + this.getEmployeeID() + "\n");
    }

    public void teachCourse(Course course) {
        courseTaught.add(course);
    }

    public void viewTaughtCourses() {
        for(int i = 0; i < courseTaught.size(); i++) {
            courseTaught.get(i).getDetails();
        }
    }

    public static void lectureDisplayMenu() {
        System.out.println(" -----------------------------------" );
        System.out.println("|            DATA DOSEN             |");
        System.out.println("| ================================= |");
        System.out.println("| <1> Tambah Dosen                  |");
        System.out.println("| <2> Lihat Detail Dosen            |");
        System.out.println("| <3> Lihat Mata Kuliah yang diampu |");
        System.out.println("| <4> Keluar                        |");
        System.out.println("|                                   |");
        System.out.println(" -----------------------------------");
    }
}
