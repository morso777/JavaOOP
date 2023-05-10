package Encasulaption;

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("After deposit: " + account.getBalance());

        account.withdraw(2000.0);
        System.out.println("After withdrawal: " + account.getBalance());
    }
}
