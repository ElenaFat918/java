package HomeWork6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
   public static void main(String[] args) {
      Notebook notebook1 = new Notebook("Samsung", "8", "1000", "Windows", "grey");
      Notebook notebook2 = new Notebook("HP", "32", "1000", "Lunex", "black");
      Notebook notebook3 = new Notebook("Asus", "16", "2000", "Windows", "black");
      Notebook notebook4 = new Notebook("Apple", "16", "10000", "MacOS", "red");
      Notebook notebook5 = new Notebook("Acer ", "32", "1000", "Windows", "black");

      Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2,
            notebook3, notebook4, notebook5));
        
      Map<String, String> sel = selectCriteria();
      sort(sel, notebooks);

   }

   public static String scanner() {
      Scanner in = new Scanner(System.in);
      String input = in.nextLine();
      return input;
   }

   public static Map<String, String> selectCriteria() {
      Map<String, String> resultCriterias = new HashMap<>();
      while (true) {
         System.out.println("Вы хотите выбрать критерий? Если да введите 'y', если нет введите 'n'");
         String question = scanner();
         if (question.equals("n")) {
            break;
         } else {

            System.out.println(
                  "Введите цифру, соответствующую необходимому критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем жёсткого диска \n 4 - Операционная система \n 5 - Цвет");
            String key = scanner();
            System.out.println("Введите значения для выбранного критерия: ");
            String value = scanner();

            resultCriterias.put(key, value);
         }
      }
      System.out.println(resultCriterias);
      return resultCriterias;

   }

   public static void sort(Map<String, String> criterias, Set<Notebook> notebooks) {

      Set<Notebook> temp = new HashSet<>(notebooks);
      for (Notebook notebook : notebooks) {

         for (Object parameters : criterias.keySet()) {

            if (parameters.equals("1") && !notebook.getName().equals(criterias.get(parameters))) {
               temp.remove(notebook);
            }
            for (Object parameters2 : criterias.keySet()) {

               if (parameters2.equals("2") && !notebook.getRam().equals(criterias.get(parameters2))) {
                  temp.remove(notebook);

               }
               for (Object parameters3 : criterias.keySet()) {

                  if (parameters3.equals("3") && !notebook.getHardDisk().equals(criterias.get(parameters3))) {
                     temp.remove(notebook);

                  }
                  for (Object parameters4 : criterias.keySet()) {

                     if (parameters4.equals("4") && !notebook.getOperatingSystem().equals(criterias.get(parameters4))) {
                        temp.remove(notebook);

                     }
                     for (Object parameters5 : criterias.keySet()) {

                        if (parameters5.equals("5") && !notebook.getColour().equals(criterias.get(parameters5))) {
                           temp.remove(notebook);

                        }
                     }
                  }
               }
            }
         }
      }
      if (temp.isEmpty()) {
         System.out.println("По введенным критериям ничего не найдено!");
      } else {
         System.out.println("Вот что мы можем предложить: \n" + temp.toString());
      }
   }
}
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. 
 */