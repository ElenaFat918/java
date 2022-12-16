package HomeWork4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ReverseLinkedList {
    int n; // объявии переменную в классе
    public LinkedList<Integer> linkedList = new LinkedList<>();

    public void addToLinkedList() {
        Scanner in = new Scanner(System.in); // объявили сканер чтобы вводить с клавиатуры
        System.out.println("Введите количество элементов массива :");
        n = in.nextInt();
        in.close();

        Random random = new Random(); // ввели объект класса рандом
        Integer[] array = new Integer[n]; // инициализировали массив
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Сформирован массив из " + n + " случайных чисел: " + Arrays.toString(array));

        for (Integer temp : array) {
            linkedList.add(temp);
        }
        System.out.println("Передали массив в LinkedList = " + linkedList);
    }
    
    public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList) {

        LinkedList<Integer> reverseLinkedList = new LinkedList<>();

        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reverseLinkedList.add(linkedList.get(i));
        }
        System.out.println("Перевернутый список " + reverseLinkedList);
        return reverseLinkedList;
    }
}
/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
 * вернет “перевернутый” список.
 */