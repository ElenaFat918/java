import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class qw {
    private static Logger logger = Logger.getLogger(qw.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("BubbleLogs.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        ArrayBubble myArray = new ArrayBubble();

        myArray.bubbleSorter();
        System.out.println(" ");
        myArray.printer();
        
    }  
}
class ArrayBubble {
        int n;
        int[] ar;
        private static Logger logger = Logger.getLogger(qw.class.getName());

        ArrayBubble(){
            Scanner input = new Scanner(System.in);
            System.out.println("Введите размер массива");
            try {
                n = input.nextInt();
            }catch(InputMismatchException inputMismatchException){
                logger.warning("Введен неправильный тип данных, введите целое число");
            }
            input.close();

            ar=new int[n];
            for(int i = 0;i<n;i++){
                ar[i] = ((int) (Math.random() * 31) + 5);
                System.out.print(ar[i] + " ");
            }
        }   
    

    void printer(){          //метод вывода массива в консоль
        for (int i = 0; i < n; i++){    //для каждого элемента в массиве
            System.out.print(ar[i] + " ");   //вывести в консоль    
            System.out.println(" ");                                         
        }
        logger.info("Выполнился метод вывода массива в консоль"); 
    }    

    void toSwap(int first, int second) { // метод меняет местами пару чисел массива
        int dummy = ar[first]; // во временную переменную помещаем первый элемент
        ar[first] = ar[second]; // на место первого ставим второй элемент
        ar[second] = dummy; // вместо второго элемента пишем первый из временной памяти
        System.out.println(" ");
        logger.info("Выполнился метод замены мест чисел массива");
    }

    void bubbleSorter() {
        for (int i = n - 1; i >= 1; i--) { // Внешний цикл
            for (int j = 0; j < i; j++) { // Внутренний цикл
                if (ar[j] > ar[j + 1]) // Если порядок элементов нарушен
                    toSwap(j, j + 1);
            }
        }
        System.out.println(" ");
        logger.info("Выполнилась сортировка массива пузырьком");
    }
}