package lambdas_example;

// Подсчет суммы трёх целых чисел;
// Подсчет произведения трёх целых чисел;
// Вывод текущего времени;
// Вывод текущей даты.

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = (firstNumber, secondNumber, thirdNumber) -> firstNumber + secondNumber + thirdNumber;

        System.out.println(calculator.getSumOfThree(1, 5, 8));

        Calendar calendar = () -> new Date().toString();

        System.out.println(calendar.getCurrentDate());
    }
}
