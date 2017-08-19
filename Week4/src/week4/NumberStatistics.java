package week4;

public class NumberStatistics
{
    private int amountofNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountofNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        ++amountofNumbers;
        sum += number;
    }

    public int getNumbers() {
        return amountofNumbers;
    }

    public int getSum() {
        return sum;
    }

    public double average() {
        return (amountofNumbers == 0) ? 0 : (double)getSum()/amountofNumbers;
    }
}

