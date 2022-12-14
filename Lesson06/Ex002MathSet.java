package Lesson06;

import java.util.Arrays;
import java.util.HashSet;

public class Ex002MathSet {
    public static void main(String[] args) {
		
		var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));	//определили одну коллекцию, задали её используя функционал Arrays.asList
		var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
		var u = new HashSet<Integer>(a); u.addAll(b);	//делаем копию множества а и кладем её в множество u, определяем с каким множеством будем объединяться(b)
		var r = new HashSet<Integer>(a); r.retainAll(b);
		var s = new HashSet<Integer>(a); s.removeAll(b);
		System.out.println(a);	// [1,2,3,4,5,6]
		System.out.println(b);	// [17,2,3,5,7,11]
		System.out.println(u);	// [1,17,2,3,5,6,11]
		System.out.println(r);	// [2,3,5,7]
		System.out.println(s);	// [1,4,6]
		boolean res = a.addAll(b);
	}
}
/*
 * HashSet как синоним множества:
first()
last()
headSet(E)
teilSet(E)
subSet(E1,E2)

TreeSet - коллекция - в основе HashMap, упорядочен по возрастанию, null`ов быть не может
LinkedHashSet -  коллекция - в основе HashMap, помнит порядок (использовать когда нужен HashSet с запоминанием порядка элемента
LinkedHashSet :
isEmpty() - проверка на пустоту
add(V) - добавление элемента в коллекцию
remove(V) - удаление элемента из коллекции
contains(V) - проверка на включение элемента в коллекцию
clear() - удаеоние всех элементов коллекции
size() - возвращает количество элементов коллекции

Объект - выделяем сущность и переносим в вирт мир, правильно описать
Введение в создание собственных типов. Решение проблемы получило название ООП. При использовании данного подхода,
упорядочивание кода базируется на объединении данных и методов для обработки этих данных в одно целое. 
Это одно целое в ООП называется экземпляром класса.
Вся программа имеет блочную структуру, что существенно упрощает анализ кода и внесение в него изменения.
ООП - искусственный прием, в большинстве случаев не зависящий от языка программирования.
Если говорят, что разработка идет с использованием ООП - это говорит о том, что испол-ся классы и экземпляры этих классов.
Каждый экземпляр класса определяется общим шаблоном, который называется классом.
В рамках класса задается общая структура, на основе кготорой затем создаются экземпляры.
Данные, относящиеся к классу, называются полями класса, а код для их обработки - методами класса.

Пример:
Автомобиль - Lada 2107 UIN 123123123, S/N 789789789 - конкретная машина является представителем класса Автомобиль 
Здание - Дом по адресу г.Москва ул.Ленина 21к1
Ученик - Сергей Камянецкий, 51 МиИ, СмолГУ
Моб тел - Siemence CX60 IMEI 76725746878687463473
Геомертрическая фигура - додекаэдр
Работник - Смирнова Т.В. 14.02.1994, ID 728, Компания GeekBrains
Котики - Барсик
*/