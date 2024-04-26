package ClassShenanigans;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        double price = 2.6;

        if (this.balance - price > 0) {
            this.balance -= price;
        }
    }
    
    public void eatHeartily() {
        double price = 4.6;

        if (this.balance - price > 0) {
            this.balance -= price;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            if (this.balance + amount < 150) {
                this.balance += amount;
            } else {
                this.balance = 150;
            }
        }
    }
}