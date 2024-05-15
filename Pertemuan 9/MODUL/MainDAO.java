/* 
 * Nama File    : MainDAO.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : Main program untu akses DAO
 * Tanggal      : 15 Mei 2024
 */

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
