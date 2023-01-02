package Seminar6;
import java.util.UUID;

public class Cat {// описываем сущность - кошку через атрибуты
    private UUID uuid = UUID.randomUUID(); // прописывается библиотека uuid при создании экземпляра класса Cat будет рандомно сгенерирован uuid (id)
    private String name;//все атрибуты сущности должны быть private
    private int age;
    private int weight;
    private String model;

    public Cat(int age, int weight, String model) { // конструктор(метод, который отрабатывает сразу при вызове класса) собирает все атрибуты вместе в объект
        this.age = age; //this - ключевое слово, указывает на данный класс, данный объект( private int age;). 
        this.weight = weight;
        this.model = model;
    }
/*
 * если переменные private то доступ к ним организовывается через getter и setter
 */
    public String getName() { //получить, возвращает строку с именем
        return name;
    }

    public void setName(String name) { // изменить 
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override //переопределяем метод equals (ctrl o)
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj == null || this.getClass() != obj.getClass()) {
                return false;
            } else {
                Cat cat = (Cat) obj;
                return this.uuid == cat.uuid;
            }
        }
    }

    @Override
    public int hashCode() {
        return 31 * model.hashCode() - age;
    }
}
/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
Можно записать в текстовом виде, не обязательно реализовывать в java
атрибуты: имя, возраст, порода, цвет, здоровье (состояние), вес, дата выставки, история болезни, id, место которое заняла кошка
 */