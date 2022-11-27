import java.util.Scanner;

public class HomeWork1_simpleCalculator {
    public static void main(String[] args) {
        /*
         * Реализовать простой калькулятор
         */
        System.out.print("Введите первое и второе числа для операции ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.print("Введите тип операции, набрав + или - или * или / или % ");
        char symbol = in.next().charAt(0);
        in.close();
        calculator(a, b, symbol);
    }

    public static int calculator(int a, int b, char symbol) {
        int result = 0;
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
