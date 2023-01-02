package Seminar5;

import java.util.ArrayList;
import java.util.TreeMap;

public class ThirdProblem  {
    public void sortedMap(String input) {
        TreeMap<Integer, ArrayList<String>> treeMap = new TreeMap<>();  // M<ключ Integer, значение ArrayList<String>>
        String[] s = input.split(" ");  // разбиваем строку по пробелам в массив 
        for (int i = 0; i<s.length; i++) {      //в массиве проверяем:
            if (treeMap.containsKey(s[i].length())) {   //если treeMap содержит длину, указанную в s[i]
                treeMap.get(s[i].length()).add(s[i]);   
                /*добавляем это слово get(s[i].length())-получить эемент соотв-ий ключу, что является листом list*/
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(s[i]); //добавим слово в лист
                treeMap.put(s[i].length(), list); // добавим в treeMap с ключем длиной слова и словом из list
            }
        }
        System.out.println(treeMap.entrySet());
    }
}

        /*
Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный
Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
Строки с одинаковой длиной не должны “потеряться”.
         */