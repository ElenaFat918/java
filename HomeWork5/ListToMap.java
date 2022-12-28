package HomeWork5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class ListToMap {
    // public void run() {
    //     ArrayList<String> staff = addStaff();
    //     System.out.println("Дан список сотрудников" + staff);
    //     System.out.println("Повторяющиеся имена с количеством повторений: " + repeat(staff));
    //     sorted(repeat(staff));   
    // }

    public ArrayList<String> addStaff() {

        ArrayList<String> staff = new ArrayList<>();
        staff.add("Миронов М.Б.");
        staff.add("Петров И.С.");
        staff.add("Иванов И.И.");
        staff.add("Сидоров Р.Р.");
        staff.add("Алексеев В.Д.");
        staff.add("Андреев О.Г.");
        staff.add("Андреев О.Г.");
        staff.add("Михеев О.Ю.");
        staff.add("Андреев О.Г.");
        staff.add("Миронов М.Б.");
        staff.add("Михеев О.Ю.");
        staff.add("Миронов М.Б.");
        staff.add("Михеев О.Ю.");
        System.out.println("Дан список сотрудников: " + staff);
        return staff;
    }

    public Map<String, Integer> repeat(ArrayList<String> addStaff) {
        Map<String, Integer> repeatNameCount = new LinkedHashMap<>();

        for (int i = 0; i < addStaff.size(); i++) {
            if (repeatNameCount.containsKey(addStaff.get(i))) {
                /* если ключ мапы repeatNameCount содержит элемент addStaff */
                repeatNameCount.put(addStaff.get(i), repeatNameCount.get(addStaff.get(i)) + 1);
                /*
                 * перезаписываем в мапу в ключ элемент addStaff и
                 * в значение +1 если элемент с такимже ключем
                 */

            } else { // если ключ мапы repeatNameCount не содержит элемент addStaff
                repeatNameCount.put(addStaff.get(i), 1);
                /* записываем в мапу в ключ элемент addStaff и в элемент значение 1 */
            }
            /*
             * repeatNameCount{Миронов М.Б.=3, Петров И.С.=1, Иванов И.И.=1,
             * Сидоров Р.Р.=1, Алексеев В.Д.=1, Андреев О.Г.=3, Михеев О.Ю.=3}
             */
        }
        System.out.println("Список имён с количеством повторений: " + repeatNameCount);
        return repeatNameCount;
    }

    public void sorted(Map<String, Integer> repeat) {
        Map<String, Integer> sortedRepeatNameCount = new LinkedHashMap<>();
        int max = 1;
        for (int value : repeat.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : repeat.entrySet()) {
                String key = entry.getKey();
                if (repeat.get(key) == i) {
                    sortedRepeatNameCount.put(key, repeat.get(key));
                }
            }
        }
        System.out.println("Отсортированный  по убыванию популярности список :" + sortedRepeatNameCount);
    }
}
/*
 * Пусть дан список сотрудников:Иван Иванов Написать программу,
 * которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */