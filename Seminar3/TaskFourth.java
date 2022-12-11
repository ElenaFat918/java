import java.util.ArrayList;
import java.util.Iterator;

public class TaskFourth {
    ArrayList<String> myList = new ArrayList<>();

    public void work(){
        myList.add("Hello");
        myList.add("Seminar");
        myList.add(String.valueOf(1)); //valueOf возвращает строковое представление аргумента
        myList.add(String.valueOf(3));

        System.out.println("Первичный список " + myList);
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().matches("-?\\d+(\\.\\d+)?$")) { // matches указывает, соответствует ли эта строка заданному регулярному выражению для целых чисел(есть ли здесь числа со знаком - ,гуглим шаблоны регулярки)
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */