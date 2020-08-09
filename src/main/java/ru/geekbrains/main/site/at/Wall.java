package ru.geekbrains.main.site.at;

public class Wall implements Obstacles{
    private int height;


    public Wall(int height) {
        this.height = height;
    }
    public void check(Players players) {
        players.jump();
        players.setSuccess(players.getJump() >= height);
        if (players.getSuccess()) {
            System.out.println(players.getName() + " перепрыгнул стену высотой: " + height + "м");
        } else {
            System.out.println(players.getName() + " не перепрыгнул стену высотой: " + height + "м");
        }

    }
}
