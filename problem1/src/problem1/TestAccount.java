package problem1;

public class TestAccount {
    public static void main(String[] args) {
        Account ac1 = new Account("A01", "Ac1", 5000);
        Account ac2 = new Account("A02", "Ac2", 4000);

        System.out.println("Initial balances:");
        System.out.println("Ac1 balance: $" + ac1.getBalance());
        System.out.println("Ac2 balance: $" + ac2.getBalance());

        System.out.println("\nTransferring $1000 from Ac1 to Ac2...");
        ac1.transferTo(ac2, 1000);

        System.out.println("\nBalances after transfer:");
        System.out.println("Ac1 balance: $" + ac1.getBalance());
        System.out.println("Ac2 balance: $" + ac2.getBalance());
    }
}
