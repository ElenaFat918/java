package Lesson05;

import java.util.HashMap;
import java.util.Map;

public class Ex001HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<Integer, String>(); //Интерфейс Map<тип для ключа, тип значения> имя коллекции
        db.putIfAbsent(1, "один");  //проверяет если есть такой ключ 
        db.put(2, "два"); //метод put добавляет  
        db.put(null, "!null");
        System.out.println(db); //{null=!null, 1=один, 2=два}
        System.out.println(db.get(44)); //null
        // db.remove(null);
        System.out.println(db);
        System.out.println(db.containsKey(1));
        System.out.println(db.containsValue("один"));   // проверка значения
        // System.out.println(db.containsValue(1));
        // System.out.println(db.containsKey("один"));
        System.out.println(db.containsKey(1));   // проверка ключа
        System.out.println(db.keySet());       // получить коллекцию всх ключей
        System.out.println(db.values());   // получить коллекцию всх значений
    }
    
}

/*
 * HashMap
Map – это множество коллекций, работающих с данными
по принципу <Ключ / Значение>.
Ключевые особенности:
● допускаются только уникальные ключи, значения
могут повторяться;
● помните про значения*;
● ускоренная обработка данных;
● порядок добавления не запоминается.
функционал HashMap
put(K,V) – добавить пару если или изменить значение,если ключ имеется.
putIfAbsent(K,V) – произвести добавление если ключ не найден.
get(K) - получение значения по указанному ключу.
remove(K) – удаляет пару по указанному ключу.
containsValue(V) – проверка наличия значения.
containsKey(V) – проверка наличия ключа.
keySet() – возвращает множество ключей.
values() – возвращает набор значений.
 */