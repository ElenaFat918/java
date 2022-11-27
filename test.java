import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.*;

public class test {

    private static Logger logger = Logger.getLogger(test.class.getName());

    public static void main(String[] args) throws IOException {

        FileHandler fh = new FileHandler("TestLog.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        writer();
    }

    public static ArrayList<String> getFiles() throws IOException {
        File file = new File("C:\\");
        File[] files = file.listFiles();
        ArrayList<String> names;
        try {
            names = new ArrayList<String>(Arrays.asList(file.list()));
            return names;
        } catch (NullPointerException nullPointerException) {

            logger.log(Level.WARNING, "Файлы не найдены в этой папке");

        }
        return null;
    }

    public static void writer() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
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