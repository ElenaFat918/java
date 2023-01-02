package Lesson06;

import java.util.HashSet;
import java.util.Set;

/*
 * Коллекция HashSet
 * isEmpty() - проверка на пустоту
 * add(V) - добавление элемента в коллекцию
 * remove(V) - удаление элемента из коллекции
 * contains(V) - проверка на включение элемента в коллекцию
 * clear() - удаеоние всех элементов коллекции
 * size() - возвращает количество элементов коллекции
 * */

public class Ex001HashSet {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>(); 
/* есть HashSet<> и он инплеметирует некий интерфейс set, 
как следствие используем базовый тип Set<Integer> 
и в него кладем экземпляр нашего конкретного сета*/
		
		set.add(1); set.add(12); set.add(123);	//- добавление уникального элементов в коллекцию
		set.add(1234); set.add(1234);
		System.out.println(set.contains(12)); //true  
		set.add(null);
		System.out.println(set.size()); //5
		System.out.println(set); //[null, 1, 1234, 12, 12]
		set.remove(12);
		for (var item : set) System.out.println(item); // null, 1, 1234, 123
		set.clear();
		System.out.println(set); // []
	}
}
/*
 * HashSet как синоним множества:
 * addAll(coll) - объединение множеств
 * retainAll(coll) - пересечение множеств
 * removeAll(coll) - разность множеств
 */