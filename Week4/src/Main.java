/**
 * @author Pratik Bhusal
 */
// Imports {{{
import java.util.*;
import week4.Person;
//import week4.Product;
import week4.Multiplier;
import week4.DecreasingCounter;
import week4.Menu;
import week4.LyyraCard;
import week4.BoundedCounter;
import week4.NumberStatistics;
import week4.Dice;
import week4.PasswordRandomizer;
import week4.LotteryNumbers;
// }}} Imports

public class Main
{
    public static void combine() {//{{{
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(3);
        list1.add(4);

        list2.add(7);
        list2.add(4);
        list2.add(10);

        list1.addAll(list2);

        System.out.println(list1);
        System.out.println(list2);
    }//}}}

    public static void smartCombine() {//{{{
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(3);
        list1.add(4);

        list2.add(7);
        list2.add(4);
        list2.add(10);

        for (int i = 0; i < list2.size(); ++i) {
            if (!list1.contains(list2.get(i))) {
                list1.add(list2.get(i));
            }
        }

        System.out.println(list1);
        System.out.println(list2);
    }//}}}

    public static void main(String[] args) throws Exception {//{{{
        // Practice 1: Combining ArrayLists{{{
        combine();
        System.out.println();

        // Practice 2: Smart Combining ArrayLists
        smartCombine();
        System.out.println();

        // Practice 3: Person Class
        Person pratik = new Person("Pratik");
        System.out.println(pratik);
        pratik.setAge(10);
        System.out.println(pratik);
        pratik.becomeOlder();
        System.out.println(pratik + "\n");

        /* Practice 4: Product Class
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
        System.out.println();*/

        // Practice 5: Multiplier Class
        Multiplier threeMultiplier = new Multiplier(3);

        System.out.println("threeMultiplier.multiply(2): "
        + threeMultiplier.multiply(2));
        System.out.println("hello world");
        System.out.println();

        // Practice 6: Decrease Counter Class
        DecreasingCounter counter = new  DecreasingCounter(1);

        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.absoluteDecrease();
        counter.printValue();
        counter.setInitial();
        counter.printValue();
        counter.reset();
        counter.printValue();
        System.out.println();

        // Practice 7: Meals
        Menu meals = new Menu();
        meals.addMeal("Chicken");
        meals.addMeal("Cheeze");
        System.out.println("Menu after adding an item: ");
        meals.printMeals();
        meals.clearMenu();
        System.out.println("\nMenu after clearing: ");
        meals.printMeals();

        // Practice 8: Lyra-Card
        LyyraCard card = new LyyraCard(50);
        System.out.println(card);
        card.payGourmet();
        System.out.println(card);
        card.loadMoney(-1);
        System.out.println(card);
        card.loadMoney(103.9999);
        System.out.println(card);

        // Practice 9: Clock using a counter
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours   = new BoundedCounter(23);

        hours.setValue(23);
        minutes.setValue(59);
        seconds.setValue(59);

        for (int i = 0; i < 63; ++i) {
            System.out.println( hours + ":" + minutes + ":" + seconds );
            // Thread.sleep(1000);

            if (seconds.getValue() == seconds.getLimit()
                && minutes.getValue() == minutes.getLimit() ) {
                hours.next();
            }
            if ( seconds.getValue() == seconds.getLimit() ) {
                minutes.next();
            }
            seconds.next();
        }

        // Practice 10: Number Statistics
        NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println( "Amount: " + stats.getNumbers() );
        System.out.println( "sum: " + stats.getSum() );
        System.out.println( "average: " + stats.average() );

        // Practice 11: Rolling the Dice
        Dice dice = new Dice(6);
        for (int i = 0; i < 10; ++i) {
            System.out.println( dice.roll() );
        }

        // Practice 12: Password Randomizer
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        for (int i = 0; i < 10; ++i) {
            System.out.println("Password: " + randomizer.createPassword());
            randomizer.resetPassword();
        }

        // Practice 13: Lottery
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.getNumbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();//}}}
    }
}
