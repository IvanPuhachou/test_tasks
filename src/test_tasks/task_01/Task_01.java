package test_tasks.task_01;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Enter your number, please");
        double doubleNumber = 0;
        long longNumber = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextDouble()) {  // проверяем пользователь ввел число или нет (примитив double покрывает как целочисленные значения так и с плавающей точкой)
                //можно было сразу использовать hasNextLong, но тогда ошибки для текста и числа с плавающей точкой были бы одиноковы
                doubleNumber = input.nextDouble();
                longNumber = (long) doubleNumber;
            } else {
                System.out.println("You didn't enter a number");
                continue;
            }
/*            if (doubleNumber < 0) {
                System.out.println("You entered a minus number. Please enter a positive number.");
                continue;
            }*/
            if (doubleNumber != longNumber) {
                System.out.println("Your number isn't a integer.  Please enter another number."); // при условии, что целое число переводится как integer
                continue;
            }


            System.out.println("Yor number (" + longNumber + ") is " + evenOrOdd(longNumber) + " and " + primeOrComposite(longNumber));
            input.close();
            break;
        }

    }


    public static String evenOrOdd(long number) {  // проверка на четность
        String answer;
        if (number % 2 == 0) {
            answer = "even";
        } else {
            answer = "odd";
        }
        return answer;
    }

    public static String primeOrComposite(long number) { // проверка на простоту
        String answer;
        if (number == 0) {
            return "composite"; // если верить, что ноль к множеству натуральных чисел не принадлежит, следовательно, и не является простым числом.
            // Простые числа делятся только на само себя и единицу, а ноль имеет бесконечное количество делителей (то есть делится на любое число). Так что, ноль - составное, а не простое
        }
        if (number == 1) {
            return "neither prime nor composite"; // если считать, что в настоящее время в математике принято не относить единицу ни к простым, ни к составным числам,
            // так как это нарушает важную для теории чисел единственность разложения на простые множители
        }
        if (number < 0) {
            return "any minus number can't be prime"; // простые числа - это натуральные (целые и ПОЛОЖИТЕЛЬНЫЕ) числа,
            // которые имеют ровно два различных натуральных делителя единицу и самого себя
        }

        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter > 2) {
            answer = "composite";
        } else {
            answer = "prime";
        }
        return answer;
    }
}