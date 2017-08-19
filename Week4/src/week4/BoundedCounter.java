package week4;

public class BoundedCounter
{
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value = (++(this.value) > this.upperLimit) ? 0 : this.value;
    }

    public int getValue() {
        return this.value;
    }

    public int getLimit() {
        return this.upperLimit;
    }

    public void setValue(int value) {
        this.value = (value >= 0 && value <= this.upperLimit) ? value : this.value;
    }

    public String toString() {
        return (this.value < 10) ? "0" + this.value : Integer.toString(this.value);
    }
}
