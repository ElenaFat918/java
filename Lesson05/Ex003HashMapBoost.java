package Lesson05;
import java.util.*;
public class Ex003HashMapBoost {
    // Как ускорить работу
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();     //конструктор HashMap<>() без аргументов, просто выделяем какое-то значение массива по умолчанию
        Map<Integer,String> map2 = new HashMap<>(9);     //конструктор выделяем на вместимость массива 9 элементов
        Map<Integer,String> map3 = new HashMap<>(9, 1.0f); 
        /* конструктор выделяем на вместимость массива 9 элементов 
        и 100%(в %-ом соотношении до какого момента нужно заполнять текущ значения
        чтобы произвелось удвоение кол-ва эл-в в нашем хранилище)
        */   
    }
}