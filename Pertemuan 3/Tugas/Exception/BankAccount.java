/* 
 * Nama File    : BankAccount.java
 * Nama Pembuat : Muhammad Ahsan Yudhistira
 * NIM          : 24060122130083
 * Deskripsi    : File kelas BankAccount
 * Tanggal      : 8 Maret 2023
 */
public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0;
  
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void showBalance() {
        System.out.println("Saldo saat ini: $" + this.getBalance());
    }
  
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Saldo saat ini: $" + this.getBalance());
    }
  
    public void withdraw(double amount) throws InsufficientFundsException{
        if (this.getBalance() - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Insufficient funds.  Minimum balance required: $" + MIN_BALANCE);
        }
        this.balance -= amount;
        System.out.println("Withdrawn: $" + amount);
        System.out.println("Saldo saat ini: $" + this.getBalance());
    }
  
    public double getBalance() {
        return balance;
    }
  }
  