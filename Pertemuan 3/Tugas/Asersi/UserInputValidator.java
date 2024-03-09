/* 
 * Nama File    : UserInputValidator.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas UserInputValidator
 * Tanggal      : 8 Maret 2023
 */
public class UserInputValidator {
    public static void validateUsername(String username) {
        assert(username.matches("[a-zA-Z][a-zA-Z0-9_]+")): "Invalid username";
        assert(username.length() >=5): "Username must be at least 5 characters long";
        assert(username.length() <20): "Username must be at most 20 characters long";
    }
  
    public static void validateEmail(String email) {
        assert(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
    }
  
    public static void validateAge(int age) {
        assert(age >= 17 && age <100): "Age must be between 17 and 99";
    }
  }
  