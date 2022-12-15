package Lesson_04;

import java.util.Stack;

public class Ex005 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -
        
        // var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3    //разбираем выражение при помощи сплита через пробел
        
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;    //переменная,в которой храним результат вычисления
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>();  //стек который будет хранить числа
        for (int i = 0; i < exp.length; i++) {      //пробегаемся по всем элементам выражения exp

            if (isDigit(exp[i])) {      //если текущий эл-т выражения явл-ся числом
                st.push(Integer.parseInt(exp[i]));  // добавляем его в стек, предварительно преобразовав из строки в целое
            } else {                    //если не число, то 
                switch (exp[i]) {       //
                    case "+":           //если получаем операцию + то 
                        res = st.pop() + st.pop();  //извлекаем два элемента из стека применив +-е
                        st.push(res);   //кладем результат назад в стек
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());    // извлекаем посл эл-т из стека получая результат выражения exp
    }
}