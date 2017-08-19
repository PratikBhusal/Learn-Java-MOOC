/*
 * Name: Pratik Bhusal
 * Programming Language: Java
 * Week: 1
 * Book: MOOC Website
 */
import java.util.Scanner; //used in Part 7

public class Week1
{

    public static void main(String[] args) {
        //first print statement
        System.out.println("Hello World!");

        //6 - Concatenation
        System.out.println("\nSection 6: Concatenation");
        int firstInteger= 4;
        int secondInteger= 5;
        System.out.println("The first integer is: " + firstInteger);
        System.out.println("The second integer is: " + secondInteger);
        System.out.println(firstInteger + "+" + secondInteger + "=" + (firstInteger+secondInteger));
        System.out.println(firstInteger + "*" + secondInteger + "=" + (firstInteger+secondInteger));
        /*7 - Reading User Input
        Scanner reader = new Scanner(System.in);
            //Strings
                System.out.print("What is your name? ");
                String name = reader.nextLine();
                System.out.println("Your name is: " + name);
            //Integers
                System.out.print("How old are you? ");
                int age = Integer.parseInt(reader.nextLine());
                System.out.println("You are " + age + " years old.");
        */

        //8.4 - Comparing Strings
        System.out.println("\nSection 8: Comparing Strings");
        String a = "Pratik";
        String b = "Pratik";
        if (a.equals(b)){
            System.out.println("It's the same string!");
        }
        else {
            System.out.println("It's two different strings!");
        }
    }
}
