/* 
 * Nama File    : ExceptionOnArray.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
 * Tanggal      : 6 Maret 2023
 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi objek array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("clean up code");
        }
    }
}
