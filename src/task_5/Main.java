package task_5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        double number1 = in.nextDouble();

        System.out.print("Введите число 2: ");
        double number2 = in.nextDouble();

        System.out.print("Введите знак вычисления: ");
        String sign = in.next();

        double result =0;
        try {
        switch (sign) {
            case "+":
                result = calculator.add(number1, number2);
                break;
            case "-":
                result = calculator.sub(number1, number2);
                break;
            case "*":
                result = calculator.mul(number1, number2);
                break;
            case "/":
                result = calculator.div(number1, number2);
                break;
            default:
                throw new IllegalArgumentException("Вы ввели неверный знак!");
        }
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно!");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    }



