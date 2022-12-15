package Lesson_04;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();  //Линейная коллекция, которая поддерживает вставку 
                                                    //и удаление элементов на обоих концах.
        // deque.addFirst(1); deque.addLast(2);    
        // System.out.println(deque);
        // System.out.println(deque.removeLast());System.out.println( deque.removeLast());
        // System.out.println(deque);
        deque.offerFirst(1); /*Вставляет указанный элемент в начало этого deque, 
        если только он не будет нарушать ограничения пропускной способности. */
        // deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(2); 
        /*Вставляет указанный элемент в конец этого deque, 
        если только он не будет нарушать ограничения пропускной способности. */
        System.out.println(deque);
        // System.out.println(deque.pollFirst());System.out.println(deque.pollLast());
        /*Извлекает и удаляет первый pollFirst или последний pollLast элемент этого deque, 
        или возвращает {@code null}, если этот deque пуст.*/
        // System.out.println(deque);
        System.out.println(deque.getFirst());System.out.println(deque.getLast());
        /*Извлекает, но не удаляет, первый getFirst или последний getLast элемент этого deque. */
        System.out.println(deque);
        System.out.println(deque.peekFirst());System.out.println(deque.peekLast());
        /*Извлекает, но не удаляет, первый peekFirst или последний peekLast элемент этого deque,
        * или возвращает {@code null}, если этот deque пуст. */
        System.out.println(deque);

    }
}