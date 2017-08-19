package week5;

public class Reformatory
{
    private int measured;

    public Reformatory() {
        this.measured = 0;
    }

    public int weight(Person person) {
        this.measured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weightsMeasured() {
        return this.measured;
    }
}
