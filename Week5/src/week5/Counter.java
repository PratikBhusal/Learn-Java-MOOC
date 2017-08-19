package week5;

public class Counter
{
    private int value;
    private boolean check;

    public Counter(int value, boolean check) {
        this.value = value;
        this.check = check;
    }

    public Counter(int value) {
        this(value, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int getValue() {
        return this.value;
    }

    public void increase(int amount) {
        if (amount > 0) {
            this.value += amount;
        }
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int amount) {
        if (amount > 0
            && (!this.check || (this.check && (this.value - amount) >= 0) ) ) {
            this.value -= amount;
        }
    }

    public void decrease() {
        this.decrease(1);
    }
}
