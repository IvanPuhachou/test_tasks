package test_tasks.task_05;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        System.out.println("Enter your number, please");
        int number = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                number = input.nextInt();
            } else {
                System.out.println("You didn't enter a number");
                continue;
            }
            if (number < 0) {
                System.out.println("You entered a minus number. Please enter a positive number.");
                continue;
            }
            if (number == 0) {
                System.out.println("You entered zero. Please enter a positive number.");
                continue;
            }
            if (number > 100) {
                System.out.println("Your number is very big. Please enter the number lower then 100.");
                continue;
            }

            System.out.println("Number of palindromes between inclusive 0 and " + number + " is " + findAllPalindromesFrom0ToN(number));
            input.close();
            break;
        }
    }

    public static boolean isThisNumberAPalindrome(int X) {
        String number = new String(Integer.toString(X));
        String reverse = "";
        for (int i = 0; i < number.length(); i++) {               // наверное максимально оптимальный способ получения слова наоборот, чем у StringBuilder вызывать метод .reverse
            reverse += number.charAt(number.length() - i - 1);
        }
        if (number.equals(reverse)) {
            return true;
        } else
            return false;
    }

    public static int findAllPalindromesFrom0ToN(int n) {
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            if (isThisNumberAPalindrome(i)) {
                counter++;
            }
        }
        return counter;
    }
}

