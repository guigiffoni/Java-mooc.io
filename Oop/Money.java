package Oop;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        // create a new Money object that has the correct worth
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
    
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }

            return false;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            return new Money(0, 0);
        }

        if (decreaser.cents > 0) {
            return new Money(this.euros - decreaser.euros - 1, Math.abs(cents - decreaser.cents));
        }

        return new Money(this.euros - decreaser.euros, cents - decreaser.cents);
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
