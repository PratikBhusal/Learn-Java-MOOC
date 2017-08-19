/*
 * Name: Pratik Bhusal
 * Programming Language: Java Part: 2
 * Book: MOOC Website
 */
import java.util.Scanner;

public class Part2
{
    public static void main(String[] args)
    {
        /*
        //13 - Self-Written Methods 
        Scanner reader = new Scanner(System.in);
        System.out.print("How many times do you want 'Hello World' to repeat?");
        int count = Integer.parseInt( reader.nextLine() );
        for (int i = 0;i < count;i++ )
        {
            helloWorld();
        }
        */

        //13.1 - Method Parameters
        String person = "Pratik";
        helloName(person);
    }

    public static void helloWorld()
    {
        System.out.println("Hello World!");
    }

    public static void helloName(String name)
    {
        System.out.println("Hello " + name + "!");
    }
}

