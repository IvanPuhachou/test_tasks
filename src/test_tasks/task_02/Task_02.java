package test_tasks.task_02;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        long firstNumber = 0;
        long secondNumber = 0;
        System.out.println("Please enter your first number");

        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextLong()) {
                firstNumber = input.nextLong();

            } else {
                System.out.println("You didn't enter a suitable number");
                continue;
            }
            if (firstNumber == 0) {
                System.out.println(" You can't enter 0, enter another number");
                continue;
            }
            break;
        }

        System.out.println("Please enter your second number.");
        while (true) {
            Scanner secondInput = new Scanner(System.in);
            if (secondInput.hasNextLong()) {
                secondNumber = secondInput.nextLong();
            } else {
                System.out.println("You didn't enter a suitable number");
                continue;
            }
            if (secondNumber == 0) {
                System.out.println(" You can't enter 0, enter another number");
                continue;
            }
            secondInput.close();
            break;
        }
        System.out.println("LCM for " + firstNumber + " and " + secondNumber + " is " + findLCM(firstNumber, secondNumber));
        System.out.println("GCD for " + firstNumber + " and " + secondNumber + " is " + findGCD(firstNumber, secondNumber));
    }

    public static Long findLCM(Long firstNumber, Long secondNumber) { // Least common multiple - Наименьшее общее кратное
        long lcm = 0;
        long productOfBothNumbers = Math.abs(firstNumber * secondNumber); // НОК не может быть больше, чем произведение двух чисел
        long biggerNumber = (Math.abs(firstNumber) >= Math.abs(secondNumber)) ? Math.abs(firstNumber) : Math.abs(secondNumber); // и в то же время меньше, чем большее по модулю число
        for (long i = Math.abs(biggerNumber); i <= productOfBothNumbers; i++) {
            if (i % firstNumber == 0 && i % secondNumber == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }

    public static Long findGCD(Long firstNumber, Long secondNumber) { // Greatest common divisor - Наибольший общий делитель
        long gcd = 0;
        long lowerNumber = (Math.abs(firstNumber) >= Math.abs(secondNumber)) ? Math.abs(secondNumber) : Math.abs(firstNumber); // НОД не может быть больше, чем наименьшее число по модулю
        for (int i = 1; i <= lowerNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
