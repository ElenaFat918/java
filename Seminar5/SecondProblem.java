package Seminar5;

import java.util.HashMap;

public class SecondProblem {

    public boolean isIsomorphic(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        } else {
            HashMap<Character, Character> firstMap = new HashMap<>();   //объявим мапу для первой строки
            HashMap<Character, Character> secondMap = new HashMap<>();  //объявим мапу для второй строки
            char[] firstChars = first.toCharArray();                    //переведем 1строку в массив символов
            char[] secondChars = second.toCharArray();                   //переведем 1строку в массив символов
            for (int i=0; i<firstChars.length; i++) {                   //возмём 1 мапу,
                if (firstMap.containsKey(firstChars[i])) { 
                    /*если первая мапа содержит
                в качестве ключа i-тый элемент массива,состоящего из 1-й строки firstChars[i]
                     */ 
                    if (secondChars[i] != firstMap.get(firstChars[i])) {
                        /*то проверяем если i-тый элемент массива,состоящего из 2-й строки secondChars[i], 
                         * отличается от первого значения 1-й мапы
                        */
                        return false; //строки не изоморфны
                    }
                } else {
                    if (secondMap.containsKey(secondChars[i])) {     /*если вторая мапа содержит
                        в качестве ключа i-тый элемент массива,состоящего из 1-й строки secondChars[i]*/
                        return false;
                    } else {
                        firstMap.put(firstChars[i], secondChars[i]);    //положим в 1ю мапу под ключом firstChars элемент secondChars
                        secondMap.put(secondChars[i], firstChars[i]);   //положим в 2ю мапу под ключом secondChars элемент firstChars
                    }
                }
            }
        }
        return true;
    }
}

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во
втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
(Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
note -> code
n -> c
o = o
t -> d
e = e
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */