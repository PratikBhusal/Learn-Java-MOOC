package week4;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    final private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        --this.value;
    }

    public void absoluteDecrease() {
        if (!(this.value <= 0)) {
            --this.value;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = this.initialValue;
    }
    // and here the rest of the methods
}
