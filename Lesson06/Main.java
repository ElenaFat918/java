package Lesson06;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    //main.java //клиентский код
    public static void main(String[] args) {
        // #region создаем экземпляр  класса Worker
        Worker w1 = new Worker(); // тип класса Worker, w1 - идентификатор переменной типа Worker, вызываем конструкцию new Worker()
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w2 = new Worker();
        w1.firstName = "Имя_2";
        w1.lastName = "Фамилия_2";
        w1.salary = 200;
        w1.id = 2000;

        Worker w3 = new Worker();
        w1.firstName = "Имя_3";
        w1.lastName = "Фамилия_3";
        w1.salary = 300;
        w1.id = 3000;

        System.out.println(w1); //Worker@545343 - @... -хэш-код
        System.out.println(w2.toString());
        System.out.println(w3);
        System.out.println(w4);

        System.out.println(w1 = w4);//false
        System.out.println(w1.equals(w4));//false
        var workers = new HashSet<Worker>(Arrays.asList(w1,w2,w3));//созд коллекцию
        System.out.println(workers.contains(w4));//false
    }
	// #region
}
