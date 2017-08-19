package week4;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers
{
    private final int pickMax;
    private final int largestValue;
    private final Random random;
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        pickMax = 7;
        largestValue = 39;
        numbers = new ArrayList<Integer>();
        random = new Random();

        drawNumbers();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void drawNumbers() {
        int counter = 0;

        while (counter < pickMax) {
            final int num = this.random.nextInt(largestValue + 1);

            if ( !containsNumber(num) ) {
                numbers.add(num);
                ++counter;
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
