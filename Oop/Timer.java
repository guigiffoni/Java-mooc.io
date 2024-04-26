package Oop;

public class Timer {
    private ClockHand hundreth;

    public Timer() {
        this.hundreth = new ClockHand(100);
    }

    @Override
    public String toString() {
        return "" + this.hundreth.value();
    }

    public void advance() {
        this.hundreth.advance();
    }
}
