import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskThree {
    int count = 0;
    ArrayList<String> planets = new ArrayList<>();

    public void addPlanets(){
        planets.add("Меркурий");   
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Плутон");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Уран");
        planets.add("Сатурн");
        planets.add("Нептун");
        planets.add("Земля");

        // Для работы и модификации с коллекцией Iterator, тип должен совпадать с коллекцией (просо каретка, у нее есть методы, next передвигает кретку и возвращает элемент)
        Iterator<String> iterator = planets.iterator();
        while (iterator.hasNext()) {                                //пока hasNext передвигает каретку на один элемент, 
            if (Collections.frequency(planets, iterator.next())>1){ //если количество вхождений элемента в iterator.next() в коллекции planets больше одного
                count++;           // увеличиваем переменную на 1                               //
                iterator.remove(); //удаляет именно этот элемент
            }
        }
        System.out.println(planets);
        System.out.println(count);
    }
}
/*
Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */