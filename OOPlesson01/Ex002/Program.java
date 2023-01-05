package OOPlesson01.Ex002;
/*
 * Описываем логику:
 * если есть static, то обращаемся через имя типа, 
 * не через конкретный экземпляр Point2D(a - конкрет экземпляр,Point2D - тип )
*/
public class Program {
    static double distance(int x1, int y1, int x2, int y2) {//раньше 4 аргумента, что-то представляющие м-ду собой
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(Point2D a, Point2D b) { 
        /*
 * Описываем логику:
 * новый метод static double distance принимает 2 точки "Point2D a" и "Point2D b", 
 * переходим на след уровень абстракции, есть точка a или b, а у сточки есть х и у, манипулируем с ними
*/
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        // Point2D a = new Point2D(); //выделяем конкретный экземпляр класса точка Point2D
        // a.x = 0;
        // a.y = 2;//указываем  конкретные значения полей
        Point2D a = new Point2D(0, 2); 
        // вызвали конструктор и пеедали а него 0, 2. теперь такое поведение добавим в класс =>
        System.out.println(a.toString());
        System.out.println(a);
        // a.setX(12);
        System.out.println(a.getX()); //метод возвращающий значение координаты X
        System.out.println(a.getY());//метод возвращающий значение координаты Y


        Point2D b = new Point2D(0);//выделяем конкретный экземпляр класса точка Point2D, получился конструктор по умолчанию(нет аргументов)
        // b.x = 0;
        // b.y = 10;
        // Point2D b = new Point2D(10); // создаем экземпляр класса Point2D b  со значением 10 как для х так и для у
        System.out.println(b.toString());
        
        //System.out.println(distance(a, b));//вызываем метод distance, передавая в него точки
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
/*
 * в работе с памятью "а" будет размещаться в стеке, остальное будет размещаться в куче
*/