package week4;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void becomeOlder() {
        ++(this.age);
    }

    public boolean isAdult() {
        return (this.age >= 18);
    }
}
