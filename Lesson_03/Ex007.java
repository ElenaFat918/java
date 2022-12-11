package Lesson_03;

import java.util.*;

public class Ex007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);  //коллекция, сформированная при помощи List.of

        for (int item : list) { // цикл for each. (тип данных, хранящихся в итерируемом объекте _ переменная для конкретого элемента в переборе: имя коллекции
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();    //
        System.out.println();

        while (col.hasNext()) {    //пока есть след элемент
            //col.remove(); //Exception in thread "main" java.lang.UnsupportedOperationException
            System.out.println(col.next());
            // col.next();  //Exception in thread "main" java.util.NoSuchElementException
        }

    }
}
