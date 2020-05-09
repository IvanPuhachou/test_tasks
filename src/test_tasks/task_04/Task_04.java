package test_tasks.task_04;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        String text;
        String word;
        System.out.println("Please enter your text");
        Scanner input = new Scanner(System.in);
        text = input.nextLine();
        System.out.println("Please enter your word");
        word = input.next();
        input.close();
        System.out.println("Your word \"" + word + "\" occurs " + numberOfReiteration(text, word) + " times in your sentence");

    }

    public static int numberOfReiteration(String text, String word) {
        String textToLowerCase = text.toLowerCase();
        String wordToLowerCase = word.toLowerCase();
        int number = 0;
        int indexOfWord = 0;
        int firstIndex;
        for (; textToLowerCase.indexOf(wordToLowerCase, indexOfWord) != -1; ) {
            firstIndex = text.indexOf(wordToLowerCase, indexOfWord);
            indexOfWord = firstIndex + 1;
            number++;
        }

        return number;
    }
}
