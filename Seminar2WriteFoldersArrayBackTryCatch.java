// import com.sun.org.slf4j.internal.Logger;
// import com.sun.org.slf4j.internal.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/*
 * Данный фреймворк включен в стандарт и поставляется вместе с JDK, 
 * поэтому ничего дополнительно скачивать и подключать вам не надо. 
 * JUL имеет следующие уровни логгирования по возрастанию: 
 * FINEST, FINER, FINE, CONFIG, INFO, WARNING, SEVERE, а так же ALL и OFF, 
 * включающий и отключающий все уровни соответственно.
 */
public class Seminar2WriteFoldersArrayBackTryCatch {
    /*
     * Логгер создается вызовом одного из статических методов класса java.util.logging.Logger:
     * Logger log = Logger.getLogger(LoggingJul.class.getName());
     */
    private static Logger logger = Logger.getLogger(Seminar2WriteFoldersArrayBackTryCatch.class.getName());

    public static void main(String[] args) throws IOException {
        /*
         * Напишите метод, который вернет содержимое текущей папки в виде массива строк.
         * Напишите метод, который запишет массив, возвращенный предыдущим методом в
         * файл.
         * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
         * исключения,
         * оно должно записаться в лог-файл.
         */
        FileHandler fh = new FileHandler("TestLog.txt");    
        //Для задания способа вывода сообщений указываем какие хендлеры он будет использовать.
        //java.util.logging.FileHandler.pattern   = log.txt
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        writer();

        /*
         * По умолчанию JUL будет выводить сообщения на консоль, 
         * однако можно задать конфигурацию в файле свойств. 
         */
       
    }

    public static ArrayList<String> getFiles() {
        File file = new File("C:\\gitEduc\\");
        File[] files = file.listFiles();
        ArrayList<String> names;
        try {
            names = new ArrayList<String>(Arrays.asList(file.list()));
            return names;
        } catch (NullPointerException nullPointerException) {

            logger.warning("Файлы не найдены в этой папке");

        }
        return null;
    }

    public static void writer() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("arrayNameFiles.txt");
        try {

            ArrayList<String> files = getFiles();

            for (String file : files) {
                file += "\n";
                fileOutputStream.write(file.getBytes());
            }
        } catch (NullPointerException nullPointerException) {
            logger.info("В предыдущем методе файл вернул null");
        }
        fileOutputStream.close();
    }
}