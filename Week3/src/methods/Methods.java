package methods;

import java.util.*;

public class Methods
{
// Practice Part 1: Number Calculations{{{1 //
    public static int sum(int num1, int num2, int num3, int num4){
        return (num1+num2+num3+num4);
    }

    public static int least(int num1, int num2, int num3, int num4) {
        int min = num1;

        min = (min < num2) ? min : num2;
        min = (min < num3) ? min : num3;
        min = (min < num4) ? min : num4;

        return min;
    }

    public static int greatest(int num1, int num2, int num3, int num4) {
        int max = num1;

        max = (max > num2) ? max : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        return max;
    }

    public static double average(int num1, int num2, int num3, int num4) {
        double avg = sum(num1,num2,num3,num4)/4.0;
        return avg;
    }
// 1}}} //

// Practice Part 2: String Manipulation {{{1 //
    public static int calculateCharacters(String text) {
        return text.length();
    }

    public static char firstCharacter(String text) {
        return text.charAt(0);
    }

    public static char lastCharacter(String text) {
        return text.charAt(text.length()-1);
    }

    public static void separateCharacters(String text) {
        int i = 0;
        while (i < text.length()) {
            System.out.println((i+1) + ". character: " + text.charAt(i));
            ++i;
        }
    }

    public static String reverseCharacters(String text) {
        return new StringBuilder(text).reverse().toString();
    }
// 1}}} //

    // Practice Part 3: Sub-strings {{{ //
    public static void firstPart() {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Type a word: ");
        String text = input.nextLine();

        System.out.print("Length of the first part: ");
        int length = input.nextInt();

        System.out.println(text.substring(0,length));
    }

    public static void lastPart() {
        Scanner inputt = new Scanner(System.in);

        System.out.println();
        System.out.print("Type a word: ");
        String text = inputt.nextLine();

        System.out.print("Length of the last part: ");
        int length = inputt.nextInt();

        System.out.println(text.substring(text.length()-length,text.length()));
    }

    public static void find_subword() {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String first_word = input.nextLine();

        System.out.print("Type the second word: ");
        String second_word = input.nextLine();

        int substrig_location = first_word.indexOf(second_word);

        if (substrig_location == -1) {
            System.out.println("The word \'" + second_word
                + "\' was not found in the word \'" + first_word +"\' ");
        }
        else {
            System.out.println("The word \'" + second_word
                + "\' was found in the word \'" + first_word +"\' ");           
        }
    }

    // }}} Practice Part 3: Sub-strings //

    public static void main(String[] args) {

        // Excercise 1: Sum, least, greatest, and average values {{{1 //
        System.out.println("Excercise Part 1:");
        System.out.println("Sum Value: " + sum(4,3,6,1));
        System.out.println("Least Value: " + least(4,3,6,1));
        System.out.println("Greatest Value: " + greatest(4,3,6,1));
        System.out.println("Average Value: " + average(4,3,6,1));
        // 1}}} //

        // Excercise 2: String manipulation {{{1 //
        System.out.println("\nExcercise Part 2:");
        //Scanner input = new Scanner(System.in);
        String name = "John";
        System.out.println("Type your name: " + name);
        System.out.println("Number of Characters: " + calculateCharacters(name));
        System.out.println("First Character: " + firstCharacter(name));
        System.out.println("Last Character: " + lastCharacter(name));
        System.out.println("Separated Characters: ");
        separateCharacters(name);
        System.out.println("Reversed characters of John: " + reverseCharacters(name));
        // 1}}} //

        // Excercise 3: Sub-strings {{{ //
        firstPart();
        lastPart();
        //find_subword();
        //Note: I already have a string reverser. See separateCharacters method
        // }}} Excercise 3: Sub-strings //
    }
}
