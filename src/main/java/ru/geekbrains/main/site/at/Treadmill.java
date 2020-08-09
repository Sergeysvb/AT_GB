package ru.geekbrains.main.site.at;

public class Treadmill implements Obstacles{
    int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }
    public void check(Players players) {
        players.run();
        players.setSuccess(players.getRun() >= distance);
        if (players.getSuccess()) {
            System.out.println(players.getName() + " пробежал дорожку длиной: " + distance + "м");
        } else {
            System.out.println(players.getName() + " не пробежал дорожку длиной: " + distance + "м");
        }
    }
}
