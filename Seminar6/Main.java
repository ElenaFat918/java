package Seminar6;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) { // public - модификатор доступа
    //    TaskOne taskOne = new TaskOne();

    //    taskOne.fillSet(taskOne.hashSet);// обращение к переменной класса по имени класса
    //    taskOne.fillSet(taskOne.linkedHashSet);
    //    taskOne.fillSet(taskOne.treeSet);

    //    taskOne.sout(taskOne.hashSet);
    //    taskOne.sout(taskOne.linkedHashSet);
    //    taskOne.sout(taskOne.treeSet);

    //    TaskTwo taskTwo = new TaskTwo();
    //    System.out.println(taskTwo.percentOfUnique(taskTwo.array)); //вложенность 

        Cat cat = new Cat(1,4, "Дворняжка"); //cat объект который создается по шаблону класса
        cat.setName("Васька"); // изменяем имя кошки
        Cat anotherCat = new Cat(1,4,"Дворняжка");
        anotherCat.setName("Васька");

        HashSet<Cat> catsSet = new HashSet<>(); // параметризовали catsSet HashSet Cat-ом(только объекты класса Cat)
        catsSet.add(cat);
        catsSet.add(anotherCat);
        System.out.println(catsSet);

        //hashCode - не совпал, то объекты 100% разные
        //hashCode - совпал - либо это коллизия, либо объекты одинаковые
        //Хэш совпал: отрабатывает метод equals()

        /*
        Если equals() вернул true -> hashCode 100% одинаковые
         */
    }
}