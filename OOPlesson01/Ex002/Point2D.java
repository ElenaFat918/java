package OOPlesson01.Ex002;

public class Point2D  { 
    /**
     * выделяем сущность "точка": говорим класс Point2D, для этой сущности определены  поля x, y
    */
    
    int x, y;
    public Point2D (int valueX, int valueY){ //опишем конструктор(используем снипеты - пишем ctor) в котором будет поведение
        /*пусть принимаются значения valueX и valueY, как юудто это обычные аргументы
        */ 
        x = valueX;
        y = valueY;
    }
    // public Point2D() { //создадим  конструктор по умолчанию(нет аргументов) - технически объявили свое поведение - переопределяю конструктор
    //     x = 0;
    //     y = 0;
    // }
    // public Point2D(int value) {//конструктор c 1 аргументом, в котором одинаковые х и у
    //     x = value;
    //     y = value;
    // }
    public Point2D(int value) { //в момент вызова Point2D вызывается конструктор public Point2D (int valueX, int valueY)
        this(value, value);
    }
    public Point2D() {//переопределяем конструктор по умолчанию
        this(0);//давайте мы вызовем this и вызываем констр с 1м арг или с 2мя
    }
    public int getX(){//в рамках сущности описать метод  и разграничить права доступа
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int value){//дополняем класс поведением изменить координату Х
        this.x = value;
    }
    public void setY(int value){//дополняем класс поведением изменить координату Y
        this.y = value;
    }
    private String getInfo(){ //опишем метод с возвращаемой строкой, private - модификатор доступа
        return String.format("x: %d; y:%d",x,y);
    }
    @Override //переопределили(перегрузка) поведение
    public String toString() {
        
        return getInfo();  
        /*переопределили(перегрузка - описываю в рамках одной сущности методы, 
        отличающиеся сигнатурой(количеством аргументов или тип данных аргументов)) поведение: 
        вместо super.toString() обращаемся к текущему getInfo(), 
        т.е. метод toString будет возвращать getInfo*/
    }
    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
