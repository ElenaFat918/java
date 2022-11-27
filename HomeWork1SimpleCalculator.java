import java.util.Scanner;

public class HomeWork1SimpleCalculator {
    public static void main(String[] args) {
        /*
         * Реализовать простой калькулятор
         */
        System.out.print("Введите первое и второе числа для операции ");
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        double b = in.nextInt();

        System.out.print("Введите тип операции, набрав + или - или * или / или % ");
        char symbol = in.next().charAt(0);
        in.close();
        calculator(a, b, symbol);
    }

    public static double calculator(Double a, Double b, char symbol) {
        double result = 0;
        if (symbol == '+') {
            result = a + b;

        } else if (symbol == '-') {
            result = a - b;

        } else if (symbol == '*') {
            result = a * b;
        } else if (symbol == '%') {
            result = a % b;

        } else if (symbol == '/') {
            result = a / b;
        }

        System.out.println("Получилось " + result);
        return result;
    }
}
