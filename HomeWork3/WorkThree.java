package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.IntStream;

public class WorkThree {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public void findMinMaxAverage() {
        list.add(56789); // на i-й индекс добавляет элемент
        list.add(3);
        list.add(34);
        list.add(876);
        list.add(78765);
        list.add(33);
        list.add(55);
        list.add(0);
        list.add(0);

        int min = list.get(0);
        int max = list.get(0);
        for (Integer i : list) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }

        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double average = sum / list.size();

        System.out.println("Первичный список целых чисел " + list);
        System.out.println("Максимальное " + max);
        System.out.println("Минимальное " + min);
        System.out.println("Cреднее арифметическое чисел равно: " + average);
        if (list.size() % 2 == 0) {
            int medium1 = list.get(list.size() / 2);
            int medium2 = list.get(list.size() / 2 - 1);
            System.out.println(
                    "В списке из " + list.size() + " элементов два средних числа : " + medium2 + " и " + medium1);
        } else {
            int medium = list.get(list.size() / 2);
            System.out.println("В списке из " + list.size() + " элементов среднее число : " + medium);

            // // Iterator<Integer> iterator = list.iterator();
            // while (iterator.hasNext()) {
            // for (int i = 0; i<list.size(); i++){
            // for (int j = 0; j<list.size(); j++){
            // Float prctng=((i - j)/i )*100;
            // }
            // }

            // System.out.println("Cреднее число из этого списка " + average);
        }

        // System.out.println("Максимальное число из этого списка" +
        // Collections.max(list));
        // System.out.println("Минимальное число из этого списка" +
        // Collections.min(list));

    }
}
/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
 * среднее из этого списка .
 */