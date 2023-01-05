package OOPlesson01.Ex006;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();//создали мага и посмотрели инфо о нем
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest();//создали жреца и посмотрели инфо о нем
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());
        //*налаживаем взаимодействие между персонажами */
        hero3.GetDamage(hero2.Attack());// hero3 принимает урон, hero2 атакует
        hero3.GetDamage(hero3.Attack());// hero3 атакует сам себя и принимает урон
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
        //hero3.GetDamage(hero3.Attack());
    }
}