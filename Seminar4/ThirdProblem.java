package Seminar4;

import java.util.Scanner;
import java.util.Stack;

public class ThirdProblem {
    String a;

    public void task(){
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>(); // LIFO - last in first out
        do {
            a = in.next();
            if (!a.equals("print") && !a.equals("revert") && !a.equals("Q")) {  //если а  не print и а не revert и а не Q
                stack.push(a);  // push добавляет элемент в очередь верхушку(добавляеv элемент в верхушку stack)
            } else if (a.equals("print")) { //если а = print 
               for (int i=stack.size()-1; i>=0; i--) {      // для индексов от последнего к 0-му(в обратном порядке)
                   System.out.println(stack.elementAt(i));  //выводим строки, 
               }
            } else if (a.equals("revert")) {    //если а = revert
                stack.pop();    // pop удаляет обьект верхушки и возвращает его (удаляем обьект верхушки и возвращаем его)
            }
        } while (!a.equals("Q"));System.out.println(stack); //объявили точку Q выхода из конструкция do - while 
}
}
/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а
первая - последней. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */