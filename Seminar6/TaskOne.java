package Seminar6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskOne {
    HashSet<Integer> hashSet = new HashSet<>();//испольузем этот сет для быстродействия, создали hashSet который проинтеризовали Integer, чтобы другие разработчики не смогли изменить hashSet
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>(); //испольузем этот сет для сортировки

/*в HashSet есть все методы из класса Set + свои(механизм позднего 
связывания позволяет вести себя с этим объектом set как с объектом класса родителя, 
так и при этом поддтягивать реализацию класса наследника). В основе лежит Hash-функция. 
Сохраняеет неестеств порядок.
*/
    public void fillSet(Set<Integer> set){ 
        // абстрактный Set<Integer> метод по заполнению set, испоьзуем Set чтобы в мейне использаовать treeSet
        set.add(5); 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(3);
    }

    public void sout(Set<Integer> set){ /*метод по получению инфо об имени класса коллекции. 
        set - имя переменной в метод передаём*/
        System.out.println(set.getClass() + " " + set);
    }
}

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
 */