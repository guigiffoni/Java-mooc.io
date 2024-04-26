public class BankAccount {
    public static void main(String[] args) {
        Account mat = new Account("Matthews account", 1000);
        Account mine = new Account("My account", 0);

        mat.withdraw(100);
        mine.deposit(100);

        System.out.println(mat);
        System.out.println(mine);
    }
}

class Account {
    String accountName;
    double amount;

    public Account(String accountName, double money) {
        this.accountName = accountName;
        this.amount = money;
    }

    public double balance() {
        return this.amount;
    }

    public void withdraw(double amount) {
        this.amount -= amount;
    } 

    public void deposit(double amount) {
        this.amount += amount;
    }
}