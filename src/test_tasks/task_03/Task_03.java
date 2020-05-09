package test_tasks.task_03;

import java.util.Arrays;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        String text;
        System.out.println("Please enter your sentence");
        Scanner input = new Scanner(System.in);
        text = input.nextLine();
        input.close();
        System.out.println(text);
        System.out.println("Number of words in your sentence is " + wordCounter(text));
        System.out.println("Sorted words from your sentence: " + wordSorter(text));
        System.out.println("All words to upper case for first letter - " + toUpperCaseForFirstLetter(text));

    }

    public static int wordCounter(String text) {
        String[] words = text.split(" ");
        int number = words.length;
        return number;
    }

    public static String wordSorter(String text) {
        String[] words = text.split(" ");
        Arrays.sort(words);
        String sorted = Arrays.toString(words);
        return sorted;
    }

    private static String toUpperCaseForFirstLetter(String text) {
        StringBuilder builder = new StringBuilder(text);
        if (Character.isAlphabetic(text.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));

        for (int i = 1; i < text.length(); i++)
            if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));

        return builder.toString();
    }
}
