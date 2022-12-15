package Lesson_04;

import java.util.*;

public class Ex004 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /*Stack представляет собой обработку данных по принципу LIFO.
Расширяет Vector пятью операциями, которые позволяют
рассматривать вектор как стек. */
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
    }
}
