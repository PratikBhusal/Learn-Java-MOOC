import week5.*;
import java.util.ArrayList;
import java.util.Scanner;
// import java.io.*;
// import java.util.*;

public class Main
{
    public static ArrayList<Student> createClassroom() {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        String temp = "";

        do {
            System.out.print("Name: ");
            temp = input.nextLine();

            if (!temp.isEmpty()) {
                System.out.print("Student ID: ");
                final String tempID = input.nextLine();
                students.add( new Student(temp, tempID) );
            }
        } while ( !temp.isEmpty() );



        System.out.println();
        for (Student i: students) {
            System.out.println(i);
        }

        // input.close();

        return students;
    }

    public static void findStudents(final ArrayList<Student> students) {
        if (students.size() != 0) {
            Scanner input = new Scanner(System.in);

            System.out.print("Give the search term: ");
            String temp = input.nextLine();

            for (Student i : students) {
                if ( i.getName().contains(temp) ) {
                    System.out.println(i);
                }
            }


            input.close();
        }
    }

    public static void main(String[] args) {
        /* Practices {{{
        // Practice 1: Counter
        Counter counter = new Counter(15,true);

        for (int i = 0; i < 10; ++i) {
            System.out.print(counter.getValue() + " -> ");
            counter.increase(1);
            System.out.print(counter.getValue() + " -> ");
            counter.decrease(3);
            System.out.println( counter.getValue() );
        }

        // Practice 2: Reformatory
        Reformatory eastHelsinkiReformatory = new Reformatory();
        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);

        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
        System.out.println("total weights measured: " + eastHelsinkiReformatory.weightsMeasured());
        System.out.println();

        eastHelsinkiReformatory.feed(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(pekka);

        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
        System.out.println("total weights measured: " + eastHelsinkiReformatory.weightsMeasured());
        System.out.println();

        // Practice 3: Lyyra Cards
        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("Change: " + theChange);

        theChange = unicafeExactum.payGourmet(4.5);
        System.out.println("Change: "  + theChange);
        System.out.println(unicafeExactum);
        System.out.println();

        LyyraCard card = new LyyraCard(3);

        boolean succeeded = unicafeExactum.payEconomical(card);
        System.out.println("payment success: " + succeeded);
        System.out.println( card.balance() );

        succeeded = unicafeExactum.payGourmet(card);
        System.out.println("payment success: " + succeeded);
        System.out.println( card.balance() );

        unicafeExactum.loadMoneyToCard(card, 100);
        succeeded = unicafeExactum.payGourmet(card);
        System.out.println("payment success: " + succeeded);

        System.out.println( "Balance: $" + card.balance() );

        System.out.println(unicafeExactum);

        // Practice 4: Apartment Comparison
        Apartment studioManhattan = new Apartment(16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(38, 4200);

        System.out.println( studioManhattan.isLarger(twoRoomsBrooklyn) );
        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );
        System.out.println( studioManhattan.isPricier(twoRoomsBrooklyn) );
        */ // }}}

        // Practice 5: Student
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("Name: " + pekka.getName());
        System.out.println("Student ID: " + pekka.getID());
        System.out.println(pekka);

        createClassroom();
        findStudents(createClassroom());
    }
}
