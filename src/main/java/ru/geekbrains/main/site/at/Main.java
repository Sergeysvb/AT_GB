package ru.geekbrains.main.site.at;
/* Создать три класса Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
————————————————————————
Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
(успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина (для дорожки) или высота (для стены),
у участников ограничения на бег и прыжки.
————————————————————————
Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
*/

public class Main {
    public static void main(String[] args) {
      Cat tom = new Cat("Tom",150,2);
        Person serg = new Person("Sergey",150,1);
            Robot wally = new Robot("Wally",50,1);
                Wall wall = new Wall(2);
                    Treadmill treadm = new Treadmill(100);

                    Players[] players = {tom,serg,wally};
                    Obstacles[] obstacles = {wall,treadm};
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println(" Испытание " + (i + 1));
            for (Players play : players) {
                if (play.getSuccess()) {
                    System.out.println("*************");
                    obstacles[i].check(play);
                }

            }

        }
    }
}
