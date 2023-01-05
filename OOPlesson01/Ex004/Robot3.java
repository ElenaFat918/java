package OOPlesson01.Ex004;

import java.util.ArrayList;

public class Robot3 {

    enum State {
        On, Off
    }
    /* Статическое поле для исключения использования нескольких персонажей с одинаковым именем*/
    /** Дефолтный индекс для нумерации*/
    private static int defaultIndex;
    /** Коллекция имен */
    private static ArrayList<String> names;

    /* статический инициализатор:*/
    static {
        defaultIndex = 1;
        names = new ArrayList<String>(); //инициализируем пустую коллекцию
    }

    /** Уровень робота */
    private int level;

    /** Имя робота */
    private String name;

    /** Cостояние вкл\выкл робот*/
    private State state;

    /**
     * Создание робота
     * 
     * @param name  Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    /** Конструктор */
    private Robot3(String name, int level) { /*чтобы не было возможности явно указывать уровень меняем 
        public на private (технически скрываем конструктор) и тогда для конечного польз-ля будет только 
        указание имени или без параметров, все остальное система сделает сама*/
        System.out.println(Character.isDigit(name.charAt(0)));
        /* если имя робота будет пустым или первый символ будет цифрой или такое имя было задано ранее*/
        if ((name.isEmpty()
                || Character.isDigit(name.charAt(0)))
                || Robot3.names.indexOf(name) != -1)

        {/** то придумаем дефолтное имя */
            this.name =
             String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;//иначе будем испол имя которое ввел пользователь
        }
        /** добавляем это дефотное имя в коллекцию имен */
        Robot3.names.add(this.name);
        this.level = level; //производим инициал уровня
        this.state = State.Off;//производим инициал начального состояния(робот выключен)

    }

    // #region другие конструкторы

    // public Robot3(String name) //конструктор, имеющий один аргумент
    // {
    // if ((name.isEmpty()
    // || Character.isDigit(name.charAt(0)))
    // || Robot3.names.indexOf(name) == -1)

    // { this.name = String.format("DefaultName_%d", defaultIndex++); }
    // else { this.name = name; }

    // Robot3.names.add(this.name);
    // this.level = 1; //производим инициал уровня 1
    // this.state = State.Off;
    // }

    // public Robot3() // конструктор по умолчанию
    // {
    // this.name = String.format("DefaultName_%d", defaultIndex++); //cразу присваеваем дефолтное имя
    // Robot3.names.add(this.name);
    // this.level = 1; //производим инициал уровня 1
    // this.state = State.Off;
    // }

    // #endregion

    // #region правильные конструкторы

    public Robot3(String name) { //конструктор с одним параметром вызывает имеющийся конструктор с двумя аргументами
        this(name, 1);
    }

    public Robot3() { // конструктор по умодчанию вызывает имеющийся конструктор с одним аргументом передавая пустую строку
        this("");
    }

    // #endregion

    // Методы вкл\выкл подсистем
    /**  кнопка: если система выкл нужно вызвать логику вкл и поменять состояние на робот вкл,
     * если система вкл нужно вызвать логику выкл и поменять состояние на робот выкл
    */
    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /** Работа: если состояние вкл - заачу можно решать */
    public void work() {
        if (this.state == State.On) {
            System.out.println("Working...");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}
