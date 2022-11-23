import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
        /*
         * Вывести в консоль системные дату и время.
         * Получить введенную строку и вывести в консоль сообщение "Привет, <Имя>!"
         * В консоли запросить имя пользователя. В зависимости от текущего времени,
         * вывести приветствие вида
         * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
         * "Добрый день, <Имя>!", если время от 12:00 до 17:59
         * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59
         * "Доброй ночи, <Имя>!", если время от 23:00 до 04:59
         * 
         * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
         */
        // LocalDateTime now = LocalDateTime.now();
        // Calendar calendar = new GregorianCalendar();
        // System.out.println(calendar);
        // System.out.println(now);
        // System.out.println("Введите имя!");
        // Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        // in.close();
        // System.out.println("Привет, " + name);
        // if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
        //         && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
        //     System.out.println("Доброе утро, " + name + "!");
        // } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
        //         && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
        //     System.out.println("Добрый день, " + name + "!");
        // } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
        //         && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
        //     System.out.println("Добрый вечер, " + name + "!");
        // } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
        //         && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
        //     System.out.println("Доброй ночи, " + name + "!");
        // }
        Task myObject = new Task();
        myObject.maxOfOnes();
    }
}
class Task {
    /* 
    * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    */
    int n; /* переменная - размер массива*/
    int[] array;

    Task(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = input.nextInt();
        array = new int[n];
        System.out.println("Введите массив");
        for (int i = 0; i<n; i++){
            array[i] = input.nextInt();
        }
        input.close();
    }
    void maxOfOnes(){
        int count = 0;
        int anotherCount = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] == 1){
                anotherCount++;
            }else if (count < anotherCount) {
                    count = anotherCount;
                    anotherCount = 0;
                }
            }
            if (count < anotherCount){
                System.out.println(anotherCount);
            }else{
                System.out.println(count);
            }
    }
}
