package HomeWork4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// public class QueueLinkedList {
//     int n; // объявии переменную в классе
//     public LinkedList<Integer> linkedList = new LinkedList<>();

//     public void addToLinkedList() {
//         Scanner in = new Scanner(System.in); // объявили сканер чтобы вводить с клавиатуры
//         System.out.println("Введите количество элементов массива :");
//         n = in.nextInt();
//         // in.close();

//         Random random = new Random(); // ввели объект класса рандом
//         Integer[] array = new Integer[n]; // инициализировали массив
//         for (int i = 0; i < n; i++) {
//             array[i] = random.nextInt(100);
//         }
//         // System.out.println("Сформирован массив из " + n + " случайных чисел: " + Arrays.toString(array));

//         for (Integer temp : array) {
//             linkedList.add(temp);
//         }
//         System.out.println("Сформирована очередь = " + linkedList);
//         enqueue(linkedList);
//         dequeue(linkedList);
//         first(linkedList);

//     }
//     public static void dequeue(LinkedList<Integer> linkedList) {
//         Deque<Integer> deque = linkedList;  //Линейная коллекция, которая поддерживает вставку 
//                                                     //и удаление элементов на обоих концах.
//         System.out.println("Извлекаю и удаляю первый элемент " + deque.pollFirst());
//         System.out.println("Получился linkedList: " + deque);
//         /*Извлекает и удаляет первый pollFirst или последний pollLast элемент этого deque, 
//         или возвращает {@code null}, если этот deque пуст.*/
//     }
//     public static void enqueue(LinkedList<Integer> linkedList) {
//         int i;
//         Scanner in = new Scanner(System.in); // объявили сканер чтобы вводить с клавиатуры
//         System.out.println("Введите элемент, который вы хотите извлечь и поместить в конец очереди :");
//         i = in.nextInt();
//         in.close();

//          Deque<Integer> enqueue = linkedList; 
//          System.out.println("Извлекаю и удаляю элемент " + i + " " + enqueue.remove(i) + "Получился linkedList: " + enqueue); 
         
//          System.out.println("Перемещаю элемент в конец очереди "+  enqueue.offerLast(i)); 
//         /*Вставляет указанный элемент в конец этого deque, 
//         если только он не будет нарушать ограничения пропускной способности. */
//         System.out.println("Получился linkedList: " + enqueue);
//     }
//     public static void first(LinkedList<Integer> linkedList) {
//         Deque<Integer> enqueue = linkedList; 
//         System.out.println("Извлекаю и НЕ удаляю первый элемент " + enqueue.peekFirst()); 
//         System.out.println("И linkedList тот же : " + enqueue);
//     }
// }
/*
 * Реализуйте очередь с помощью LinkedList со следующими методами: 
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class QueueLinkedList {
    int n; // объявии переменную в классе
    public LinkedList<Integer> linkedList = new LinkedList<>();

    public void addToLinkedList() {
        Scanner in = new Scanner(System.in); // объявили сканер чтобы вводить с клавиатуры
        System.out.println("Введите количество элементов массива :");
        n = in.nextInt();
        // in.close();

        Random random = new Random(); // ввели объект класса рандом
        Integer[] array = new Integer[n]; // инициализировали массив
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        // System.out.println("Сформирован массив из " + n + " случайных чисел: " + Arrays.toString(array));

        for (Integer temp : array) {
            linkedList.add(temp);
        }
        System.out.println("Сформирована очередь = " + linkedList);
        enqueue(linkedList);
        dequeue(linkedList);
        first(linkedList);
    }
    public static void enqueue(LinkedList<Integer> linkedList) {    // помещает элемент в конец очереди
        int i;
        Scanner in = new Scanner(System.in); // объявили сканер чтобы вводить с клавиатуры
        System.out.println("Введите элемент, который вы хотите поместить в конец очереди :");
        i = in.nextInt();
        linkedList.add(i);
        in.close();
        System.out.println("Помещаю " + i + " "  + "в конец очереди : " + linkedList); 
    }
    
    public static void dequeue(LinkedList<Integer> linkedList) {   //возвращает первый элемент из очереди и удаляет его
        
        System.out.println("Извлекаю и удаляю первый элемент " + linkedList.removeFirst());
        System.out.println("Получилась очередь: " + linkedList);
    }
    
    public static void first(LinkedList<Integer> linkedList) {  // возвращает первый элемент из очереди, не удаляя
        System.out.println("Извлекаю и НЕ удаляю первый элемент " + linkedList.getFirst()); 
        System.out.println("И очередь та же : " + linkedList);
    }
}