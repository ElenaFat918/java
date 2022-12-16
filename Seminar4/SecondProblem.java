package Seminar4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class SecondProblem {
    String string;  //объявии переменную в классе


    public void addToLinkedList() {     //метод
        LinkedList<String> linkedList = new LinkedList<>();     //обьявли линкед лист для хранения строк

        do {            // конструкция do - while (один раз прогоняет логику даже если while не выполняется)
        Scanner in = new Scanner(System.in);    // объявили сканер чтобы вводить с клавиатуры
        string = in.next();
        in.close();
            String[] split = string.split("~");
            if (!split[0].equals("print")) {    //если введено не print 
                Random random = new Random();   // ввели объект класса рандом
                int myRandomNumber = random.nextInt(2 * Integer.parseInt(split[1]));    /*генерируется число до числа, 
                                                                                        которое (распарсили num (parseInt(split[1]))   
                                                                                        который написали и умножили на 2)*/
                while (myRandomNumber < Integer.parseInt(split[1])) {   //защита от дурака(обработчик) пока myRandomNumber<числа которое внесли и распарсили...
                    myRandomNumber = random.nextInt(2 * Integer.parseInt(split[1]));      //генерируется число без границ
                }

                for (int i = 0; i < myRandomNumber; i++) {     
                    linkedList.add("a");                   //инициализируем linkedList нулями
                }
                linkedList.set(Integer.parseInt(split[1]), split[0]); //на позицию null, которую передали через консоль вставим текст, введеный ранее с консоли

            } else if (!linkedList.isEmpty() && Integer.parseInt(split[1]) <= linkedList.size()) {   //если linkedList непустой и null не превосходит размер листа (введено  print )
                System.out.println(linkedList.get(Integer.parseInt(split[1]))); //выводим элемент на позиции Num
                linkedList.remove(Integer.parseInt(split[1]));  //удаляем элемент на позиции Num
                System.out.println(linkedList);
            }
        } while (!string.equals("Q"));  //объявили точку Q выхода из конструкция do - while 
    }
}
/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */