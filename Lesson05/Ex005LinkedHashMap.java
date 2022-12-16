package Lesson05;
import java.util.*;

public class Ex005LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> linkmap = new LinkedHashMap<>();    //хранит элементы по порядку их добавления
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}
    }
}