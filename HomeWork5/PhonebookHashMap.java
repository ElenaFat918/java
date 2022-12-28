package HomeWork5;

import java.util.HashMap;
import java.util.Map;
// import java.util.Map;
import java.util.Scanner;

public class PhonebookHashMap {

    public HashMap<Long, String> fillHashMap() {

        HashMap<Long, String> contacts = new HashMap<Long, String>();
        contacts.put(8495123456L, "Муж");
        contacts.put(8347321456L, "Свекровь");
        contacts.put(8846234561L, "Сестренка");
        contacts.put(8495234432L, "Муж");
        contacts.put(8347654321L, "Свекровь");
        contacts.put(8846345678L, "Сестренка");
        contacts.put(8353555678L, "Мама");
        contacts.put(8353555533L, "Мама");
        System.out.println(contacts);
        return contacts;
    }
    
        // public void getcontactsInfoByName( HashMap<Long, String> contacts, String name){
        //     for(HashMap.Entry<Long, String> contactsEntry : contacts.entrySet()) {
        //         if (contactsEntry.getValue().equals(name)) {
        //             System.out.println(contactsEntry.getKey());
        //         }
        //     }
        // }
    public void getcontactsInfoByName( ){
        HashMap<Long, String> phonebookHashMap = fillHashMap();
            System.out.print("Введите имя контакта: ");

            Scanner in = new Scanner(System.in, "Cp866");
            String name = in.nextLine();
            in.close();

            System.out.println("Контакты абонента: "+name);

            for (Map.Entry<Long, String> contactsEntry : phonebookHashMap.entrySet()) {
                if (contactsEntry.getValue().equals(name)) {

                    System.out.println(contactsEntry.getKey());
                }    
        }
    }

      
}
/*
 * Реализуйте структуру телефонной книги с помощью HashMap,
 * учитывая, что 1 человек может иметь несколько телефонов.
 */