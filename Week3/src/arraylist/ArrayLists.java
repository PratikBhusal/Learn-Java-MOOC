package arraylist;

//import java.io.*;
import java.util.*;

public class ArrayLists
{
    public static void printWords() {//{{{
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String word = "";

        do {
            System.out.print("Type a word: ");
            word = input.nextLine();

            if (!word.isEmpty()) {
                words.add(word);
            }

        } while (!word.isEmpty());

        System.out.println();
        for (String i : words) {
            System.out.println(i);
        }
    }//}}}

    public static void recurringWord() {//{{{
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String word;
        boolean foundDuplicate = false;

        do {
            System.out.print("Type a word: ");
            word = input.nextLine();

            if (!words.contains(word)) {
                words.add(word);
            }
            else {
                foundDuplicate = true;
            }

        } while (foundDuplicate == false);

        System.out.println("\nYou typed the word " + word + " twice.");

    }//}}}

    public static void reverseWords() {//{{{
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String word = "";

        do {
            System.out.print("Type a word: ");
            word = input.nextLine();

            if (!word.isEmpty()) {
                words.add(word);
            }

        } while (!word.isEmpty());

        Collections.reverse(words);

        System.out.println();
        for (String i : words) {
            System.out.println(i);
        }
    }//}}}

    public static void alphabetizeWords() {//{{{
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String word = "";

        do {
            System.out.print("Type a word: ");
            word = input.nextLine();

            if (!word.isEmpty()) {
                words.add(word);
            }

        } while (!word.isEmpty());

        Collections.sort(words);

        System.out.println();
        for (String i : words) {
            System.out.println(i);
        }
    }//}}}

    public static int countItems(ArrayList<String> list) {//{{{
        return list.size();
    }//}}}

    public static void removeLast(ArrayList<String> list) {//{{{
        System.out.println("Removing \'" + list.get(list.size()-1) + "\'");
        list.remove(list.size()-1);
        System.out.println("Successfully removed last element");
    }//}}}

    public static int sum(ArrayList<Integer> numbers) {//{{{
        int total = 0;

        for (int i = 0; i < numbers.size(); ++i) {
            total += numbers.get(i);
        }

         return total;
    }//}}}

    public static double average(ArrayList<Integer> numbers) {//{{{
        return (double)sum(numbers)/numbers.size();
    }//}}}

    public static ArrayList<Integer> lengths(ArrayList<String>list) {//{{{
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (String i : list) {
            output.add(i.length());
        }

        return output;
    }//}}}

    public static int greatest(ArrayList<Integer> list) {//{{{
        return Collections.max(list);
    }//}}}

    public static double variance(final ArrayList<Integer> list) {//{{{
        final double average = average(list);
        double varianceNumerator = 0;
        final int varianceDenominator = list.size()-1;

        for (int i = 0; i < list.size(); ++i) {
             varianceNumerator += (list.get(i)-average)*(list.get(i)-average);

        }

        return varianceNumerator / varianceDenominator;
    }//}}}

    public static boolean moreThanOnce(final ArrayList<Integer> list, final int num) {//{{{
        int counter = 0;

        for (int i = 0; i < list.size(); ++i) {
            if (num == list.get(i)) {
                ++counter;
            }
        }

        return (counter > 1) ? true : false;
    }//}}}

    public static boolean isPalindrome(String text) {//{{{
        return text.equals(reverseCharacters(text));
    }

    public static String reverseCharacters(String text) {
        return new StringBuilder(text).reverse().toString();
    }//}}}

    public static void main(String[] args) {//{{{
        // Practice 1: Print Words
        // printWords();

        // Practice 2: Recurring Word
        // recurringWord();

        // Practice 3: Words in Reverse Order
        // reverseWords();

        // Practice 4: Words in Alphabetical Order
        // alphabetizeWords();

        // Practice 5: Amount of Items in a List
        /*
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list: " + countItems(list));
        */

        // Practice 6: Remove Last
        /*
        removeLast(list);
        System.out.println("There are this many items in the list: " + countItems(list));
        */

        // Practice 7: Sum of the Numbers
        /*
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        System.out.println("The sum is: " + sum(numbers));
        numbers.add(10);
        */

        // Practice 8: Average of Numbers
        /*
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        System.out.println("The average is: " + average(numbers));
        */

        // Practice 9: Length of Strings
        /*
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of the strings: " + lengths);
        */

        // Pratice 10: The greatest
        // System.out.println("The longest string has a length of " + greatest(lengths) + " characters");

        // Practice 11: Variance
        /*
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        System.out.println("The variance is: " + variance(numbers));
        */

        // Practice 12: Is the number more than once in the list?
        /*
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        System.out.println(moreThanOnce(numbers,2));
        */

        // Practice 13: Palindrome
        String input = "mam";
        if (isPalindrome(input)) {
            System.out.println("The text is a palindrome.");
        }
        else {
            System.out.println("The text is not a palindrome");
        }
    }//}}}
}
