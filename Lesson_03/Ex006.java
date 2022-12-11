package Lesson_03;

import java.util.ArrayList;
import java.util.List;

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        // List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');// ПОЗВОЛЯЕТ СФОРМИРОВАТЬ массив на основе какого-то набора данных, здесь лист символов(Character)
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add( 'e');
        list1.add( 'r');
        list1.add( 'g');
        System.out.println(list1);
        list1.remove(1); // java.lang.UnsupportedOperationException связано с тем, что в коллекции, кот создается при помощи List.of не работает remove  
        System.out.println(list1);
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);
    }
}
