package Seminar5;

import java.util.Map;

public class FirstProblem {

    public Map<Integer, String> fillMap(Map<Integer, String> passports) {
        passports.put(123456, "Иванов");
        passports.put(321456, "Васильев");
        passports.put(234561, "Петрова");
        passports.put(234432, "Иванов");
        passports.put(654321, "Петрова");
        passports.put(345678, "Иванов");
        // System.out.println(passports);
        return passports;
    }

    public void getPassportInfoByName(Map<Integer, String> passports, String name){
        for(Map.Entry<Integer, String> passportsEntry : passports.entrySet()) {
            // System.out.println(passportsEntry.getValue() + "   " + name);
            if (passportsEntry.getValue().equals(name)) {

                System.out.println(passportsEntry.getKey());
                // System.out.println("найдено совпадение");
            }
        }
    }
}
/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести номера паспортов  по сотрудникам с фамилией Иванов.
 */