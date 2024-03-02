/* 
 * Nama File    : Main.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File Main Program Sistem Akademik
 * Tanggal      : 1 Maret 2023
 */

package Tugas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihanMenuUtama;
        int pilihanDosen;
        int pilihanMhs;
        int pilihanCourse;

        Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
        Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);
        List<Lecture> listDosen = new ArrayList<>();
        listDosen.add(agus);
        listDosen.add(bambang);
        
        Student cahyo = new Student("Cahyo", 20, "Jalan Sipodang", 723751);
        Student dani = new Student("Dani", 20, "Jalan Gondang Raya", 734621);
        Student edi = new Student("Edi", 20, "Jalan Timoho Barat", 733451);
        List<Student> listMahasiswa =  new ArrayList<>();
        listMahasiswa.add(cahyo);
        listMahasiswa.add(dani);
        listMahasiswa.add(edi);
        
        Course cs101 = new Course("PAIK6401", "Pemrograman Berorientasi Objek");
        Course cs102 = new Course("PAIK6402", "Jaringan Komputer");
        Course cs103 = new Course("PAIK6403", "Manajemen Basis Data");
        Course cs104 = new Course("PAIK6404", "Grafika dan Komputasi Visual");
        List<Course> listCourse = new ArrayList<>();
        listCourse.add(cs101);
        listCourse.add(cs102);
        listCourse.add(cs103);
        listCourse.add(cs104);
        
        agus.teachCourse(cs101);
        agus.teachCourse(cs102);
        bambang.teachCourse(cs103);
        bambang.teachCourse(cs104);

        cahyo.enrollInCourse(cs101);
        dani.enrollInCourse(cs101);
        edi.enrollInCourse(cs101);
    
        cs101.addStudent(cahyo);
        cs101.addStudent(dani);
        cs101.addStudent(edi);
        
        cahyo.enrollInCourse(cs102);
        dani.enrollInCourse(cs102);

        cs102.addStudent(cahyo);
        cs102.addStudent(dani);
        
        cahyo.enrollInCourse(cs103);

        cs103.addStudent(cahyo);
        
        edi.enrollInCourse(cs104);
        dani.enrollInCourse(cs104);

        cs104.addStudent(edi);
        cs104.addStudent(dani);
          
        do {
        System.out.println(" -----------------------------------" );
        System.out.println("|          Selamat Datang           |");
        System.out.println("|    SISTEM AKADEMIK INFORMATIKA    |");
        System.out.println("| ================================= |");
        System.out.println("| <1> Data Dosen                    |");
        System.out.println("| <2> Data Mahasiswa                |");
        System.out.println("| <3> Data Mata Kuliah              |");
        System.out.println("| <4> Keluar                        |");
        System.out.println(" -----------------------------------");
        System.out.print("Masukkan Pilihan : ");
        pilihanMenuUtama = input.nextInt();
        switch (pilihanMenuUtama) {
            case 1:
                do {
                    Lecture.lectureDisplayMenu();
                    System.out.print("Masukkan Pilihan : ");
                    pilihanDosen = input.nextInt();
                    switch (pilihanDosen) {
                        case 1:
                            input.nextLine();
                            System.out.print("Nama dosen: ");
                            String name = input.nextLine();
                            System.out.print("Usia dosen: ");
                            int age = input.nextInt();
                            input.nextLine();
                            System.out.print("Alamat dosen: ");
                            String address = input.nextLine();
                            System.out.print("NIP: ");
                            int id = input.nextInt();
                            input.nextLine();
                            Lecture dosenTambah = new Lecture(name, age, address, id);
                            listDosen.add(dosenTambah);
                            System.out.println("Data dosen berhasil ditambahkan.");
                            break;

                        case 2:
                            for(int i = 0; i < listDosen.size(); i++){
                                System.out.println((i+1) + ". " + listDosen.get(i).getName());
                            }
                            System.out.print("Masukkan Pilihan : ");
                            int inputPilihan2 = input.nextInt();
                            input.nextLine();
                            Lecture dosen = listDosen.get(inputPilihan2-1);
                            dosen.getDetails();
                            break;
                            
                        case 3:
                            for(int i = 0; i < listDosen.size(); i++){
                                System.out.println((i+1) + ". " + listDosen.get(i).getName());
                            }
                            System.out.print("Masukkan Pilihan : ");
                            int inputPilihan3 = input.nextInt();
                            input.nextLine();
                            Lecture dosen2 = listDosen.get(inputPilihan3-1);
                            dosen2.viewTaughtCourses();
                            break;
                        
                        case 4:
                            break;

                        default:
                            System.out.println("Pilihan salah");
                            break;
                    }
                } 
                while(pilihanDosen != 4);
                break;

            case 2:
                do{
                    Student.studentDisplayMenu();
                    System.out.print("Masukkan Pilihan : ");
                    pilihanMhs = input.nextInt();
                    switch (pilihanMhs) {
                        case 1:
                            input.nextLine(); 
                            System.out.print("Nama mahasiswa: ");
                            String name = input.nextLine();
                            System.out.print("Usia mahasiswa: ");
                            int age = input.nextInt();
                            input.nextLine();
                            System.out.print("Alamat mahasiswa: ");
                            String address = input.nextLine();
                            System.out.print("Nomor mahasiswa: ");
                            int id = input.nextInt();
                            input.nextLine();
                            listMahasiswa.add(new Student(name, age, address, id));
                            System.out.println("Data mahasiswa berhasil ditambahkan.");
                            break;

                        case 2:
                            for(int i = 0; i < listMahasiswa.size(); i++){
                                System.out.println((i+1) + ". " + listMahasiswa.get(i).getName());
                            }
                            System.out.print("Masukkan Pilihan : ");
                            int inputPilihan2 = input.nextInt();
                            input.nextLine();
                            Student mhs = listMahasiswa.get(inputPilihan2-1);
                            mhs.getDetails();
                            break;

                        case 3:
                            for(int i = 0; i < listMahasiswa.size(); i++){
                                System.out.println((i+1) + ". " + listMahasiswa.get(i).getName());
                            }
                            System.out.print("Masukkan Pilihan : ");
                            int inputPilihan3 = input.nextInt();
                            input.nextLine();
                            Student mhs2 = listMahasiswa.get(inputPilihan3-1);
                            mhs2.viewEnrolledCourses();
                            break;
                        
                        case 4:
                            break;

                        default:
                            System.out.println("Pilihan salah");
                            break;
                    } 
                } while(pilihanMhs != 4);
                break;
            case 3:
                do{
                    Course.CourseDisplayMenu();
                    System.out.print("Masukkan Pilihan : ");
                    pilihanCourse = input.nextInt();
                    switch (pilihanCourse) {
                        case 1:
                            input.nextLine();
                            System.out.print("Kode MK: ");
                            String kode = input.nextLine();
                            System.out.print("Nama MK: ");
                            String name = input.nextLine();
                            listCourse.add(new Course(kode, name));
                            System.out.println("Data course berhasil ditambahkan.");
                            break;

                        case 2:
                            for(int i = 0; i < listCourse.size(); i++){
                                System.out.println((i+1) + ". " + listCourse.get(i).getCourseName());
                            }
                            System.out.print("Masukkan Pilihan : ");
                            int inputPilihan = input.nextInt();
                            input.nextLine();
                            Course mk = listCourse.get(inputPilihan-1);
                            mk.getDetails();
                            break;

                        case 3:
                            for(int i = 0; i < listCourse.size(); i++){
                                System.out.println((i+1) + ". " + listCourse.get(i).getCourseName());
                            }
                            System.out.print("Masukkan Pilihan : ");
                            int input3 = input.nextInt();
                            input.nextLine();
                            Course mkhs = listCourse.get(input3-1);
                            mkhs. viewEnrolledStudents();
                            break;
                            
                        case 4: 
                            break;
                                
                        default:
                            System.out.println("Pilihan salah");
                            break;
                    }
                } while(pilihanCourse != 4);
          }
        }
        while(pilihanMenuUtama != 4);
    }
}