/* 
 * Nama File    : Course.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Kelas Course
 * Tanggal      : 1 Maret 2023
 */

package Tugas;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Lecture getLecture() {
        return this.lecture;
    }

    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        for(int i = 0; i < studentsEnrolled.size(); i++) {
            studentsEnrolled.get(i).getDetails();
        }
    }

    public void getDetails() {
        System.out.println("Kode MK \t: " + this.getCourseCode());
        System.out.println("Nama MK \t: " + this.getCourseName() + "\n");
        // System.out.println("Pengampu \t: " + this.getLecture().getName());
    }

    public static void CourseDisplayMenu() {
        System.out.println(" -----------------------------------" );
        System.out.println("|            DATA COURSE            |");
        System.out.println("| ================================= |");
        System.out.println("| <1> Tambah Course                 |");
        System.out.println("| <2> Lihat Detail Course           |");
        System.out.println("| <3> Lihat Daftar Mahasiswa        |");
        System.out.println("| <4> Keluar                        |");
        System.out.println(" -----------------------------------");
    }

}
