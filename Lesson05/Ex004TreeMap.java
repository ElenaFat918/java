package Lesson05;
import java.util.*;

public class Ex004TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); System.out.println(tMap);
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
    }
}
/*
 * TreeMap
Методы, на которые нужно обратить внимание
put(K,V)                добавить пару
get(K)                  получить значение по ключу
remove(K)               удалить значение по ключу
descendingKeySet(V)     получит только ключи
descendingMap()         показать в обратном порядке
tailMap()               показать значения > чем
headMap()               показать значения < чем
lastEntry()             послед запись
firstEntry()            перв запись
 */