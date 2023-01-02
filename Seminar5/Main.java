package Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       FirstProblem firstProblem = new FirstProblem();  /*объявл новую переменную в классе
        FirstProblem и создаем для нее новый экземпляр этого класса*/

       Map<Integer, String> passports = firstProblem.fillMap(new HashMap<>());
        // System.out.println(passports);
       Scanner in = new Scanner(System.in,  "Cp866");
       firstProblem.getPassportInfoByName(passports, in.nextLine());
            //    in.close();
            //     firstProblem.getPassportInfoByName(firstProblem.fillMap(new HashMap<>()), in.next());

    //    SecondProblem secondProblem = new SecondProblem();
    //    String a = "paper";
    //    String b = "title";
    //    System.out.println(secondProblem.isIsomorphic(a,b));

        // ThirdProblem thirdProblem = new ThirdProblem();
        // thirdProblem.sortedMap("Мороз и солнце день чудесный Еще ты дремлешь " +
        //         "друг прелестный Пора красавица проснись");
    }
}

