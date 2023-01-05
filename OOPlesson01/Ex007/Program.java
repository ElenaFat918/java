package OOPlesson01.Ex007;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
      
        // #region ex1 Demo

        // BaseHero hero3 = new Magician(); // создаем переменную базового класса и кладем в нее экземпляр производного класса
        // System.out.println(hero3.getInfo());

        // BaseHero hero4 = new Priest();
        // System.out.println(hero4.getInfo());

        // // #endregion

        // // #region ex2 Attack
        // System.out.println("------");
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // hero3.Attack(hero4);
        
        // hero4.Attack(hero3);
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // #endregion

        // #region Teams
            //создаем команду персонажей
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
 

        List<BaseHero> teams = new ArrayList<>();//коллекция базового класса BaseHero
        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(2) == 0) {//если случ число 0, то
                teams.add(new Priest());//добавляем в команду жреца
                priestCount++;
            }
            else{
                teams.add(new Magician());//иначе мага
                magicianCount++;
            }

            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);
        
        // attack

        // #endregion

        // todo добавить ещё один класс и 
        // реализовать возможность лечения героев
    }
}