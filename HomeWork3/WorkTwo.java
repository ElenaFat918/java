package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;

public class WorkTwo {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public void addAndRemoveNumbers() {
        list.add(56789); // на i-й индекс добавляет элемент
        list.add(3);
        list.add(34);
        list.add(876);
        list.add(78765);
        list.add(33);
        list.add(55);
        list.add(0);

        System.out.println("Первичный список целых чисел" + list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Cписок оставшихся нечетных чисел" + list);
    }
}
/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа.
 */