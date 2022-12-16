package Lesson05;

    // Работа с парами
import java.util.*;

public class Ex002HashMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db);
        for (var item : db.entrySet()) {    //итератор entrySet
        System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());    //выдает конкретное значение ключа и значение
        }
    }
}