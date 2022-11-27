import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Распарсить файл с логами из заданий, выполненных на семинаре, найти записи уровня INFO/DEBUG.
 */
public class q {
    public static void main(String[] args) {
        try {
            PrintWriter requests = new PrintWriter("textLog.txt");
            PrintWriter responses = new PrintWriter("textLog.txt");
            PrintWriter currentLog = null;
            Scanner s = new Scanner(new File("log.txt"));
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (line.startsWith("Request from"))
                    currentLog = requests;
                else if (line.startsWith("Response from"))
                    currentLog = responses;
                else if (currentLog != null)
                    currentLog.println(line);
            }
            requests.close();
            responses.close();
            s.close();
        } catch (IOException ioex) {
            // handle exception...
        }
    }
}
