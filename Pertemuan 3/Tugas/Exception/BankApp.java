/* 
 * Nama File    : BankApp.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File program bank app
 * Tanggal      : 8 Maret 2023
 */

import java.util.Scanner;
public class BankApp {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(500.0);
		Scanner input = new Scanner(System.in);
		boolean inginTransaksiLagi = true;

		do {
			System.out.println(" -----------------------------------" );
			System.out.println("|          Selamat Datang           |");
			System.out.println("| ================================= |");
			System.out.println("| <1> Cek Saldo                     |");
			System.out.println("| <2> Tarik Tunai                   |");
			System.out.println("| <3> Setor Tunai                   |");
			System.out.println("| <4> Keluar                        |");
			System.out.println(" -----------------------------------");
			System.out.print("Your choice : ");
			int pilihan = input.nextInt();
			
				switch (pilihan) {
					case 1:
						account.showBalance();
						break;
					case 2:
						System.out.print("Input amount : ");
						double jumlahTarik = input.nextDouble();
						try {
							account.withdraw(jumlahTarik);
						}
						catch(InsufficientFundsException e) {
							System.out.println(e.getMessage());
						}
						break;
					case 3:
						System.out.print("Input amount : ");
						double jumlahSetor = input.nextDouble();
						account.deposit(jumlahSetor);
						break;
					case 4:
						System.exit(0);
						break;
					default:
						System.out.println("Please select a correct option!");
						break;
				}
				if (inginTransaksiLagi) {
					do{
						System.out.println("Do you want to make another transaction?  Y/N");
						String pilihanAkhir = input.next().toLowerCase();
						if (pilihanAkhir.equals("n")) {
							System.exit(0);
						}
						else if (pilihanAkhir.equals("y")){
							break;
						}
						else {
							System.out.println("Please select a correct option!");
						}
					}while (inginTransaksiLagi);
				}
		} while(inginTransaksiLagi);
    }
  }
  