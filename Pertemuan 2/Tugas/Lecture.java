/* 
 * Nama File    : Lecture.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Lecture
 * Tanggal      : 3 Maret 2023
 */
package Tugas;
import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> courseTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.courseTaught = new ArrayList<>();
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

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

    public int getEmployeeID() {
        return this.employeeID;
    }

    public void getDetails() {
        System.out.println("Nama \t: " + this.getName());
        System.out.println("Age \t: " + this.getAge());
        System.out.println("Address : " + this.getAddress());
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
