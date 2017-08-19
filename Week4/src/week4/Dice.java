package week4;

import java.util.Random;

public class Dice 
{
    private Random random;
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
        random = new Random();
    }

    public int roll() {
        return (random.nextInt(sides) + 1);
    }
}
