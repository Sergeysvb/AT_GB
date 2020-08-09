package ru.geekbrains.main.site.at;

public interface Players {
    String getName();

    int getRun();

    int getJump();

    boolean getSuccess();

    void setSuccess(boolean success);

    void run();

    void jump();
}

