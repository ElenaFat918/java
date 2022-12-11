package Lesson_03;

import java.util.ArrayList;

public class Ex003 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(); // <обобщение> -правильнее, чтобы обойти ошибки
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10); // хранилище под 10 элем
        ArrayList<Integer> list4 = new ArrayList<>(list3);
       
        list3.add(123); 
        System.out.println(list3);
        list4.add(1234567890); 
        System.out.println(list4);

    }
}
